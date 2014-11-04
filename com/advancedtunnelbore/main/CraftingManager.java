package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.MyBlocks;
import com.advancedtunnelbore.item.MyItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addShapedCraftingRecipe();
		addSmeltingRecipe();
	}
	
	public static void addShapedCraftingRecipe(){
		//Impure Ingots
		GameRegistry.addRecipe(new ItemStack(MyItems.stImpureIngot), new Object[]{" X ","XIX"," X ", 'X', MyItems.coaldust, 'I', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstImpureIngot), new Object[]{"XXX","XIX","XXX",'X', MyItems.coaldust, 'I', MyItems.stIngot});
		
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.iStick), new Object[]{"X","X",'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfStick), new Object[]{"X","X",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.stStick), new Object[]{"X","X",'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstStick), new Object[]{"X","X",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstStick), new Object[]{"X","X",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.tStick), new Object[]{"X","X",'X', MyItems.tIngot});
		
		//Beams
		GameRegistry.addRecipe(new ItemStack(MyItems.ibeam), new Object[]{"XXX","XXX", 'X', Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfbeam), new Object[]{"XXX"," X ","XXX", 'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.stbeam), new Object[]{"X X","XXX","X X", 'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstbeam), new Object[]{"XXX"," X ","XXX", 'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstbeam), new Object[]{"XXX"," X ","XXX", 'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.tbeam), new Object[]{"XXX"," X ","XXX", 'X', MyItems.tIngot});
		
		//Metal Blocks and ingots conversions
		GameRegistry.addRecipe(new ItemStack(MyBlocks.rfBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.stBlock), new Object[]{"XXX","XXX","XXX", MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.hstBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.cstBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.tBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.tIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfIngot), new Object[]{"X",'X', MyBlocks.rfBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.stIngot), new Object[]{"X",'X', MyBlocks.stBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstIngot), new Object[]{"X",'X', MyBlocks.hstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstIngot), new Object[]{"X",'X', MyBlocks.cstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.tIngot), new Object[]{"X",'X', MyBlocks.tBlock});
				
	}
	
	public static void addSmeltingRecipe(){
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MyItems.rfIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.tdust, new ItemStack(MyItems.tIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.idust, new ItemStack(Items.iron_ingot), 0.0f);
		GameRegistry.addSmelting(MyItems.stIngot, new ItemStack(MyItems.stImpureIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.cstIngot, new ItemStack(MyItems.cstImpureIngot), 0.0f);
		
	}
	
	
}
