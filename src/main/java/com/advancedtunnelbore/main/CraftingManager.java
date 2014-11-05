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
		
		//Wheels
		GameRegistry.addRecipe(new ItemStack(MyItems.iwheel), new Object[]{"XIX","IXI","XIX",'X', Items.iron_ingot, 'I', MyItems.iStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfwheel), new Object[]{"XIX","IXI","XIX",'X', MyItems.rfIngot, 'I', MyItems.rfStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.stwheel), new Object[]{"XIX","IXI","XIX",'X', MyItems.stIngot, 'I', MyItems.stStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstwheel), new Object[]{"XIX","IXI","XIX",'X', MyItems.hstIngot, 'I', MyItems.hstStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstwheel), new Object[]{"XIX","IXI","XIX",'X', MyItems.cstIngot, 'I', MyItems.cstStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.twheel), new Object[]{"XIX","IXI","XIX",'X', MyItems.tIngot, 'I', MyItems.tStick});
		
		//Axles
		GameRegistry.addRecipe(new ItemStack(MyItems.iaxle), new Object[]{"X","X",'X', MyItems.irod});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfaxle), new Object[]{"X","X",'X', MyItems.rfrod});
		GameRegistry.addRecipe(new ItemStack(MyItems.staxle), new Object[]{"X","X",'X', MyItems.strod});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstaxle), new Object[]{"X","X",'X', MyItems.hstrod});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstaxle), new Object[]{"X","X",'X', MyItems.cstrod});
		GameRegistry.addRecipe(new ItemStack(MyItems.taxle), new Object[]{"X","X",'X', MyItems.trod});
		
		//Gears
		GameRegistry.addRecipe(new ItemStack(MyItems.igear), new Object[]{"XXX","XIX","XXX",'X', Items.iron_ingot, 'I', MyItems.iwheel});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfgear), new Object[]{"XXX","XIX","XXX",'X', MyItems.rfIngot, 'I', MyItems.rfwheel});
		GameRegistry.addRecipe(new ItemStack(MyItems.stgear), new Object[]{"XXX","XIX","XXX",'X', MyItems.stIngot, 'I', MyItems.stwheel});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstgear), new Object[]{"XXX","XIX","XXX",'X', MyItems.hstIngot, 'I', MyItems.hstwheel});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstgear), new Object[]{"XXX","XIX","XXX",'X', MyItems.cstIngot, 'I', MyItems.cstwheel});
		GameRegistry.addRecipe(new ItemStack(MyItems.tgear), new Object[]{"XXX","XIX","XXX",'X', MyItems.tIngot, 'I', MyItems.twheel});
		
		//Gearboxes
		GameRegistry.addRecipe(new ItemStack(MyItems.igearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.igear, 'C', MyItems.iStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfgearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.rfgear, 'C', MyItems.rfStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.stgearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.stgear, 'C', MyItems.stStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstgearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.hstgear, 'C', MyItems.hstStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstgearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.cstgear, 'C', MyItems.cstStick});
		GameRegistry.addRecipe(new ItemStack(MyItems.tgearbx), new Object[]{"XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.tgear, 'C', MyItems.tStick});
		
		//Rods
		GameRegistry.addRecipe(new ItemStack(MyItems.irod), new Object[]{"X  "," X ","  X",'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfrod), new Object[]{"X  "," X ","  X",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.strod), new Object[]{"X  "," X ","  X",'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstrod), new Object[]{"X  "," X ","  X",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstrod), new Object[]{"X  "," X ","  X",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.trod), new Object[]{"X  "," X ","  X",'X', MyItems.tIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.irod), new Object[]{"  X"," X ","X  ",'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfrod), new Object[]{"  X"," X ","X  ",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.strod), new Object[]{"  X"," X ","X  ",'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstrod), new Object[]{"  X"," X ","X  ",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstrod), new Object[]{"  X"," X ","X  ",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.trod), new Object[]{"  X"," X ","X  ",'X', MyItems.tIngot});
		
		//Beams
		GameRegistry.addRecipe(new ItemStack(MyItems.ibeam), new Object[]{"XXX","XXX", 'X', Blocks.iron_block});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfbeam), new Object[]{"XXX","XXX", 'X', MyBlocks.rfBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.stbeam), new Object[]{"XXX","XXX", 'X', MyBlocks.stBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstbeam), new Object[]{"XXX","XXX", 'X', MyBlocks.hstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstbeam), new Object[]{"XXX","XXX", 'X', MyBlocks.cstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.tbeam), new Object[]{"XXX","XXX", 'X', MyBlocks.tBlock});
				
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.iStick,2), new Object[]{"X","X",'X', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfStick,2), new Object[]{"X","X",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.stStick,2), new Object[]{"X","X",'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstStick,2), new Object[]{"X","X",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstStick,2), new Object[]{"X","X",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.tStick,2), new Object[]{"X","X",'X', MyItems.tIngot});
		
		//Dusts
		GameRegistry.addRecipe(new ItemStack(MyItems.coaldust), new Object[]{"X",'X', Items.coal});
		
		//Metal Blocks and ingots conversions
		GameRegistry.addRecipe(new ItemStack(MyBlocks.rfBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.rfIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.stBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.stIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.hstBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.hstIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.cstBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.cstIngot});
		GameRegistry.addRecipe(new ItemStack(MyBlocks.tBlock), new Object[]{"XXX","XXX","XXX",'X', MyItems.tIngot});
		GameRegistry.addRecipe(new ItemStack(MyItems.rfIngot,9), new Object[]{"X",'X', MyBlocks.rfBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.stIngot,9), new Object[]{"X",'X', MyBlocks.stBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.hstIngot,9), new Object[]{"X",'X', MyBlocks.hstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.cstIngot,9), new Object[]{"X",'X', MyBlocks.cstBlock});
		GameRegistry.addRecipe(new ItemStack(MyItems.tIngot,9), new Object[]{"X",'X', MyBlocks.tBlock});
				
	}
	
	public static void addSmeltingRecipe(){
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MyItems.rfIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.tdust, new ItemStack(MyItems.tIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.idust, new ItemStack(Items.iron_ingot), 0.0f);
		GameRegistry.addSmelting(MyItems.stImpureIngot, new ItemStack(MyItems.stIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.cstImpureIngot, new ItemStack(MyItems.cstIngot), 0.0f);
		
	}
	
	
}
