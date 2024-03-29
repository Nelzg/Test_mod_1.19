package net.nelzg.tutorialmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nelzg.tutorialmod.block.ModBlocks;
import net.nelzg.tutorialmod.block.entity.ModBlockEntities;
import net.nelzg.tutorialmod.entity.ModEntityTypes;
import net.nelzg.tutorialmod.entity.client.ChomperRenderer;
import net.nelzg.tutorialmod.entity.client.RedBeastRenderer;
import net.nelzg.tutorialmod.entity.client.IgorRenderer;
import net.nelzg.tutorialmod.entity.client.SlavaRenderer;
import net.nelzg.tutorialmod.entity.client.IliyaRenderer;
import net.nelzg.tutorialmod.entity.client.IliyaMountRenderer;
import net.nelzg.tutorialmod.fluid.ModFluidTypes;
import net.nelzg.tutorialmod.fluid.ModFluids;
import net.nelzg.tutorialmod.item.ModItems;
import net.nelzg.tutorialmod.networking.ModMessages;
import net.nelzg.tutorialmod.painting.ModPaintings;
import net.nelzg.tutorialmod.recipe.ModRecipes;
import net.nelzg.tutorialmod.screen.GemInfusingStationScreen;
import net.nelzg.tutorialmod.screen.ModMenuTypes;
import net.nelzg.tutorialmod.sound.ModSoundsClass;
import net.nelzg.tutorialmod.villager.ModVillagers;
import net.nelzg.tutorialmod.world.feature.ModConfiguredFeatures;
import net.nelzg.tutorialmod.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MOD_ID)
public class TutorialMod
{
    public static final String MOD_ID = "tutorialmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public TutorialMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModVillagers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModSoundsClass.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        ModEntityTypes.register(modEventBus);
        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModMessages.register();
            ModVillagers.registerPOIs();
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SOAP_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SOAP_WATER.get(), RenderType.translucent());

            MenuScreens.register(ModMenuTypes.GEM_INFUSING_STATION_MENU.get(), GemInfusingStationScreen::new);

            EntityRenderers.register(ModEntityTypes.CHOMPER.get(), ChomperRenderer::new);
            EntityRenderers.register(ModEntityTypes.RED_BEAST.get(), RedBeastRenderer::new);
            EntityRenderers.register(ModEntityTypes.IGOR.get(), IgorRenderer::new);
            EntityRenderers.register(ModEntityTypes.SLAVA.get(), SlavaRenderer::new);
            EntityRenderers.register(ModEntityTypes.ILIYA.get(), IliyaRenderer::new);
            EntityRenderers.register(ModEntityTypes.ILIYA_MOUNT.get(), IliyaMountRenderer::new);
        }
    }
}
