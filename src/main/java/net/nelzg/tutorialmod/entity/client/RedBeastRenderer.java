package net.nelzg.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;

import net.nelzg.tutorialmod.entity.custom.RedBeastEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RedBeastRenderer extends GeoEntityRenderer<RedBeastEntity> {
    public RedBeastRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RedBeastModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(RedBeastEntity instance) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/red_beast_texture.png");
    }

    @Override
    public RenderType getRenderType(RedBeastEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
