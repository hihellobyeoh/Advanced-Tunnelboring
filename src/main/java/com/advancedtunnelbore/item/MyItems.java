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
	
	//Ingots--textures done
	public static Item bronzeIngot = new Item().setUnlocalizedName("bzIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Ingot");
	public static Item steelIngot = new Item().setUnlocalizedName("stIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Ingot");
	public static Item hardenedSteelIngot = new Item().setUnlocalizedName("hstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Ingot");
	public static Item carbonSteelIngot = new Item().setUnlocalizedName("cstIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Ingot");
	public static Item titaniumIngot = new Item().setUnlocalizedName("tIngot").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Ingot");
	
	//Wheels--textures done
	public static Item ironWheel = new Item().setUnlocalizedName("iwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Wheel");
	public static Item bronzeWheel = new Item().setUnlocalizedName("bzwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Wheel");
	public static Item steelWheel = new Item().setUnlocalizedName("stwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Wheel");
	public static Item hardenedSteelWheel = new Item().setUnlocalizedName("hstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Wheel");
	public static Item carbonSteelWheel = new Item().setUnlocalizedName("cstwheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Wheel");
	public static Item titaniumWheel = new Item().setUnlocalizedName("twheel").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Wheel");
	
	//Axles
	public static Item ironAxle = new Item().setUnlocalizedName("iaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Axle");
	public static Item bronzeAxle = new Item().setUnlocalizedName("bzaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Axle");
	public static Item steelAxle = new Item().setUnlocalizedName("staxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Axle");
	public static Item hardenedSteelAxle = new Item().setUnlocalizedName("hstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Axle");
	public static Item carbonSteelAxle = new Item().setUnlocalizedName("cstaxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Axle");
	public static Item titaniumAxle = new Item().setUnlocalizedName("taxle").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Axle");
	
	//Gears--Iron Gear is Done others need to be made
	public static Item ironGear = new Item().setUnlocalizedName("igear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Gear");
	public static Item bronzeGear = new Item().setUnlocalizedName("bzgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Gear");
	public static Item steelGear = new Item().setUnlocalizedName("stgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Gear");
	public static Item hardenedSteelGear = new Item().setUnlocalizedName("hstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Gear");
	public static Item carbonSteelGear = new Item().setUnlocalizedName("cstgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Gear");
	public static Item titaniumGear = new Item().setUnlocalizedName("tgear").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Gear");
	
	//Gearboxes
	public static Item ironGearBox = new Item().setUnlocalizedName("igearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Gearbox");
	public static Item bronzeGearBox = new Item().setUnlocalizedName("bzgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Gearbox");
	public static Item steelGearBox = new Item().setUnlocalizedName("stgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Gearbox");
	public static Item hardenedSteelGearBox = new Item().setUnlocalizedName("hstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Gearbox");
	public static Item carbonSteelGearBox = new Item().setUnlocalizedName("cstgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Gearbox");
	public static Item titaniumGearBox = new Item().setUnlocalizedName("tgearbx").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Gearbox");
	
	//Rods
	public static Item ironRod = new Item().setUnlocalizedName("irod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Rod");
	public static Item bronzeRod = new Item().setUnlocalizedName("bzrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Rod");
	public static Item steelRod = new Item().setUnlocalizedName("strod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Rod");
	public static Item hardenedSteelRod = new Item().setUnlocalizedName("hstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Rod");
	public static Item carbonSteelRod = new Item().setUnlocalizedName("cstrod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Rod");
	public static Item titaniumRod = new Item().setUnlocalizedName("trod").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Rod");
	
	//Beams--textures done
	public static Item ironBeam = new Item().setUnlocalizedName("ibeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Beam");
	public static Item bronzeBeam = new Item().setUnlocalizedName("bzbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Beam");
	public static Item steelBeam = new Item().setUnlocalizedName("stbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Beam");
	public static Item hardenedSteelBeam = new Item().setUnlocalizedName("hstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Beam");
	public static Item carbonSteelBeam = new Item().setUnlocalizedName("cstbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Beam");
	public static Item titaniumBeam = new Item().setUnlocalizedName("tbeam").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Beam");
	
	//Sticks--Iron Stick is done, others need to be made
	public static Item ironStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Stick");
	public static Item bronzeStick = new Item().setUnlocalizedName("bzStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Bronze_Stick");
	public static Item steelStick = new Item().setUnlocalizedName("stStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Steel_Stick");
	public static Item hardenedSteelStick = new Item().setUnlocalizedName("hstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Hardened_Steel_Stick");
	public static Item carbonSteelStick = new Item().setUnlocalizedName("cstStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Carbon_Steel_Stick");
	public static Item titaniumStick = new Item().setUnlocalizedName("tStick").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Stick");
	
	//Dusts
	public static Item coalDust = new Item().setUnlocalizedName("coaldust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Coal_Dust");
	public static Item ilmeniteDust = new Item().setUnlocalizedName("ilmenitedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Ilmenite_Dust");
	public static Item titaniumDust = new Item().setUnlocalizedName("tdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Titanium_Dust");
	public static Item ironDust = new Item().setUnlocalizedName("idust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Dust");
	public static Item bronzeDust = new Item().setUnlocalizedName("bronzedust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Dust");
	public static Item copperDust = new Item().setUnlocalizedName("copperdust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Dust");
	public static Item tinDust = new Item().setUnlocalizedName("tindust").setCreativeTab(MainRegistry.tabTunnelB).setMaxStackSize(64).setTextureName(RefStrings.MODID + ":Iron_Dust");
	
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
