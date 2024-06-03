package net.btbob.bensaddons.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.entity.custom.SpookEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpookRenderer extends MobRenderer<SpookEntity, SpookModel<SpookEntity>> {
    public SpookRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SpookModel<>(pContext.bakeLayer(ModModelLayers.SPOOK_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SpookEntity pEntity) {
        return new ResourceLocation(BensAddons.MOD_ID, "textures/entity/spook.png");
    }

    @Override
    public void render(SpookEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
