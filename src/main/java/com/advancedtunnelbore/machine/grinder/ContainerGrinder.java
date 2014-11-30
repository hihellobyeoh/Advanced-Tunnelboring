package com.advancedtunnelbore.machine.grinder;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerGrinder extends Container {

	private TileEntityGrinder tileGrinder;
	private int lastCookTime;
	private int lastBurnTime;
	private int lastItemBurnTime;
	
	public ContainerGrinder(InventoryPlayer player, TileEntityGrinder tileEntityGrinderContainer){
		this.tileGrinder = tileEntityGrinderContainer;
		this.addSlotToContainer(new Slot(tileEntityGrinderContainer, 0, 56, 17));
		this.addSlotToContainer(new Slot(tileEntityGrinderContainer, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnace(player.player, tileEntityGrinderContainer, 2,116,35));
		int i;
		
		for(int i1 = 0; i1 < 3; ++i1){
			for(int j = 0; j <9; ++j){
				this.addSlotToContainer(new Slot(player, j + i1 * 9 + 9, 8 + j * 18, 84 + i1 * 18));
			}
		}
		
		for(i = 0; i < 9; ++i){
			this.addSlotToContainer(new Slot(player, i , 8 + i * 18 , 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting craft){
		super.addCraftingToCrafters(craft);
		craft.sendProgressBarUpdate(this,  0,  this.tileGrinder.furnaceCookTime);
		craft.sendProgressBarUpdate(this,  1,  this.tileGrinder.furnaceBurnTime);
		craft.sendProgressBarUpdate(this,  2,  this.tileGrinder.currentBurnTime);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		for(int i = 0; i < this.crafters.size(); ++i){
			ICrafting craft = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.tileGrinder.furnaceCookTime){
				craft.sendProgressBarUpdate(this, 0, this.tileGrinder.furnaceCookTime);
			}
			if(this.lastBurnTime != this.tileGrinder.furnaceBurnTime){
				craft.sendProgressBarUpdate(this, 0, this.tileGrinder.furnaceCookTime);
			}
			if(this.lastItemBurnTime != this.tileGrinder.currentBurnTime){
				craft.sendProgressBarUpdate(this, 0, this.tileGrinder.furnaceCookTime);
			}
		}
		this.lastBurnTime = this.tileGrinder.furnaceBurnTime;
		this.lastCookTime = this.tileGrinder.furnaceCookTime;
		this.lastItemBurnTime = this.tileGrinder.currentBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2){
		if(par1 == 0)
			this.tileGrinder.furnaceCookTime = par2;
		if(par1 == 1)
			this.tileGrinder.furnaceBurnTime = par2;
		if(par1 == 2)
			this.tileGrinder.currentBurnTime = par2;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tileGrinder.isUseableByPlayer(player);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int par2){
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);
		
		if(slot != null && slot.getHasStack()){
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			
			if(par2 == 2){
				if(!this.mergeItemStack(itemstack1, 3, 39, true)){
					return null;
				}
				slot.onSlotChange(itemstack1, itemstack);
			}else if(par2 != 1 && par2 != 0){
				if(GrinderRecipes.smelting().getSmeltingResult(itemstack1) != null){
					if(!this.mergeItemStack(itemstack1, 0, 1, false)){
						return null;
					}
				}else if(TileEntityGrinder.isItemFuel(itemstack1)){
					if(!this.mergeItemStack(itemstack1, 1, 2, false)){
						return null;
					}
				}else if(par2 >=3 && par2 < 30){
					if(!this.mergeItemStack(itemstack1, 30, 39, false)){
						return null;
					}
				}else if(par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)){
					return null;
				}
			}else if(!this.mergeItemStack(itemstack1, 3, 39, false)){
				return null;
			}
			if(itemstack1.stackSize == 0){
				slot.putStack((ItemStack)null);
			}else{
				slot.onSlotChanged();
			}
			if(itemstack1.stackSize == itemstack.stackSize){
				return null;
			}
			slot.onPickupFromSlot(player, itemstack1);
		}
		return itemstack;
	}

}
