package com.advancedtunnelbore.item;

import com.advancedtunnelbore.lib.RefStrings;
import com.advancedtunnelbore.main.MainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MyItems {

	public static void mainRegistry(){
		registerItem();
		oreRegistration();
	}
	
	//Ingots -- Done Nats
	public static Item bronzeIngot = new Item().setUnlocalizedName("bronzeingot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Ingot");
	public static Item steelIngot = new Item().setUnlocalizedName("steelingot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Ingot");
	public static Item hardenedSteelIngot = new Item().setUnlocalizedName("hardenedsteelingot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Ingot");
	public static Item carbonSteelIngot = new Item().setUnlocalizedName("carbonsteelingot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Ingot");
	public static Item titaniumIngot = new Item().setUnlocalizedName("titaniumingot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Ingot");
	
	//Wheels -- Done Nats
	public static Item ironWheel = new Item().setUnlocalizedName("ironwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Wheel");
	public static Item bronzeWheel = new Item().setUnlocalizedName("bronzewheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Wheel");
	public static Item steelWheel = new Item().setUnlocalizedName("steelwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Wheel");
	public static Item hardenedSteelWheel = new Item().setUnlocalizedName("hardenedsteelwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Wheel");
	public static Item carbonSteelWheel = new Item().setUnlocalizedName("carbonsteelwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Wheel");
	public static Item titaniumWheel = new Item().setUnlocalizedName("titaniumwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Wheel");
	
	//Axles - Done Nats
	public static Item ironAxle = new Item().setUnlocalizedName("ironaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Axle");
	public static Item bronzeAxle = new Item().setUnlocalizedName("bronzeaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Axle");
	public static Item steelAxle = new Item().setUnlocalizedName("steelaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Axle");
	public static Item hardenedSteelAxle = new Item().setUnlocalizedName("hardenedsteelaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Axle");
	public static Item carbonSteelAxle = new Item().setUnlocalizedName("carbonsteelaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Axle");
	public static Item titaniumAxle = new Item().setUnlocalizedName("titaniumaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Axle");
	
	//Gears -- Done Nats
	public static Item ironGear = new Item().setUnlocalizedName("irongear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Gear");
	public static Item bronzeGear = new Item().setUnlocalizedName("bronzegear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Gear");
	public static Item steelGear = new Item().setUnlocalizedName("steelgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Gear");
	public static Item hardenedSteelGear = new Item().setUnlocalizedName("hardenedsteelgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Gear");
	public static Item carbonSteelGear = new Item().setUnlocalizedName("carbonsteelgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Gear");
	public static Item titaniumGear = new Item().setUnlocalizedName("titaniumgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Gear");
	
	//Gearboxes -- Done Nats
	public static Item ironGearBox = new Item().setUnlocalizedName("irongearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Gearbox");
	public static Item bronzeGearBox = new Item().setUnlocalizedName("bronzegearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Gearbox");
	public static Item steelGearBox = new Item().setUnlocalizedName("steelgearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Gearbox");
	public static Item hardenedSteelGearBox = new Item().setUnlocalizedName("hardenedsteelgearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Gearbox");
	public static Item carbonSteelGearBox = new Item().setUnlocalizedName("carbonsteelgearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Gearbox");
	public static Item titaniumGearBox = new Item().setUnlocalizedName("titaniumgearbox").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Gearbox");
	
	//Rods -- Done Nats
	public static Item ironRod = new Item().setUnlocalizedName("ironrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Rod");
	public static Item bronzeRod = new Item().setUnlocalizedName("bronzerod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Rod");
	public static Item steelRod = new Item().setUnlocalizedName("steelrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Rod");
	public static Item hardenedSteelRod = new Item().setUnlocalizedName("hardenedsteelrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Rod");
	public static Item carbonSteelRod = new Item().setUnlocalizedName("carbonsteelrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Rod");
	public static Item titaniumRod = new Item().setUnlocalizedName("titaniumrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Rod");
	
	//Beams -- Done Nats
	public static Item ironBeam = new Item().setUnlocalizedName("ironbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Beam");
	public static Item bronzeBeam = new Item().setUnlocalizedName("bronzebeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Beam");
	public static Item steelBeam = new Item().setUnlocalizedName("steelbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Beam");
	public static Item hardenedSteelBeam = new Item().setUnlocalizedName("hardenedsteelbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Beam");
	public static Item carbonSteelBeam = new Item().setUnlocalizedName("carbonsteelbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Beam");
	public static Item titaniumBeam = new Item().setUnlocalizedName("titaniumbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Beam");
	
	//Sticks -- Done Nats
	public static Item ironStick = new Item().setUnlocalizedName("ironstick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Stick");
	public static Item bronzeStick = new Item().setUnlocalizedName("bronzestick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Stick");
	public static Item steelStick = new Item().setUnlocalizedName("steelstick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Stick");
	public static Item hardenedSteelStick = new Item().setUnlocalizedName("hardenedsteelstick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Stick");
	public static Item carbonSteelStick = new Item().setUnlocalizedName("carbonsteelstick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Stick");
	public static Item titaniumStick = new Item().setUnlocalizedName("titaniumstick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Stick");
	
	//Dusts -- Done Nats
	public static Item coalDust = new Item().setUnlocalizedName("coaldust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Coal_Dust");
	public static Item ilmeniteDust = new Item().setUnlocalizedName("ilmenitedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Ilmenite_Dust");
	public static Item titaniumDust = new Item().setUnlocalizedName("titaniumdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Dust");
	public static Item ironDust = new Item().setUnlocalizedName("irondust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Dust");
	public static Item bronzeDust = new Item().setUnlocalizedName("bronzedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Dust");
	public static Item copperDust = new Item().setUnlocalizedName("copperdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Copper_Dust");
	public static Item tinDust = new Item().setUnlocalizedName("tindust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Tin_Dust");
	
	public static void registerItem(){
		
		//Ingots
		GameRegistry.registerItem(bronzeIngot, bronzeIngot.getUnlocalizedName());
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelIngot, hardenedSteelIngot.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelIngot, carbonSteelIngot.getUnlocalizedName());
		GameRegistry.registerItem(titaniumIngot, titaniumIngot.getUnlocalizedName());
		
		//Wheels
		GameRegistry.registerItem(ironWheel, ironWheel.getUnlocalizedName());
		GameRegistry.registerItem(bronzeWheel, bronzeWheel.getUnlocalizedName());
		GameRegistry.registerItem(steelWheel, steelWheel.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelWheel, hardenedSteelWheel.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelWheel, carbonSteelWheel.getUnlocalizedName());
		GameRegistry.registerItem(titaniumWheel, titaniumWheel.getUnlocalizedName());
		
		//Axles
		GameRegistry.registerItem(ironAxle, ironAxle.getUnlocalizedName());
		GameRegistry.registerItem(bronzeAxle, bronzeAxle.getUnlocalizedName());
		GameRegistry.registerItem(steelAxle, steelAxle.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelAxle, hardenedSteelAxle.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelAxle, carbonSteelAxle.getUnlocalizedName());
		GameRegistry.registerItem(titaniumAxle, titaniumAxle.getUnlocalizedName());
		
		//Gears
		GameRegistry.registerItem(ironGear, ironGear.getUnlocalizedName());
		GameRegistry.registerItem(bronzeGear, bronzeGear.getUnlocalizedName());
		GameRegistry.registerItem(steelGear, steelGear.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelGear, hardenedSteelGear.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelGear, carbonSteelGear.getUnlocalizedName());
		GameRegistry.registerItem(titaniumGear, titaniumGear.getUnlocalizedName());
		
		//Gearboxes
		GameRegistry.registerItem(ironGearBox, ironGearBox.getUnlocalizedName());
		GameRegistry.registerItem(bronzeGearBox, bronzeGearBox.getUnlocalizedName());
		GameRegistry.registerItem(steelGearBox, steelGearBox.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelGearBox, hardenedSteelGearBox.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelGearBox, carbonSteelGearBox.getUnlocalizedName());
		GameRegistry.registerItem(titaniumGearBox, titaniumGearBox.getUnlocalizedName());
		
		//Rods
		GameRegistry.registerItem(ironRod, ironRod.getUnlocalizedName());
		GameRegistry.registerItem(bronzeRod, bronzeRod.getUnlocalizedName());
		GameRegistry.registerItem(steelRod, steelRod.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelRod, hardenedSteelRod.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelRod, carbonSteelRod.getUnlocalizedName());
		GameRegistry.registerItem(titaniumRod, titaniumRod.getUnlocalizedName());
		
		//Beams
		GameRegistry.registerItem(ironBeam, ironBeam.getUnlocalizedName());
		GameRegistry.registerItem(bronzeBeam, bronzeBeam.getUnlocalizedName());
		GameRegistry.registerItem(steelBeam, steelBeam.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelBeam, hardenedSteelBeam.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelBeam, carbonSteelBeam.getUnlocalizedName());
		GameRegistry.registerItem(titaniumBeam, titaniumBeam.getUnlocalizedName());
		
		//Sticks
		GameRegistry.registerItem(ironStick, ironStick.getUnlocalizedName());
		GameRegistry.registerItem(bronzeStick, bronzeStick.getUnlocalizedName());
		GameRegistry.registerItem(steelStick, steelStick.getUnlocalizedName());
		GameRegistry.registerItem(hardenedSteelStick, hardenedSteelStick.getUnlocalizedName());
		GameRegistry.registerItem(carbonSteelStick, carbonSteelStick.getUnlocalizedName());
		GameRegistry.registerItem(titaniumStick, titaniumStick.getUnlocalizedName());
		
		//Dusts
		GameRegistry.registerItem(coalDust, coalDust.getUnlocalizedName());
		GameRegistry.registerItem(ilmeniteDust, ilmeniteDust.getUnlocalizedName());
		GameRegistry.registerItem(titaniumDust, titaniumDust.getUnlocalizedName());
		GameRegistry.registerItem(ironDust, ironDust.getUnlocalizedName());
		GameRegistry.registerItem(copperDust, copperDust.getUnlocalizedName());
		GameRegistry.registerItem(tinDust, tinDust.getUnlocalizedName());
		GameRegistry.registerItem(bronzeDust, bronzeDust.getUnlocalizedName());
				
	}
	
	public static void oreRegistration(){
		
		OreDictionary.registerOre("dustCoal", coalDust);
		OreDictionary.registerOre("dustIron", ironDust);
		OreDictionary.registerOre("dustTitanium", titaniumDust);
		OreDictionary.registerOre("dustIlmenite", ilmeniteDust);
		OreDictionary.registerOre("ingotBronze", bronzeIngot);
		OreDictionary.registerOre("ingotSteel", steelIngot);
		OreDictionary.registerOre("ingotTitanium", titaniumIngot);
		OreDictionary.registerOre("ingotHardenedSteel", hardenedSteelIngot);
		OreDictionary.registerOre("ingotCarbonSteel", carbonSteelIngot);
		
				
	}
}
