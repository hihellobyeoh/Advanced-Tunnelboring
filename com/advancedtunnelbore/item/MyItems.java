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
	public static Item rfwheel;
	public static Item stwheel;
	public static Item hstwheel;
	public static Item cstwheel;
	public static Item twheel;
	
	//Axles
	public static Item iaxle;
	public static Item rfaxle;
	public static Item staxle;
	public static Item hstaxle;
	public static Item cstaxle;
	public static Item taxle;
	
	//Gears
	public static Item igear;
	public static Item rfgear;
	public static Item stgear;
	public static Item hstgear;
	public static Item cstgear;
	public static Item tgear;
	
	//Gearboxes
	public static Item igearbx;
	public static Item rfgearbx;
	public static Item stgearbx;
	public static Item hstgearbx;
	public static Item cstgearbx;
	public static Item tgearbx;
	
	//Rods
	public static Item irod;
	public static Item rfrod;
	public static Item strod;
	public static Item hstrod;
	public static Item cstrod;
	public static Item trod;
	
	//Beams
	public static Item ibeam;
	public static Item rfbeam;
	public static Item stbeam;
	public static Item hstbeam;
	public static Item cstbeam;
	public static Item tbeam;
	
	//Sticks
	public static Item iStick;
	public static Item rfStick;
	public static Item stStick;
	public static Item hstStick;
	public static Item cstStick;
	public static Item tStick;
	
	//Dusts
	public static Item coaldust;
	public static Item ilmenitedust;
	public static Item tdust;
	public static Item idust;
	
		
	public static void initializeItem(){
		
		//Ingots
		rfIngot = new Item().setUnlocalizedName("rfIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		stIngot = new Item().setUnlocalizedName("stIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstIngot = new Item().setUnlocalizedName("hstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstIngot = new Item().setUnlocalizedName("cstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tIngot = new Item().setUnlocalizedName("tIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Wheels
		iwheel = new Item().setUnlocalizedName("iwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":iwheel");
		rfwheel = new Item().setUnlocalizedName("rfwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":riwheel");
		stwheel = new Item().setUnlocalizedName("stwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":swheel");
		hstwheel = new Item().setUnlocalizedName("hstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":hswheel");
		cstwheel = new Item().setUnlocalizedName("cstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":cswheel");
		twheel = new Item().setUnlocalizedName("twheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":twheel");
		
		//Axles
		iaxle = new Item().setUnlocalizedName("iaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		rfaxle = new Item().setUnlocalizedName("rfaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		staxle = new Item().setUnlocalizedName("staxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstaxle = new Item().setUnlocalizedName("hstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstaxle = new Item().setUnlocalizedName("cstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		taxle = new Item().setUnlocalizedName("taxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Gears
		igear = new Item().setUnlocalizedName("igear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		rfgear = new Item().setUnlocalizedName("rfgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		stgear = new Item().setUnlocalizedName("stgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstgear = new Item().setUnlocalizedName("hstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstgear = new Item().setUnlocalizedName("cstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tgear = new Item().setUnlocalizedName("tgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Gearboxes
		igearbx = new Item().setUnlocalizedName("igearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		rfgearbx = new Item().setUnlocalizedName("rfgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		stgearbx = new Item().setUnlocalizedName("stgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstgearbx = new Item().setUnlocalizedName("hstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstgearbx = new Item().setUnlocalizedName("cstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tgearbx = new Item().setUnlocalizedName("tgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Rods
		irod = new Item().setUnlocalizedName("irod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		rfrod = new Item().setUnlocalizedName("rfrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		strod = new Item().setUnlocalizedName("strod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstrod = new Item().setUnlocalizedName("hstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstrod = new Item().setUnlocalizedName("cstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		trod = new Item().setUnlocalizedName("trod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Beams
		ibeam = new Item().setUnlocalizedName("ibeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		rfbeam = new Item().setUnlocalizedName("rfbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		stbeam = new Item().setUnlocalizedName("stbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstbeam = new Item().setUnlocalizedName("hstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstbeam = new Item().setUnlocalizedName("cstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tbeam = new Item().setUnlocalizedName("tbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Sticks
		iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":istick");
		rfStick = new Item().setUnlocalizedName("rfStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		stStick = new Item().setUnlocalizedName("stStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		hstStick = new Item().setUnlocalizedName("hstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		cstStick = new Item().setUnlocalizedName("cstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tStick = new Item().setUnlocalizedName("tStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		
		//Dusts
		coaldust = new Item().setUnlocalizedName("coaldust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		ilmenitedust = new Item().setUnlocalizedName("ilmenitedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		tdust = new Item().setUnlocalizedName("tdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
		idust = new Item().setUnlocalizedName("idust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
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
		GameRegistry.registerItem(rfwheel, rfwheel.getUnlocalizedName());
		GameRegistry.registerItem(stwheel, stwheel.getUnlocalizedName());
		GameRegistry.registerItem(hstwheel, hstwheel.getUnlocalizedName());
		GameRegistry.registerItem(cstwheel, cstwheel.getUnlocalizedName());
		GameRegistry.registerItem(twheel, twheel.getUnlocalizedName());
		
		//Axles
		GameRegistry.registerItem(iaxle, iaxle.getUnlocalizedName());
		GameRegistry.registerItem(rfaxle, rfaxle.getUnlocalizedName());
		GameRegistry.registerItem(staxle, staxle.getUnlocalizedName());
		GameRegistry.registerItem(hstaxle, hstaxle.getUnlocalizedName());
		GameRegistry.registerItem(cstaxle, cstaxle.getUnlocalizedName());
		GameRegistry.registerItem(taxle, taxle.getUnlocalizedName());
		
		//Gears
		GameRegistry.registerItem(igear, igear.getUnlocalizedName());
		GameRegistry.registerItem(rfgear, rfgear.getUnlocalizedName());
		GameRegistry.registerItem(stgear, stgear.getUnlocalizedName());
		GameRegistry.registerItem(hstgear, hstgear.getUnlocalizedName());
		GameRegistry.registerItem(cstgear, cstgear.getUnlocalizedName());
		GameRegistry.registerItem(tgear, tgear.getUnlocalizedName());
		
		//Gearboxes
		GameRegistry.registerItem(igearbx, igearbx.getUnlocalizedName());
		GameRegistry.registerItem(rfgearbx, rfgearbx.getUnlocalizedName());
		GameRegistry.registerItem(stgearbx, stgearbx.getUnlocalizedName());
		GameRegistry.registerItem(hstgearbx, hstgearbx.getUnlocalizedName());
		GameRegistry.registerItem(cstgearbx, cstgearbx.getUnlocalizedName());
		GameRegistry.registerItem(tgearbx, tgearbx.getUnlocalizedName());
		
		//Rods
		GameRegistry.registerItem(irod, irod.getUnlocalizedName());
		GameRegistry.registerItem(rfrod, rfrod.getUnlocalizedName());
		GameRegistry.registerItem(strod, strod.getUnlocalizedName());
		GameRegistry.registerItem(hstrod, hstrod.getUnlocalizedName());
		GameRegistry.registerItem(cstrod, cstrod.getUnlocalizedName());
		GameRegistry.registerItem(trod, trod.getUnlocalizedName());
		
		//Beams
		GameRegistry.registerItem(ibeam, ibeam.getUnlocalizedName());
		GameRegistry.registerItem(rfbeam, rfbeam.getUnlocalizedName());
		GameRegistry.registerItem(stbeam, stbeam.getUnlocalizedName());
		GameRegistry.registerItem(hstbeam, hstbeam.getUnlocalizedName());
		GameRegistry.registerItem(cstbeam, cstbeam.getUnlocalizedName());
		GameRegistry.registerItem(tbeam, tbeam.getUnlocalizedName());
		
		//Sticks
		GameRegistry.registerItem(iStick, iStick.getUnlocalizedName());
		GameRegistry.registerItem(rfStick, rfStick.getUnlocalizedName());
		GameRegistry.registerItem(stStick, stStick.getUnlocalizedName());
		GameRegistry.registerItem(hstStick, hstStick.getUnlocalizedName());
		GameRegistry.registerItem(cstStick, cstStick.getUnlocalizedName());
		GameRegistry.registerItem(tStick, tStick.getUnlocalizedName());
		
		//Dusts
		GameRegistry.registerItem(coaldust, coaldust.getUnlocalizedName());
		GameRegistry.registerItem(ilmenitedust, ilmenitedust.getUnlocalizedName());
		GameRegistry.registerItem(tdust, tdust.getUnlocalizedName());
		GameRegistry.registerItem(idust, idust.getUnlocalizedName());
		
	}
}