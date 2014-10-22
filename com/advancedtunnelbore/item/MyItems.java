package com.advancedtunnelbore.item;

import com.advancedtunnelbore.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item iStick;
	public static Item sStick;
	public static Item tStick;
		
	public static void initializeItem(){
		iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MainRegistry.tabCustom);
		sStick = new Item().setUnlocalizedName("sStick").setCreativeTab(MainRegistry.tabCustom);
		tStick = new Item().setUnlocalizedName("tStick").setCreativeTab(MainRegistry.tabCustom);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(iStick, iStick.getUnlocalizedName());
		GameRegistry.registerItem(sStick, sStick.getUnlocalizedName());
		GameRegistry.registerItem(tStick, tStick.getUnlocalizedName());
	}
}
