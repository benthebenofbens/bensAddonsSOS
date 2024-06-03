package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagGenerator extends BiomeTagsProvider {
    public ModBiomeTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, lookupProvider, BensAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Biomes.WORLD)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST,
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                        Biomes.SNOWY_TAIGA,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE,
                        Biomes.RIVER,
                        Biomes.FROZEN_RIVER,
                        Biomes.SWAMP,
                        Biomes.MANGROVE_SWAMP,
                        Biomes.PLAINS,
                        Biomes.SUNFLOWER_PLAINS,
                        Biomes.SNOWY_PLAINS,
                        Biomes.ICE_SPIKES,
                        Biomes.SAVANNA,
                        Biomes.SAVANNA_PLATEAU,
                        Biomes.WINDSWEPT_SAVANNA,
                        Biomes.WOODED_BADLANDS,
                        Biomes.MEADOW,
                        Biomes.CHERRY_GROVE,
                        Biomes.GROVE,
                        Biomes.SNOWY_SLOPES,
                        Biomes.WINDSWEPT_HILLS,
                        Biomes.WINDSWEPT_GRAVELLY_HILLS,
                        Biomes.WINDSWEPT_FOREST,
                        Biomes.BIRCH_FOREST
                );

        this.tag(ModTags.Biomes.WORLD_ARCTIC)
                .add(
                        Biomes.SNOWY_TAIGA,
                        Biomes.FROZEN_RIVER,
                        Biomes.SNOWY_PLAINS,
                        Biomes.ICE_SPIKES,
                        Biomes.GROVE,
                        Biomes.SNOWY_SLOPES
                );

        this.tag(ModTags.Biomes.PALM_TREE_COMMON_SPAWNS).add(Biomes.BEACH);
        this.tag(ModTags.Biomes.BEACH).add(Biomes.BEACH);
        this.tag(ModTags.Biomes.OCEANS).add(
                Biomes.OCEAN,
                Biomes.COLD_OCEAN,
                Biomes.DEEP_COLD_OCEAN,
                Biomes.DEEP_FROZEN_OCEAN,
                Biomes.DEEP_LUKEWARM_OCEAN,
                Biomes.DEEP_OCEAN,
                Biomes.FROZEN_OCEAN,
                Biomes.WARM_OCEAN,
                Biomes.LUKEWARM_OCEAN
                );
        this.tag(ModTags.Biomes.PALM_TREE_RARE_SPAWNS).add(Biomes.DESERT);

        this.tag(ModTags.Biomes.WORLD_TEMPERATE_AND_ARCTIC)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST,
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                        Biomes.SNOWY_TAIGA,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.RIVER,
                        Biomes.FROZEN_RIVER,
                        Biomes.PLAINS,
                        Biomes.SUNFLOWER_PLAINS,
                        Biomes.SNOWY_PLAINS,
                        Biomes.ICE_SPIKES,
                        Biomes.MEADOW,
                        Biomes.CHERRY_GROVE,
                        Biomes.GROVE,
                        Biomes.SNOWY_SLOPES,
                        Biomes.WINDSWEPT_HILLS,
                        Biomes.WINDSWEPT_GRAVELLY_HILLS,
                        Biomes.WINDSWEPT_FOREST,
                        Biomes.BIRCH_FOREST
                );

        this.tag(ModTags.Biomes.BADLANDS).add(Biomes.BADLANDS,Biomes.ERODED_BADLANDS,Biomes.WOODED_BADLANDS);
        this.tag(ModTags.Biomes.DESERTS).add(Biomes.BADLANDS,Biomes.ERODED_BADLANDS,Biomes.DESERT);
        this.tag(ModTags.Biomes.DESERT).add(Biomes.DESERT);

        this.tag(ModTags.Biomes.WORLD_TEMPERATE)
                    .add(
                            Biomes.FOREST,
                            Biomes.FLOWER_FOREST,
                            Biomes.TAIGA,
                            Biomes.OLD_GROWTH_PINE_TAIGA,
                            Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                            Biomes.BIRCH_FOREST,
                            Biomes.OLD_GROWTH_BIRCH_FOREST,
                            Biomes.SWAMP,
                            Biomes.DARK_FOREST,
                            Biomes.RIVER,
                            Biomes.PLAINS,
                            Biomes.SUNFLOWER_PLAINS,
                            Biomes.ICE_SPIKES,
                            Biomes.MEADOW,
                            Biomes.CHERRY_GROVE,
                            Biomes.WINDSWEPT_HILLS,
                            Biomes.WINDSWEPT_GRAVELLY_HILLS,
                            Biomes.WINDSWEPT_FOREST,
                            Biomes.BIRCH_FOREST
                    );

        this.tag(ModTags.Biomes.WORLD_TROPIC_AND_TEMPERATE)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.SWAMP,
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE,
                        Biomes.RIVER,
                        Biomes.SWAMP,
                        Biomes.MANGROVE_SWAMP,
                        Biomes.PLAINS,
                        Biomes.SUNFLOWER_PLAINS,
                        Biomes.SAVANNA,
                        Biomes.SAVANNA_PLATEAU,
                        Biomes.WINDSWEPT_SAVANNA,
                        Biomes.WOODED_BADLANDS,
                        Biomes.MEADOW,
                        Biomes.CHERRY_GROVE,
                        Biomes.BIRCH_FOREST
                );

        this.tag(ModTags.Biomes.WORLD_TROPIC)
                .add(
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE,
                        Biomes.MANGROVE_SWAMP
                );

        this.tag(ModTags.Biomes.WORLD_TROPIC_AND_ARID)
                .add(
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE,
                        Biomes.MANGROVE_SWAMP,
                        Biomes.SAVANNA,
                        Biomes.SAVANNA_PLATEAU,
                        Biomes.WINDSWEPT_SAVANNA,
                        Biomes.WOODED_BADLANDS,
                        Biomes.ERODED_BADLANDS,
                        Biomes.BADLANDS,
                        Biomes.DESERT
                );

        this.tag(ModTags.Biomes.WOODLANDS)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST,
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE
                );

        this.tag(ModTags.Biomes.WOODLANDS_AND_SNOW)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST,
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                        Biomes.SNOWY_TAIGA,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE
                );

        this.tag(ModTags.Biomes.FOREST)
                .add(
                        Biomes.FOREST,
                        Biomes.FLOWER_FOREST
                );

        this.tag(ModTags.Biomes.ROSE_SPAWNS)
                .add(
                        Biomes.FOREST,
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.DARK_FOREST,
                        Biomes.FLOWER_FOREST
                );

        this.tag(ModTags.Biomes.TAIGA)
                .add(
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA
                );

        this.tag(ModTags.Biomes.TAIGA_AND_SNOWY_TAIGA)
                .add(
                        Biomes.TAIGA,
                        Biomes.OLD_GROWTH_PINE_TAIGA,
                        Biomes.OLD_GROWTH_SPRUCE_TAIGA,
                        Biomes.SNOWY_TAIGA
                );

        this.tag(ModTags.Biomes.SNOWY_TAIGA)
                .add(
                        Biomes.SNOWY_TAIGA
                );


        this.tag(ModTags.Biomes.BIRCH_FOREST)
                .add(
                        Biomes.BIRCH_FOREST,
                        Biomes.OLD_GROWTH_BIRCH_FOREST
                );

        this.tag(ModTags.Biomes.DARK_FOREST)
                .add(
                        Biomes.DARK_FOREST
                );

        this.tag(ModTags.Biomes.JUNGLE)
                .add(
                        Biomes.JUNGLE,
                        Biomes.SPARSE_JUNGLE,
                        Biomes.BAMBOO_JUNGLE
                );

        this.tag(ModTags.Biomes.WETLANDS)
                .add(
                        Biomes.SWAMP,
                        Biomes.MANGROVE_SWAMP
                );

        this.tag(ModTags.Biomes.FLATLANDS_AND_SNOWY)
                .add(
                        Biomes.PLAINS,
                        Biomes.SUNFLOWER_PLAINS,
                        Biomes.SNOWY_PLAINS,
                        Biomes.ICE_SPIKES
                );

        this.tag(ModTags.Biomes.FLATLANDS)
                .add(
                        Biomes.PLAINS,
                        Biomes.SUNFLOWER_PLAINS
                );

        this.tag(ModTags.Biomes.MOUNTAINOUS)
                .add(
                        Biomes.MEADOW,
                        Biomes.CHERRY_GROVE,
                        Biomes.GROVE,
                        Biomes.WINDSWEPT_GRAVELLY_HILLS,
                        Biomes.WINDSWEPT_FOREST
                );

        this.tag(ModTags.Biomes.MOUNTAINOUS_WITH_SNOW)
                .add(
                        Biomes.MEADOW,
                        Biomes.CHERRY_GROVE,
                        Biomes.GROVE,
                        Biomes.SNOWY_SLOPES,
                        Biomes.WINDSWEPT_HILLS,
                        Biomes.WINDSWEPT_GRAVELLY_HILLS,
                        Biomes.WINDSWEPT_FOREST
                        );

        this.tag(ModTags.Biomes.STONE_BEACH)
                .add(
                        Biomes.STONY_SHORE
                );

        this.tag(ModTags.Biomes.ARID)
                .add(
                        Biomes.SAVANNA,
                        Biomes.SAVANNA_PLATEAU,
                        Biomes.WINDSWEPT_SAVANNA,
                        Biomes.WOODED_BADLANDS,
                        Biomes.BADLANDS,
                        Biomes.ERODED_BADLANDS,
                        Biomes.DESERT
                );




    }
}
