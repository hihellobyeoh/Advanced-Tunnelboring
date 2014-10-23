package com.advancedtunnelbore.item;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	//Ingots
	public static Item rfIngot;
	public static Item stIngot;
	public static Item hstIngot;
	public static Item cstIngot;
	public static Item tIngot;
	//Wheels
	public static Item iwheel;
	//Axles
	//Gears
	//Gearboxes
	//Rods
	//Beams
	//Sticks
	public static Item iStick;
	public static Item stStick;
	public static Item tStick;
		
	public static void initializeItem(){
		//Ingots
		rfIngot = new Item().setUnlocalizedName("rfIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		stIngot = new Item().setUnlocalizedName("stIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		hstIngot = new Item().setUnlocalizedName("hstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		cstIngot = new Item().setUnlocalizedName("cstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		tIngot = new Item().setUnlocalizedName("tIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		//Wheels
		iwheel = new Item().setUnlocalizedName("iwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":iwheel");
		//Axles
		//Gears
		//Gearboxes
		//Rods
		//Beams
		//Sticks
		iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_stick");
		stStick = new Item().setUnlocalizedName("stStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
		tStick = new Item().setUnlocalizedName("tStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64);
	}
	
	public static void registerItem(){
		//Ingots
		GameRegistry.registerItem(rfIngot, rfIngot.getUnlocalizedName());
		GameRegistry.registerItem(stIngot, stIngot.getUnlocalizedName());
		GameRegistry.registerItem(hstIngot, hstIngot.getUnlocalizedName());
		GameRegistry.registerItem(cstIngot, cstIngot.getUnlocalizedName());
		GameRegistry.registerItem(tIngot, tIngot.getUnlocalizedName());
		//Wheels
		GameRegistry.registerItem(iwheel, iwheel.getUnlocalizedName());
		//Axles
		//Gears
		//Gearboxes
		//Rods
		//Beams
		//Sticks
		GameRegistry.registerItem(iStick, iStick.getUnlocalizedName());
		GameRegistry.registerItem(stStick, stStick.getUnlocalizedName());
		GameRegistry.registerItem(tStick, tStick.getUnlocalizedName());
	}
}
