package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.CompressedStone;
import com.advancedtunnelbore.item.IronStick;
import com.advancedtunnelbore.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide =RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		IronStick.mainRegistry();
		CompressedStone.mainRegistry();
		proxy.registerRenderinfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
