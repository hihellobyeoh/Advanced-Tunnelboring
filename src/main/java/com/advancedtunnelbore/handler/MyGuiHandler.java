package com.advancedtunnelbore.handler;

import com.advancedtunnelbore.gui.GuiBlastFurnace;
import com.advancedtunnelbore.inventory.ContainerBlastFurnace;
import com.advancedtunnelbore.tile_entity.TileEntityBlastFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class MyGuiHandler implements IGuiHandler {

	
	
	public MyGuiHandler (){
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityBlastFurnace tileEntityFurnace = (TileEntityBlastFurnace) world.getTileEntity(x, y, z);
			return new ContainerBlastFurnace(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityBlastFurnace tileEntityTestContainer = (TileEntityBlastFurnace) world.getTileEntity(x, y, z);
			return new GuiBlastFurnace(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}

