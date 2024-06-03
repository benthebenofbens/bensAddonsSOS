package net.btbob.bensaddons.worldgen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import org.apache.commons.lang3.concurrent.CircuitBreakingException;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");

    public static final ResourceKey<PlacedFeature> RED_CLAY_PLACED_KEY = registerKey("red_clay_placed");

    public static final ResourceKey<PlacedFeature> UPPER_LIMESTONE_PLACED_KEY = registerKey("upper_limestone_placed");
    public static final ResourceKey<PlacedFeature> LOWER_LIMESTONE_PLACED_KEY = registerKey("lower_limestone_placed");
    public static final ResourceKey<PlacedFeature> UPPER_SLATE_PLACED_KEY = registerKey("upper_slate_placed");
    public static final ResourceKey<PlacedFeature> LOWER_SLATE_PLACED_KEY = registerKey("lower_slate_placed");

    public static final ResourceKey<PlacedFeature> ROCK_SALT_PLACED_KEY = registerKey("rock_salt_placed");
    public static final ResourceKey<PlacedFeature> PUMICE_PLACED_KEY = registerKey("pumice_placed");

    public static final ResourceKey<PlacedFeature> MARBLE_PLACED_KEY = registerKey("marble_placed");
    public static final ResourceKey<PlacedFeature> CHERT_PLACED_KEY = registerKey("chert_placed");
    public static final ResourceKey<PlacedFeature> GABBRO_PLACED_KEY = registerKey("gabbro_placed");

    public static final ResourceKey<PlacedFeature> RUBY_GEODE_PLACED = registerKey("ruby_geode_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_GEODE_PLACED = registerKey("topaz_geode_placed");
    public static final ResourceKey<PlacedFeature> CITRINE_GEODE_PLACED = registerKey("citrine_geode_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_GEODE_PLACED = registerKey("peridot_geode_placed");
    public static final ResourceKey<PlacedFeature> AQUAMARINE_GEODE_PLACED = registerKey("aquamarine_geode_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_GEODE_PLACED = registerKey("sapphire_geode_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?,?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY), ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-63), VerticalAnchor.absolute(14))));
        register(context, ROCK_SALT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_ROCK_SALT_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, PUMICE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_PUMICE_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

        register(context, JADE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_JADE_ORE_KEY), ModOrePlacement.commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.absolute(-63), VerticalAnchor.absolute(0))));

        register(context, UPPER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_LIMESTONE_KEY), ModOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, LOWER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_LIMESTONE_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, UPPER_SLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_SLATE_KEY), ModOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        register(context, LOWER_SLATE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_SLATE_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, MARBLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_MARBLE_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, GABBRO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_GABBRO_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, CHERT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_CHERT_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));

        //RED CLAY
        register(context, RED_CLAY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RED_CLAY_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128))));
        //GEODES
        //      PlacementUtils.register(pContext, AMETHYST_GEODE, holder15, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, RUBY_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, TOPAZ_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, CITRINE_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRINE_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, PERIDOT_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOT_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, AQUAMARINE_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.AQUAMARINE_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, SAPPHIRE_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_GEODE_KEY), ModGeodePlacement.commonGeodePlacement(HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));

    }



    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(BensAddons.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
