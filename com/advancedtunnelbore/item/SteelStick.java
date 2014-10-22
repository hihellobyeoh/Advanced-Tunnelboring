package com.advancedtunnelbore.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteelStick extends Item {
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item sStick;
	public static void initializeItem(){
		sStick = new Item().setUnlocalizedName("sStick").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(sStick, sStick.getUnlocalizedName());
	}
}
