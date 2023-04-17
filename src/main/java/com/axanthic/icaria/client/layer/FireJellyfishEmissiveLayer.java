package com.axanthic.icaria.client.layer;

import com.axanthic.icaria.client.registry.IcariaRenderTypes;
import com.axanthic.icaria.client.model.FireJellyfishModel;
import com.axanthic.icaria.common.entity.JellyfishEntity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class FireJellyfishEmissiveLayer extends RenderLayer<JellyfishEntity, FireJellyfishModel> {
    public FireJellyfishEmissiveLayer(RenderLayerParent<JellyfishEntity, FireJellyfishModel> pRenderer) {
        super(pRenderer);
    }

    @Override
    public void render(PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, JellyfishEntity pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        this.getParentModel().renderToBuffer(pPoseStack, pBuffer.getBuffer(IcariaRenderTypes.FIRE_JELLYFISH_EMISSIVE), LightTexture.FULL_SKY, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, !pLivingEntity.isInvisible() ? 1.0F : 0.0F);
    }
}
