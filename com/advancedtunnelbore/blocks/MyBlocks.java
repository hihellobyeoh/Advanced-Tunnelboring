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
	
	public static Block CompressedStone;
	
	public static void initializeBlock(){
		CompressedStone = new MyBlockTextures(Material.ground).setBlockName("ComStone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":com_stone_1");
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(CompressedStone, CompressedStone.getUnlocalizedName());
	}
}
