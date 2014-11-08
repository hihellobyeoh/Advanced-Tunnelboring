package com.advancedtunnelbore.main;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.tile_entity.TileEntityBlastFurnace;

import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {
	public void registerRenderinfo(){
		
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, RefStrings.MODID + "TileEntityBlastFurnace");
	}
}
