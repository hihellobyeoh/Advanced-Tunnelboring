package com.advancedtunnelbore.machine.grinder;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cofh.api.energy.TileEnergyHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityGrinder extends TileEnergyHandler implements ISidedInventory
{
    private static final int[] slotsTop = new int[] {0};
    private static final int[] slotsBottom = new int[] {2, 1};
    private static final int[] slotsSides = new int[] {1};
    
    /** The ItemStacks that hold the items currently being used in the furnace */
    private ItemStack[] grinderItemStacks = new ItemStack[3];
    
    /** The number of ticks that the furnace will keep burning */
    public int furnaceBurnTime;
    
    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
    public int currentBurnTime;
    
    /** The number of ticks that the current item has been cooking for */
    public int furnaceCookTime;
    
    private String furnaceName;
    private static final String __OBFID = "CL_00000357";

    /**
     * Returns the number of slots in the inventory.
     */
    public int getSizeInventory()
    {
        return this.grinderItemStacks.length;
    }

    /**
     * Returns the stack in slot i
     */
    public ItemStack getStackInSlot(int slot)
    {
        return this.grinderItemStacks[slot];
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
    public ItemStack decrStackSize(int var1, int var2)
    {
        if (this.grinderItemStacks[var1] != null)
        {
            ItemStack itemstack;

            if (this.grinderItemStacks[var1].stackSize <= var2)
            {
                itemstack = this.grinderItemStacks[var1];
                this.grinderItemStacks[var1] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.grinderItemStacks[var1].splitStack(var2);

                if (this.grinderItemStacks[var1].stackSize == 0)
                {
                    this.grinderItemStacks[var1] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int slot)
    {
        if (this.grinderItemStacks[slot] != null)
        {
            ItemStack itemstack = this.grinderItemStacks[slot];
            this.grinderItemStacks[slot] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int slot, ItemStack itemstack)
    {
        this.grinderItemStacks[slot] = itemstack;

        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit())
        {
            itemstack.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Returns the name of the inventory
     */
    public String getInventoryName()
    {
        return this.hasCustomInventoryName() ? this.furnaceName : "Grinder";
    }

    /**
     * Returns if the inventory is named
     */
    public boolean hasCustomInventoryName()
    {
        return this.furnaceName != null && this.furnaceName.length() > 0;
    }

    public void furnaceName(String string)
    {
        this.furnaceName = string;
    }

    public void readFromNBT(NBTTagCompound tagCompound)
    {
        super.readFromNBT(tagCompound);
        NBTTagList taglist = tagCompound.getTagList("Items", 10);
        this.grinderItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < taglist.tagCount(); ++i)
        {
            NBTTagCompound tagcompound1 = taglist.getCompoundTagAt(i);
            byte b0 = tagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.grinderItemStacks.length)
            {
                this.grinderItemStacks[b0] = ItemStack.loadItemStackFromNBT(tagcompound1);
            }
        }

        this.furnaceBurnTime = tagCompound.getShort("BurnTime");
        this.furnaceCookTime = tagCompound.getShort("CookTime");
        this.currentBurnTime = getItemBurnTime(this.grinderItemStacks[1]);

        if (tagCompound.hasKey("CustomName", 8))
        {
            this.furnaceName = tagCompound.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound tagCompound)
    {
        super.writeToNBT(tagCompound);
        tagCompound.setShort("BurnTime", (short)this.furnaceBurnTime);
        tagCompound.setShort("CookTime", (short)this.furnaceCookTime);
        NBTTagList taglist = new NBTTagList();

        for (int i = 0; i < this.grinderItemStacks.length; ++i)
        {
            if (this.grinderItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.grinderItemStacks[i].writeToNBT(nbttagcompound1);
                taglist.appendTag(nbttagcompound1);
            }
        }

        tagCompound.setTag("Items", taglist);

        if (this.hasCustomInventoryName())
        {
        	tagCompound.setString("CustomName", this.furnaceName);
        }
    }

    /**
     * Returns the maximum stack size for a inventory slot.
     */
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely
     * cooked
     */
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int par1)
    {
        return this.furnaceCookTime * par1 / 3600;
    }

    /**
     * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
     * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
     */
    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int par1)
    {
        if (this.currentBurnTime == 0)
        {
            this.currentBurnTime = 800;
        }

        return this.furnaceBurnTime * par1 / this.currentBurnTime;
    }

    /**
     * Furnace isBurning
     */
    public boolean isBurning()
    {
        return this.furnaceBurnTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = this.furnaceBurnTime > 0;
        boolean flag1 = false;

        if (this.furnaceBurnTime > 0)
        {
            --this.furnaceBurnTime;
        }

        if (!this.worldObj.isRemote)
        {
            if (this.furnaceBurnTime != 0 || this.grinderItemStacks[1] != null && this.grinderItemStacks[0] != null)
            {
                if (this.furnaceBurnTime == 0 && this.canSmelt())
                {
                    this.currentBurnTime = this.furnaceBurnTime = getItemBurnTime(this.grinderItemStacks[1]);

                    if (this.furnaceBurnTime > 0)
                    {
                        flag1 = true;

                        if (this.grinderItemStacks[1] != null)
                        {
                            --this.grinderItemStacks[1].stackSize;

                            if (this.grinderItemStacks[1].stackSize == 0)
                            {
                                this.grinderItemStacks[1] = grinderItemStacks[1].getItem().getContainerItem(grinderItemStacks[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.furnaceCookTime;

                    if (this.furnaceCookTime == 3600)
                    {
                        this.furnaceCookTime = 0;
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.furnaceCookTime = 0;
                }
            }

            if (flag != this.furnaceBurnTime > 0)
            {
                flag1 = true;
                Grinder.updateBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    /**
     * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */
    private boolean canSmelt()
    {
        if (this.grinderItemStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack = GrinderRecipes.smelting().getSmeltingResult(this.grinderItemStacks[0]);
            if (itemstack == null) return false;
            if (this.grinderItemStacks[2] == null) return true;
            if (!this.grinderItemStacks[2].isItemEqual(itemstack)) return false;
            int result = grinderItemStacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.grinderItemStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }

    /**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = GrinderRecipes.smelting().getSmeltingResult(this.grinderItemStacks[0]);

            if (this.grinderItemStacks[2] == null)
            {
                this.grinderItemStacks[2] = itemstack.copy();
            }
            else if (this.grinderItemStacks[2].getItem() == itemstack.getItem())
            {
                this.grinderItemStacks[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
            }

            --this.grinderItemStacks[0].stackSize;

            if (this.grinderItemStacks[0].stackSize <= 0)
            {
                this.grinderItemStacks[0] = null;
            }
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack itemstack)
    {
        if (itemstack == null)
        {
            return 0;
        }
        else
        {
            Item item = itemstack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.coal_block)
                {
                    return 3600;
                }
            }

            
            if (item == Items.coal) return 800;
            //if (item == Item.getItemFromBlock(Blocks.coal_block)) return 16000;
            return GameRegistry.getFuelValue(itemstack);
        }
    }

    public static boolean isItemFuel(ItemStack itemstack)
    {
        /**
         * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
         * fuel
         */
        return getItemBurnTime(itemstack) > 0;
    }

    /**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openInventory() {}

    public void closeInventory() {}

    /**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isItemValidForSlot(int par1, ItemStack itemstack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(itemstack) : true);
    }

    /**
     * Returns an array containing the indices of the slots that can be accessed by automation on the given side of this
     * block.
     */
    public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? slotsBottom : (par1 == 1 ? slotsTop : slotsSides);
    }

    /**
     * Returns true if automation can insert the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canInsertItem(int par1, ItemStack itemstack, int par3)
    {
        return this.isItemValidForSlot(par1, itemstack);
    }

    /**
     * Returns true if automation can extract the given item in the given slot from the given side. Args: Slot, item,
     * side
     */
    public boolean canExtractItem(int par1, ItemStack itemstack, int par3)
    {
        return par3 != 0 || par1 != 1 || itemstack.getItem() == Items.bucket;
    }
}


