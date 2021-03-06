package com.advancedtunnelbore.main;

import com.advancedtunnelbore.block.ATBBlocks;
import com.advancedtunnelbore.handler.MyGuiHandler;
import com.advancedtunnelbore.item.MyItems;
import com.advancedtunnelbore.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	static MyGuiHandler gHandler = new MyGuiHandler();
	
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;
	
	
	public static CreativeTabs tabTunnelB = new CreativeTabs("tabTunnelBore") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return MyItems.ironStick;
	    }
	};
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide =RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		MyItems.mainRegistry();
		ATBBlocks.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderinfo();
		proxy.registerTileEntities();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
		NetworkRegistry.INSTANCE.registerGuiHandler(modInstance, gHandler);
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
