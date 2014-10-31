package com.advancedtunnelbore.main;

import com.advancedtunnelbore.item.MyItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.iStick), new Object[]{" X "," X ","   ",'X', Items.iron_ingot});
		
		
		
		
	}
	public static void addSmeltingRec(){
		
		
		
	}
	
	
}
