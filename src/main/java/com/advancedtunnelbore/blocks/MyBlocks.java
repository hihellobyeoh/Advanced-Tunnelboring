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
		registerItem();
		registerOre();
	}

	public static Block comStone = new ComStone(Material.rock).setBlockName("comStone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Compressed_Stone_1").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block tOre = new TOre(Material.rock).setBlockName("tOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block bzBlock = new BzBlock(Material.iron).setBlockName("bzBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Bronze_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block stBlock = new StBlock(Material.iron).setBlockName("stBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block hstBlock = new HstBlock(Material.iron).setBlockName("hstBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Hardened_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block cstBlock = new cstBlock(Material.iron).setBlockName("cstBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Carbon_Steel_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block tBlock = new TBlock(Material.iron).setBlockName("tBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Titanium_Block").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	
	public static Block blastFurnace;
	public static Block blastFurnaceActive;
	
	public static void initializeBlock(){
		
		tOre.setHarvestLevel("pickaxe", 3);
		comStone.setHarvestLevel("pickaxe", 1);
		bzBlock.setHarvestLevel("pickaxe", 1);
		stBlock.setHarvestLevel("pickaxe", 2);
		hstBlock.setHarvestLevel("pickaxe", 2);
		cstBlock.setHarvestLevel("pickaxe", 2);
		tBlock.setHarvestLevel("pickaxe", 2);
		
		blastFurnace = new BlastFurnace(false).setBlockName("BlastFurnace").setCreativeTab(MainRegistry.tabTunnelB);
		blastFurnaceActive = new BlastFurnace(true).setBlockName("BlastFurnaceActive");
		
		
	}
	
	
	public static void registerItem(){
		
		GameRegistry.registerBlock(comStone, comStone.getUnlocalizedName());
		GameRegistry.registerBlock(tOre, tOre.getUnlocalizedName());
		GameRegistry.registerBlock(bzBlock, bzBlock.getUnlocalizedName());
		GameRegistry.registerBlock(stBlock, stBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hstBlock, hstBlock.getUnlocalizedName());
		GameRegistry.registerBlock(cstBlock, cstBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tBlock, tBlock.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnace, blastFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnaceActive, blastFurnaceActive.getUnlocalizedName());
				
	}
	
	public static void registerOre(){
		
		OreDictionary.registerOre("blockBronze", bzBlock);
		OreDictionary.registerOre("blockSteel", stBlock);
		OreDictionary.registerOre("blockHardenedSteel", hstBlock);
		OreDictionary.registerOre("blockCarbonSteel", cstBlock);
		OreDictionary.registerOre("blockTitanium", tBlock);
		OreDictionary.registerOre("blockCompressedStone", comStone);
		OreDictionary.registerOre("oreIlmenite", tOre);
		
	}
}


