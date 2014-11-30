package com.advancedtunnelbore.handler;

import com.advancedtunnelbore.machine.blastfurnace.ContainerBlastFurnace;
import com.advancedtunnelbore.machine.blastfurnace.GuiBlastFurnace;
import com.advancedtunnelbore.machine.blastfurnace.TileEntityBlastFurnace;
import com.advancedtunnelbore.machine.grinder.ContainerGrinder;
import com.advancedtunnelbore.machine.grinder.GuiGrinder;
import com.advancedtunnelbore.machine.grinder.TileEntityGrinder;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class MyGuiHandler implements IGuiHandler {

	public MyGuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if(id == 0){
			TileEntityBlastFurnace tileEntityBlastFurnace = (TileEntityBlastFurnace) world.getTileEntity(x, y, z);
			return new ContainerBlastFurnace(player.inventory, tileEntityBlastFurnace);
		}
		
		if(id == 1){
			TileEntityGrinder tileEntityGrinder = (TileEntityGrinder) world.getTileEntity(x, y, z);
			return new ContainerGrinder(player.inventory, tileEntityGrinder);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if(id == 0){
			TileEntityBlastFurnace tileEntityBlastFurnaceContainer = (TileEntityBlastFurnace) world.getTileEntity(x, y, z);
			return new GuiBlastFurnace(player.inventory, tileEntityBlastFurnaceContainer);
		}
		
		if(id == 1){
			TileEntityGrinder tileEntityGrinderContainer = (TileEntityGrinder) world.getTileEntity(x, y, z);
			return new GuiGrinder(player.inventory, tileEntityGrinderContainer);
		}
		
		return null;
	}

}

