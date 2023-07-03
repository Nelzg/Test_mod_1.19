package net.nelzg.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.entity.custom.IliyaEntity;
import net.nelzg.tutorialmod.entity.custom.SlavaEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SlavaRenderer extends GeoEntityRenderer<SlavaEntity> {
    public SlavaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SlavaModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SlavaEntity instance) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/slava_texture.png");
    }

    @Override
    public RenderType getRenderType(SlavaEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @Override
    protected float getDeathMaxRotation(SlavaEntity entityLivingBaseIn) {
        return 0.0F;
    }
}
