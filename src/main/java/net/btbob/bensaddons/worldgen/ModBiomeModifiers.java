package net.btbob.bensaddons.worldgen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.http.message.TokenParser;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_JADE_ORE = registerKey("add_jade_ore");

    public static final ResourceKey<BiomeModifier> ADD_RED_CLAY = registerKey("add_red_clay");

    public static final ResourceKey<BiomeModifier> ADD_RUBY_GEODE = registerKey("add_ruby_geode");
    public static final ResourceKey<BiomeModifier> ADD_TOPAZ_GEODE = registerKey("add_topaz_geode");
    public static final ResourceKey<BiomeModifier> ADD_CITRINE_GEODE = registerKey("add_citrine_geode");
    public static final ResourceKey<BiomeModifier> ADD_PERIDOT_GEODE = registerKey("add_peridot_geode");
    public static final ResourceKey<BiomeModifier> ADD_AQUAMARINE_GEODE = registerKey("add_aquamarine_geode");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_GEODE = registerKey("add_sapphire_geode");

    public static final ResourceKey<BiomeModifier> ADD_ROCK_SALT = registerKey("add_rock_salt");
    public static final ResourceKey<BiomeModifier> ADD_PUMICE = registerKey("add_pumice");

    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_UPPER = registerKey("add_limestone_upper");
    public static final ResourceKey<BiomeModifier> ADD_MARBLE = registerKey("add_marble");
    public static final ResourceKey<BiomeModifier> ADD_SLATE_UPPER = registerKey("add_slate_upper");
    public static final ResourceKey<BiomeModifier> ADD_GABBRO = registerKey("add_gabbro");
    public static final ResourceKey<BiomeModifier> ADD_CHERT = registerKey("add_chert");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_LOWER = registerKey("add_limestone_lower");
    public static final ResourceKey<BiomeModifier> ADD_SLATE_LOWER = registerKey("add_slate_lower");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //ORES
        context.register(ADD_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLATINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_JADE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JADE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        //STONES
        context.register(ADD_ROCK_SALT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.ARID), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ROCK_SALT_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_PUMICE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.WORLD_TROPIC_AND_ARID), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PUMICE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SLATE_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.UPPER_SLATE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SLATE_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LOWER_SLATE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LIMESTONE_UPPER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.UPPER_LIMESTONE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LIMESTONE_LOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LOWER_LIMESTONE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MARBLE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CHERT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHERT_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GABBRO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GABBRO_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_RED_CLAY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.JUNGLE), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RED_CLAY_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        //GEODES
        context.register(ADD_RUBY_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.WORLD_TEMPERATE), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));
        context.register(ADD_TOPAZ_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.ARID), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TOPAZ_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));
        context.register(ADD_CITRINE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.MOUNTAINOUS_WITH_SNOW), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CITRINE_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));
        context.register(ADD_PERIDOT_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.WORLD_TROPIC), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PERIDOT_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));
        context.register(ADD_AQUAMARINE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.OCEANS), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AQUAMARINE_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));
        context.register(ADD_SAPPHIRE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(ModTags.Biomes.WORLD_ARCTIC), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SAPPHIRE_GEODE_PLACED)), GenerationStep.Decoration.LOCAL_MODIFICATIONS));

    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(BensAddons.MOD_ID, name));
    }
}
