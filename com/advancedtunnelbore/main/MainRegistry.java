package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.CompressedStone;
import com.advancedtunnelbore.item.IronStick;
import com.advancedtunnelbore.item.SteelStick;
import com.advancedtunnelbore.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide =RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		CTabs.OtherInfo();
		IronStick.mainRegistry();
		CompressedStone.mainRegistry();
		SteelStick.mainRegistry();
		proxy.registerRenderinfo();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
