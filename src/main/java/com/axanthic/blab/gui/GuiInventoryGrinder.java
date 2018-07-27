package com.axanthic.blab.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.axanthic.blab.utils.TileEntityGrinder;

@SideOnly(Side.CLIENT)
public class GuiInventoryGrinder extends GuiContainer {

	private static final ResourceLocation texture = new ResourceLocation("blab", "textures/gui/crafting_grinder_gui.png");
	private final InventoryPlayer playerInventory;
	private TileEntityGrinder tileEntity;

	public GuiInventoryGrinder(InventoryPlayer invPlayer, TileEntityGrinder tile) {
		super(new ContainerGrinder(invPlayer, tile));
		this.playerInventory = invPlayer;
		this.tileEntity = tile;
		xSize = 176;
		ySize = 207;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}

	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.tileEntity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 0x504537);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, 73, 0x504537);
	}

	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);

		if (TileEntityFurnace.isBurning(this.tileEntity)) {
			int k = this.getBurnLeftScaled(52);
			this.drawTexturedModalRect(guiLeft + 142, guiTop + 17 + 51 - k, 176, 17 + 51 - k, 4, k + 1);
		}

		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(guiLeft + 57, guiTop + 17, 176, 0, l + 1, 16);
	}

	private int getCookProgressScaled(int pixels) {
		int i = this.tileEntity.getField(2);
		int j = this.tileEntity.getField(3);
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}

	private int getBurnLeftScaled(int pixels) {
		int i = this.tileEntity.getField(1);

		if (i == 0) {
			i = 200;
		}

		return this.tileEntity.getField(0) * pixels / i;
	}
}