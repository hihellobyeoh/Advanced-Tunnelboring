package com.advancedtunnelbore.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronStick {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item iStick;
	public static void initializeItem(){
		iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(iStick, iStick.getUnlocalizedName());
	}
}
