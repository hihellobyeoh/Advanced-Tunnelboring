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
		
		//Wheels
		GameRegistry.addRecipe(new ItemStack(MyItems.ironWheel), "XIX","IXI","XIX",'X', Items.iron_ingot, 'I', MyItems.ironStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeWheel), "XIX","IXI","XIX",'X', MyItems.bronzeIngot, 'I', MyItems.bronzeStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelWheel), "XIX","IXI","XIX",'X', MyItems.steelIngot, 'I', MyItems.steelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelWheel), "XIX","IXI","XIX",'X', MyItems.hardenedSteelIngot, 'I', MyItems.hardenedSteelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelWheel), "XIX","IXI","XIX",'X', MyItems.carbonSteelIngot, 'I', MyItems.carbonSteelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumWheel), "XIX","IXI","XIX",'X', MyItems.titaniumIngot, 'I', MyItems.titaniumStick);
		
		//Axles
		GameRegistry.addRecipe(new ItemStack(MyItems.ironAxle), "X","X",'X', MyItems.ironRod);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeAxle), "X","X",'X', MyItems.bronzeRod);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelAxle), "X","X",'X', MyItems.steelRod);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelAxle), "X","X",'X', MyItems.hardenedSteelRod);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelAxle), "X","X",'X', MyItems.carbonSteelRod);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumAxle), "X","X",'X', MyItems.titaniumRod);
		
		//Gears
		GameRegistry.addRecipe(new ItemStack(MyItems.ironGear), "XXX","XIX","XXX",'X', Items.iron_ingot, 'I', MyItems.ironWheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeGear), "XXX","XIX","XXX",'X', MyItems.bronzeIngot, 'I', MyItems.bronzeWheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelGear), "XXX","XIX","XXX",'X', MyItems.steelIngot, 'I', MyItems.steelWheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelGear), "XXX","XIX","XXX",'X', MyItems.hardenedSteelIngot, 'I', MyItems.hardenedSteelWheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelGear), "XXX","XIX","XXX",'X', MyItems.carbonSteelIngot, 'I', MyItems.carbonSteelWheel);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumGear), "XXX","XIX","XXX",'X', MyItems.titaniumIngot, 'I', MyItems.titaniumWheel);
		
		//Gearboxes
		GameRegistry.addRecipe(new ItemStack(MyItems.ironGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.ironGear, 'C', MyItems.ironStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.bronzeGear, 'C', MyItems.bronzeStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.steelGear, 'C', MyItems.steelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.hardenedSteelGear, 'C', MyItems.hardenedSteelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.carbonSteelGear, 'C', MyItems.carbonSteelStick);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumGearBox), "XIX","ICI","XIX",'X', Items.iron_ingot, 'I', MyItems.titaniumGear, 'C', MyItems.titaniumStick);
		
		//Rods
		GameRegistry.addRecipe(new ItemStack(MyItems.ironRod), "X  "," X ","  X",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeRod), "X  "," X ","  X",'X', MyItems.bronzeIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelRod), "X  "," X ","  X",'X', MyItems.steelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelRod), "X  "," X ","  X",'X', MyItems.hardenedSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelRod), "X  "," X ","  X",'X', MyItems.carbonSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumRod), "X  "," X ","  X",'X', MyItems.titaniumIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.ironRod), "  X"," X ","X  ",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeRod), "  X"," X ","X  ",'X', MyItems.bronzeIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelRod), "  X"," X ","X  ",'X', MyItems.steelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelRod), "  X"," X ","X  ",'X', MyItems.hardenedSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelRod), "  X"," X ","X  ",'X', MyItems.carbonSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumRod), "  X"," X ","X  ",'X', MyItems.titaniumIngot);
		
		//Beams
		GameRegistry.addRecipe(new ItemStack(MyItems.ironBeam), "XXX","XXX", 'X', Blocks.iron_block);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeBeam), "XXX","XXX", 'X', MyBlocks.bzBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelBeam), "XXX","XXX", 'X', MyBlocks.stBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelBeam), "XXX","XXX", 'X', MyBlocks.hstBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelBeam), "XXX","XXX", 'X', MyBlocks.cstBlock);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumBeam), "XXX","XXX", 'X', MyBlocks.tBlock);
				
		//Sticks
		GameRegistry.addRecipe(new ItemStack(MyItems.ironStick,2), "X","X",'X', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(MyItems.bronzeStick,2), "X","X",'X', MyItems.bronzeIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.steelStick,2), "X","X",'X', MyItems.steelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.hardenedSteelStick,2), "X","X",'X', MyItems.hardenedSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.carbonSteelStick,2), "X","X",'X', MyItems.carbonSteelIngot);
		GameRegistry.addRecipe(new ItemStack(MyItems.titaniumStick,2), "X","X",'X', MyItems.titaniumIngot);
		
		//Dusts
		//GameRegistry.addRecipe(new ItemStack(MyItems.coaldust), "X",'X', Items.coal);
		
		
		//Metal Blocks and ingots conversions
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.bzBlock, true, "FFF","FFF","FFF",'F', "ingotBronze"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.stBlock, true, "FFF","FFF","FFF",'F', "ingotSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.hstBlock, true, "FFF","FFF","FFF",'F', "ingotHardenedSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.cstBlock, true, "FFF","FFF","FFF",'F', "ingotCarbonSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(MyBlocks.tBlock, true, "FFF","FFF","FFF",'F', "ingotTitanium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.bronzeIngot, 9), true, "F",'F', "blockRefinedIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.steelIngot, 9), true, "F",'F', "blockSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.hardenedSteelIngot, 9), true, "F",'F', "blockHardenedSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.carbonSteelIngot, 9), true, "F",'F', "blockCarbonSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MyItems.titaniumIngot, 9), true, "F",'F', "blockTitanium"));
				
	}
	
	public static void addSmeltingRecipe(){
		
		GameRegistry.addSmelting(MyItems.bronzeDust, new ItemStack(MyItems.bronzeIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.titaniumDust, new ItemStack(MyItems.titaniumIngot), 0.0f);
		GameRegistry.addSmelting(MyItems.ironDust, new ItemStack(Items.iron_ingot), 0.0f);
		GameRegistry.addSmelting(MyItems.steelIngot, new ItemStack(MyItems.hardenedSteelIngot), 0.0f);
		
	}
	
	
}
