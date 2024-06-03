package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.item.ModToolTiers;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BensAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.NEEDS_PLATINUM_TOOL);

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                     ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                     ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
        this.tag(Tags.Blocks.NEEDS_GOLD_TOOL);
        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_HOE)
        .add(
                ModBlocks.INK_VINES.get()
        );
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                        ModBlocks.PLATINUM_ORE.get(),
                        ModBlocks.RAW_PLATINUM_BLOCK.get(),
                        ModBlocks.SLATE.get(),
                        ModBlocks.MARBLE.get(),
                        ModBlocks.LIMESTONE.get(),
                        ModBlocks.STONE_NODULE.get(),
                        ModBlocks.AMMONITE_FOSSIL.get()

        );

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
        .add(
                ModBlocks.PEAT.get(),
                ModBlocks.IRIDESCENT_SAND.get(),
                ModBlocks.BLACK_SAND.get(),
                ModBlocks.WHITE_SAND.get(),
                ModBlocks.PINK_SAND.get()
        );
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(
                        //MUSHROOMS
                        ModBlocks.INK_CAP_MUSHROOM_BLOCK.get(),
                        ModBlocks.PUFFBALL_MUSHROOM_BLOCK.get(),
                        ModBlocks.MOREL_MUSHROOM_BLOCK.get(),
                        ModBlocks.OYSTER_MUSHROOM_BLOCK.get(),
                        ModBlocks.DAPPERLING_MUSHROOM_BLOCK.get(),
                        ModBlocks.MILK_CAP_MUSHROOM_BLOCK.get(),
                        ModBlocks.TRUFFLE_MUSHROOM_BLOCK.get(),
                        ModBlocks.WAX_CAP_MUSHROOM_BLOCK.get(),
                        ModBlocks.RUSSULA_MUSHROOM_BLOCK.get(),
                        ModBlocks.LOBSTER_TAIL_MUSHROOM_BLOCK.get(),
                        ModBlocks.CHANGLE_MUSHROOM_BLOCK.get(),

                        ModBlocks.MAPLE_PLANKS.get(),
                        ModBlocks.PALM_PLANKS.get(),
                        ModBlocks.COCONUT_BUNCH.get(),
                        ModBlocks.BAOBAB_PLANKS.get()

                );

        this.tag(BlockTags.CLIMBABLE).add(ModBlocks.INK_VINES.get(), ModBlocks.HONEYSUCKLE_VINES.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MAPLE_FENCE.get(),
                ModBlocks.BAOBAB_FENCE.get(),
                ModBlocks.PALM_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAPLE_FENCE_GATE.get(),
                ModBlocks.BAOBAB_FENCE_GATE.get(),
                        ModBlocks.PALM_FENCE_GATE.get());

        this.tag(ModTags.Blocks.ROCK_SALT_REPLACEABLE).add(Blocks.TERRACOTTA);

        this.tag(BlockTags.SAND).add(
                ModBlocks.PINK_SAND.get(),
                ModBlocks.BLACK_SAND.get(),
                ModBlocks.IRIDESCENT_SAND.get(),
                ModBlocks.WHITE_SAND.get()
        );
        this.tag(BlockTags.LEAVES).add(ModBlocks.PALM_LEAVES.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.LIMESTONE_WALL.get(),
                ModBlocks.SLATE_WALL.get(),
                ModBlocks.MARBLE_WALL.get(),
                ModBlocks.BRICK_TILE_WALL.get(),
                ModBlocks.CRACKED_BRICK_WALL.get(),
                        ModBlocks.COBBLED_LIMESTONE_WALL.get(),
                        ModBlocks.LICHENY_COBBLED_LIMESTONE_WALL.get(),
                        ModBlocks.POLISHED_SLATE_WALL.get(),
                        ModBlocks.POLISHED_MARBLE_WALL.get(),
                        ModBlocks.CHERT_WALL.get(),
                        ModBlocks.CHERT_BRICK_WALL.get(),
                        ModBlocks.CRACKED_CHERT_BRICK_WALL.get(),
                        ModBlocks.POLISHED_CHERT_WALL.get(),
                        ModBlocks.LIMESTONE_TILE_WALL.get(),
                        ModBlocks.POLISHED_LIMESTONE_WALL.get(),
                        ModBlocks.LIMESTONE_BRICK_WALL.get(),
                        ModBlocks.LICHENY_LIMESTONE_BRICK_WALL.get(),
                        ModBlocks.CRACKED_LIMESTONE_BRICK_WALL.get(),
                        ModBlocks.POLISHED_MARBLE_BRICK_WALL.get(),
                        ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_WALL.get(),
                        ModBlocks.GABBRO_WALL.get(),
                        ModBlocks.POLISHED_GABBRO_BRICK_WALL.get(),
                        ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_WALL.get(),
                        ModBlocks.POLISHED_GABBRO_WALL.get(),
                        ModBlocks.PINK_SANDSTONE_WALL.get(),
                        ModBlocks.BLACK_SANDSTONE_WALL.get(),
                        ModBlocks.WHITE_SANDSTONE_WALL.get(),
                        ModBlocks.IRIDESCENT_SANDSTONE_WALL.get(),
                        ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_WALL.get(),
                        ModBlocks.PINK_SMOOTH_SANDSTONE_WALL.get(),
                        ModBlocks.BLACK_SMOOTH_SANDSTONE_WALL.get(),
                        ModBlocks.WHITE_SMOOTH_SANDSTONE_WALL.get(),
                        ModBlocks.IRIDESCENT_CUT_SANDSTONE_WALL.get(),
                        ModBlocks.PINK_CUT_SANDSTONE_WALL.get(),
                        ModBlocks.BLACK_CUT_SANDSTONE_WALL.get(),
                        ModBlocks.WHITE_CUT_SANDSTONE_WALL.get(),
                        ModBlocks.CRACKED_STONE_BRICK_WALL.get(),
                        ModBlocks.DEEPSLATE_WALL.get(),
                        ModBlocks.CALCITE_WALL.get(),
                        ModBlocks.DRIPSTONE_WALL.get(),
                        ModBlocks.SLATE_BRICK_WALL.get(),
                        ModBlocks.STONE_WALL.get(),
                        ModBlocks.SMOOTH_STONE_WALL.get(),
                        ModBlocks.POLISHED_ANDESITE_WALL.get(),
                        ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                        ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),
                        ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(),
                        ModBlocks.GILDED_BLACKSTONE_WALL.get(),
                        ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                        ModBlocks.POLISHED_DIORITE_WALL.get(),
                        ModBlocks.POLISHED_GRANITE_WALL.get(),
                        ModBlocks.QUARTZ_BRICK_WALL.get(),
                        ModBlocks.SMOOTH_QUARTZ_WALL.get(),
                        ModBlocks.QUARTZ_WALL.get(),
                        ModBlocks.POLISHED_STONE_WALL.get(),
                        ModBlocks.CUT_QUARTZ_WALL.get(),

                        ModBlocks.SKULKED_DEEPSLATE_BRICK_WALL.get(),
                        ModBlocks.SKULKED_DEEPSLATE_TILE_WALL.get(),
                        ModBlocks.SKULKED_COBBLED_DEEPSLATE_WALL.get(),

                        ModBlocks.CRACKED_SLATE_BRICK_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(
                ModBlocks.MAPLE_LOG.get(),
                ModBlocks.MAPLE_WOOD.get(),
                ModBlocks.STRIPPED_MAPLE_LOG.get(),
                ModBlocks.STRIPPED_MAPLE_WOOD.get(),
                        ModBlocks.BAOBAB_LOG.get(),
                        ModBlocks.BAOBAB_WOOD.get(),
                        ModBlocks.PALM_LOG.get(),
                        ModBlocks.PALM_WOOD.get(),
                        ModBlocks.STRIPPED_PALM_LOG.get(),
                        ModBlocks.STRIPPED_PALM_WOOD.get(),
                        ModBlocks.STRIPPED_BAOBAB_LOG.get(),
                        ModBlocks.STRIPPED_BAOBAB_WOOD.get()
        );
        this.tag(BlockTags.TALL_FLOWERS)
                .add(
                        ModBlocks.YELLOW_CELOSIA_BUSH.get(),
                        ModBlocks.MAGENTA_CELOSIA_BUSH.get(),
                        ModBlocks.PINK_CELOSIA_BUSH.get(),
                        ModBlocks.ORANGE_CELOSIA_BUSH.get(),
                        ModBlocks.BLUE_ROSE_BUSH.get(),
                        ModBlocks.WHITE_ROSE_BUSH.get(),
                        ModBlocks.PURPLE_ROSE_BUSH.get(),
                        ModBlocks.YELLOW_HIBISCUS_BUSH.get(),
                        ModBlocks.RED_HIBISCUS_BUSH.get(),
                        ModBlocks.ORANGE_HIBISCUS_BUSH.get(),
                        ModBlocks.PINK_HIBISCUS_BUSH.get(),
                        ModBlocks.PURPLE_HYDRANGEA_BUSH.get(),
                        ModBlocks.BLUE_HYDRANGEA_BUSH.get(),
                        ModBlocks.WHITE_HYDRANGEA_BUSH.get(),
                        ModBlocks.ZOMBIE_BLOOM.get(),
                        ModBlocks.CATTAIL.get(),
                        ModBlocks.YUCCA.get(),
                        ModBlocks.PURPLE_RHODODENDRON.get(),
                        ModBlocks.BLUE_RHODODENDRON.get(),
                        ModBlocks.MAGENTA_RHODODENDRON.get(),
                        ModBlocks.MAGENTA_HYDRANGEA_BUSH.get()
                );

        this.tag(BlockTags.PLANKS)
                .add(
                        ModBlocks.MAPLE_PLANKS.get(),
                        ModBlocks.BAOBAB_PLANKS.get(),
                        ModBlocks.PALM_PLANKS.get()
                );


        this.tag(BlockTags.SMALL_FLOWERS)
                .add(
                        ModBlocks.MAGENTA_CELOSIA.get(),
                        ModBlocks.YELLOW_CELOSIA.get(),
                        ModBlocks.PINK_CELOSIA.get(),
                        ModBlocks.ORANGE_CELOSIA.get(),

                        ModBlocks.WHITE_LILY.get(),
                        ModBlocks.ORANGE_LILY.get(),
                        ModBlocks.PINK_LILY.get(),
                        ModBlocks.PURPLE_LILY.get(),

                        ModBlocks.PANSY.get(),
                        ModBlocks.CREEPER_PANSY.get(),
                        ModBlocks.FIRE_PANSY.get(),

                        ModBlocks.MAGENTA_HYACINTH.get(),
                        ModBlocks.PURPLE_HYACINTH.get(),
                        ModBlocks.BLUE_HYACINTH.get(),

                        ModBlocks.BIRD_OF_PARADISE.get(),
                        ModBlocks.DAFFODIL.get(),
                        ModBlocks.SALVIA.get(),
                        ModBlocks.VIOLET.get(),
                        ModBlocks.CONEFLOWER.get(),
                        ModBlocks.IRIS.get(),
                        ModBlocks.TRUMPET_PITCHER.get(),
                        ModBlocks.DAHLIA.get()
                );

        this.tag(ModTags.Blocks.MAPLE_LOGS)
                .add(
                        ModBlocks.MAPLE_LOG.get(),
                        ModBlocks.MAPLE_WOOD.get(),
                        ModBlocks.STRIPPED_MAPLE_LOG.get(),
                        ModBlocks.STRIPPED_MAPLE_WOOD.get()
                );

        this.tag(BlockTags.DIRT).add(ModBlocks.LEAFY_PODZOL.get(), ModBlocks.GRASSY_PEAT.get());



    }
}
