package com.advancedtunnelbore.blocks;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class MyBlocks {
	
	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
		registerOre();
	}

	public static Block compressedStone = new CompressedStone(Material.rock).setBlockName("compressedstone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Compressed_Stone_1").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block titaniumOre = new TitaniumOre(Material.rock).setBlockName("titaniumore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block bronzeBlock = new BronzeBlock(Material.iron).setBlockName("bronzeblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Bronze_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block steelBlock = new SteelBlock(Material.iron).setBlockName("steelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block hardenedSteelBlock = new HardenedSteelBlock(Material.iron).setBlockName("hardenedsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Hardened_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block carbonSteelBlock = new CarbonSteelBlock(Material.iron).setBlockName("carbonsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Carbon_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block titaniumBlock = new TitaniumBlock(Material.iron).setBlockName("titaniumblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	
	public static Block blastFurnace;
	public static Block blastFurnaceActive;
	
	public static void initializeBlock(){
		
		titaniumOre.setHarvestLevel("pickaxe", 3);
		compressedStone.setHarvestLevel("pickaxe", 1);
		bronzeBlock.setHarvestLevel("pickaxe", 1);
		steelBlock.setHarvestLevel("pickaxe", 2);
		hardenedSteelBlock.setHarvestLevel("pickaxe", 2);
		carbonSteelBlock.setHarvestLevel("pickaxe", 2);
		titaniumBlock.setHarvestLevel("pickaxe", 2);
		
		blastFurnace = new BlastFurnace(false).setBlockName("blastfurnace").setCreativeTab(MainRegistry.tabTunnelB);
		blastFurnaceActive = new BlastFurnace(true).setBlockName("blastfurnaceactive");
		
		
	}
	
	
	public static void registerBlock(){
		
		GameRegistry.registerBlock(compressedStone, compressedStone.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumOre, titaniumOre.getUnlocalizedName());
		GameRegistry.registerBlock(bronzeBlock, bronzeBlock.getUnlocalizedName());
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hardenedSteelBlock, hardenedSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(carbonSteelBlock, carbonSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnace, blastFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnaceActive, blastFurnaceActive.getUnlocalizedName());
		
				
	}
	
	public static void registerOre(){
		
		OreDictionary.registerOre("blockBronze", bronzeBlock);
		OreDictionary.registerOre("blockSteel", steelBlock);
		OreDictionary.registerOre("blockHardenedSteel", steelBlock);
		OreDictionary.registerOre("blockCarbonSteel", carbonSteelBlock);
		OreDictionary.registerOre("blockTitanium", titaniumBlock);
		OreDictionary.registerOre("blockCompressedStone", compressedStone);
		OreDictionary.registerOre("oreIlmenite", titaniumOre);
		
	}
}