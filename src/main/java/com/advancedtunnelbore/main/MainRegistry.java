package com.advancedtunnelbore.main;

import com.advancedtunnelbore.blocks.MyBlocks;
import com.advancedtunnelbore.item.MyItems;
import com.advancedtunnelbore.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
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
	
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;
	
	
	public static CreativeTabs tabTunnelB = new CreativeTabs("tabTunnelBore") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return MyItems.iStick;
	    }
	};
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide =RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		MyItems.mainRegistry();
		MyBlocks.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderinfo();
		proxy.registerTileEntities();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
