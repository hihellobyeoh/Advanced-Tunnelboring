package com.advancedtunnelbore.handler;

import com.advancedtunnelbore.gui.GuiBlastFurnace;
import com.advancedtunnelbore.gui.GuiGrinder;
import com.advancedtunnelbore.inventory.ContainerBlastFurnace;
import com.advancedtunnelbore.inventory.ContainerGrinder;
import com.advancedtunnelbore.tile_entity.TileEntityBlastFurnace;
import com.advancedtunnelbore.tile_entity.TileEntityGrinder;

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

