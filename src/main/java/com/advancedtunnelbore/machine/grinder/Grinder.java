package com.advancedtunnelbore.machine.grinder;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.advancedtunnelbore.block.machine.ATBMachines;
import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Grinder extends BlockContainer {
	  private final Random random = new Random();
	    private final boolean isBurning2;
	    private static boolean isBurning;
	    
	    @SideOnly(Side.CLIENT)
	    private IIcon top;
	    @SideOnly(Side.CLIENT)
	    private IIcon front;
	    
	    private static final String __OBFID = "CL_00000248";

	    public Grinder(boolean isActive)
	    {
	        super(Material.rock);
	        this.isBurning2 = isActive;
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(ATBMachines.grinder);
	    }

	    /**
	     * Called whenever the block is added into the world. Args: world, x, y, z
	     */
	    public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_)
	    {
	        super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
	        this.direction(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
	    }

	    private void direction(World world, int x, int y, int z) 
	    {
	        if (!world.isRemote)
	        {
	        	Block direction = world.getBlock(x,  y,  z - 1);
				Block direction1 = world.getBlock(x,  y,  z + 1);
				Block direction2 = world.getBlock(x - 1,  y,  z);
				Block direction3 = world.getBlock(x + 1,  y,  z);
				byte byte0 = 3;

	            if(direction.func_149730_j() && !direction1.func_149730_j()){
					byte0 = 3;
				}
				if(direction1.func_149730_j() && !direction.func_149730_j()){
					byte0 = 2;
				}
				if(direction2.func_149730_j() && !direction3.func_149730_j()){
					byte0 = 5;
				}
				if(direction3.func_149730_j() && !direction2.func_149730_j()){
					byte0 = 4;
				}
				
				world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
			}
		}

	    /**
	     * Gets the block's texture. Args: side, meta
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int side, int meta)
	    {
	        return side == 1 ? this.top : (side == 0 ? this.blockIcon : (side != meta ? this.blockIcon : this.front));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconregister)
	    {
	        this.blockIcon = iconregister.registerIcon(RefStrings.MODID + ":GrinderSide");
	        this.front = iconregister.registerIcon(RefStrings.MODID + ":Grinder");
	        this.top = iconregister.registerIcon(this.isBurning2 ? RefStrings.MODID + ":GrinderTopActive" : RefStrings.MODID + ":GrinderTopInactive" );
	    }

	    /**
	     * Called upon block activation (right click on the block.)
	     */
	    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
	    {
	    	player.openGui(MainRegistry.modInstance, 1, world, x, y, z);
			return true;
	    }

	    /**
	     * Update which block the furnace is using depending on whether or not it is burning
	     */
	    public static void updateBlockState(boolean burning, World world, int x, int y, int z){
	    	
	        int direction = world.getBlockMetadata(x, y, z);
	        TileEntity tileentity = world.getTileEntity(x, y, z);
	        isBurning = true;

	        if (burning)
	        {
	            world.setBlock(x, y, z, ATBMachines.grinderActive);
	        }
	        else
	        {
	            world.setBlock(x, y, z, ATBMachines.grinder);
	        }

	        isBurning = false;
	        world.setBlockMetadataWithNotify(x, y, z, direction, 2);

	        if (tileentity != null)
	        {
	            tileentity.validate();
	            world.setTileEntity(x, y, z, tileentity);
	        }
	    }

	    /**
	     * Returns a new instance of a block's tile entity class. Called on placing the block.
	     */
	    public TileEntity createNewTileEntity(World world, int par2)
	    {
	        return new TileEntityGrinder();
	    }

	    /**
	     * Called when the block is placed in the world.
	     */
	    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack){
			int direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) +0.5D) & 3;
			
			if(direction == 0){
				world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			}
			if(direction == 1){
				world.setBlockMetadataWithNotify(x, y, z, 5, 2);
			}
			if(direction == 2){
				world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			}
			if(direction == 3){
				world.setBlockMetadataWithNotify(x, y, z, 4, 2);
			}
			if(itemstack.hasDisplayName()){
				((TileEntityGrinder) world.getTileEntity(x, y, z)).furnaceName(itemstack.getDisplayName());
			}
			
		}

	    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
	    {
	    	if(!isBurning){
				TileEntityGrinder tileentitygrinder = (TileEntityGrinder) world.getTileEntity(x, y, z);
				if(tileentitygrinder != null){
					for(int i = 0; i <tileentitygrinder.getSizeInventory(); ++i){
						ItemStack itemstack = tileentitygrinder.getStackInSlot(i);
						
						if(itemstack != null){
							float f = this.random.nextFloat() * 0.8F + 0.1F;
							float f1 = this.random.nextFloat() * 0.8F + 0.1F;
							float f2 = this.random.nextFloat() * 0.8F + 0.1F;
							
							while(itemstack.stackSize > 0){
								int j1 = this.random.nextInt(21) + 10;
								
								if(j1 > itemstack.stackSize){
									j1 = itemstack.stackSize;
								}

	                            itemstack.stackSize -= j1;
	                            EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

	                            if (itemstack.hasTagCompound())
	                            {
	                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
	                            }

	                            float f3 = 0.05F;
	                            entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
	                            entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
	                            entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
	                            world.spawnEntityInWorld(entityitem);
	                        }
	                    }
	                }

	                world.func_147453_f(x, y, z, block);
	            }
	        }

	        super.breakBlock(world, x, y, z, block, meta);
	    }

	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    /*@SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World world, int x, int y, int z, Random random)
	    {
	        if (this.isBurning2)
	        {
	            int l = world.getBlockMetadata(x, y, z);
	            float f = (float)x + 0.5F;
	            float f1 = (float)y + 0.0F + random.nextFloat() * 6.0F / 16.0F;
	            float f2 = (float)z + 0.5F;
	            float f3 = 0.52F;
	            float f4 = random.nextFloat() * 0.6F - 0.3F;

	            if (l == 4)
	            {
	                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
	                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 5)
	            {
	                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
	                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 2)
	            {
	                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
	                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 3)
	            {
	                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
	                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
	            }
	        }
	    }*/

	    /**
	     * If this returns true, then comparators facing away from this block will use the value from
	     * getComparatorInputOverride instead of the actual redstone signal strength.
	     */
	    public boolean hasComparatorInputOverride()
	    {
	        return true;
	    }

	    /**
	     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
	     * strength when this block inputs to a comparator.
	     */
	    public int getComparatorInputOverride(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_)
	    {
	        return Container.calcRedstoneFromInventory((IInventory)p_149736_1_.getTileEntity(p_149736_2_, p_149736_3_, p_149736_4_));
	    }

	    /**
	     * Gets an item for the block being called on. Args: world, x, y, z
	     */
	    @SideOnly(Side.CLIENT)
	    public Item getItem(World world, int par2, int par3, int par4){
			return Item.getItemFromBlock(ATBMachines.grinder);
		}
	}
