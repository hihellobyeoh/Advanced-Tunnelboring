package com.advancedtunnelbore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class CompressedStone {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block ComStone;
	
	public static void initializeBlock(){
		ComStone = new ComStone(Material.ground).setBlockName("ComStone").setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(ComStone, ComStone.getUnlocalizedName());
	}
}
