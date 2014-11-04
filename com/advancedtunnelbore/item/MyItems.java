package com.advancedtunnelbore.item;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class MyItems {

	public static void mainRegistry(){
		registerItem();
	}
	//Impure Ingots
	public static Item stImpureIngot = new Item().setUnlocalizedName("stImpureIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstImpureIngot = new Item().setUnlocalizedName("cstImpureIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Ingots
	public static Item rfIngot = new Item().setUnlocalizedName("rfIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item stIngot = new Item().setUnlocalizedName("stIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstIngot = new Item().setUnlocalizedName("hstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstIngot = new Item().setUnlocalizedName("cstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item tIngot = new Item().setUnlocalizedName("tIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Wheels
	public static Item iwheel = new Item().setUnlocalizedName("iwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Wheel");
	public static Item rfwheel = new Item().setUnlocalizedName("rfwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Refined_Iron_Wheel");
	public static Item stwheel = new Item().setUnlocalizedName("stwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Wheel");
	public static Item hstwheel = new Item().setUnlocalizedName("hstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Wheel");
	public static Item cstwheel = new Item().setUnlocalizedName("cstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Wheel");
	public static Item twheel = new Item().setUnlocalizedName("twheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Wheel");
	
	//Axles
	public static Item iaxle = new Item().setUnlocalizedName("iaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item rfaxle = new Item().setUnlocalizedName("rfaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item staxle = new Item().setUnlocalizedName("staxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstaxle = new Item().setUnlocalizedName("hstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstaxle = new Item().setUnlocalizedName("cstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item taxle = new Item().setUnlocalizedName("taxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Gears
	public static Item igear = new Item().setUnlocalizedName("igear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item rfgear = new Item().setUnlocalizedName("rfgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item stgear = new Item().setUnlocalizedName("stgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstgear = new Item().setUnlocalizedName("hstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstgear = new Item().setUnlocalizedName("cstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item tgear = new Item().setUnlocalizedName("tgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Gearboxes
	public static Item igearbx = new Item().setUnlocalizedName("igearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item rfgearbx = new Item().setUnlocalizedName("rfgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item stgearbx = new Item().setUnlocalizedName("stgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstgearbx = new Item().setUnlocalizedName("hstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstgearbx = new Item().setUnlocalizedName("cstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item tgearbx = new Item().setUnlocalizedName("tgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Rods
	public static Item irod = new Item().setUnlocalizedName("irod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item rfrod = new Item().setUnlocalizedName("rfrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item strod = new Item().setUnlocalizedName("strod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstrod = new Item().setUnlocalizedName("hstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstrod = new Item().setUnlocalizedName("cstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item trod = new Item().setUnlocalizedName("trod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Beams
	public static Item ibeam = new Item().setUnlocalizedName("ibeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Beam");
	public static Item rfbeam = new Item().setUnlocalizedName("rfbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Refined_Iron_Beam");
	public static Item stbeam = new Item().setUnlocalizedName("stbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Beam");
	public static Item hstbeam = new Item().setUnlocalizedName("hstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Beam");
	public static Item cstbeam = new Item().setUnlocalizedName("cstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Beam");
	public static Item tbeam = new Item().setUnlocalizedName("tbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Beam");
	
	//Sticks
	public static Item iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Stick");
	public static Item rfStick = new Item().setUnlocalizedName("rfStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item stStick = new Item().setUnlocalizedName("stStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item hstStick = new Item().setUnlocalizedName("hstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item cstStick = new Item().setUnlocalizedName("cstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item tStick = new Item().setUnlocalizedName("tStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	//Dusts
	public static Item coaldust = new Item().setUnlocalizedName("coaldust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item ilmenitedust = new Item().setUnlocalizedName("ilmenitedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item tdust = new Item().setUnlocalizedName("tdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	public static Item idust = new Item().setUnlocalizedName("idust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + "void");
	
	public static void registerItem(){
		
		//Impure Ingots
		GameRegistry.registerItem(stImpureIngot, stImpureIngot.getUnlocalizedName());
		GameRegistry.registerItem(cstImpureIngot, cstImpureIngot.getUnlocalizedName());
		
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
