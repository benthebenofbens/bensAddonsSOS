package net.btbob.bensaddons.util;

import net.btbob.bensaddons.BensAddons;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = tag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_JADE_TOOL = tag("needs_jade_tool");
        public static final TagKey<Block> MAPLE_LOGS = tag ("maple_logs");
        public static final TagKey<Block> LILLIES = tag ("lillies");
        public static final TagKey<Block> ROCK_SALT_REPLACEABLE = tag ("rock_salt_replaceable");
        public static final TagKey<Block> RED_CLAY_REPLACEABLE = tag ("red_clay_replaceable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BensAddons.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SMALL_MUSHROOMS = tag("small_mushrooms");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BensAddons.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> WORLD = tag("world");
        public static final TagKey<Biome> WORLD_TROPIC = tag("world_tropic");
        public static final TagKey<Biome> WORLD_TROPIC_AND_ARID = tag("world_tropic_and_arid");
        public static final TagKey<Biome> WORLD_TROPIC_AND_TEMPERATE = tag("world_tropic_and_temperate");
        public static final TagKey<Biome> WORLD_TEMPERATE = tag("world_temperate");
        public static final TagKey<Biome> WORLD_TEMPERATE_AND_ARCTIC = tag("world_temperate_and_arctic");
        public static final TagKey<Biome> WORLD_ARCTIC = tag("world_arctic");
        public static final TagKey<Biome> WOODLANDS = tag("woodlands");
        public static final TagKey<Biome> ROSE_SPAWNS = tag("rose_spawns");
        public static final TagKey<Biome> WOODLANDS_AND_SNOW = tag("woodlands_and_snow");
        public static final TagKey<Biome> FOREST = tag("forest");
        public static final TagKey<Biome> TAIGA = tag("taiga");
        public static final TagKey<Biome> TAIGA_AND_SNOWY_TAIGA = tag("taiga_and_snowy_taiga");
        public static final TagKey<Biome> SNOWY_TAIGA = tag("snowy_taiga");
        public static final TagKey<Biome> BIRCH_FOREST = tag("birch_forest");
        public static final TagKey<Biome> DARK_FOREST = tag("dark_forest");
        public static final TagKey<Biome> JUNGLE = tag("jungle");
        public static final TagKey<Biome> WETLANDS = tag("wetlands");
        public static final TagKey<Biome> SWAMP = tag("swamp");
        public static final TagKey<Biome> FLATLANDS = tag("flatlands");
        public static final TagKey<Biome> FLATLANDS_AND_SNOWY = tag("flatlands_and_snowy");
        public static final TagKey<Biome> MOUNTAINOUS = tag("mountainous");
        public static final TagKey<Biome> OCEANS = tag("oceans");
        public static final TagKey<Biome> MOUNTAINOUS_WITH_SNOW = tag("mountainous_with_snow");
        public static final TagKey<Biome> ARID = tag("arid");
        public static final TagKey<Biome> STONE_BEACH = tag("stone_beach");
        public static final TagKey<Biome> BADLANDS = tag("badlands");
        public static final TagKey<Biome> DESERTS = tag("deserts");
        public static final TagKey<Biome> DESERT = tag("desert");
        public static final TagKey<Biome> BEACH = tag("beach");
        public static final TagKey<Biome> PALM_TREE_COMMON_SPAWNS = tag("palm_tree_common_spawns");
        public static final TagKey<Biome> PALM_TREE_RARE_SPAWNS = tag("palm_tree_rare_spawns");


        private static TagKey<Biome> tag(String name) {
            return biomeCreate(new ResourceLocation(BensAddons.MOD_ID, name));
        }
    }

    public static TagKey<Biome> biomeCreate(ResourceLocation name) {
        return TagKey.create(Registries.BIOME, name);
    }


}
