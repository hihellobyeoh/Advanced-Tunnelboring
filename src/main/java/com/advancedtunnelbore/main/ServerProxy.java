package com.advancedtunnelbore.main;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.tile_entity.TileEntityBlastFurnace;
import com.advancedtunnelbore.tile_entity.TileEntityGrinder;

import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {
	public void registerRenderinfo(){
		
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, RefStrings.MODID + "TileEntityBlastFurnace");
		GameRegistry.registerTileEntity(TileEntityGrinder.class, RefStrings.MODID + "TileEntityGrinder");
	}
}
