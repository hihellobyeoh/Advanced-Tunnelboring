package com.advancedtunnelbore.main;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.machine.blastfurnace.TileEntityBlastFurnace;
import com.advancedtunnelbore.machine.grinder.TileEntityGrinder;

import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {
	public void registerRenderinfo(){
		
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, RefStrings.MODID + "TileEntityBlastFurnace");
		GameRegistry.registerTileEntity(TileEntityGrinder.class, RefStrings.MODID + "TileEntityGrinder");
	}
}
