package net.nelzg.tutorialmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nelzg.tutorialmod.TutorialMod;
import net.nelzg.tutorialmod.block.ModBlocks;
import net.nelzg.tutorialmod.entity.ModEntityTypes;
import net.nelzg.tutorialmod.fluid.ModFluids;
import net.nelzg.tutorialmod.item.custom.EightBallItem;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SOAP_WATER,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> KAUPENSWORD = ITEMS.register("kaupensword",
            () -> new SwordItem(Tiers.DIAMOND, 10, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> CHOMPER_SPAWN_EGG = ITEMS.register("chomper_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHOMPER, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));
    public static final RegistryObject<Item> RED_BEAST_SPAWN_EGG = ITEMS.register("red_beast_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.RED_BEAST, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));

    public static final RegistryObject<Item> IGOR_SPAWN_EGG = ITEMS.register("igor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.IGOR, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));

    public static final RegistryObject<Item> SLAVA_SPAWN_EGG = ITEMS.register("slava_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SLAVA, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));

    public static final RegistryObject<Item> ILIYA_SPAWN_EGG = ITEMS.register("iliya_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ILIYA, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
