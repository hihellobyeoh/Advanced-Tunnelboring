package com.advancedtunnelbore.machine.blastfurnace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.advancedtunnelbore.item.MyItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlastFurnaceRecipes {
	
	private static final BlastFurnaceRecipes SMELTING_BASE = new BlastFurnaceRecipes();
	
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	
	public static BlastFurnaceRecipes smelting(){
		return SMELTING_BASE;
	}
	
	private BlastFurnaceRecipes(){
		this.addRecipie(Items.iron_ingot, new ItemStack(MyItems.steelIngot), 0.0F);
		this.addRecipie(MyItems.steelIngot, new ItemStack(MyItems.carbonSteelIngot), 0.0F);
		this.addRecipie(MyItems.titaniumDust, new ItemStack(MyItems.titaniumIngot), 0.0F);
		this.addRecipie(Item.getItemFromBlock(Blocks.iron_ore), new ItemStack(MyItems.steelIngot), 0.8F);
		
	}
	
	public void addRecipie(Item item, ItemStack itemstack, float experience){
		this.addLists(item, itemstack, experience);
	}
	
	public void addLists(Item item, ItemStack itemstack, float experience){
		this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
	}
	
	public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience){
		this.smeltingList.put(itemstack, itemstack2);
		this.experienceList.put(itemstack2, Float.valueOf(experience));
	}
	
	public ItemStack getSmeltingResult(ItemStack itemstack){
		Iterator iterator = this.smeltingList.entrySet().iterator();
		Entry entry;
		do{
			if(!iterator.hasNext()){
				return null;
			}
			entry = (Entry) iterator.next();
		}
		while(!canBeSmelted(itemstack, (ItemStack)entry.getKey()));
		return (ItemStack) entry.getValue();
	}

	private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
		return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getItemDamage() == 32767 || itemstack2.getItemDamage() == itemstack.getItemDamage());
	}
	
	public float giveExperience(ItemStack itemstack){
		Iterator iterator = this.experienceList.entrySet().iterator();
		Entry entry;
		
		do{
			if(!iterator.hasNext()){
				return 0.0F;
			}
			
			entry = (Entry) iterator.next();
		}
		while(!this.canBeSmelted(itemstack, (ItemStack) entry.getKey()));
		
		if(itemstack.getItem().getSmeltingExperience(itemstack) != -1){
			return itemstack.getItem().getSmeltingExperience(itemstack);
		}
		
		return (((Float) entry.getValue()).floatValue());
	}
}
