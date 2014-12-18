package com.advancedtunnelbore.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class ATBOres {
	
	public static void ores(){
		initializeOreBlocks();
		registerOreBlocks();
		registerOre();
	}
	
	public static Block copperOre = new CopperOre(Material.rock).setBlockName("copperore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Copper_Ore").setStepSound(Block.soundTypePiston).setHardness(1.5F);
	public static Block tinOre = new TinOre(Material.rock).setBlockName("tinore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Tin_Ore").setStepSound(Block.soundTypePiston).setHardness(1.5F);
	public static Block ilmeniteOre = new IlmeniteOre(Material.rock).setBlockName("ilmeniteore").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Ilmenite_Ore").setStepSound(Block.soundTypePiston).setHardness(3F);
	
	public static void initializeOreBlocks(){
		
		copperOre.setHarvestLevel("pickaxe", 1);
		tinOre.setHarvestLevel("pickaxe", 1);
		ilmeniteOre.setHarvestLevel("pickaxe", 3);
		
	}
	
	public static void registerOreBlocks(){
		
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName());
		GameRegistry.registerBlock(tinOre, tinOre.getUnlocalizedName());
		GameRegistry.registerBlock(ilmeniteOre, ilmeniteOre.getUnlocalizedName());
		
	}
	
	public static void registerOre(){
		OreDictionary.registerOre("oreIlmenite", ilmeniteOre);
		OreDictionary.registerOre("oreTin", tinOre);
		OreDictionary.registerOre("oreCopper", copperOre);
	}
	
}
