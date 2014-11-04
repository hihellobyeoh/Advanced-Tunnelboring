package com.advancedtunnelbore.blocks;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MyBlocks {
	
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}

	public static Block comStone = new ComStone(Material.rock).setBlockName("comStone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":com_stone_1").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block tOre = new TOre(Material.rock).setBlockName("tOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":titanium_ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	public static Block rfBlock = new RfBlock(Material.iron).setBlockName("rfBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block stBlock = new StBlock(Material.iron).setBlockName("stBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block hstBlock = new HstBlock(Material.iron).setBlockName("hstBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block cstBlock = new cstBlock(Material.iron).setBlockName("cstBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	public static Block tBlock = new TBlock(Material.iron).setBlockName("tBlock").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypeMetal).setHardness(1.5F);
	
	public static void initializeBlock(){
		
		tOre.setHarvestLevel("pickaxe", 3);
		comStone.setHarvestLevel("pickaxe", 1);
		rfBlock.setHarvestLevel("pickaxe", 1);
		stBlock.setHarvestLevel("pickaxe", 2);
		hstBlock.setHarvestLevel("pickaxe", 2);
		cstBlock.setHarvestLevel("pickaxe", 2);
		tBlock.setHarvestLevel("pickaxe", 2);
		
	}
	
	
	public static void registerItem(){
		
		GameRegistry.registerBlock(comStone, comStone.getUnlocalizedName());
		GameRegistry.registerBlock(tOre, tOre.getUnlocalizedName());
		GameRegistry.registerBlock(rfBlock, rfBlock.getUnlocalizedName());
		GameRegistry.registerBlock(stBlock, stBlock.getUnlocalizedName());
		GameRegistry.registerBlock(hstBlock, hstBlock.getUnlocalizedName());
		GameRegistry.registerBlock(cstBlock, cstBlock.getUnlocalizedName());
		GameRegistry.registerBlock(tBlock, tBlock.getUnlocalizedName());
		
	}
}


