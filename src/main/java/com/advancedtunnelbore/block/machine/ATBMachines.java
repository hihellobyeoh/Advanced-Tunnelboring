package com.advancedtunnelbore.block.machine;

import com.advancedtunnelbore.machine.blastfurnace.BlastFurnace;
import com.advancedtunnelbore.machine.grinder.Grinder;
import com.advancedtunnelbore.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ATBMachines {

	public static void machines(){
		initializeMachines();
		registerMachines();
		//neiHideItem();
	}
	
	public static Block blastFurnace;
	public static Block blastFurnaceActive;
	
	public static Block grinder;
	public static Block grinderActive;
	
	public static void initializeMachines(){
		
		blastFurnace = new BlastFurnace(false).setBlockName("blastfurnace").setCreativeTab(MainRegistry.tabTunnelB);
		blastFurnaceActive = new BlastFurnace(true).setBlockName("blastfurnaceactive");
		
		grinder = new Grinder(false).setBlockName("grinder").setCreativeTab(MainRegistry.tabTunnelB);
		grinderActive = new Grinder(true).setBlockName("grinderactive");
		
	}

	public static void registerMachines(){
		
		GameRegistry.registerBlock(blastFurnace, blastFurnace.getUnlocalizedName());
		GameRegistry.registerBlock(blastFurnaceActive, blastFurnaceActive.getUnlocalizedName());
		
		GameRegistry.registerBlock(grinder, grinder.getUnlocalizedName());
		GameRegistry.registerBlock(grinderActive, grinderActive.getUnlocalizedName());
		
	}
	
	/*public static void neiHideItem() {
		API.hideItem(new ItemStack(blastFurnaceActive));
		API.hideItem(new ItemStack(grinderActive));
	}*/
	
}
