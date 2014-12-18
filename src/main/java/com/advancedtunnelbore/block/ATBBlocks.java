package com.advancedtunnelbore.block;

//import codechicken.nei.api.API;

import com.advancedtunnelbore.block.machine.ATBMachines;
import com.advancedtunnelbore.block.metal.ATBMetals;
import com.advancedtunnelbore.block.ore.ATBOres;
import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ATBBlocks {
	
	public static void mainRegistry(){
		basicBlocks();
		ATBMachines.machines();	
		ATBOres.ores();
		ATBMetals.metals();
	}
	
	public static void basicBlocks(){
		initializeBlocks();
		registerBlocks();
		registerOre();
	}

	public static Block compressedStone = new CompressedStone(Material.rock).setBlockName("compressedstone").setCreativeTab(MainRegistry.tabTunnelB).setBlockTextureName(RefStrings.MODID + ":Compressed_Stone_1").setStepSound(Block.soundTypePiston).setHardness(3F);
	
	public static void initializeBlocks(){
		
		compressedStone.setHarvestLevel("pickaxe", 1);
		
	}
	
	
	public static void registerBlocks(){
		
		GameRegistry.registerBlock(compressedStone, compressedStone.getUnlocalizedName());
						
	}
	
	public static void registerOre(){
		
		OreDictionary.registerOre("blockCompressedStone", compressedStone);
				
	}
	
	
}