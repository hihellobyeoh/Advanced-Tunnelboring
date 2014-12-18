package com.advancedtunnelbore.block.metal;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ATBMetals {
	
	public static void metals(){
		initializeMetalBlocks();
		registerMetalBlocks();
		registerOre();
	}
	
	public static Block copperBlock = new CopperBlock(Material.iron).setBlockName("copperblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Copper_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block tinBlock = new TinBlock(Material.iron).setBlockName("tinblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Tin_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block bronzeBlock = new BronzeBlock(Material.iron).setBlockName("bronzeblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Bronze_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block steelBlock = new SteelBlock(Material.iron).setBlockName("steelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block hardenedSteelBlock = new HardenedSteelBlock(Material.iron).setBlockName("hardenedsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Hardened_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block carbonSteelBlock = new CarbonSteelBlock(Material.iron).setBlockName("carbonsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Carbon_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block titaniumBlock = new TitaniumBlock(Material.iron).setBlockName("titaniumblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	
	public static void initializeMetalBlocks(){
		
	copperBlock.setHarvestLevel("pickaxe", 1);
	tinBlock.setHarvestLevel("pickaxe", 1);
	bronzeBlock.setHarvestLevel("pickaxe", 1);
	steelBlock.setHarvestLevel("pickaxe", 2);
	hardenedSteelBlock.setHarvestLevel("pickaxe", 2);
	carbonSteelBlock.setHarvestLevel("pickaxe", 2);
	titaniumBlock.setHarvestLevel("pickaxe", 2);
		
	}
	
	public static void registerMetalBlocks(){
		
		GameRegistry.registerBlock(bronzeBlock, bronzeBlock.getUnlocalizedName());
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tinBlock, tinBlock.getUnlocalizedName());
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hardenedSteelBlock, hardenedSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(carbonSteelBlock, carbonSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName());
		
	}
	
	public static void registerOre(){
		
		OreDictionary.registerOre("blockBronze", bronzeBlock);
		OreDictionary.registerOre("blockSteel", steelBlock);
		OreDictionary.registerOre("blockCopper", copperBlock);
		OreDictionary.registerOre("blockTin", tinBlock);
		OreDictionary.registerOre("blockHardenedSteel", steelBlock);
		OreDictionary.registerOre("blockCarbonSteel", carbonSteelBlock);
		OreDictionary.registerOre("blockTitanium", titaniumBlock);
		
	}
	

}
