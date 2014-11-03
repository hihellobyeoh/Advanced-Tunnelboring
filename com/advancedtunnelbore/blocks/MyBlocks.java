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
	public static Block tOre = new TOre(Material.rock).setBlockName("tOre").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":tianium_ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	
	private static void initializeBlock() {
		
		tOre.setHarvestLevel("pickaxe", 3);
		comStone.setHarvestLevel("pickaxe", 1);
		
	}
	
	public static void registerItem(){
		
		GameRegistry.registerBlock(comStone, comStone.getUnlocalizedName());
		GameRegistry.registerBlock(tOre, tOre.getUnlocalizedName());
		
	}
}


