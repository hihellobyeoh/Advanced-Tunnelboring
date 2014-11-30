package com.advancedtunnelbore.block;

import com.advancedtunnelbore.block.metal.BronzeBlock;
import com.advancedtunnelbore.block.metal.CarbonSteelBlock;
import com.advancedtunnelbore.block.metal.CopperBlock;
import com.advancedtunnelbore.block.metal.HardenedSteelBlock;
import com.advancedtunnelbore.block.metal.SteelBlock;
import com.advancedtunnelbore.block.metal.TinBlock;
import com.advancedtunnelbore.block.metal.TitaniumBlock;
import com.advancedtunnelbore.block.ore.CopperOre;
import com.advancedtunnelbore.block.ore.TinOre;
import com.advancedtunnelbore.block.ore.TitaniumOre;
import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.machine.blastfurnace.BlastFurnace;
import com.advancedtunnelbore.machine.grinder.Grinder;
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
	public static Block copperOre = new CopperOre(Material.rock).setBlockName("copperore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Copper_Ore").setStepSound(Block.soundTypePiston).setHardness(1.5F);
	public static Block tinOre = new TinOre(Material.rock).setBlockName("tinore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Tin_Ore").setStepSound(Block.soundTypePiston).setHardness(1.5F);
	public static Block titaniumOre = new TitaniumOre(Material.rock).setBlockName("titaniumore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block copperBlock = new CopperBlock(Material.iron).setBlockName("copperblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Copper_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block tinBlock = new TinBlock(Material.iron).setBlockName("tinblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Tin_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block bronzeBlock = new BronzeBlock(Material.iron).setBlockName("bronzeblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Bronze_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block steelBlock = new SteelBlock(Material.iron).setBlockName("steelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block hardenedSteelBlock = new HardenedSteelBlock(Material.iron).setBlockName("hardenedsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Hardened_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block carbonSteelBlock = new CarbonSteelBlock(Material.iron).setBlockName("carbonsteelblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Carbon_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block titaniumBlock = new TitaniumBlock(Material.iron).setBlockName("titaniumblock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	
	public static Block blastFurnace;
	public static Block blastFurnaceActive;
	
	public static Block grinder;
	public static Block grinderActive;
	
	public static void initializeBlock(){
		
		compressedStone.setHarvestLevel("pickaxe", 1);
		copperOre.setHarvestLevel("pickaxe", 1);
		tinOre.setHarvestLevel("pickaxe", 1);
		titaniumOre.setHarvestLevel("pickaxe", 3);
		copperBlock.setHarvestLevel("pickaxe", 1);
		tinBlock.setHarvestLevel("pickaxe", 1);
		bronzeBlock.setHarvestLevel("pickaxe", 1);
		steelBlock.setHarvestLevel("pickaxe", 2);
		hardenedSteelBlock.setHarvestLevel("pickaxe", 2);
		carbonSteelBlock.setHarvestLevel("pickaxe", 2);
		titaniumBlock.setHarvestLevel("pickaxe", 2);
		
		blastFurnace = new BlastFurnace(false).setBlockName("blastfurnace").setCreativeTab(MainRegistry.tabTunnelB);
		blastFurnaceActive = new BlastFurnace(true).setBlockName("blastfurnaceactive");
		
		grinder = new Grinder(false).setBlockName("grinder").setCreativeTab(MainRegistry.tabTunnelB);
		grinderActive = new Grinder(true).setBlockName("grinderactive");
		
		
	}
	
	
	public static void registerBlock(){
		
		GameRegistry.registerBlock(compressedStone, compressedStone.getUnlocalizedName());
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName());
		GameRegistry.registerBlock(tinOre, tinOre.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumOre, titaniumOre.getUnlocalizedName());
		GameRegistry.registerBlock(bronzeBlock, bronzeBlock.getUnlocalizedName());
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tinBlock, tinBlock.getUnlocalizedName());
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hardenedSteelBlock, hardenedSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(carbonSteelBlock, carbonSteelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnace, blastFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnaceActive, blastFurnaceActive.getUnlocalizedName());
		GameRegistry.registerBlock(grinder, grinder.getUnlocalizedName());
		GameRegistry.registerBlock(grinderActive, grinderActive.getUnlocalizedName());
		
				
	}
	
	public static void registerOre(){
		
		OreDictionary.registerOre("blockBronze", bronzeBlock);
		OreDictionary.registerOre("blockSteel", steelBlock);
		OreDictionary.registerOre("blockCopper", copperBlock);
		OreDictionary.registerOre("blockTin", tinBlock);
		OreDictionary.registerOre("blockHardenedSteel", steelBlock);
		OreDictionary.registerOre("blockCarbonSteel", carbonSteelBlock);
		OreDictionary.registerOre("blockTitanium", titaniumBlock);
		OreDictionary.registerOre("blockCompressedStone", compressedStone);
		OreDictionary.registerOre("oreIlmenite", titaniumOre);
		OreDictionary.registerOre("oreTin", tinOre);
		OreDictionary.registerOre("oreCopper", copperOre);
		
	}
}