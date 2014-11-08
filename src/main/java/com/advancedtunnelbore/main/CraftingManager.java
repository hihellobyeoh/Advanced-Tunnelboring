package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.MyBlocks;
import com.advancedtunnelbore.item.MyItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addShapedCraftingRecipe();
		addSmeltingRecipe();
	}
	
	public static void addShapedCraftingRecipe(){
		//Impure Ingots
		GameRegistry.addRecipe(new ItemStack(MyItems.stImpureIngot), " X ","XIX"," X ", 'X', MyItems.coaldust, 'I', MyItems.bzIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstImpureIngot), "XXX","XIX","XXX",'X', MyItems.coaldust, 'I', MyItems.stIngot);
		GameRegistry.addRecipe(new ShapedOreRecipe(MyItems.cstImpureIngot, true, "XXX","XIX","XXX",'X', "dustCoal", 'I', "ingotSteelIngot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyItems.stImpureIngot, true, " X ","XIX"," X ", 'X', "dustCoal", 'I', "ingotRefinedIron"));
		
		//Wheels
		GameRegistry.addRecipe(new ItemStack(MyItems.iwheel), "XIX","IXI","XIX",'X', Items.iron_ingot, 'I', MyItems.iStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzwheel), "XIX","IXI","XIX",'X', MyItems.bzIngot, 'I', MyItems.bzStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.stwheel), "XIX","IXI","XIX",'X', MyItems.stIngot, 'I', MyItems.stStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstwheel), "XIX","IXI","XIX",'X', MyItems.hstIngot, 'I', MyItems.hstStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstwheel), "XIX","IXI","XIX",'X', MyItems.cstIngot, 'I', MyItems.cstStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.twheel), "XIX","IXI","XIX",'X', MyItems.tIngot, 'I', MyItems.tStick);
		
		//Axles
		GameRegistry.addRecipe(new ItemStack(MyItems.iaxle), "X","X",'X', MyItems.irod);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzaxle), "X","X",'X', MyItems.bzrod);
		GameRegistry.addRecipe(new ItemStack(MyItems.staxle), "X","X",'X', MyItems.strod);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstaxle), "X","X",'X', MyItems.hstrod);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstaxle), "X","X",'X', MyItems.cstrod);
		GameRegistry.addRecipe(new ItemStack(MyItems.taxle), "X","X",'X', MyItems.trod);
		
		//Gears
		GameRegistry.addRecipe(new ItemStack(MyItems.igear), "XXX","XIX","XXX",'X', Items.iron_ingot, 'I', MyItems.iwheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzgear), "XXX","XIX","XXX",'X', MyItems.bzIngot, 'I', MyItems.bzwheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.stgear), "XXX","XIX","XXX",'X', MyItems.stIngot, 'I', MyItems.stwheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstgear), "XXX","XIX","XXX",'X', MyItems.hstIngot, 'I', MyItems.hstwheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstgear), "XXX","XIX","XXX",'X', MyItems.cstIngot, 'I', MyItems.cstwheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.tgear), "XXX","XIX","XXX",'X', MyItems.tIngot, 'I', MyItems.twheel);
		
		//Gearboxes
		GameRegistry.addRecipe(new ItemStack(MyItems.igearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.igear, 'C', MyItems.iStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzgearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.bzgear, 'C', MyItems.bzStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.stgearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.stgear, 'C', MyItems.stStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstgearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.hstgear, 'C', MyItems.hstStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstgearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.cstgear, 'C', MyItems.cstStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.tgearbx), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.tgear, 'C', MyItems.tStick);
		
		//Rods
		GameRegistry.addRecipe(new ItemStack(MyItems.irod), "X  "," X ","  X",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzrod), "X  "," X ","  X",'X', MyItems.bzIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.strod), "X  "," X ","  X",'X', MyItems.stIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstrod), "X  "," X ","  X",'X', MyItems.hstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstrod), "X  "," X ","  X",'X', MyItems.cstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.trod), "X  "," X ","  X",'X', MyItems.tIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.irod), "  X"," X ","X  ",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzrod), "  X"," X ","X  ",'X', MyItems.bzIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.strod), "  X"," X ","X  ",'X', MyItems.stIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstrod), "  X"," X ","X  ",'X', MyItems.hstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstrod), "  X"," X ","X  ",'X', MyItems.cstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.trod), "  X"," X ","X  ",'X', MyItems.tIngot);
		
		//Beams
		GameRegistry.addRecipe(new ItemStack(MyItems.ibeam), "XXX","XXX", 'X', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzbeam), "XXX","XXX", 'X', MyBlocks.bzBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.stbeam), "XXX","XXX", 'X', MyBlocks.stBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstbeam), "XXX","XXX", 'X', MyBlocks.hstBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstbeam), "XXX","XXX", 'X', MyBlocks.cstBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.tbeam), "XXX","XXX", 'X', MyBlocks.tBlock);
				
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.iStick,2), "X","X",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bzStick,2), "X","X",'X', MyItems.bzIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.stStick,2), "X","X",'X', MyItems.stIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hstStick,2), "X","X",'X', MyItems.hstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.cstStick,2), "X","X",'X', MyItems.cstIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.tStick,2), "X","X",'X', MyItems.tIngot);
		
		//Dusts
		//GameRegistry.addRecipe(new ItemStack(MyItems.coaldust), "X",'X', Items.coal);
		
		
		//Metal Blocks and ingots conversions
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.bzBlock, true, "FFF","FFF","FFF",'F', "ingotBronze"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.stBlock, true, "FFF","FFF","FFF",'F', "ingotSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.hstBlock, true, "FFF","FFF","FFF",'F', "ingotHardenedSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.cstBlock, true, "FFF","FFF","FFF",'F', "ingotCarbonSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.tBlock, true, "FFF","FFF","FFF",'F', "ingotTitanium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.bzIngot, 9), true, "F",'F', "blockRefinedIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.stIngot, 9), true, "F",'F', "blockSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.hstIngot, 9), true, "F",'F', "blockHardenedSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.cstIngot, 9), true, "F",'F', "blockCarbonSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.tIngot, 9), true, "F",'F', "blockTitanium"));
				
	}
	
	public static void addSmeltingRecipe(){
		
		//GameRegistry.addSmelting(MyItems.bzdust, new ItemStack(MyItems.bzIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.tdust, new ItemStack(MyItems.tIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.idust, new ItemStack(Items.iron_ingot), 0.0f);
		GameRegistry.addSmelting(MyItems.stImpureIngot, new ItemStack(MyItems.stIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.cstImpureIngot, new ItemStack(MyItems.cstIngot), 0.0f);
		
	}
	
	
}
