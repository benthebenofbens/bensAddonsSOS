package net.btbob.bensaddons.worldgen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JADE_ORE_KEY = registerKey("jade_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("amber_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RED_CLAY_KEY = registerKey("red_clay");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ROCK_SALT_KEY = registerKey("ore_rock_salt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_PUMICE_KEY = registerKey("ore_pumice");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LIMESTONE_KEY = registerKey("ore_limestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MARBLE_KEY = registerKey("ore_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SLATE_KEY = registerKey("ore_slate");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_GABBRO_KEY = registerKey("ore_gabbro");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_CHERT_KEY = registerKey("ore_chert");

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_GEODE_KEY = registerKey("ruby_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_GEODE_KEY = registerKey("topaz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_GEODE_KEY = registerKey("citrine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PERIDOT_GEODE_KEY = registerKey("peridot_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AQUAMARINE_GEODE_KEY = registerKey("aquamarine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_GEODE_KEY = registerKey("sapphire_geode");


    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STONE_NODULE_KEY = registerKey("stone_nodule");



    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest rockSaltReplaceable = new TagMatchTest(ModTags.Blocks.ROCK_SALT_REPLACEABLE);
        RuleTest redClayReplaceable = new TagMatchTest(BlockTags.DIRT);

        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jadeOres = List.of(OreConfiguration.target(deepslateReplaceable, ModBlocks.JADE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldStoneNodule = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.STONE_NODULE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> rockSalt = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.ROCK_SALT.get().defaultBlockState()), OreConfiguration.target(rockSaltReplaceable, ModBlocks.ROCK_SALT.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> pumice = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.PUMICE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> limestone = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.LIMESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> slate = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.SLATE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> marble = List.of(OreConfiguration.target(deepslateReplaceable, ModBlocks.MARBLE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> gabbro = List.of(OreConfiguration.target(deepslateReplaceable, ModBlocks.GABBRO.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> chert = List.of(OreConfiguration.target(deepslateReplaceable, ModBlocks.CHERT.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> redClay = List.of(OreConfiguration.target(redClayReplaceable, ModBlocks.RED_CLAY.get().defaultBlockState()), OreConfiguration.target(stoneReplaceable, ModBlocks.RED_CLAY.get().defaultBlockState()));

        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 5));
        register(context, OVERWORLD_JADE_ORE_KEY, Feature.ORE, new OreConfiguration(jadeOres, 3));
        register(context, ORE_ROCK_SALT_KEY, Feature.ORE, new OreConfiguration(rockSalt, 64));
        register(context, ORE_PUMICE_KEY, Feature.ORE, new OreConfiguration(pumice, 64));
        register(context, OVERWORLD_STONE_NODULE_KEY, Feature.ORE, new OreConfiguration(overworldStoneNodule, 1));

        register(context, ORE_LIMESTONE_KEY, Feature.ORE, new OreConfiguration(limestone, 64));
        register(context, ORE_SLATE_KEY, Feature.ORE, new OreConfiguration(slate, 64));

        register(context, OVERWORLD_RED_CLAY_KEY, Feature.ORE, new OreConfiguration(redClay, 64));

        register(context, ORE_MARBLE_KEY, Feature.ORE, new OreConfiguration(marble, 64));
        register(context, ORE_CHERT_KEY, Feature.ORE, new OreConfiguration(chert, 64));
        register(context, ORE_GABBRO_KEY, Feature.ORE, new OreConfiguration(gabbro, 64));


        //GEODES
        register(context, RUBY_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.RUBY_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_RUBY.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_RUBY_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_RUBY_BUD.get().defaultBlockState(), ModBlocks.LARGE_RUBY_BUD.get().defaultBlockState(), ModBlocks.RUBY_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, TOPAZ_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.TOPAZ_BLOCK.get()), BlockStateProvider.simple(ModBlocks.BUDDING_TOPAZ.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.LARGE_TOPAZ_BUD.get().defaultBlockState(), ModBlocks.TOPAZ_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, CITRINE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.CITRINE_BLOCK.get()), BlockStateProvider.simple(ModBlocks.CITRINE_BLOCK.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_CITRINE_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_CITRINE_BUD.get().defaultBlockState(), ModBlocks.LARGE_CITRINE_BUD.get().defaultBlockState(), ModBlocks.CITRINE_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PERIDOT_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.PERIDOT_BLOCK.get()), BlockStateProvider.simple(ModBlocks.PERIDOT_BLOCK.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.LARGE_PERIDOT_BUD.get().defaultBlockState(), ModBlocks.PERIDOT_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, AQUAMARINE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.AQUAMARINE_BLOCK.get()), BlockStateProvider.simple(ModBlocks.AQUAMARINE_BLOCK.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_AQUAMARINE_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_AQUAMARINE_BUD.get().defaultBlockState(), ModBlocks.LARGE_AQUAMARINE_BUD.get().defaultBlockState(), ModBlocks.AQUAMARINE_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SAPPHIRE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(ModBlocks.SAPPHIRE_BLOCK.get()), BlockStateProvider.simple(ModBlocks.SAPPHIRE_BLOCK.get()), BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(ModBlocks.SMALL_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.MEDIUM_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.LARGE_SAPPHIRE_BUD.get().defaultBlockState(), ModBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D,2.2D,3.2D,4.2D), new GeodeCrackSettings(0.95D,2.0D,2),0.35D,0.083D, true, UniformInt.of(4,6), UniformInt.of(3,4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BensAddons.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
