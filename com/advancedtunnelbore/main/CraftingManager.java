package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.MyBlocks;
import com.advancedtunnelbore.item.MyItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRecipe();
		addSmeltingRecipe();
	}
	
	public static void addCraftingRecipe(){
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.iStick), new Object[]{"X","X",'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfStick), new Object[]{"X","X",'X', MyItems.rfIngot});
		
		//Beams
		GameRegistry.addRecipe(new ItemStack(MyItems.ibeam), new Object[]{"XXX"," X ","XXX", 'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.ibeam), new Object[]{"X X","XXX","X X", 'X', Items.iron_ingot});
		
	}
	
	public static void addSmeltingRecipe(){
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MyItems.rfIngot), 0.0f);
		
	}
	
	
}
