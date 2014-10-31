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
	public static Block sandTOre;
	public static Block sandStoneTOre;
	public static Block stoneTOre;
	
	public static void initializeBlock(){
		comStone = new MyBlockTextures(Material.rock).setBlockName("comStone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":com_stone_1").setStepSound(Block.soundTypePiston);
		sandTOre = new MyBlockTextures(Material.sand).setBlockName("sandTOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":sand_titanium_ore").setStepSound(Block.soundTypeSand);
		sandStoneTOre = new MyBlockTextures(Material.rock).setBlockName("sandStoneTOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":sandstone_titanium_ore").setStepSound(Block.soundTypePiston);
		stoneTOre = new MyBlockTextures(Material.rock).setBlockName("stoneTOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":stone_titanium_ore").setStepSound(Block.soundTypePiston);
		
		
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(comStone, comStone.getUnlocalizedName());
		GameRegistry.registerBlock(sandTOre, sandTOre.getUnlocalizedName());
		GameRegistry.registerBlock(sandStoneTOre, sandStoneTOre.getUnlocalizedName());
		GameRegistry.registerBlock(stoneTOre, stoneTOre.getUnlocalizedName());
		
	}
}


