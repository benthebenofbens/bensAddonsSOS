package net.btbob.bensaddons;

import com.mojang.logging.LogUtils;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.entity.ModBlockEntities;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.config.BensAddonsClientConfigs;
import net.btbob.bensaddons.config.BensAddonsCommonConfigs;
import net.btbob.bensaddons.entity.ModEntities;
import net.btbob.bensaddons.entity.client.SpookRenderer;
import net.btbob.bensaddons.item.ModCreativeModeTabs;
import net.btbob.bensaddons.item.ModItems;
import net.btbob.bensaddons.screen.ModMenuTypes;
import net.btbob.bensaddons.screen.MushroomGrowingBoxScreen;
import net.btbob.bensaddons.sound.ModSounds;
import net.btbob.bensaddons.util.ModWoodTypes;
import net.btbob.bensaddons.world.effect.ModMobEffects;
import net.btbob.bensaddons.worldgen.tree.ModFoliagePlacers;
import net.btbob.bensaddons.worldgen.tree.ModTreeDecoratorType;
import net.btbob.bensaddons.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BensAddons.MOD_ID)
public class BensAddons
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "bensaddons";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BensAddons()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        MushroomBlocks.register(modEventBus);

        ModMobEffects.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModSounds.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacers.register(modEventBus);
        ModTreeDecoratorType.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, BensAddonsClientConfigs.SPEC, "bensaddons-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BensAddonsCommonConfigs.SPEC, "bensaddons-common.toml");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLENDER.get(), RenderType.translucent());
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.INKY_CAP.getId(), MushroomBlocks.POTTED_INKY_CAP);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.GIANT_PUFFBALL.getId(), MushroomBlocks.POTTED_GIANT_PUFFBALL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.GRAY_MOREL.getId(), MushroomBlocks.POTTED_GRAY_MOREL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.BASKET_STINKHORN.getId(), MushroomBlocks.POTTED_BASKET_STINKHORN);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.INDIGO_MILKCAP.getId(), MushroomBlocks.POTTED_INDIGO_MILKCAP);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.DEATH_CAP.getId(), MushroomBlocks.POTTED_DEATH_CAP);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.DESTROYING_ANGEL.getId(), MushroomBlocks.POTTED_DESTROYING_ANGEL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.EARTHBALL.getId(), MushroomBlocks.POTTED_EARTHBALL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.FALSE_DEATH_CAP.getId(), MushroomBlocks.POTTED_FALSE_DEATH_CAP);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.DESERT_SHAGGY_MANE.getId(), MushroomBlocks.POTTED_DESERT_SHAGGY_MANE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.PORTABELLA.getId(), MushroomBlocks.POTTED_PORTABELLA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.SANDY_STILTBALL.getId(), MushroomBlocks.POTTED_SANDY_STILTBALL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.SUBBS_MUSHROOMS.getId(), MushroomBlocks.POTTED_SUBBS_MUSHROOMS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.GOLDEN_HALO.getId(), MushroomBlocks.POTTED_GOLDEN_HALO);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.BLACK_TRUFFLE.getId(), MushroomBlocks.POTTED_BLACK_TRUFFLE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.LILAC_BONNETS.getId(), MushroomBlocks.POTTED_LILAC_BONNETS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.FIRE_CORAL.getId(), MushroomBlocks.POTTED_FIRE_CORAL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.GLOWING_MUSHROOMS.getId(), MushroomBlocks.POTTED_GLOWING_MUSHROOMS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(MushroomBlocks.YELLOW_PARASOLS.getId(), MushroomBlocks.POTTED_YELLOW_PARASOLS);


            //MISC PLANTS
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CLOVER.getId(), ModBlocks.POTTED_CLOVER);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LUCKY_CLOVER.getId(), ModBlocks.POTTED_LUCKY_CLOVER);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TRUMPET_PITCHER.getId(), ModBlocks.POTTED_TRUMPET_PITCHER);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CUT_PEONY.getId(), ModBlocks.POTTED_CUT_PEONY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CUT_LILAC.getId(), ModBlocks.POTTED_CUT_LILAC);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CUT_ROSE.getId(), ModBlocks.POTTED_CUT_ROSE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CUT_ROSE.getId(), ModBlocks.POTTED_WHITE_CUT_ROSE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CUT_ROSE.getId(), ModBlocks.POTTED_PURPLE_CUT_ROSE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_CUT_ROSE.getId(), ModBlocks.POTTED_BLUE_CUT_ROSE);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_CELOSIA.getId(), ModBlocks.POTTED_MAGENTA_CELOSIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CELOSIA.getId(), ModBlocks.POTTED_PINK_CELOSIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_CELOSIA.getId(), ModBlocks.POTTED_YELLOW_CELOSIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_CELOSIA.getId(), ModBlocks.POTTED_ORANGE_CELOSIA);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SALVIA.getId(), ModBlocks.POTTED_SALVIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CEDAR_SALVIA.getId(), ModBlocks.POTTED_CEDAR_SALVIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VIOLET.getId(), ModBlocks.POTTED_VIOLET);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BIRD_OF_PARADISE.getId(), ModBlocks.POTTED_BIRD_OF_PARADISE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.IRIS.getId(), ModBlocks.POTTED_IRIS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DAFFODIL.getId(), ModBlocks.POTTED_DAFFODIL);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CONEFLOWER.getId(), ModBlocks.POTTED_CONEFLOWER);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DAHLIA.getId(), ModBlocks.POTTED_DAHLIA);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PANSY.getId(), ModBlocks.POTTED_PANSY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FIRE_PANSY.getId(), ModBlocks.POTTED_FIRE_PANSY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CREEPER_PANSY.getId(), ModBlocks.POTTED_CREEPER_PANSY);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_HYACINTH.getId(), ModBlocks.POTTED_BLUE_HYACINTH);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_HYACINTH.getId(), ModBlocks.POTTED_PURPLE_HYACINTH);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_HYACINTH.getId(), ModBlocks.POTTED_MAGENTA_HYACINTH);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_CUT_HIBISCUS.getId(), ModBlocks.POTTED_YELLOW_CUT_HIBISCUS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_CUT_HIBISCUS.getId(), ModBlocks.POTTED_RED_CUT_HIBISCUS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_CUT_HIBISCUS.getId(), ModBlocks.POTTED_PINK_CUT_HIBISCUS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_CUT_HIBISCUS.getId(), ModBlocks.POTTED_ORANGE_CUT_HIBISCUS);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CUT_HYDRANGEA.getId(), ModBlocks.POTTED_PURPLE_CUT_HYDRANGEA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_CUT_HYDRANGEA.getId(), ModBlocks.POTTED_BLUE_CUT_HYDRANGEA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_CUT_HYDRANGEA.getId(), ModBlocks.POTTED_MAGENTA_CUT_HYDRANGEA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CUT_HYDRANGEA.getId(), ModBlocks.POTTED_WHITE_CUT_HYDRANGEA);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_CUT_RHODODENDRON.getId(), ModBlocks.POTTED_PURPLE_CUT_RHODODENDRON);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_CUT_RHODODENDRON.getId(), ModBlocks.POTTED_BLUE_CUT_RHODODENDRON);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAGENTA_CUT_RHODODENDRON.getId(), ModBlocks.POTTED_MAGENTA_CUT_RHODODENDRON);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CUT_RHODODENDRON.getId(), ModBlocks.POTTED_WHITE_CUT_RHODODENDRON);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_LILY.getId(), ModBlocks.POTTED_WHITE_LILY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_LILY.getId(), ModBlocks.POTTED_PURPLE_LILY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_LILY.getId(), ModBlocks.POTTED_ORANGE_LILY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_LILY.getId(), ModBlocks.POTTED_PINK_LILY);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SEA_THRIFT.getId(), ModBlocks.POTTED_SEA_THRIFT);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BEACHGRASS.getId(), ModBlocks.POTTED_BEACHGRASS);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MAPLE_SAPLING.getId(), ModBlocks.POTTED_MAPLE_SAPLING);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PALM_SHOOT.getId(), ModBlocks.POTTED_PALM_SHOOT);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BAOBAB_SAPLING.getId(), ModBlocks.POTTED_BAOBAB_SAPLING);

            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BARREL_CACTUS.getId(), ModBlocks.POTTED_BARREL_CACTUS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ALOE.getId(), ModBlocks.POTTED_ALOE);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HAWORTHIA.getId(), ModBlocks.POTTED_HAWORTHIA);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FLOWERING_CACTUS.getId(), ModBlocks.POTTED_FLOWERING_CACTUS);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CUT_AEONIUM.getId(), ModBlocks.POTTED_CUT_AEONIUM);
            ( (FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CUT_OPUNTIA_CACTUS.getId(), ModBlocks.POTTED_CUT_OPUNTIA_CACTUS);
        });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.MORTAR_AND_PESTLE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {


        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            EntityRenderers.register(ModEntities.SPOOK.get(), SpookRenderer::new);

            MenuScreens.register(ModMenuTypes.MUSHROOM_GROWING_BOX_MENU.get(), MushroomGrowingBoxScreen::new);

            Sheets.addWoodType(ModWoodTypes.BAOBAB);
            Sheets.addWoodType(ModWoodTypes.MAPLE);
            Sheets.addWoodType(ModWoodTypes.PALM);


            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
