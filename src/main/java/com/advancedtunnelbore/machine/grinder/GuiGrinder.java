package com.advancedtunnelbore.machine.grinder;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiGrinder extends GuiContainer {

	private static final ResourceLocation furnaceGuiTextures = new ResourceLocation("textures/gui/container/furnace.png");
	private TileEntityGrinder tileGrinder;
	
	
	public GuiGrinder(InventoryPlayer invPlayer, TileEntityGrinder tileEntityGrinderContainer) {
		super(new ContainerGrinder(invPlayer, tileEntityGrinderContainer));
		this.tileGrinder = tileEntityGrinderContainer;
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2){
		String string = this.tileGrinder.hasCustomInventoryName() ? this.tileGrinder.getInventoryName() : I18n.format(this.tileGrinder.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(string, this.xSize / 2 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	        int i1;

	        if (this.tileGrinder.isBurning()){
	            i1 = this.tileGrinder.getBurnTimeRemainingScaled(12);
	            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
	        }

	        i1 = this.tileGrinder.getCookProgressScaled(24);
	        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
	}

}