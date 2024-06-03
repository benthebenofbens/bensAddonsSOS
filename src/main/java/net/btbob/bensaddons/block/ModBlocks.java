package net.btbob.bensaddons.block;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.custom.*;
import net.btbob.bensaddons.item.ModItems;
import net.btbob.bensaddons.util.ModWoodTypes;
import net.btbob.bensaddons.worldgen.ModConfiguredFeatures;
import net.btbob.bensaddons.worldgen.tree.MapleTreeGrower;
import net.btbob.bensaddons.worldgen.tree.PalmTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BensAddons.MOD_ID);

    //PLANTS AND FLOWERS
    //PITCHER
    public static final RegistryObject<Block> TRUMPET_PITCHER = registerBlock("trumpet_pitcher", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_TRUMPET_PITCHER = registerBlock("potted_trumpet_pitcher", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.TRUMPET_PITCHER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //ZOMBIE BLOOM
    public static final RegistryObject<Block> ZOMBIE_BLOOM = registerBlock("zombie_bloom_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ZOMBIE_BLOOM_BOTTOM = registerBlock("zombie_bloom_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    //CATTAIL
    public static final RegistryObject<Block> CATTAIL = registerBlock("cattail_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS).noCollission().noOcclusion()));
    public static final RegistryObject<Block> CATTAIL_BOTTOM = registerBlock("cattail_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.TALL_GRASS).noCollission().noOcclusion()));
    //HYACINTH
    public static final RegistryObject<Block> BLUE_HYACINTH = registerBlock("blue_hyacinth", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_HYACINTH = registerBlock("potted_blue_hyacinth", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLUE_HYACINTH, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_HYACINTH = registerBlock("magenta_hyacinth", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_HYACINTH = registerBlock("potted_magenta_hyacinth", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAGENTA_HYACINTH, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_HYACINTH = registerBlock("purple_hyacinth", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_HYACINTH = registerBlock("potted_purple_hyacinth", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_HYACINTH, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //CONEFLOWER
    public static final RegistryObject<Block> CONEFLOWER = registerBlock("coneflower", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CONEFLOWER = registerBlock("potted_coneflower", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CONEFLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //DAHLIA
    public static final RegistryObject<Block> DAHLIA = registerBlock("dahlia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_DAHLIA = registerBlock("potted_dahlia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.DAHLIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //LILLIES
    public static final RegistryObject<Block> WHITE_LILY = registerBlock("white_lily", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_LILY = registerBlock("potted_white_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> PINK_LILY = registerBlock("pink_lily", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_LILY = registerBlock("potted_pink_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> ORANGE_LILY = registerBlock("orange_lily", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_LILY = registerBlock("potted_orange_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ORANGE_LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_LILY = registerBlock("purple_lily", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_LILY = registerBlock("potted_purple_lily", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_LILY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //TEOSINTE
    public static final RegistryObject<Block> TEOSINTE = registerBlock("teosinte_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> TEOSINTE_BOTTOM = registerBlock("teosinte_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    //PINEAPPLE
    public static final RegistryObject<Block> PINEAPPLE_PLANT = registerBlock("pineapple_plant_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PINEAPPLE_PLANT_BOTTOM = registerBlock("pineapple_plant_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));

    //HONEYSUCKLE
    public static final RegistryObject<Block> HONEYSUCKLE_VINES = registerBlock("honeysuckle_vines", () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    //SEA THRIFT
    public static final RegistryObject<Block> SEA_THRIFT = registerBlock("sea_thrift", () -> new FlowerBlock(MobEffects.WATER_BREATHING, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SEA_THRIFT = registerBlock("potted_sea_thrift", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.SEA_THRIFT, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //PANSY
    public static final RegistryObject<Block> PANSY = registerBlock("pansy", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PANSY = registerBlock("potted_pansy", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PANSY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //CREEPER PANSY
    public static final RegistryObject<Block> CREEPER_PANSY = registerBlock("creeper_pansy", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CREEPER_PANSY = registerBlock("potted_creeper_pansy", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CREEPER_PANSY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //FIRE PANSY
    public static final RegistryObject<Block> FIRE_PANSY = registerBlock("fire_pansy", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FIRE_PANSY = registerBlock("potted_fire_pansy", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.FIRE_PANSY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //IRIS
    public static final RegistryObject<Block> IRIS = registerBlock("iris", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_IRIS = registerBlock("potted_iris", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.IRIS, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //DAFFODIL
    public static final RegistryObject<Block> DAFFODIL = registerBlock("daffodil", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_DAFFODIL = registerBlock("potted_daffodil", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.DAFFODIL, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //VIOLET
    public static final RegistryObject<Block> VIOLET = registerBlock("violet", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_VIOLET = registerBlock("potted_violet", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VIOLET, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //BIRD OF PARADISE
    public static final RegistryObject<Block> BIRD_OF_PARADISE = registerBlock("bird_of_paradise", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BIRD_OF_PARADISE = registerBlock("potted_bird_of_paradise", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BIRD_OF_PARADISE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //CELOSIA
    public static final RegistryObject<Block> MAGENTA_CELOSIA_BUSH = registerBlock("magenta_celosia_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_CELOSIA_BUSH_BOTTOM = registerBlock("magenta_celosia_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_CELOSIA = registerBlock("magenta_celosia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_CELOSIA = registerBlock("potted_magenta_celosia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAGENTA_CELOSIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> PINK_CELOSIA_BUSH = registerBlock("pink_celosia_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PINK_CELOSIA_BUSH_BOTTOM = registerBlock("pink_celosia_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PINK_CELOSIA = registerBlock("pink_celosia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_CELOSIA = registerBlock("potted_pink_celosia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_CELOSIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_CELOSIA_BUSH = registerBlock("orange_celosia_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ORANGE_CELOSIA_BUSH_BOTTOM = registerBlock("orange_celosia_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ORANGE_CELOSIA = registerBlock("orange_celosia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_CELOSIA = registerBlock("potted_orange_celosia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ORANGE_CELOSIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_CELOSIA_BUSH = registerBlock("yellow_celosia_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> YELLOW_CELOSIA_BUSH_BOTTOM = registerBlock("yellow_celosia_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> YELLOW_CELOSIA = registerBlock("yellow_celosia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_CELOSIA = registerBlock("potted_yellow_celosia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_CELOSIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //SALVIA
    public static final RegistryObject<Block> SALVIA = registerBlock("salvia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SALVIA = registerBlock("potted_salvia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.SALVIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> CEDAR_SALVIA = registerBlock("cedar_salvia", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CEDAR_SALVIA = registerBlock("potted_cedar_salvia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CEDAR_SALVIA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //LILAC
    public static final RegistryObject<Block> CUT_LILAC = registerBlock("cut_lilac", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUT_LILAC = registerBlock("potted_cut_lilac", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_LILAC, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    //ROSE BUSHES
    //BLUE ROSE
    public static final RegistryObject<Block> BLUE_ROSE_BUSH = registerBlock("blue_rose_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_ROSE_BUSH_BOTTOM = registerBlock("blue_rose_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_CUT_ROSE = registerBlock("blue_cut_rose", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_CUT_ROSE = registerBlock("potted_blue_cut_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLUE_CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //WHITE ROSE
    public static final RegistryObject<Block> WHITE_ROSE_BUSH = registerBlock("white_rose_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_ROSE_BUSH_BOTTOM = registerBlock("white_rose_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_CUT_ROSE = registerBlock("white_cut_rose", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_CUT_ROSE = registerBlock("potted_white_cut_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //PURPLE ROSE
    public static final RegistryObject<Block> PURPLE_ROSE_BUSH = registerBlock("purple_rose_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_ROSE_BUSH_BOTTOM = registerBlock("purple_rose_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_CUT_ROSE = registerBlock("purple_cut_rose", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_CUT_ROSE = registerBlock("potted_purple_cut_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //RED ROSE
    public static final RegistryObject<Block> CUT_ROSE = registerBlock("cut_rose", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUT_ROSE = registerBlock("potted_cut_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //HIBISCUS BUSHES
    //YELLOW HIBISCUS
    public static final RegistryObject<Block> YELLOW_HIBISCUS_BUSH = registerBlock("yellow_hibiscus_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> YELLOW_HIBISCUS_BUSH_BOTTOM = registerBlock("yellow_hibiscus_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> YELLOW_CUT_HIBISCUS = registerBlock("yellow_cut_hibiscus", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_CUT_HIBISCUS = registerBlock("potted_yellow_cut_hibiscus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_CUT_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //RED HIBISCUS
    public static final RegistryObject<Block> RED_HIBISCUS_BUSH = registerBlock("red_hibiscus_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> RED_HIBISCUS_BUSH_BOTTOM = registerBlock("red_hibiscus_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> RED_CUT_HIBISCUS = registerBlock("red_cut_hibiscus", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_RED_CUT_HIBISCUS = registerBlock("potted_red_cut_hibiscus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_CUT_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //PINK HIBISCUS
    public static final RegistryObject<Block> PINK_HIBISCUS_BUSH = registerBlock("pink_hibiscus_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PINK_HIBISCUS_BUSH_BOTTOM = registerBlock("pink_hibiscus_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PINK_CUT_HIBISCUS = registerBlock("pink_cut_hibiscus", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_CUT_HIBISCUS = registerBlock("potted_pink_cut_hibiscus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_CUT_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //ORANGE HIBISCUS
    public static final RegistryObject<Block> ORANGE_HIBISCUS_BUSH = registerBlock("orange_hibiscus_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ORANGE_HIBISCUS_BUSH_BOTTOM = registerBlock("orange_hibiscus_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ORANGE_CUT_HIBISCUS = registerBlock("orange_cut_hibiscus", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_CUT_HIBISCUS = registerBlock("potted_orange_cut_hibiscus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ORANGE_CUT_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //CUT PEONY
    public static final RegistryObject<Block> CUT_PEONY = registerBlock("cut_peony", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUT_PEONY = registerBlock("potted_cut_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_PEONY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //CLOVERS
    public static final RegistryObject<Block> CLOVER = registerBlock("clover", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CLOVER = registerBlock("potted_clover", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CLOVER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    public static final RegistryObject<Block> LUCKY_CLOVER = registerBlock("lucky_clover", () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_LUCKY_CLOVER = registerBlock("potted_lucky_clover", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LUCKY_CLOVER, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //YUCCA
    public static final RegistryObject<Block> YUCCA = registerBlock("yucca_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> YUCCA_BOTTOM = registerBlock("yucca_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    //HYDRANGEA BUSHES
    //PURPLE HYDRANGEA
    public static final RegistryObject<Block> PURPLE_HYDRANGEA_BUSH = registerBlock("purple_hydrangea_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_HYDRANGEA_BUSH_BOTTOM = registerBlock("purple_hydrangea_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_CUT_HYDRANGEA = registerBlock("purple_cut_hydrangea", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_CUT_HYDRANGEA = registerBlock("potted_purple_cut_hydrangea", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_CUT_HYDRANGEA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //BLUE HYDRANGEA
    public static final RegistryObject<Block> BLUE_HYDRANGEA_BUSH = registerBlock("blue_hydrangea_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_HYDRANGEA_BUSH_BOTTOM = registerBlock("blue_hydrangea_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_CUT_HYDRANGEA = registerBlock("blue_cut_hydrangea", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_CUT_HYDRANGEA = registerBlock("potted_blue_cut_hydrangea", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLUE_CUT_HYDRANGEA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //MAGENTA HYDRANGEA
    public static final RegistryObject<Block> MAGENTA_HYDRANGEA_BUSH = registerBlock("magenta_hydrangea_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_HYDRANGEA_BUSH_BOTTOM = registerBlock("magenta_hydrangea_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_CUT_HYDRANGEA = registerBlock("magenta_cut_hydrangea", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_CUT_HYDRANGEA = registerBlock("potted_magenta_cut_hydrangea", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAGENTA_CUT_HYDRANGEA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //WHITE HYDRANGEA
    public static final RegistryObject<Block> WHITE_HYDRANGEA_BUSH = registerBlock("white_hydrangea_bush_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_HYDRANGEA_BUSH_BOTTOM = registerBlock("white_hydrangea_bush_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_CUT_HYDRANGEA = registerBlock("white_cut_hydrangea", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_CUT_HYDRANGEA = registerBlock("potted_white_cut_hydrangea", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CUT_HYDRANGEA, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //RHODODENDRON BUSHES
    //PURPLE RHODODENDRON
    public static final RegistryObject<Block> PURPLE_RHODODENDRON = registerBlock("purple_rhododendron_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_RHODODENDRON_BOTTOM = registerBlock("purple_rhododendron_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PURPLE_CUT_RHODODENDRON = registerBlock("purple_cut_rhododendron", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_CUT_RHODODENDRON = registerBlock("potted_purple_cut_rhododendron", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_CUT_RHODODENDRON, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //MAGENTA RHODODENDRON
    public static final RegistryObject<Block> MAGENTA_RHODODENDRON = registerBlock("magenta_rhododendron_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_RHODODENDRON_BOTTOM = registerBlock("magenta_rhododendron_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_CUT_RHODODENDRON = registerBlock("magenta_cut_rhododendron", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAGENTA_CUT_RHODODENDRON = registerBlock("potted_magenta_cut_rhododendron", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAGENTA_CUT_RHODODENDRON, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //BLUE RHODODENDRON
    public static final RegistryObject<Block> BLUE_RHODODENDRON = registerBlock("blue_rhododendron_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_RHODODENDRON_BOTTOM = registerBlock("blue_rhododendron_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BLUE_CUT_RHODODENDRON = registerBlock("blue_cut_rhododendron", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLUE_CUT_RHODODENDRON = registerBlock("potted_blue_cut_rhododendron", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLUE_CUT_RHODODENDRON, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));
    //WHITE RHODODENDRON
    public static final RegistryObject<Block> WHITE_RHODODENDRON = registerBlock("white_rhododendron_top", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_RHODODENDRON_BOTTOM = registerBlock("white_rhododendron_bottom", () -> new TallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WHITE_CUT_RHODODENDRON = registerBlock("white_cut_rhododendron", () -> new FlowerBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_CUT_RHODODENDRON = registerBlock("potted_white_cut_rhododendron", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CUT_RHODODENDRON, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    //MUSHROOMS
    public static final RegistryObject<Block> FAIRY_RING = registerBlock("fairy_ring", () -> new FairyCircleBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));


    //TO KEEP SHELVES

    //MUSHROOM BLOCKS
    public static final RegistryObject<Block> INK_CAP_MUSHROOM_BLOCK = registerBlock("ink_cap_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> INK_VINES = registerBlock("ink_vines", () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    public static final RegistryObject<Block> PUFFBALL_MUSHROOM_BLOCK = registerBlock("puffball_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> DAPPERLING_MUSHROOM_BLOCK = registerBlock("dapperling_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> MOREL_MUSHROOM_BLOCK = registerBlock("morel_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> OYSTER_MUSHROOM_BLOCK = registerBlock("oyster_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TRUFFLE_MUSHROOM_BLOCK = registerBlock("truffle_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> MILK_CAP_MUSHROOM_BLOCK = registerBlock("milk_cap_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> WAX_CAP_MUSHROOM_BLOCK = registerBlock("wax_cap_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> RUSSULA_MUSHROOM_BLOCK = registerBlock("russula_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> CHANGLE_MUSHROOM_BLOCK = registerBlock("changle_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> LOBSTER_TAIL_MUSHROOM_BLOCK = registerBlock("lobster_tail_mushroom_block", () -> new HugeMushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    //SUCCULENTS
    public static final RegistryObject<Block> BEACHGRASS = registerBlock("beachgrass", () -> new DesertBushBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BEACHGRASS = registerBlock("potted_beachgrass", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BEACHGRASS, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));

    public static final RegistryObject<Block> BARREL_CACTUS = registerBlock("barrel_cactus", () -> new PricklySucculentBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BARREL_CACTUS = registerBlock("potted_barrel_cactus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    public static final RegistryObject<Block> ALOE = registerBlock("aloe", () -> new PricklySucculentBlock(MobEffects.REGENERATION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_ALOE = registerBlock("potted_aloe", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    public static final RegistryObject<Block> HAWORTHIA = registerBlock("haworthia", () -> new SucculentBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_HAWORTHIA = registerBlock("potted_haworthia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_CACTUS = registerBlock("flowering_cactus", () -> new PricklySucculentBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FLOWERING_CACTUS = registerBlock("potted_flowering_cactus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    public static final RegistryObject<Block> AEONIUM_BUSH = registerBlock("aeonium_bush_top", () -> new DoubleSucculentBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> AEONIUM_BUSH_BOTTOM = registerBlock("aeonium_bush_bottom", () -> new DoubleSucculentBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> OPUNTIA_CACTUS = registerBlock("opuntia_cactus_top", () -> new PricklyDoubleSucculentBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> OPUNTIA_CACTUS_BOTTOM = registerBlock("opuntia_cactus_bottom", () -> new PricklyDoubleSucculentBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));

    public static final RegistryObject<Block> CUT_AEONIUM = registerBlock("cut_aeonium", () -> new SucculentBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUT_AEONIUM = registerBlock("potted_cut_aeonium", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_AEONIUM, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    public static final RegistryObject<Block> CUT_OPUNTIA_CACTUS = registerBlock("cut_opuntia_cactus", () -> new PricklySucculentBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_CUT_OPUNTIA_CACTUS = registerBlock("potted_cut_opuntia_cactus", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CUT_AEONIUM, BlockBehaviour.Properties.copy(Blocks.POTTED_CACTUS).noOcclusion()));
    //MISC PLANTS

    //WORLD BLOCKS
    //PLATINUM BLOCKS
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    //JADE BLOCKS
    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
   //PYRITE BLOCKS
   public static final RegistryObject<Block> PYRITE_ORE = registerBlock("pyrite_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)));
    public static final RegistryObject<Block> PYRITE_BLOCK = registerBlock("pyrite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    //STONE NODULE AND FOSSILS
    public static final RegistryObject<Block> STONE_NODULE = registerBlock("stone_nodule", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> AMMONITE_FOSSIL = registerBlock("ammonite_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> FERN_FOSSIL = registerBlock("fern_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> CLAW_FOSSIL = registerBlock("claw_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> TORCHFLOWER_FOSSIL = registerBlock("torchflower_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> ANOMALOCARIS_FOSSIL = registerBlock("anomalocaris_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> TRILOBITE_FOSSIL = registerBlock("trilobite_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> FOOTPRINTS_FOSSIL = registerBlock("footprints_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    public static final RegistryObject<Block> SPOOK_FOSSIL = registerBlock("spook_fossil", () -> new FossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()));
    //SNIFFER FOSSILS
    public static final RegistryObject<Block> SNIFFER_FOSSIL1 = registerBlock("sniffer_fossil1", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL2 = registerBlock("sniffer_fossil2", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL3 = registerBlock("sniffer_fossil3", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL4 = registerBlock("sniffer_fossil4", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL5 = registerBlock("sniffer_fossil5", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL6 = registerBlock("sniffer_fossil6", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL7 = registerBlock("sniffer_fossil7", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SNIFFER_FOSSIL8 = registerBlock("sniffer_fossil8", () -> new LimestoneFossilBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    //PEAT
    public static final RegistryObject<Block> PEAT = registerBlock("peat", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> RED_CLAY = registerBlock("red_clay", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY)));

    public static final RegistryObject<Block> GRASSY_PEAT = registerBlock("grassy_peat", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> LEAFY_PODZOL = registerBlock("leafy_podzol", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> MYCELIATED_DIRT = registerBlock("myceliated_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));
    //SAND VARIANTS
    //PINK SAND
    public static final RegistryObject<Block> PINK_SAND = registerBlock("pink_sand", () -> new SandBlock(16439512, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> PINK_SANDSTONE = registerBlock("pink_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> PINK_SANDSTONE_STAIRS = registerBlock("pink_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_SANDSTONE_SLAB = registerBlock("pink_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_SANDSTONE_WALL = registerBlock("pink_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE = registerBlock("pink_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_STAIRS = registerBlock("pink_smooth_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_SLAB = registerBlock("pink_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_WALL = registerBlock("pink_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));
    public static final RegistryObject<Block> PINK_CHISELED_SANDSTONE = registerBlock("pink_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> PINK_CUT_SANDSTONE = registerBlock("pink_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> PINK_CUT_SANDSTONE_STAIRS = registerBlock("pink_cut_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.PINK_CUT_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_CUT_SANDSTONE_SLAB = registerBlock("pink_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PINK_CUT_SANDSTONE_WALL = registerBlock("pink_cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));

    //BLACK SAND
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand", () -> new SandBlock( 2763306,BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> BLACK_SANDSTONE = registerBlock("black_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> BLACK_SANDSTONE_STAIRS = registerBlock("black_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_SANDSTONE_SLAB = registerBlock("black_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_SANDSTONE_WALL = registerBlock("black_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE = registerBlock("black_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_STAIRS = registerBlock("black_smooth_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_SLAB = registerBlock("black_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_WALL = registerBlock("black_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));
    public static final RegistryObject<Block> BLACK_CHISELED_SANDSTONE = registerBlock("black_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> BLACK_CUT_SANDSTONE = registerBlock("black_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> BLACK_CUT_SANDSTONE_STAIRS = registerBlock("black_cut_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.BLACK_CUT_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_CUT_SANDSTONE_SLAB = registerBlock("black_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BLACK_CUT_SANDSTONE_WALL = registerBlock("black_cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));

    //WHITE SAND
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand", () -> new SandBlock(15985633, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> WHITE_SANDSTONE = registerBlock("white_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_STAIRS = registerBlock("white_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_SLAB = registerBlock("white_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_WALL = registerBlock("white_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE = registerBlock("white_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_STAIRS = registerBlock("white_smooth_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_SLAB = registerBlock("white_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_WALL = registerBlock("white_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));
    public static final RegistryObject<Block> WHITE_CHISELED_SANDSTONE = registerBlock("white_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> WHITE_CUT_SANDSTONE = registerBlock("white_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> WHITE_CUT_SANDSTONE_STAIRS = registerBlock("white_cut_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.WHITE_CUT_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_CUT_SANDSTONE_SLAB = registerBlock("white_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WHITE_CUT_SANDSTONE_WALL = registerBlock("white_cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));

    //IRIDESCENT SAND
    public static final RegistryObject<Block> IRIDESCENT_SAND = registerBlock("iridescent_sand", () -> new SandBlock(15916981, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> IRIDESCENT_SANDSTONE = registerBlock("iridescent_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_SANDSTONE_STAIRS = registerBlock("iridescent_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.IRIDESCENT_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> IRIDESCENT_SANDSTONE_SLAB = registerBlock("iridescent_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_SANDSTONE_WALL = registerBlock("iridescent_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_SMOOTH_SANDSTONE = registerBlock("iridescent_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_SMOOTH_SANDSTONE_STAIRS = registerBlock("iridescent_smooth_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> IRIDESCENT_SMOOTH_SANDSTONE_SLAB = registerBlock("iridescent_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_SMOOTH_SANDSTONE_WALL = registerBlock("iridescent_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));
    public static final RegistryObject<Block> IRIDESCENT_CHISELED_SANDSTONE = registerBlock("iridescent_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_CUT_SANDSTONE = registerBlock("iridescent_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_CUT_SANDSTONE_STAIRS = registerBlock("iridescent_cut_sandstone_stairs", () -> new StairBlock(() -> ModBlocks.IRIDESCENT_CUT_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> IRIDESCENT_CUT_SANDSTONE_SLAB = registerBlock("iridescent_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> IRIDESCENT_CUT_SANDSTONE_WALL = registerBlock("iridescent_cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_WALL)));
    //ROCK SALT
    public static final RegistryObject<Block> ROCK_SALT = registerBlock("rock_salt", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    //PUMICE
    public static final RegistryObject<Block> PUMICE = registerBlock("pumice", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)));
    //GNEISS BLOCKS
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_GNEISS = registerBlock("cobbled_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ENERGIZED_COBBLED_GNEISS = registerBlock("energized_cobbled_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GNEISS = registerBlock("polished_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_GNEISS = registerBlock("chiseled_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GNEISS_BRICKS = registerBlock("gneiss_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_GNEISS_BRICKS = registerBlock("cracked_gneiss_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_BRICKS = registerBlock("energized_gneiss_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GNEISS_TILES = registerBlock("gneiss_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_GNEISS_TILES = registerBlock("cracked_gneiss_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ENERGIZED_GNEISS_TILES = registerBlock("energized_gneiss_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> SMOOTH_GNEISS = registerBlock("smooth_gneiss", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_GNEISS_SLAB = registerBlock("smooth_gneiss_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    //CHERT BLOCKS
    public static final RegistryObject<Block> CHERT = registerBlock("chert", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHERT_STAIRS = registerBlock("chert_stairs", () -> new StairBlock(() -> ModBlocks.CHERT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)));
    public static final RegistryObject<Block> CHERT_SLAB = registerBlock("chert_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final RegistryObject<Block> CHERT_WALL = registerBlock("chert_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_WALL)));
    public static final RegistryObject<Block> POLISHED_CHERT = registerBlock("polished_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_CHERT_STAIRS = registerBlock("polished_chert_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_CHERT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE_STAIRS)));
    public static final RegistryObject<Block> POLISHED_CHERT_SLAB = registerBlock("polished_chert_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE_SLAB)));
    public static final RegistryObject<Block> POLISHED_CHERT_WALL = registerBlock("polished_chert_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE_WALL)));
    public static final RegistryObject<Block> CHERT_BRICKS = registerBlock("chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CHERT_BRICK_STAIRS = registerBlock("chert_brick_stairs", () -> new StairBlock(() -> ModBlocks.CHERT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final RegistryObject<Block> CHERT_BRICK_SLAB = registerBlock("chert_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final RegistryObject<Block> CHERT_BRICK_WALL = registerBlock("chert_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_WALL)));
    public static final RegistryObject<Block> CRACKED_CHERT_BRICKS = registerBlock("cracked_chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_CHERT_BRICK_STAIRS = registerBlock("cracked_chert_brick_stairs", () -> new StairBlock(() -> ModBlocks.CHERT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS)));
    public static final RegistryObject<Block> CRACKED_CHERT_BRICK_SLAB = registerBlock("cracked_chert_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final RegistryObject<Block> CRACKED_CHERT_BRICK_WALL = registerBlock("cracked_chert_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_WALL)));

    public static final RegistryObject<Block> CHISELED_CHERT = registerBlock("chiseled_chert", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CHERT_TILES = registerBlock("chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_CHERT_TILES = registerBlock("cracked_chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRYSTALLINE_CHERT_TILES = registerBlock("crystalline_chert_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRYSTALLINE_CHERT_BRICKS = registerBlock("crystalline_chert_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    //GABBRO BLOCKS
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO = registerBlock("polished_gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_BRICKS = registerBlock("polished_gabbro_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_GABBRO_BRICKS = registerBlock("cracked_polished_gabbro_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_POLISHED_GABBRO = registerBlock("chiseled_polished_gabbro", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_STAIRS = registerBlock("gabbro_stairs", () -> new StairBlock(() -> ModBlocks.GABBRO.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_SLAB = registerBlock("gabbro_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GABBRO_WALL = registerBlock("gabbro_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_STAIRS = registerBlock("polished_gabbro_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_GABBRO.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_SLAB = registerBlock("polished_gabbro_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_WALL = registerBlock("polished_gabbro_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_BRICK_STAIRS = registerBlock("polished_gabbro_brick_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_GABBRO_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_BRICK_SLAB = registerBlock("polished_gabbro_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_GABBRO_BRICK_WALL = registerBlock("polished_gabbro_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_GABBRO_BRICK_STAIRS = registerBlock("cracked_polished_gabbro_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_GABBRO_BRICK_SLAB = registerBlock("cracked_polished_gabbro_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_GABBRO_BRICK_WALL = registerBlock("cracked_polished_gabbro_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));


    //LIMESTONE BLOCKS
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs", () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE = registerBlock("cobbled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LICHENY_COBBLED_LIMESTONE = registerBlock("licheny_cobbled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LICHENY_COBBLED_LIMESTONE_STAIRS = registerBlock("licheny_cobbled_limestone_stairs", () -> new StairBlock(() -> ModBlocks.COBBLED_LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LICHENY_COBBLED_LIMESTONE_SLAB = registerBlock("licheny_cobbled_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LICHENY_COBBLED_LIMESTONE_WALL = registerBlock("licheny_cobbled_limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> COBBLED_LIMESTONE_STAIRS = registerBlock("cobbled_limestone_stairs", () -> new StairBlock(() -> ModBlocks.COBBLED_LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_SLAB = registerBlock("cobbled_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_WALL = registerBlock("cobbled_limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = registerBlock("polished_limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_TILE = registerBlock("limestone_tile", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_TILE_STAIRS = registerBlock("limestone_tile_stairs", () -> new StairBlock(() -> ModBlocks.LIMESTONE_TILE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_TILE_SLAB = registerBlock("limestone_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_TILE_WALL = registerBlock("limestone_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_LIMESTONE = registerBlock("chiseled_limestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = registerBlock("cracked_limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LICHENY_LIMESTONE_BRICKS = registerBlock("licheny_limestone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs", () -> new StairBlock(() -> ModBlocks.LIMESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICK_STAIRS = registerBlock("cracked_limestone_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRACKED_LIMESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICK_SLAB = registerBlock("cracked_limestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICK_WALL = registerBlock("cracked_limestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LICHENY_LIMESTONE_BRICK_STAIRS = registerBlock("licheny_limestone_brick_stairs", () -> new StairBlock(() -> ModBlocks.LICHENY_LIMESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LICHENY_LIMESTONE_BRICK_SLAB = registerBlock("licheny_limestone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> LICHENY_LIMESTONE_BRICK_WALL = registerBlock("licheny_limestone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});


    //SLATE BLOCKS
    public static final RegistryObject<Block> SLATE = registerBlock("slate", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_STAIRS = registerBlock("slate_stairs", () -> new StairBlock(() -> ModBlocks.SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_SLAB = registerBlock("slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_WALL = registerBlock("slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_SLATE = registerBlock("cobbled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BEDAZZLED_COBBLED_SLATE = registerBlock("bedazzled_cobbled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CHISELED_SLATE = registerBlock("chiseled_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_BRICKS = registerBlock("bedazzled_slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICKS = registerBlock("cracked_slate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs", () -> new StairBlock(() -> ModBlocks.SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_BRICK_SLAB = registerBlock("slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_BRICK_WALL = registerBlock("slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_STAIRS = registerBlock("cracked_slate_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRACKED_SLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_SLAB = registerBlock("cracked_slate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SLATE_BRICK_WALL = registerBlock("cracked_slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_SLATE = registerBlock("polished_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_SLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_SLATE_WALL = registerBlock("polished_slate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> SLATE_TILES = registerBlock("slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_SLATE_TILES = registerBlock("cracked_slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> BEDAZZLED_SLATE_TILES = registerBlock("bedazzled_slate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SLATE_PILLAR = registerBlock("slate_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> SMOOTH_SLATE = registerBlock("smooth_slate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_SLATE_SLAB = registerBlock("smooth_slate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    //MARBLE BLOCKS
    public static final RegistryObject<Block> MARBLE = registerBlock("marble", () -> new StoneBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs", () -> new StairBlock(() -> ModBlocks.MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> MARBLE_WALL = registerBlock("marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_MARBLE = registerBlock("cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> PAINTED_COBBLED_MARBLE = registerBlock("painted_cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE = registerBlock("polished_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_MARBLE = registerBlock("chiseled_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICKS = registerBlock("polished_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> PAINTED_MARBLE_BRICKS = registerBlock("painted_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_MARBLE_BRICKS = registerBlock("cracked_polished_marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_STAIRS = registerBlock("polished_marble_brick_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_SLAB = registerBlock("polished_marble_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_WALL = registerBlock("polished_marble_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_MARBLE_BRICK_STAIRS = registerBlock("cracked_polished_marble_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_MARBLE_BRICK_SLAB = registerBlock("cracked_polished_marble_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_MARBLE_BRICK_WALL = registerBlock("cracked_polished_marble_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> MARBLE_PILLAR = registerBlock("marble_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> MARBLE_TILES = registerBlock("marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> PAINTED_MARBLE_TILES = registerBlock("painted_marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_MARBLE_TILES = registerBlock("cracked_marble_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));


    //BLACKSTONE
    public static final RegistryObject<Block> GILDED_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_polished_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final RegistryObject<Block> ANCIENT_STONE = registerBlock("ancient_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> OLDSTONE = registerBlock("oldstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SHATTERED_OLDSTONE = registerBlock("shattered_oldstone", () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> MOSSY_OLDSTONE = registerBlock("mossy_oldstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistryObject<Block> ANCIENT_BRICK = registerBlock("ancient_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> ANCIENT_ALLOY_BLOCK = registerBlock("ancient_alloy_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> GLOWRACK = registerBlock("glowrack", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)){
        @Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 15; }});
    public static final RegistryObject<Block> NETHERSTONE = registerBlock("netherstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    public static final RegistryObject<Block> PRESERVED_WOOD = registerBlock("preserved_wood", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PRESERVED_WOOD_DOOR = registerBlock("preserved_wood_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> PRESERVED_WOOD_TRAPDOOR = registerBlock("preserved_wood_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion(), BlockSetType.STONE));

    public static final RegistryObject<Block> PRESERVED_GRASS_BLOCK = registerBlock("preserved_grass_block", () -> new SnowyDirtBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));


    //AMETHYST BLOCKS
    public static final RegistryObject<Block> POLISHED_AMETHYST = registerBlock("polished_amethyst", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_AMETHYST = registerBlock("smooth_amethyst", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CUT_AMETHYST = registerBlock("cut_amethyst", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CHISELED_AMETHYST = registerBlock("chiseled_amethyst", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_PILLAR = registerBlock("amethyst_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));


    //RUBY BLOCKS
    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("ruby_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.RED )));
    public static final RegistryObject<Block> BUDDING_RUBY = registerBlock("budding_ruby", () -> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.RED )));

    public static final RegistryObject<Block> POLISHED_RUBY = registerBlock("polished_ruby", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_RUBY = registerBlock("smooth_ruby", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CUT_RUBY = registerBlock("cut_ruby", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CHISELED_RUBY = registerBlock("chiseled_ruby", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> RUBY_BRICKS = registerBlock("ruby_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
   // public static final RegistryObject<Block> RUBY_PILLAR = registerBlock("ruby_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //TOPAZ BLOCKS
    public static final RegistryObject<Block> TOPAZ_CLUSTER = registerBlock("topaz_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> LARGE_TOPAZ_BUD = registerBlock("large_topaz_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> MEDIUM_TOPAZ_BUD = registerBlock("medium_topaz_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> SMALL_TOPAZ_BUD = registerBlock("small_topaz_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> BUDDING_TOPAZ = registerBlock("budding_topaz", () -> new BuddingTopazBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.ORANGE)));

    public static final RegistryObject<Block> CHISELED_TOPAZ = registerBlock("chiseled_topaz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> TOPAZ_BRICKS = registerBlock("topaz_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //CITRINE BLOCKS
    public static final RegistryObject<Block> CITRINE_CLUSTER = registerBlock("citrine_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> LARGE_CITRINE_BUD = registerBlock("large_citrine_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> MEDIUM_CITRINE_BUD = registerBlock("medium_citrine_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> SMALL_CITRINE_BUD = registerBlock("small_citrine_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.YELLOW)));
    public static final RegistryObject<Block> BUDDING_CITRINE = registerBlock("budding_citrine", () -> new BuddingCitrineBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.YELLOW)));
    //PERIDOT BLOCKS
    public static final RegistryObject<Block> PERIDOT_CLUSTER = registerBlock("peridot_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> LARGE_PERIDOT_BUD = registerBlock("large_peridot_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> MEDIUM_PERIDOT_BUD = registerBlock("medium_peridot_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> SMALL_PERIDOT_BUD = registerBlock("small_peridot_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> BUDDING_PERIDOT = registerBlock("budding_peridot", () -> new BuddingPeridotBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.LIME)));

    public static final RegistryObject<Block> POLISHED_PERIDOT = registerBlock("polished_peridot", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_PERIDOT = registerBlock("smooth_peridot", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CUT_PERIDOT = registerBlock("cut_peridot", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CHISELED_PERIDOT = registerBlock("chiseled_peridot", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> PERIDOT_BRICKS = registerBlock("peridot_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> PERIDOT_PILLAR = registerBlock("peridot_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));



    //AQUAMARINE BLOCKS
    public static final RegistryObject<Block> AQUAMARINE_CLUSTER = registerBlock("aquamarine_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> LARGE_AQUAMARINE_BUD = registerBlock("large_aquamarine_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> MEDIUM_AQUAMARINE_BUD = registerBlock("medium_aquamarine_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.CYAN)));
   public static final RegistryObject<Block> SMALL_AQUAMARINE_BUD = registerBlock("small_aquamarine_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> BUDDING_AQUAMARINE = registerBlock("budding_aquamarine", () -> new BuddingAquamarineBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.CYAN)));

    public static final RegistryObject<Block> POLISHED_AQUAMARINE = registerBlock("polished_aquamarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_AQUAMARINE = registerBlock("smooth_aquamarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> CHISELED_AQUAMARINE = registerBlock("chiseled_aquamarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> AQUAMARINE_BRICKS = registerBlock("aquamarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //SAPPHIRE BLOCKS
    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster", () -> new AmethystClusterBlock(7,3,BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud", () -> new AmethystClusterBlock(5,3,BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud", () -> new AmethystClusterBlock(4,3,BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud", () -> new AmethystClusterBlock(3,4,BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE = registerBlock("budding_sapphire", () -> new BuddingSapphireBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).mapColor(DyeColor.BLUE)));
   //LEAF PILES
    public static final RegistryObject<Block> OAK_LEAF_PILE = registerBlock("oak_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> BIRCH_LEAF_PILE = registerBlock("birch_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> SPRUCE_LEAF_PILE = registerBlock("spruce_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> DARK_OAK_LEAF_PILE = registerBlock("dark_oak_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> AZALEA_LEAF_PILE = registerBlock("azalea_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAF_PILE = registerBlock("flowering_azalea_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> JUNGLE_LEAF_PILE = registerBlock("jungle_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> ACACIA_LEAF_PILE = registerBlock("acacia_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MANGROVE_LEAF_PILE = registerBlock("mangrove_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> CHERRY_LEAF_PILE = registerBlock("cherry_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> MAPLE_LEAF_PILE = registerBlock("maple_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().noOcclusion()));
    public static final RegistryObject<Block> PALM_LEAF_PILE = registerBlock("palm_leaf_pile", () -> new LeafPileBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noCollission().noOcclusion()));
    //MOSAICS
    public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BAOBAB_MOSAIC = registerBlock("baobab_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PALM_MOSAIC = registerBlock("palm_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WARPED_MOSAIC = registerBlock("warped_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAPLE_MOSAIC = registerBlock("maple_mosaic", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    //PAINTED PLANKS
    public static final RegistryObject<Block> RED_PAINTED_PLANKS = registerBlock("red_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ORANGE_PAINTED_PLANKS = registerBlock("orange_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_PAINTED_PLANKS = registerBlock("yellow_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GREEN_PAINTED_PLANKS = registerBlock("green_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIME_PAINTED_PLANKS = registerBlock("lime_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLUE_PAINTED_PLANKS = registerBlock("blue_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_BLUE_PAINTED_PLANKS = registerBlock("light_blue_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYAN_PAINTED_PLANKS = registerBlock("cyan_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_PAINTED_PLANKS = registerBlock("purple_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAGENTA_PAINTED_PLANKS = registerBlock("magenta_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_PAINTED_PLANKS = registerBlock("pink_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WHITE_PAINTED_PLANKS = registerBlock("white_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAY_PAINTED_PLANKS = registerBlock("gray_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LIGHT_GRAY_PAINTED_PLANKS = registerBlock("light_gray_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_PAINTED_PLANKS = registerBlock("black_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BROWN_PAINTED_PLANKS = registerBlock("brown_painted_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    //MAPLE WOOD BLOCKS
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling", () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_MAPLE_SAPLING = registerBlock("potted_maple_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAPLE_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 20; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 5; }});

    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 30; }});

    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs", () -> new StairBlock(() -> ModBlocks.MAPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS), BlockSetType.OAK));
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MAPLE));

    //TREE TAP
    public static final RegistryObject<Block> TREE_TAP = registerBlock("tree_tap", () -> new TreeTapBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    //public static final RegistryObject<Block> MAPLE_SYRUP_CAULDRON = registerBlock("maple_syrup_cauldron", () -> new LayeredCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), LayeredCauldronBlock.RAIN, CauldronInteraction.WATER));

    //PALM WOOD BLOCKS
    public static final RegistryObject<Block> PALM_SHOOT = registerBlock("palm_shoot", () -> new PalmShootBlock(new PalmTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
   public static final RegistryObject<Block> POTTED_PALM_SHOOT = registerBlock("potted_palm_shoot", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PALM_SHOOT, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PALM_WOOD = registerBlock("palm_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
       @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
      @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 20; }
        @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 5; }});
    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 30; }});
    public static final RegistryObject<Block> PALM_STAIRS = registerBlock("palm_stairs", () -> new StairBlock(() -> ModBlocks.PALM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> PALM_SLAB = registerBlock("palm_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> PALM_BUTTON = registerBlock("palm_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS), BlockSetType.OAK));
    public static final RegistryObject<Block> PALM_FENCE = registerBlock("palm_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PALM_FENCE_GATE = registerBlock("palm_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> PALM_DOOR = registerBlock("palm_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PALM_TRAPDOOR = registerBlock("palm_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> COCONUT_BUNCH = registerBlock("coconut_bunch", () -> new CoconutBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion().noCollission()));

    public static final RegistryObject<Block> PALM_SIGN = BLOCKS.register("palm_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_SIGN = BLOCKS.register("palm_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_HANGING_SIGN = BLOCKS.register("palm_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_HANGING_SIGN = BLOCKS.register("palm_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PALM));





    //BAOBAB WOOD BLOCKS
    public static final RegistryObject<Block> BAOBAB_SAPLING = registerBlock("baobab_sapling", () -> new SaplingBlock(new PalmTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_BAOBAB_SAPLING = registerBlock("potted_baobab_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PALM_SHOOT, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> BAOBAB_LOG = registerBlock("baobab_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BAOBAB_WOOD = registerBlock("baobab_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
 //   public static final RegistryObject<Block> BAOBAB_LEAVES = registerBlock("baobab_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
 //       @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
 //       @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 20; }
 //       @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 5; }});
    public static final RegistryObject<Block> BAOBAB_PLANKS = registerBlock("baobab_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 30; }});
    public static final RegistryObject<Block> BAOBAB_STAIRS = registerBlock("baobab_stairs", () -> new StairBlock(() -> ModBlocks.BAOBAB_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BAOBAB_SLAB = registerBlock("baobab_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BAOBAB_BUTTON = registerBlock("baobab_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS), BlockSetType.OAK));
    public static final RegistryObject<Block> BAOBAB_FENCE = registerBlock("baobab_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BAOBAB_DOOR = registerBlock("baobab_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BAOBAB_TRAPDOOR = registerBlock("baobab_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BAOBAB_SIGN = BLOCKS.register("baobab_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_SIGN = BLOCKS.register("baobab_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_HANGING_SIGN = BLOCKS.register("baobab_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_HANGING_SIGN = BLOCKS.register("baobab_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BAOBAB));


    //CUT BLOCKS
    public static final RegistryObject<Block> CUT_QUARTZ_BLOCK = registerBlock("cut_quartz_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));


    //DECORATIVE BLOCKS
    public static final RegistryObject<Block> BRICK_TILE = registerBlock("brick_tile", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_TILE_STAIRS = registerBlock("brick_tile_stairs", () -> new StairBlock(() -> ModBlocks.BRICK_TILE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_TILE_SLAB = registerBlock("brick_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_TILE_WALL = registerBlock("brick_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CHISELED_BRICKS = registerBlock("chiseled_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_BRICKS = registerBlock("cracked_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRACKED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> BRICK_PILLAR = registerBlock("brick_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));


    public static final RegistryObject<Block> BLENDER = registerBlock("blender", () -> new BlenderBlock(BlockBehaviour.Properties.copy(Blocks.STONECUTTER).noOcclusion()));

    //BAMBOO
    public static final RegistryObject<Block> BAMBOO_BUNDLE = registerBlock("bamboo_bundle", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_BLOCK)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BUNDLE = registerBlock("stripped_bamboo_bundle", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BAMBOO_BLOCK)));

    //STAIR-SLAB-WALL
    //STONE SET
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", () -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> STONE_PILLAR = registerBlock("stone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs", () -> new StairBlock(() -> ModBlocks.POLISHED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_STONE_WALL = registerBlock("polished_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));


    //Other
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    //CRACKED STONE
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs", () -> new StairBlock(() -> Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    //DEEPSLATE BLOCKS
    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs", () -> new StairBlock(() -> Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs", () -> new StairBlock(() -> Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs", () -> new StairBlock(() -> Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));

    public static final RegistryObject<Block> SKULKED_COBBLED_DEEPSLATE = registerBlock("skulked_cobbled_deepslate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> SKULKED_COBBLED_DEEPSLATE_STAIRS = registerBlock("skulked_cobbled_deepslate_stairs", () -> new StairBlock(() -> ModBlocks.SKULKED_COBBLED_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> SKULKED_COBBLED_DEEPSLATE_SLAB = registerBlock("skulked_cobbled_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> SKULKED_COBBLED_DEEPSLATE_WALL = registerBlock("skulked_cobbled_deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_BRICKS = registerBlock("skulked_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_BRICK_STAIRS = registerBlock("skulked_deepslate_brick_stairs", () -> new StairBlock(() -> ModBlocks.SKULKED_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_BRICK_SLAB = registerBlock("skulked_deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_BRICK_WALL = registerBlock("skulked_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_TILES = registerBlock("skulked_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_TILE_STAIRS = registerBlock("skulked_deepslate_tile_stairs", () -> new StairBlock(() -> ModBlocks.SKULKED_DEEPSLATE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_TILE_SLAB = registerBlock("skulked_deepslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SKULKED_DEEPSLATE_TILE_WALL = registerBlock("skulked_deepslate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)));



    //BLACKSTONE
    public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs", () -> new StairBlock(() -> Blocks.GILDED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs", () -> new StairBlock(() -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_polished_blackstone_brick_stairs", () -> new StairBlock(() -> ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));
    public static final RegistryObject<Block> GILDED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_polished_blackstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)));

    //CALCITE
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs", () -> new StairBlock(() -> Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    //DRIPSTONE
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock("dripstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    //QUARTZ
    public static final RegistryObject<Block> CUT_QUARTZ_STAIRS = registerBlock("cut_quartz_stairs", () -> new StairBlock(() -> ModBlocks.CUT_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> CUT_QUARTZ_SLAB = registerBlock("cut_quartz_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> CUT_QUARTZ_WALL = registerBlock("cut_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", () -> new StairBlock(() -> Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> QUARTZ_WALL = registerBlock("quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));


    //THE BORING STUFF
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
