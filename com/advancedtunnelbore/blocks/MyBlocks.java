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
	
	public static Block comStone;
	public static Block tOre;
	
	public static void initializeBlock(){
		comStone = new MyBlockTextures(Material.rock).setBlockName("comStone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":com_stone_1").setStepSound(Block.soundTypePiston);
		tOre = new MyBlockTextures(Material.rock).setBlockName("tOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + "void").setStepSound(Block.soundTypePiston);
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(comStone, comStone.getUnlocalizedName());
		GameRegistry.registerBlock(tOre, tOre.getUnlocalizedName());
	}
}


