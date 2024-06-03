package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) { super(output, BensAddons.MOD_ID, exFileHelper); }

    @Override
    protected void registerStatesAndModels() {
        //MUSHROOM BLOCKS
        blockWithItem(ModBlocks.PUFFBALL_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.INK_CAP_MUSHROOM_BLOCK);

        simpleBlockWithItem(ModBlocks.INK_VINES.get(), models().singleTexture("ink_vines", new ResourceLocation("vine"), "plant", blockTexture(ModBlocks.INK_VINES.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.HONEYSUCKLE_VINES.get(), models().singleTexture("honeysuckle_vines", new ResourceLocation("vine"), "plant", blockTexture(ModBlocks.HONEYSUCKLE_VINES.get())).renderType("cutout"));

        blockWithItem(MushroomBlocks.MUSHROOM_GROWING_BOX);

        blockWithItem(ModBlocks.OYSTER_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.MOREL_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.DAPPERLING_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.TRUFFLE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.MILK_CAP_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.WAX_CAP_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.RUSSULA_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.CHANGLE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.LOBSTER_TAIL_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.STONE_NODULE);

        //MUSHROOM PLANTS
        simpleBlockWithItem(ModBlocks.FAIRY_RING.get(), models().crop(blockTexture(ModBlocks.FAIRY_RING.get()).getPath(), blockTexture(ModBlocks.FAIRY_RING.get())).renderType("cutout"));


        //MUSHROOM BLOCKS
        simpleBlockWithItem(MushroomBlocks.GIANT_PUFFBALL.get(), models().cross(blockTexture(MushroomBlocks.GIANT_PUFFBALL.get()).getPath(), blockTexture(MushroomBlocks.GIANT_PUFFBALL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_GIANT_PUFFBALL.get(), models().singleTexture("potted_giant_puffball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.GIANT_PUFFBALL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.INDIGO_MILKCAP.get(), models().cross(blockTexture(MushroomBlocks.INDIGO_MILKCAP.get()).getPath(), blockTexture(MushroomBlocks.INDIGO_MILKCAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_INDIGO_MILKCAP.get(), models().singleTexture("potted_indigo_milkcap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.INDIGO_MILKCAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.GRAY_MOREL.get(), models().cross(blockTexture(MushroomBlocks.GRAY_MOREL.get()).getPath(), blockTexture(MushroomBlocks.GRAY_MOREL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_GRAY_MOREL.get(), models().singleTexture("potted_gray_morel", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.GRAY_MOREL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.INKY_CAP.get(), models().cross(blockTexture(MushroomBlocks.INKY_CAP.get()).getPath(), blockTexture(MushroomBlocks.INKY_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_INKY_CAP.get(), models().singleTexture("potted_inky_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.INKY_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.DESERT_SHAGGY_MANE.get(), models().cross(blockTexture(MushroomBlocks.DESERT_SHAGGY_MANE.get()).getPath(), blockTexture(MushroomBlocks.DESERT_SHAGGY_MANE.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_DESERT_SHAGGY_MANE.get(), models().singleTexture("potted_desert_shaggy_mane", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.DESERT_SHAGGY_MANE.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.PORTABELLA.get(), models().cross(blockTexture(MushroomBlocks.PORTABELLA.get()).getPath(), blockTexture(MushroomBlocks.PORTABELLA.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_PORTABELLA.get(), models().singleTexture("potted_portabella", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.PORTABELLA.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.SANDY_STILTBALL.get(), models().cross(blockTexture(MushroomBlocks.SANDY_STILTBALL.get()).getPath(), blockTexture(MushroomBlocks.SANDY_STILTBALL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_SANDY_STILTBALL.get(), models().singleTexture("potted_sandy_stiltball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.SANDY_STILTBALL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.SUBBS_MUSHROOMS.get(), models().cross(blockTexture(MushroomBlocks.SUBBS_MUSHROOMS.get()).getPath(), blockTexture(MushroomBlocks.SUBBS_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_SUBBS_MUSHROOMS.get(), models().singleTexture("potted_subbs_mushrooms", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.SUBBS_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.BLACK_TRUFFLE.get(), models().cross(blockTexture(MushroomBlocks.BLACK_TRUFFLE.get()).getPath(), blockTexture(MushroomBlocks.BLACK_TRUFFLE.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_BLACK_TRUFFLE.get(), models().singleTexture("potted_black_truffle", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.BLACK_TRUFFLE.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.GOLDEN_HALO.get(), models().cross(blockTexture(MushroomBlocks.GOLDEN_HALO.get()).getPath(), blockTexture(MushroomBlocks.GOLDEN_HALO.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_GOLDEN_HALO.get(), models().singleTexture("potted_golden_halo", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.GOLDEN_HALO.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.LILAC_BONNETS.get(), models().cross(blockTexture(MushroomBlocks.LILAC_BONNETS.get()).getPath(), blockTexture(MushroomBlocks.LILAC_BONNETS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_LILAC_BONNETS.get(), models().singleTexture("potted_lilac_bonnets", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.LILAC_BONNETS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.BASKET_STINKHORN.get(), models().cross(blockTexture(MushroomBlocks.BASKET_STINKHORN.get()).getPath(), blockTexture(MushroomBlocks.BASKET_STINKHORN.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_BASKET_STINKHORN.get(), models().singleTexture("potted_basket_stinkhorn", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.BASKET_STINKHORN.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.FIRE_CORAL.get(), models().cross(blockTexture(MushroomBlocks.FIRE_CORAL.get()).getPath(), blockTexture(MushroomBlocks.FIRE_CORAL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_FIRE_CORAL.get(), models().singleTexture("potted_fire_coral", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.FIRE_CORAL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.GLOWING_MUSHROOMS.get(), models().cross(blockTexture(MushroomBlocks.GLOWING_MUSHROOMS.get()).getPath(), blockTexture(MushroomBlocks.GLOWING_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_GLOWING_MUSHROOMS.get(), models().singleTexture("potted_glowing_mushrooms", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.GLOWING_MUSHROOMS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.YELLOW_PARASOLS.get(), models().cross(blockTexture(MushroomBlocks.YELLOW_PARASOLS.get()).getPath(), blockTexture(MushroomBlocks.YELLOW_PARASOLS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_YELLOW_PARASOLS.get(), models().singleTexture("potted_yellow_parasols", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.YELLOW_PARASOLS.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.DEATH_CAP.get(), models().cross(blockTexture(MushroomBlocks.DEATH_CAP.get()).getPath(), blockTexture(MushroomBlocks.DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_DEATH_CAP.get(), models().singleTexture("potted_death_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.FALSE_DEATH_CAP.get(), models().cross(blockTexture(MushroomBlocks.FALSE_DEATH_CAP.get()).getPath(), blockTexture(MushroomBlocks.FALSE_DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_FALSE_DEATH_CAP.get(), models().singleTexture("potted_false_death_cap", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.FALSE_DEATH_CAP.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.DESTROYING_ANGEL.get(), models().cross(blockTexture(MushroomBlocks.DESTROYING_ANGEL.get()).getPath(), blockTexture(MushroomBlocks.DESTROYING_ANGEL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_DESTROYING_ANGEL.get(), models().singleTexture("potted_destroying_angel", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.DESTROYING_ANGEL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.EARTHBALL.get(), models().cross(blockTexture(MushroomBlocks.EARTHBALL.get()).getPath(), blockTexture(MushroomBlocks.EARTHBALL.get())).renderType("cutout"));
        simpleBlockWithItem(MushroomBlocks.POTTED_EARTHBALL.get(), models().singleTexture("potted_earthball", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(MushroomBlocks.EARTHBALL.get())).renderType("cutout"));



        //DECORATIVE PLANTS
        simpleBlockWithItem(ModBlocks.TRUMPET_PITCHER.get(), models().cross(blockTexture(ModBlocks.TRUMPET_PITCHER.get()).getPath(),
                blockTexture(ModBlocks.TRUMPET_PITCHER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_TRUMPET_PITCHER.get(), models().singleTexture("potted_trumpet_pitcher", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.TRUMPET_PITCHER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MAGENTA_CELOSIA_BUSH.get(), models().cross(blockTexture(ModBlocks.MAGENTA_CELOSIA_BUSH.get()).getPath(), blockTexture(ModBlocks.MAGENTA_CELOSIA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_CELOSIA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.MAGENTA_CELOSIA_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.MAGENTA_CELOSIA_BUSH_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_CELOSIA.get(), models().cross(blockTexture(ModBlocks.MAGENTA_CELOSIA.get()).getPath(), blockTexture(ModBlocks.MAGENTA_CELOSIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAGENTA_CELOSIA.get(), models().singleTexture("potted_magenta_celosia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.MAGENTA_CELOSIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PINK_CELOSIA_BUSH.get(), models().cross(blockTexture(ModBlocks.PINK_CELOSIA_BUSH.get()).getPath(), blockTexture(ModBlocks.PINK_CELOSIA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PINK_CELOSIA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PINK_CELOSIA_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.PINK_CELOSIA_BUSH_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PINK_CELOSIA.get(), models().cross(blockTexture(ModBlocks.PINK_CELOSIA.get()).getPath(), blockTexture(ModBlocks.PINK_CELOSIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PINK_CELOSIA.get(), models().singleTexture("potted_pink_celosia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.PINK_CELOSIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORANGE_CELOSIA_BUSH.get(), models().cross(blockTexture(ModBlocks.ORANGE_CELOSIA_BUSH.get()).getPath(), blockTexture(ModBlocks.ORANGE_CELOSIA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ORANGE_CELOSIA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.ORANGE_CELOSIA_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.ORANGE_CELOSIA_BUSH_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ORANGE_CELOSIA.get(), models().cross(blockTexture(ModBlocks.ORANGE_CELOSIA.get()).getPath(), blockTexture(ModBlocks.ORANGE_CELOSIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORANGE_CELOSIA.get(), models().singleTexture("potted_orange_celosia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.ORANGE_CELOSIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.YELLOW_CELOSIA_BUSH.get(), models().cross(blockTexture(ModBlocks.YELLOW_CELOSIA_BUSH.get()).getPath(), blockTexture(ModBlocks.YELLOW_CELOSIA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.YELLOW_CELOSIA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.YELLOW_CELOSIA_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.YELLOW_CELOSIA_BUSH_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.YELLOW_CELOSIA.get(), models().cross(blockTexture(ModBlocks.YELLOW_CELOSIA.get()).getPath(), blockTexture(ModBlocks.YELLOW_CELOSIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_CELOSIA.get(), models().singleTexture("potted_yellow_celosia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.YELLOW_CELOSIA.get())).renderType("cutout"));


        simpleBlockWithItem(ModBlocks.SALVIA.get(), models().cross(blockTexture(ModBlocks.SALVIA.get()).getPath(), blockTexture(ModBlocks.SALVIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SALVIA.get(), models().singleTexture("potted_salvia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.SALVIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CEDAR_SALVIA.get(), models().cross(blockTexture(ModBlocks.CEDAR_SALVIA.get()).getPath(), blockTexture(ModBlocks.CEDAR_SALVIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CEDAR_SALVIA.get(), models().singleTexture("potted_cedar_salvia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.CEDAR_SALVIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BIRD_OF_PARADISE.get(), models().cross(blockTexture(ModBlocks.BIRD_OF_PARADISE.get()).getPath(),
                blockTexture(ModBlocks.BIRD_OF_PARADISE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BIRD_OF_PARADISE.get(), models().singleTexture("potted_bird_of_paradise", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.BIRD_OF_PARADISE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BLUE_CUT_ROSE.get(), models().cross(blockTexture(ModBlocks.BLUE_CUT_ROSE.get()).getPath(),
                blockTexture(ModBlocks.BLUE_CUT_ROSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BLUE_CUT_ROSE.get(), models().singleTexture("potted_blue_cut_rose", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.BLUE_CUT_ROSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_CUT_ROSE.get(), models().cross(blockTexture(ModBlocks.PURPLE_CUT_ROSE.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_CUT_ROSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_CUT_ROSE.get(), models().singleTexture("potted_purple_cut_rose", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.PURPLE_CUT_ROSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.WHITE_CUT_ROSE.get(), models().cross(blockTexture(ModBlocks.WHITE_CUT_ROSE.get()).getPath(),
                blockTexture(ModBlocks.WHITE_CUT_ROSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CUT_ROSE.get(), models().singleTexture("potted_white_cut_rose", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.WHITE_CUT_ROSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CUT_ROSE.get(), models().cross(blockTexture(ModBlocks.CUT_ROSE.get()).getPath(),
                blockTexture(ModBlocks.CUT_ROSE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUT_ROSE.get(), models().singleTexture("potted_cut_rose", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CUT_ROSE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CUT_LILAC.get(), models().cross(blockTexture(ModBlocks.CUT_LILAC.get()).getPath(),
                blockTexture(ModBlocks.CUT_LILAC.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUT_LILAC.get(), models().singleTexture("potted_cut_lilac", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CUT_LILAC.get())).renderType("cutout"));


        simpleBlockWithItem(ModBlocks.CUT_PEONY.get(), models().cross(blockTexture(ModBlocks.CUT_PEONY.get()).getPath(),
                blockTexture(ModBlocks.CUT_PEONY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUT_PEONY.get(), models().singleTexture("potted_cut_peony", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CUT_PEONY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.VIOLET.get(), models().cross(blockTexture(ModBlocks.VIOLET.get()).getPath(),
                blockTexture(ModBlocks.VIOLET.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_VIOLET.get(), models().singleTexture("potted_violet", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.VIOLET.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SEA_THRIFT.get(), models().cross(blockTexture(ModBlocks.SEA_THRIFT.get()).getPath(),
                blockTexture(ModBlocks.SEA_THRIFT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SEA_THRIFT.get(), models().singleTexture("potted_sea_thrift", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.SEA_THRIFT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CLOVER.get(), models().cross(blockTexture(ModBlocks.CLOVER.get()).getPath(),
                blockTexture(ModBlocks.CLOVER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CLOVER.get(), models().singleTexture("potted_clover", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CLOVER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.LUCKY_CLOVER.get(), models().cross(blockTexture(ModBlocks.LUCKY_CLOVER.get()).getPath(),
                blockTexture(ModBlocks.LUCKY_CLOVER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_LUCKY_CLOVER.get(), models().singleTexture("potted_lucky_clover", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.LUCKY_CLOVER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BLUE_HYACINTH.get(), models().cross(blockTexture(ModBlocks.BLUE_HYACINTH.get()).getPath(),
                blockTexture(ModBlocks.BLUE_HYACINTH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BLUE_HYACINTH.get(), models().singleTexture("potted_blue_hyacinth", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.BLUE_HYACINTH.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_HYACINTH.get(), models().cross(blockTexture(ModBlocks.PURPLE_HYACINTH.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_HYACINTH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_HYACINTH.get(), models().singleTexture("potted_purple_hyacinth", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.PURPLE_HYACINTH.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MAGENTA_HYACINTH.get(), models().cross(blockTexture(ModBlocks.MAGENTA_HYACINTH.get()).getPath(),
                blockTexture(ModBlocks.MAGENTA_HYACINTH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAGENTA_HYACINTH.get(), models().singleTexture("potted_magenta_hyacinth", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.MAGENTA_HYACINTH.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PANSY.get(), models().cross(blockTexture(ModBlocks.PANSY.get()).getPath(),
                blockTexture(ModBlocks.PANSY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PANSY.get(), models().singleTexture("potted_pansy", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.PANSY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CREEPER_PANSY.get(), models().cross(blockTexture(ModBlocks.CREEPER_PANSY.get()).getPath(),
                blockTexture(ModBlocks.CREEPER_PANSY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CREEPER_PANSY.get(), models().singleTexture("potted_creeper_pansy", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.CREEPER_PANSY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FIRE_PANSY.get(), models().cross(blockTexture(ModBlocks.FIRE_PANSY.get()).getPath(),
                blockTexture(ModBlocks.FIRE_PANSY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FIRE_PANSY.get(), models().singleTexture("potted_fire_pansy", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.FIRE_PANSY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.IRIS.get(), models().cross(blockTexture(ModBlocks.IRIS.get()).getPath(), blockTexture(ModBlocks.IRIS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_IRIS.get(), models().singleTexture("potted_iris", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.IRIS.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.DAHLIA.get(), models().cross(blockTexture(ModBlocks.DAHLIA.get()).getPath(), blockTexture(ModBlocks.DAHLIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DAHLIA.get(), models().singleTexture("potted_dahlia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.DAHLIA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CONEFLOWER.get(), models().cross(blockTexture(ModBlocks.CONEFLOWER.get()).getPath(), blockTexture(ModBlocks.CONEFLOWER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CONEFLOWER.get(), models().singleTexture("potted_coneflower", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.CONEFLOWER.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.WHITE_LILY.get(), models().cross(blockTexture(ModBlocks.WHITE_LILY.get()).getPath(), blockTexture(ModBlocks.WHITE_LILY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_LILY.get(), models().singleTexture("potted_white_lily", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.WHITE_LILY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_LILY.get(), models().cross(blockTexture(ModBlocks.PURPLE_LILY.get()).getPath(), blockTexture(ModBlocks.PURPLE_LILY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_LILY.get(), models().singleTexture("potted_purple_lily", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.PURPLE_LILY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PINK_LILY.get(), models().cross(blockTexture(ModBlocks.PINK_LILY.get()).getPath(), blockTexture(ModBlocks.PINK_LILY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PINK_LILY.get(), models().singleTexture("potted_pink_lily", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.PINK_LILY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORANGE_LILY.get(), models().cross(blockTexture(ModBlocks.ORANGE_LILY.get()).getPath(), blockTexture(ModBlocks.ORANGE_LILY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORANGE_LILY.get(), models().singleTexture("potted_orange_lily", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.ORANGE_LILY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.DAFFODIL.get(), models().cross(blockTexture(ModBlocks.DAFFODIL.get()).getPath(), blockTexture(ModBlocks.DAFFODIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DAFFODIL.get(), models().singleTexture("potted_daffodil", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.DAFFODIL.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.WHITE_ROSE_BUSH.get(), models().cross(blockTexture(ModBlocks.WHITE_ROSE_BUSH.get()).getPath(), blockTexture(ModBlocks.WHITE_ROSE_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_ROSE_BUSH.get(), models().cross(blockTexture(ModBlocks.BLUE_ROSE_BUSH.get()).getPath(), blockTexture(ModBlocks.BLUE_ROSE_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PURPLE_ROSE_BUSH.get(), models().cross(blockTexture(ModBlocks.PURPLE_ROSE_BUSH.get()).getPath(), blockTexture(ModBlocks.PURPLE_ROSE_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_ROSE_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.WHITE_ROSE_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.WHITE_ROSE_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ZOMBIE_BLOOM.get(), models().cross(blockTexture(ModBlocks.ZOMBIE_BLOOM.get()).getPath(), blockTexture(ModBlocks.ZOMBIE_BLOOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ZOMBIE_BLOOM_BOTTOM.get(), models().cross(blockTexture(ModBlocks.ZOMBIE_BLOOM_BOTTOM.get()).getPath(), blockTexture(ModBlocks.ZOMBIE_BLOOM_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.PURPLE_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.PURPLE_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PURPLE_RHODODENDRON_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PURPLE_RHODODENDRON_BOTTOM.get()).getPath(), blockTexture(ModBlocks.PURPLE_RHODODENDRON_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.BLUE_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.BLUE_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_RHODODENDRON_BOTTOM.get(), models().cross(blockTexture(ModBlocks.BLUE_RHODODENDRON_BOTTOM.get()).getPath(), blockTexture(ModBlocks.BLUE_RHODODENDRON_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.MAGENTA_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.MAGENTA_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_RHODODENDRON_BOTTOM.get(), models().cross(blockTexture(ModBlocks.MAGENTA_RHODODENDRON_BOTTOM.get()).getPath(), blockTexture(ModBlocks.MAGENTA_RHODODENDRON_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.WHITE_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.WHITE_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_RHODODENDRON_BOTTOM.get(), models().cross(blockTexture(ModBlocks.WHITE_RHODODENDRON_BOTTOM.get()).getPath(), blockTexture(ModBlocks.WHITE_RHODODENDRON_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_CUT_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.PURPLE_CUT_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.PURPLE_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_CUT_RHODODENDRON.get(), models().singleTexture("potted_purple_cut_rhododendron", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.PURPLE_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_CUT_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.BLUE_CUT_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.BLUE_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BLUE_CUT_RHODODENDRON.get(), models().singleTexture("potted_blue_cut_rhododendron", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.BLUE_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_CUT_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.MAGENTA_CUT_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.MAGENTA_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAGENTA_CUT_RHODODENDRON.get(), models().singleTexture("potted_magenta_cut_rhododendron", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.MAGENTA_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_CUT_RHODODENDRON.get(), models().cross(blockTexture(ModBlocks.WHITE_CUT_RHODODENDRON.get()).getPath(), blockTexture(ModBlocks.WHITE_CUT_RHODODENDRON.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CUT_RHODODENDRON.get(), models().singleTexture("potted_white_cut_rhododendron", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.WHITE_CUT_RHODODENDRON.get())).renderType("cutout"));



        simpleBlockWithItem(ModBlocks.CATTAIL.get(), models().cross(blockTexture(ModBlocks.CATTAIL.get()).getPath(),
                blockTexture(ModBlocks.CATTAIL.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.CATTAIL_BOTTOM.get(), models().cross(blockTexture(ModBlocks.CATTAIL_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.CATTAIL_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.YUCCA.get(), models().cross(blockTexture(ModBlocks.YUCCA.get()).getPath(),
                blockTexture(ModBlocks.YUCCA.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.YUCCA_BOTTOM.get(), models().cross(blockTexture(ModBlocks.YUCCA_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.YUCCA_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BLUE_ROSE_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.BLUE_ROSE_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.BLUE_ROSE_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PURPLE_ROSE_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PURPLE_ROSE_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_ROSE_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.RED_CUT_HIBISCUS.get(), models().cross(blockTexture(ModBlocks.RED_CUT_HIBISCUS.get()).getPath(),
                blockTexture(ModBlocks.RED_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RED_CUT_HIBISCUS.get(), models().singleTexture("potted_red_cut_hibiscus", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.RED_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.RED_HIBISCUS_BUSH.get(), models().cross(blockTexture(ModBlocks.RED_HIBISCUS_BUSH.get()).getPath(),
                blockTexture(ModBlocks.RED_HIBISCUS_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.RED_HIBISCUS_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.RED_HIBISCUS_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.RED_HIBISCUS_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PINK_CUT_HIBISCUS.get(), models().cross(blockTexture(ModBlocks.PINK_CUT_HIBISCUS.get()).getPath(),
                blockTexture(ModBlocks.PINK_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PINK_CUT_HIBISCUS.get(), models().singleTexture("potted_pink_cut_hibiscus", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.PINK_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PINK_HIBISCUS_BUSH.get(), models().cross(blockTexture(ModBlocks.PINK_HIBISCUS_BUSH.get()).getPath(),
                blockTexture(ModBlocks.PINK_HIBISCUS_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PINK_HIBISCUS_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PINK_HIBISCUS_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.PINK_HIBISCUS_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.YELLOW_CUT_HIBISCUS.get(), models().cross(blockTexture(ModBlocks.YELLOW_CUT_HIBISCUS.get()).getPath(),
                blockTexture(ModBlocks.YELLOW_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_CUT_HIBISCUS.get(), models().singleTexture("potted_yellow_cut_hibiscus", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.YELLOW_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.YELLOW_HIBISCUS_BUSH.get(), models().cross(blockTexture(ModBlocks.YELLOW_HIBISCUS_BUSH.get()).getPath(),
                blockTexture(ModBlocks.YELLOW_HIBISCUS_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.YELLOW_HIBISCUS_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.YELLOW_HIBISCUS_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.YELLOW_HIBISCUS_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.ORANGE_CUT_HIBISCUS.get(), models().cross(blockTexture(ModBlocks.ORANGE_CUT_HIBISCUS.get()).getPath(),
                blockTexture(ModBlocks.ORANGE_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ORANGE_CUT_HIBISCUS.get(), models().singleTexture("potted_orange_cut_hibiscus", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.ORANGE_CUT_HIBISCUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ORANGE_HIBISCUS_BUSH.get(), models().cross(blockTexture(ModBlocks.ORANGE_HIBISCUS_BUSH.get()).getPath(),
                blockTexture(ModBlocks.ORANGE_HIBISCUS_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ORANGE_HIBISCUS_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.ORANGE_HIBISCUS_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.ORANGE_HIBISCUS_BUSH_BOTTOM.get())).renderType("cutout"));

        //HYDRANGEA
        simpleBlockWithItem(ModBlocks.PURPLE_CUT_HYDRANGEA.get(), models().cross(blockTexture(ModBlocks.PURPLE_CUT_HYDRANGEA.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_CUT_HYDRANGEA.get(), models().singleTexture("potted_purple_cut_hydrangea", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.PURPLE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PURPLE_HYDRANGEA_BUSH.get(), models().cross(blockTexture(ModBlocks.PURPLE_HYDRANGEA_BUSH.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_HYDRANGEA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PURPLE_HYDRANGEA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PURPLE_HYDRANGEA_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.PURPLE_HYDRANGEA_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.BLUE_CUT_HYDRANGEA.get(), models().cross(blockTexture(ModBlocks.BLUE_CUT_HYDRANGEA.get()).getPath(),
                blockTexture(ModBlocks.BLUE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BLUE_CUT_HYDRANGEA.get(), models().singleTexture("potted_blue_cut_hydrangea", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.BLUE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_HYDRANGEA_BUSH.get(), models().cross(blockTexture(ModBlocks.BLUE_HYDRANGEA_BUSH.get()).getPath(),
                blockTexture(ModBlocks.BLUE_HYDRANGEA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BLUE_HYDRANGEA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.BLUE_HYDRANGEA_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.BLUE_HYDRANGEA_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.WHITE_CUT_HYDRANGEA.get(), models().cross(blockTexture(ModBlocks.WHITE_CUT_HYDRANGEA.get()).getPath(),
                blockTexture(ModBlocks.WHITE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CUT_HYDRANGEA.get(), models().singleTexture("potted_white_cut_hydrangea", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.WHITE_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_HYDRANGEA_BUSH.get(), models().cross(blockTexture(ModBlocks.WHITE_HYDRANGEA_BUSH.get()).getPath(),
                blockTexture(ModBlocks.WHITE_HYDRANGEA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_HYDRANGEA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.WHITE_HYDRANGEA_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.WHITE_HYDRANGEA_BUSH_BOTTOM.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.MAGENTA_CUT_HYDRANGEA.get(), models().cross(blockTexture(ModBlocks.MAGENTA_CUT_HYDRANGEA.get()).getPath(),
                blockTexture(ModBlocks.MAGENTA_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_MAGENTA_CUT_HYDRANGEA.get(), models().singleTexture("potted_magenta_cut_hydrangea", new ResourceLocation("flower_pot_cross"),"plant",
                blockTexture(ModBlocks.MAGENTA_CUT_HYDRANGEA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get(), models().cross(blockTexture(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get()).getPath(),
                blockTexture(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MAGENTA_HYDRANGEA_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.MAGENTA_HYDRANGEA_BUSH_BOTTOM.get()).getPath(),
                blockTexture(ModBlocks.MAGENTA_HYDRANGEA_BUSH_BOTTOM.get())).renderType("cutout"));


        //FOOD
        simpleBlockWithItem(ModBlocks.TEOSINTE.get(), models().cross(blockTexture(ModBlocks.TEOSINTE.get()).getPath(), blockTexture(ModBlocks.TEOSINTE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.TEOSINTE_BOTTOM.get(), models().cross(blockTexture(ModBlocks.TEOSINTE_BOTTOM.get()).getPath(), blockTexture(ModBlocks.TEOSINTE_BOTTOM.get())).renderType("cutout"));
         simpleBlockWithItem(ModBlocks.PINEAPPLE_PLANT.get(), models().cross(blockTexture(ModBlocks.PINEAPPLE_PLANT.get()).getPath(), blockTexture(ModBlocks.PINEAPPLE_PLANT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.PINEAPPLE_PLANT_BOTTOM.get(), models().cross(blockTexture(ModBlocks.PINEAPPLE_PLANT_BOTTOM.get()).getPath(), blockTexture(ModBlocks.PINEAPPLE_PLANT_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.COCONUT_BUNCH.get(), models().cross(blockTexture(ModBlocks.COCONUT_BUNCH.get()).getPath(), blockTexture(ModBlocks.COCONUT_BUNCH.get())).renderType("cutout"));

        //PLATINUM ORE
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);

        //JADE ORE
        blockWithItem(ModBlocks.JADE_ORE);
        blockWithItem(ModBlocks.JADE_BLOCK);
        //PYRITE ORE
        blockWithItem(ModBlocks.PYRITE_ORE);
        blockWithItem(ModBlocks.PYRITE_BLOCK);

        blockWithItem(ModBlocks.PEAT);
        blockWithItem(ModBlocks.RED_CLAY);
        blockWithItem(ModBlocks.ROCK_SALT);
        blockWithItem(ModBlocks.MYCELIATED_DIRT);
        //GNEISS BLOCKS
        blockWithItem(ModBlocks.GNEISS);
        blockWithItem(ModBlocks.COBBLED_GNEISS);
        blockWithItem(ModBlocks.ENERGIZED_COBBLED_GNEISS);
        blockWithItem(ModBlocks.POLISHED_GNEISS);
        blockWithItem(ModBlocks.CHISELED_GNEISS);
        blockWithItem(ModBlocks.GNEISS_BRICKS);
        blockWithItem(ModBlocks.ENERGIZED_GNEISS_BRICKS);
        blockWithItem(ModBlocks.CRACKED_GNEISS_BRICKS);
        blockWithItem(ModBlocks.GNEISS_TILES);
        blockWithItem(ModBlocks.CRACKED_GNEISS_TILES);
        blockWithItem(ModBlocks.ENERGIZED_GNEISS_TILES);
        blockWithItem(ModBlocks.SMOOTH_GNEISS);

        //CHERT BLOCKS
        blockWithItem(ModBlocks.CHERT);
        stairsBlock(((StairBlock)ModBlocks.CHERT_STAIRS.get()), blockTexture(ModBlocks.CHERT.get()));
        slabBlock(((SlabBlock)ModBlocks.CHERT_SLAB.get()), blockTexture(ModBlocks.CHERT.get()), blockTexture(ModBlocks.CHERT.get()));
        wallBlock(((WallBlock)ModBlocks.CHERT_WALL.get()), blockTexture(ModBlocks.CHERT.get()));
        blockWithItem(ModBlocks.POLISHED_CHERT);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_CHERT_STAIRS.get()), blockTexture(ModBlocks.POLISHED_CHERT.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_CHERT_SLAB.get()), blockTexture(ModBlocks.POLISHED_CHERT.get()), blockTexture(ModBlocks.POLISHED_CHERT.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_CHERT_WALL.get()), blockTexture(ModBlocks.POLISHED_CHERT.get()));
        blockWithItem(ModBlocks.CHERT_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.CHERT_BRICK_STAIRS.get()), blockTexture(ModBlocks.CHERT_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CHERT_BRICK_SLAB.get()), blockTexture(ModBlocks.CHERT_BRICKS.get()), blockTexture(ModBlocks.CHERT_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CHERT_BRICK_WALL.get()), blockTexture(ModBlocks.CHERT_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_CHERT_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.CRACKED_CHERT_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_CHERT_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_CHERT_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_CHERT_BRICKS.get()), blockTexture(ModBlocks.CRACKED_CHERT_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_CHERT_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_CHERT_BRICKS.get()));
        blockWithItem(ModBlocks.CHISELED_CHERT);
        blockWithItem(ModBlocks.CHERT_TILES);
        blockWithItem(ModBlocks.CRYSTALLINE_CHERT_TILES);
        blockWithItem(ModBlocks.CRYSTALLINE_CHERT_BRICKS);
        blockWithItem(ModBlocks.CRACKED_CHERT_TILES);

        //GABBRO BLOCKS
        blockWithItem(ModBlocks.GABBRO);
        stairsBlock(((StairBlock)ModBlocks.GABBRO_STAIRS.get()), blockTexture(ModBlocks.GABBRO.get()));
        slabBlock(((SlabBlock)ModBlocks.GABBRO_SLAB.get()), blockTexture(ModBlocks.GABBRO.get()), blockTexture(ModBlocks.GABBRO.get()));
        wallBlock(((WallBlock)ModBlocks.GABBRO_WALL.get()), blockTexture(ModBlocks.GABBRO.get()));
        blockWithItem(ModBlocks.POLISHED_GABBRO);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_GABBRO_STAIRS.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_GABBRO_SLAB.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_GABBRO_WALL.get()), blockTexture(ModBlocks.POLISHED_GABBRO.get()));
        blockWithItem(ModBlocks.POLISHED_GABBRO_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_GABBRO_BRICK_STAIRS.get()), blockTexture(ModBlocks.POLISHED_GABBRO_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_GABBRO_BRICK_SLAB.get()), blockTexture(ModBlocks.POLISHED_GABBRO_BRICKS.get()), blockTexture(ModBlocks.POLISHED_GABBRO_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_GABBRO_BRICK_WALL.get()), blockTexture(ModBlocks.POLISHED_GABBRO_BRICKS.get()));
        blockWithItem(ModBlocks.CHISELED_POLISHED_GABBRO);
        blockWithItem(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get()), blockTexture(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get()));


        //LIMESTONE BLOCKS
        blockWithItem(ModBlocks.LIMESTONE);
        stairsBlock(((StairBlock)ModBlocks.LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE.get()));
        slabBlock(((SlabBlock)ModBlocks.LIMESTONE_SLAB.get()), blockTexture(ModBlocks.LIMESTONE.get()), blockTexture(ModBlocks.LIMESTONE.get()));
        wallBlock(((WallBlock)ModBlocks.LIMESTONE_WALL.get()), blockTexture(ModBlocks.LIMESTONE.get()));
        blockWithItem(ModBlocks.COBBLED_LIMESTONE);
        blockWithItem(ModBlocks.LICHENY_COBBLED_LIMESTONE);
        stairsBlock(((StairBlock)ModBlocks.COBBLED_LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));
        slabBlock(((SlabBlock)ModBlocks.COBBLED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));
        wallBlock(((WallBlock)ModBlocks.COBBLED_LIMESTONE_WALL.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));
        stairsBlock(((StairBlock)ModBlocks.LICHENY_COBBLED_LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.LICHENY_COBBLED_LIMESTONE.get()));
        slabBlock(((SlabBlock)ModBlocks.LICHENY_COBBLED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.LICHENY_COBBLED_LIMESTONE.get()), blockTexture(ModBlocks.LICHENY_COBBLED_LIMESTONE.get()));
        wallBlock(((WallBlock)ModBlocks.LICHENY_COBBLED_LIMESTONE_WALL.get()), blockTexture(ModBlocks.LICHENY_COBBLED_LIMESTONE.get()));
        blockWithItem(ModBlocks.POLISHED_LIMESTONE);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_LIMESTONE_WALL.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        blockWithItem(ModBlocks.LIMESTONE_TILE);
        stairsBlock(((StairBlock)ModBlocks.LIMESTONE_TILE_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE_TILE.get()));
        slabBlock(((SlabBlock)ModBlocks.LIMESTONE_TILE_SLAB.get()), blockTexture(ModBlocks.LIMESTONE_TILE.get()), blockTexture(ModBlocks.LIMESTONE_TILE.get()));
        wallBlock(((WallBlock)ModBlocks.LIMESTONE_TILE_WALL.get()), blockTexture(ModBlocks.LIMESTONE_TILE.get()));
        blockWithItem(ModBlocks.CHISELED_LIMESTONE);
        blockWithItem(ModBlocks.LIMESTONE_BRICKS);
        blockWithItem(ModBlocks.LICHENY_LIMESTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_LIMESTONE_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.LIMESTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.LIMESTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.LIMESTONE_BRICK_WALL.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        stairsBlock(((StairBlock)ModBlocks.LICHENY_LIMESTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.LICHENY_LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.LICHENY_LIMESTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.LICHENY_LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LICHENY_LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.LICHENY_LIMESTONE_BRICK_WALL.get()), blockTexture(ModBlocks.LICHENY_LIMESTONE_BRICKS.get()));

        stairsBlock(((StairBlock)ModBlocks.CRACKED_LIMESTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_LIMESTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_LIMESTONE_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_LIMESTONE_BRICKS.get()));

        //SLATE BLOCKS
        blockWithItem(ModBlocks.SLATE);
        stairsBlock(((StairBlock)ModBlocks.SLATE_STAIRS.get()), blockTexture(ModBlocks.SLATE.get()));
        slabBlock(((SlabBlock)ModBlocks.SLATE_SLAB.get()), blockTexture(ModBlocks.SLATE.get()), blockTexture(ModBlocks.SLATE.get()));
        wallBlock(((WallBlock)ModBlocks.SLATE_WALL.get()), blockTexture(ModBlocks.SLATE.get()));
        blockWithItem(ModBlocks.COBBLED_SLATE);
        blockWithItem(ModBlocks.BEDAZZLED_COBBLED_SLATE);
        blockWithItem(ModBlocks.CHISELED_SLATE);
        blockWithItem(ModBlocks.SMOOTH_SLATE);

        blockWithItem(ModBlocks.SLATE_TILES);
        blockWithItem(ModBlocks.CRACKED_SLATE_TILES);
        blockWithItem(ModBlocks.BEDAZZLED_SLATE_TILES);
        blockWithItem(ModBlocks.SLATE_BRICKS);
        blockWithItem(ModBlocks.BEDAZZLED_SLATE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SLATE_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.SLATE_BRICK_STAIRS.get()), blockTexture(ModBlocks.SLATE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.SLATE_BRICK_SLAB.get()), blockTexture(ModBlocks.SLATE_BRICKS.get()), blockTexture(ModBlocks.SLATE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.SLATE_BRICK_WALL.get()), blockTexture(ModBlocks.SLATE_BRICKS.get()));
        stairsBlock(((StairBlock)ModBlocks.CRACKED_SLATE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_SLATE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_SLATE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_SLATE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_SLATE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_SLATE_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_SLATE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_SLATE);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_SLATE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_SLATE.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_SLATE_SLAB.get()), blockTexture(ModBlocks.POLISHED_SLATE.get()), blockTexture(ModBlocks.POLISHED_SLATE.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_SLATE_WALL.get()), blockTexture(ModBlocks.POLISHED_SLATE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SLATE_PILLAR.get()), blockTexture(ModBlocks.SLATE_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/slate_pillar_top"));
        blockItem(ModBlocks.SLATE_PILLAR);

        //MARBLE BLOCKS
        blockWithItem(ModBlocks.MARBLE);
        stairsBlock(((StairBlock)ModBlocks.MARBLE_STAIRS.get()), blockTexture(ModBlocks.MARBLE.get()));
        slabBlock(((SlabBlock)ModBlocks.MARBLE_SLAB.get()), blockTexture(ModBlocks.MARBLE.get()), blockTexture(ModBlocks.MARBLE.get()));
        wallBlock(((WallBlock)ModBlocks.MARBLE_WALL.get()), blockTexture(ModBlocks.MARBLE.get()));
        blockWithItem(ModBlocks.COBBLED_MARBLE);
        blockWithItem(ModBlocks.PAINTED_COBBLED_MARBLE);
        blockWithItem(ModBlocks.POLISHED_MARBLE);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_MARBLE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_MARBLE.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_MARBLE_SLAB.get()), blockTexture(ModBlocks.POLISHED_MARBLE.get()), blockTexture(ModBlocks.POLISHED_MARBLE.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_MARBLE_WALL.get()), blockTexture(ModBlocks.POLISHED_MARBLE.get()));
        blockWithItem(ModBlocks.CHISELED_MARBLE);
        blockWithItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        blockWithItem(ModBlocks.PAINTED_MARBLE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_MARBLE_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_MARBLE_BRICK_STAIRS.get()), blockTexture(ModBlocks.POLISHED_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_MARBLE_BRICK_SLAB.get()), blockTexture(ModBlocks.POLISHED_MARBLE_BRICKS.get()), blockTexture(ModBlocks.POLISHED_MARBLE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_MARBLE_BRICK_WALL.get()), blockTexture(ModBlocks.POLISHED_MARBLE_BRICKS.get()));
        stairsBlock(((StairBlock)ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get()));
        blockWithItem(ModBlocks.MARBLE_TILES);
        blockWithItem(ModBlocks.CRACKED_MARBLE_TILES);
        blockWithItem(ModBlocks.PAINTED_MARBLE_TILES);

        axisBlock(((RotatedPillarBlock) ModBlocks.MARBLE_PILLAR.get()), blockTexture(ModBlocks.MARBLE_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/marble_pillar_top"));
        blockItem(ModBlocks.MARBLE_PILLAR);

        //MAPLE WOOD
        logBlock(((RotatedPillarBlock) ModBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAPLE_WOOD.get()), blockTexture(ModBlocks.MAPLE_LOG.get()), blockTexture(ModBlocks.MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_LOG.get()), new ResourceLocation(BensAddons.MOD_ID, "block/stripped_maple_log_top"));
        blockItem(ModBlocks.MAPLE_LOG);
        blockItem(ModBlocks.MAPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_MAPLE_LOG);
        blockItem(ModBlocks.STRIPPED_MAPLE_WOOD);
        leavesBlock(ModBlocks.MAPLE_LEAVES);
        saplingBlock(ModBlocks.MAPLE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_MAPLE_SAPLING.get(), models().singleTexture("potted_maple_sapling", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.MAPLE_SAPLING.get())).renderType("cutout"));
        blockWithItem(ModBlocks.MAPLE_PLANKS);
        stairsBlock(((StairBlock)ModBlocks.MAPLE_STAIRS.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        slabBlock(((SlabBlock)ModBlocks.MAPLE_SLAB.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        buttonBlock(((ButtonBlock)ModBlocks.MAPLE_BUTTON.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock)ModBlocks.MAPLE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        fenceBlock(((FenceBlock)ModBlocks.MAPLE_FENCE.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock)ModBlocks.MAPLE_FENCE_GATE.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.MAPLE_DOOR.get()), modLoc("block/maple_door_bottom"), modLoc("block/maple_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MAPLE_TRAPDOOR.get()), modLoc("block/maple_trapdoor"), true, "cutout");
        //PALM WOOD
        logBlock(((RotatedPillarBlock) ModBlocks.PALM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PALM_WOOD.get()), blockTexture(ModBlocks.PALM_LOG.get()), blockTexture(ModBlocks.PALM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PALM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PALM_LOG.get()), blockTexture(ModBlocks.STRIPPED_PALM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PALM_LOG.get()), blockTexture(ModBlocks.STRIPPED_PALM_LOG.get()), new ResourceLocation(BensAddons.MOD_ID, "block/stripped_palm_log_top"));
        blockItem(ModBlocks.PALM_LOG);
        blockItem(ModBlocks.PALM_WOOD);
        blockItem(ModBlocks.STRIPPED_PALM_LOG);
        blockItem(ModBlocks.STRIPPED_PALM_WOOD);
       leavesBlock(ModBlocks.PALM_LEAVES);
       saplingBlock(ModBlocks.PALM_SHOOT);
       simpleBlockWithItem(ModBlocks.POTTED_PALM_SHOOT.get(), models().singleTexture("potted_palm_shoot", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.PALM_SHOOT.get())).renderType("cutout"));
        blockWithItem(ModBlocks.PALM_PLANKS);
        stairsBlock(((StairBlock)ModBlocks.PALM_STAIRS.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        slabBlock(((SlabBlock)ModBlocks.PALM_SLAB.get()), blockTexture(ModBlocks.PALM_PLANKS.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        buttonBlock(((ButtonBlock)ModBlocks.PALM_BUTTON.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock)ModBlocks.PALM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        fenceBlock(((FenceBlock)ModBlocks.PALM_FENCE.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock)ModBlocks.PALM_FENCE_GATE.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
       doorBlockWithRenderType(((DoorBlock) ModBlocks.PALM_DOOR.get()), modLoc("block/palm_door_bottom"), modLoc("block/palm_door_top"), "cutout");
      trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PALM_TRAPDOOR.get()), modLoc("block/palm_trapdoor"), true, "cutout");

       //BAOBAB
        logBlock(((RotatedPillarBlock) ModBlocks.BAOBAB_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BAOBAB_WOOD.get()), blockTexture(ModBlocks.BAOBAB_LOG.get()), blockTexture(ModBlocks.BAOBAB_LOG.get()));
       axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BAOBAB_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BAOBAB_LOG.get()), blockTexture(ModBlocks.STRIPPED_BAOBAB_LOG.get()));
       axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BAOBAB_LOG.get()), blockTexture(ModBlocks.STRIPPED_BAOBAB_LOG.get()), new ResourceLocation(BensAddons.MOD_ID, "block/stripped_baobab_log_top"));
        blockItem(ModBlocks.BAOBAB_LOG);
        blockItem(ModBlocks.BAOBAB_WOOD);
        blockItem(ModBlocks.STRIPPED_BAOBAB_LOG);
        blockItem(ModBlocks.STRIPPED_BAOBAB_WOOD);
       // leavesBlock(ModBlocks.PALM_LEAVES);
        saplingBlock(ModBlocks.BAOBAB_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_BAOBAB_SAPLING.get(), models().singleTexture("potted_baobab_sapling", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.BAOBAB_SAPLING.get())).renderType("cutout"));
        blockWithItem(ModBlocks.BAOBAB_PLANKS);
        stairsBlock(((StairBlock)ModBlocks.BAOBAB_STAIRS.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        slabBlock(((SlabBlock)ModBlocks.BAOBAB_SLAB.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        buttonBlock(((ButtonBlock)ModBlocks.BAOBAB_BUTTON.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock)ModBlocks.BAOBAB_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        fenceBlock(((FenceBlock)ModBlocks.BAOBAB_FENCE.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock)ModBlocks.BAOBAB_FENCE_GATE.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.BAOBAB_DOOR.get()), modLoc("block/baobab_door_bottom"), modLoc("block/baobab_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.BAOBAB_TRAPDOOR.get()), modLoc("block/baobab_trapdoor"), true, "cutout");


        //PINK SAND
        blockWithItem(ModBlocks.PINK_SAND);
        wallBlock(((WallBlock)ModBlocks.PINK_CUT_SANDSTONE_WALL.get()), blockTexture(ModBlocks.PINK_CUT_SANDSTONE.get()));

        stairsBlock(((StairBlock)ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get()), new ResourceLocation(BensAddons.MOD_ID, "block/pink_sandstone_top"));
        slabBlock(((SlabBlock)ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get()), blockTexture(ModBlocks.PINK_SMOOTH_SANDSTONE.get()), new ResourceLocation(BensAddons.MOD_ID, "block/pink_sandstone_top"));

        //WHITE SAND
        blockWithItem(ModBlocks.WHITE_SAND);
        wallBlock(((WallBlock)ModBlocks.WHITE_CUT_SANDSTONE_WALL.get()), blockTexture(ModBlocks.WHITE_CUT_SANDSTONE.get()));
        stairsBlock(((StairBlock)ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get()), new ResourceLocation(BensAddons.MOD_ID, "block/white_sandstone_top"));
        slabBlock(((SlabBlock)ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get()), blockTexture(ModBlocks.WHITE_SMOOTH_SANDSTONE.get()), new ResourceLocation(BensAddons.MOD_ID, "block/white_sandstone_top"));

        //BLACK SAND
        blockWithItem(ModBlocks.BLACK_SAND);
        wallBlock(((WallBlock)ModBlocks.BLACK_CUT_SANDSTONE_WALL.get()), blockTexture(ModBlocks.BLACK_CUT_SANDSTONE.get()));
        stairsBlock(((StairBlock)ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get()), new ResourceLocation(BensAddons.MOD_ID, "block/black_sandstone_top"));
        slabBlock(((SlabBlock)ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get()), blockTexture(ModBlocks.BLACK_SMOOTH_SANDSTONE.get()), new ResourceLocation(BensAddons.MOD_ID, "block/black_sandstone_top"));

        //IRIDESCENT SAND
        blockWithItem(ModBlocks.IRIDESCENT_SAND);
        wallBlock(((WallBlock)ModBlocks.IRIDESCENT_CUT_SANDSTONE_WALL.get()), blockTexture(ModBlocks.IRIDESCENT_CUT_SANDSTONE.get()));
        stairsBlock(((StairBlock)ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_STAIRS.get()), new ResourceLocation(BensAddons.MOD_ID, "block/iridescent_sandstone_top"));
        slabBlock(((SlabBlock)ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_SLAB.get()), blockTexture(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE.get()), new ResourceLocation(BensAddons.MOD_ID, "block/iridescent_sandstone_top"));


        blockWithItem(ModBlocks.PUMICE);
        blockWithItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS);

        blockWithItem(ModBlocks.ANCIENT_STONE);
        blockWithItem(ModBlocks.OLDSTONE);
        blockWithItem(ModBlocks.ANCIENT_ALLOY_BLOCK);
        blockWithItem(ModBlocks.MOSSY_OLDSTONE);
        blockWithItem(ModBlocks.SHATTERED_OLDSTONE);
        blockWithItem(ModBlocks.ANCIENT_BRICK);
        blockWithItem(ModBlocks.GLOWRACK);
        blockWithItem(ModBlocks.NETHERSTONE);
        blockWithItem(ModBlocks.PRESERVED_WOOD);
        blockItem(ModBlocks.PRESERVED_GRASS_BLOCK);


        doorBlockWithRenderType(((DoorBlock) ModBlocks.PRESERVED_WOOD_DOOR.get()), modLoc("block/preserved_wood_door_bottom"), modLoc("block/preserved_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PRESERVED_WOOD_TRAPDOOR.get()), modLoc("block/preserved_wood_trapdoor"), true, "cutout");


        //AMETHYST
        blockWithItem(ModBlocks.POLISHED_AMETHYST);
        blockWithItem(ModBlocks.SMOOTH_AMETHYST);
        blockWithItem(ModBlocks.CHISELED_AMETHYST);
        blockWithItem(ModBlocks.CUT_AMETHYST);
        blockWithItem(ModBlocks.AMETHYST_BRICKS);
        axisBlock(((RotatedPillarBlock) ModBlocks.AMETHYST_PILLAR.get()), blockTexture(ModBlocks.AMETHYST_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/amethyst_pillar_top"));
        blockItem(ModBlocks.AMETHYST_PILLAR);

        //RUBY
        simpleBlockWithItem(ModBlocks.RUBY_CLUSTER.get(), models().cross(blockTexture(ModBlocks.RUBY_CLUSTER.get()).getPath(), blockTexture(ModBlocks.RUBY_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_RUBY_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_RUBY_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_RUBY_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_RUBY_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_RUBY_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_RUBY_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_RUBY_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_RUBY_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_RUBY_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.BUDDING_RUBY);

        blockWithItem(ModBlocks.POLISHED_RUBY);
        blockWithItem(ModBlocks.SMOOTH_RUBY);
        blockWithItem(ModBlocks.CHISELED_RUBY);
        blockWithItem(ModBlocks.CUT_RUBY);
        blockWithItem(ModBlocks.RUBY_BRICKS);
       // axisBlock(((RotatedPillarBlock) ModBlocks.RUBY_PILLAR.get()), blockTexture(ModBlocks.RUBY_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/ruby_pillar_top"));
       // blockItem(ModBlocks.RUBY_PILLAR);

        //TOPAZ
        simpleBlockWithItem(ModBlocks.TOPAZ_CLUSTER.get(), models().cross(blockTexture(ModBlocks.TOPAZ_CLUSTER.get()).getPath(), blockTexture(ModBlocks.TOPAZ_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_TOPAZ_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_TOPAZ_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_TOPAZ_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_TOPAZ_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_TOPAZ_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_TOPAZ_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_TOPAZ_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_TOPAZ_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_TOPAZ_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.TOPAZ_BLOCK);
        blockWithItem(ModBlocks.BUDDING_TOPAZ);

        blockWithItem(ModBlocks.CHISELED_TOPAZ);
        blockWithItem(ModBlocks.TOPAZ_BRICKS);


        //CITRINE
        simpleBlockWithItem(ModBlocks.CITRINE_CLUSTER.get(), models().cross(blockTexture(ModBlocks.CITRINE_CLUSTER.get()).getPath(), blockTexture(ModBlocks.CITRINE_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_CITRINE_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_CITRINE_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_CITRINE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_CITRINE_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_CITRINE_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_CITRINE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_CITRINE_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_CITRINE_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_CITRINE_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.CITRINE_BLOCK);
        blockWithItem(ModBlocks.BUDDING_CITRINE);

        //PERIDOT
        simpleBlockWithItem(ModBlocks.PERIDOT_CLUSTER.get(), models().cross(blockTexture(ModBlocks.PERIDOT_CLUSTER.get()).getPath(), blockTexture(ModBlocks.PERIDOT_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_PERIDOT_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_PERIDOT_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_PERIDOT_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_PERIDOT_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_PERIDOT_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_PERIDOT_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_PERIDOT_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_PERIDOT_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_PERIDOT_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.BUDDING_PERIDOT);

        blockWithItem(ModBlocks.POLISHED_PERIDOT);
        blockWithItem(ModBlocks.SMOOTH_PERIDOT);
        blockWithItem(ModBlocks.CHISELED_PERIDOT);
        blockWithItem(ModBlocks.CUT_PERIDOT);
        blockWithItem(ModBlocks.PERIDOT_BRICKS);
        axisBlock(((RotatedPillarBlock) ModBlocks.PERIDOT_PILLAR.get()), blockTexture(ModBlocks.PERIDOT_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/peridot_pillar_top"));
        blockItem(ModBlocks.PERIDOT_PILLAR);

        //AQUAMARINE
        simpleBlockWithItem(ModBlocks.AQUAMARINE_CLUSTER.get(), models().cross(blockTexture(ModBlocks.AQUAMARINE_CLUSTER.get()).getPath(), blockTexture(ModBlocks.AQUAMARINE_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_AQUAMARINE_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_AQUAMARINE_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_AQUAMARINE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_AQUAMARINE_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_AQUAMARINE_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_AQUAMARINE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_AQUAMARINE_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_AQUAMARINE_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_AQUAMARINE_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.AQUAMARINE_BLOCK);
        blockWithItem(ModBlocks.BUDDING_AQUAMARINE);

        blockWithItem(ModBlocks.POLISHED_AQUAMARINE);
        blockWithItem(ModBlocks.SMOOTH_AQUAMARINE);
        blockWithItem(ModBlocks.CHISELED_AQUAMARINE);
        blockWithItem(ModBlocks.AQUAMARINE_BRICKS);


        //SAPPHIRE
        simpleBlockWithItem(ModBlocks.SAPPHIRE_CLUSTER.get(), models().cross(blockTexture(ModBlocks.SAPPHIRE_CLUSTER.get()).getPath(), blockTexture(ModBlocks.SAPPHIRE_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.SMALL_SAPPHIRE_BUD.get(), models().cross(blockTexture(ModBlocks.SMALL_SAPPHIRE_BUD.get()).getPath(), blockTexture(ModBlocks.SMALL_SAPPHIRE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), models().cross(blockTexture(ModBlocks.MEDIUM_SAPPHIRE_BUD.get()).getPath(), blockTexture(ModBlocks.MEDIUM_SAPPHIRE_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.LARGE_SAPPHIRE_BUD.get(), models().cross(blockTexture(ModBlocks.LARGE_SAPPHIRE_BUD.get()).getPath(), blockTexture(ModBlocks.LARGE_SAPPHIRE_BUD.get())).renderType("cutout"));
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.BUDDING_SAPPHIRE);

        //SUCCULENTS AND BEACH PLANTS
        simpleBlockWithItem(ModBlocks.BARREL_CACTUS.get(), models().cross(blockTexture(ModBlocks.BARREL_CACTUS.get()).getPath(), blockTexture(ModBlocks.BARREL_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BARREL_CACTUS.get(), models().singleTexture("potted_barrel_cactus", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.BARREL_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ALOE.get(), models().cross(blockTexture(ModBlocks.ALOE.get()).getPath(), blockTexture(ModBlocks.ALOE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ALOE.get(), models().singleTexture("potted_aloe", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.ALOE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.HAWORTHIA.get(), models().cross(blockTexture(ModBlocks.HAWORTHIA.get()).getPath(), blockTexture(ModBlocks.HAWORTHIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_HAWORTHIA.get(), models().singleTexture("potted_haworthia", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.HAWORTHIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.FLOWERING_CACTUS.get(), models().cross(blockTexture(ModBlocks.FLOWERING_CACTUS.get()).getPath(), blockTexture(ModBlocks.FLOWERING_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FLOWERING_CACTUS.get(), models().singleTexture("potted_flowering_cactus", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.FLOWERING_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.AEONIUM_BUSH.get(), models().cross(blockTexture(ModBlocks.AEONIUM_BUSH.get()).getPath(), blockTexture(ModBlocks.AEONIUM_BUSH.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.AEONIUM_BUSH_BOTTOM.get(), models().cross(blockTexture(ModBlocks.AEONIUM_BUSH_BOTTOM.get()).getPath(), blockTexture(ModBlocks.AEONIUM_BUSH_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.CUT_AEONIUM.get(), models().cross(blockTexture(ModBlocks.CUT_AEONIUM.get()).getPath(), blockTexture(ModBlocks.CUT_AEONIUM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUT_AEONIUM.get(), models().singleTexture("potted_cut_aeonium", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.CUT_AEONIUM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.OPUNTIA_CACTUS.get(), models().cross(blockTexture(ModBlocks.OPUNTIA_CACTUS.get()).getPath(), blockTexture(ModBlocks.OPUNTIA_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.OPUNTIA_CACTUS_BOTTOM.get(), models().cross(blockTexture(ModBlocks.OPUNTIA_CACTUS_BOTTOM.get()).getPath(), blockTexture(ModBlocks.OPUNTIA_CACTUS_BOTTOM.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.CUT_OPUNTIA_CACTUS.get(), models().cross(blockTexture(ModBlocks.CUT_OPUNTIA_CACTUS.get()).getPath(), blockTexture(ModBlocks.CUT_OPUNTIA_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CUT_OPUNTIA_CACTUS.get(), models().singleTexture("potted_cut_opuntia_cactus", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.CUT_OPUNTIA_CACTUS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.BEACHGRASS.get(), models().cross(blockTexture(ModBlocks.BEACHGRASS.get()).getPath(), blockTexture(ModBlocks.BEACHGRASS.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_BEACHGRASS.get(), models().singleTexture("potted_beachgrass", new ResourceLocation("flower_pot_cross"),"plant", blockTexture(ModBlocks.BEACHGRASS.get())).renderType("cutout"));




        blockWithItem(ModBlocks.CUT_QUARTZ_BLOCK);
        stairsBlock(((StairBlock)ModBlocks.CUT_QUARTZ_STAIRS.get()), blockTexture(ModBlocks.CUT_QUARTZ_BLOCK.get()));
        slabBlock(((SlabBlock)ModBlocks.CUT_QUARTZ_SLAB.get()), blockTexture(ModBlocks.CUT_QUARTZ_BLOCK.get()), blockTexture(ModBlocks.CUT_QUARTZ_BLOCK.get()));
        wallBlock(((WallBlock)ModBlocks.CUT_QUARTZ_WALL.get()), blockTexture(ModBlocks.CUT_QUARTZ_BLOCK.get()));

        stairsBlock(((StairBlock)ModBlocks.QUARTZ_BRICK_STAIRS.get()), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock(((SlabBlock)ModBlocks.QUARTZ_BRICK_SLAB.get()), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        wallBlock(((WallBlock)ModBlocks.QUARTZ_BRICK_WALL.get()), blockTexture(Blocks.QUARTZ_BRICKS));

        wallBlock(((WallBlock)ModBlocks.QUARTZ_WALL.get()), new ResourceLocation( "block/quartz_block_top"));
        wallBlock(((WallBlock)ModBlocks.SMOOTH_QUARTZ_WALL.get()), new ResourceLocation( "block/quartz_block_bottom"));



        //DECORATIVE BLOCKS
        blockWithItem(ModBlocks.BRICK_TILE);
        axisBlock(((RotatedPillarBlock) ModBlocks.BRICK_PILLAR.get()), blockTexture(ModBlocks.BRICK_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/brick_pillar_top"));
        blockItem(ModBlocks.BRICK_PILLAR);
        stairsBlock(((StairBlock)ModBlocks.BRICK_TILE_STAIRS.get()), blockTexture(ModBlocks.BRICK_TILE.get()));
        slabBlock(((SlabBlock)ModBlocks.BRICK_TILE_SLAB.get()), blockTexture(ModBlocks.BRICK_TILE.get()), blockTexture(ModBlocks.BRICK_TILE.get()));
        wallBlock(((WallBlock)ModBlocks.BRICK_TILE_WALL.get()), blockTexture(ModBlocks.BRICK_TILE.get()));
        blockWithItem(ModBlocks.CRACKED_BRICKS);
        blockWithItem(ModBlocks.CHISELED_BRICKS);
        stairsBlock(((StairBlock)ModBlocks.CRACKED_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_BRICKS.get()), blockTexture(ModBlocks.CRACKED_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.CRACKED_BRICK_WALL.get()), blockTexture(ModBlocks.CRACKED_BRICKS.get()));

        signBlock(((StandingSignBlock)ModBlocks.MAPLE_SIGN.get()), ((WallSignBlock) ModBlocks.MAPLE_WALL_SIGN.get()), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        signBlock(((StandingSignBlock)ModBlocks.PALM_SIGN.get()), ((WallSignBlock) ModBlocks.PALM_WALL_SIGN.get()), blockTexture(ModBlocks.PALM_PLANKS.get()));
        signBlock(((StandingSignBlock)ModBlocks.BAOBAB_SIGN.get()), ((WallSignBlock) ModBlocks.BAOBAB_WALL_SIGN.get()), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));

        hangingSignBlock( ModBlocks.MAPLE_HANGING_SIGN.get(), ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.MAPLE_PLANKS.get()));
        hangingSignBlock( ModBlocks.PALM_HANGING_SIGN.get(), ModBlocks.PALM_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PALM_PLANKS.get()));
        hangingSignBlock( ModBlocks.BAOBAB_HANGING_SIGN.get(), ModBlocks.BAOBAB_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.BAOBAB_PLANKS.get()));

       //WOOD MOSAICS
        blockWithItem(ModBlocks.OAK_MOSAIC);
        blockWithItem(ModBlocks.ACACIA_MOSAIC);
        blockWithItem(ModBlocks.BAOBAB_MOSAIC);
        blockWithItem(ModBlocks.BIRCH_MOSAIC);
        blockWithItem(ModBlocks.CRIMSON_MOSAIC);
        blockWithItem(ModBlocks.DARK_OAK_MOSAIC);
        blockWithItem(ModBlocks.JUNGLE_MOSAIC);
        blockWithItem(ModBlocks.PALM_MOSAIC);
        blockWithItem(ModBlocks.SPRUCE_MOSAIC);
        blockWithItem(ModBlocks.WARPED_MOSAIC);
        blockWithItem(ModBlocks.MAPLE_MOSAIC);
        blockWithItem(ModBlocks.CHERRY_MOSAIC);
        blockWithItem(ModBlocks.MANGROVE_MOSAIC);

        blockWithItem(ModBlocks.RED_PAINTED_PLANKS);
        blockWithItem(ModBlocks.ORANGE_PAINTED_PLANKS);
        blockWithItem(ModBlocks.YELLOW_PAINTED_PLANKS);
        blockWithItem(ModBlocks.GREEN_PAINTED_PLANKS);
        blockWithItem(ModBlocks.LIME_PAINTED_PLANKS);
        blockWithItem(ModBlocks.BLUE_PAINTED_PLANKS);
        blockWithItem(ModBlocks.LIGHT_BLUE_PAINTED_PLANKS);
        blockWithItem(ModBlocks.CYAN_PAINTED_PLANKS);
        blockWithItem(ModBlocks.PURPLE_PAINTED_PLANKS);
        blockWithItem(ModBlocks.MAGENTA_PAINTED_PLANKS);
        blockWithItem(ModBlocks.PINK_PAINTED_PLANKS);
        blockWithItem(ModBlocks.WHITE_PAINTED_PLANKS);
        blockWithItem(ModBlocks.LIGHT_GRAY_PAINTED_PLANKS);
        blockWithItem(ModBlocks.GRAY_PAINTED_PLANKS);
        blockWithItem(ModBlocks.BLACK_PAINTED_PLANKS);
        blockWithItem(ModBlocks.BROWN_PAINTED_PLANKS);

        axisBlock(((RotatedPillarBlock) ModBlocks.BAMBOO_BUNDLE.get()), blockTexture(Blocks.BAMBOO_BLOCK), blockTexture(Blocks.BAMBOO_BLOCK));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BAMBOO_BUNDLE.get()), blockTexture(Blocks.STRIPPED_BAMBOO_BLOCK), blockTexture(Blocks.STRIPPED_BAMBOO_BLOCK));

        blockItem(ModBlocks.BAMBOO_BUNDLE);
        blockItem(ModBlocks.STRIPPED_BAMBOO_BUNDLE);
        blockItem(ModBlocks.LEAFY_PODZOL);
        blockItem(ModBlocks.GRASSY_PEAT);

        //STAIR-SLAB-WALL
        //CRACKED STONE BRICK
        blockWithItem(ModBlocks.POLISHED_STONE);
        stairsBlock(((StairBlock)ModBlocks.POLISHED_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_STONE.get()));
        slabBlock(((SlabBlock)ModBlocks.POLISHED_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_STONE.get()), blockTexture(ModBlocks.POLISHED_STONE.get()));
        wallBlock(((WallBlock)ModBlocks.POLISHED_STONE_WALL.get()), blockTexture(ModBlocks.POLISHED_STONE.get()));


        axisBlock(((RotatedPillarBlock) ModBlocks.STONE_PILLAR.get()), blockTexture(ModBlocks.STONE_PILLAR.get()), new ResourceLocation(BensAddons.MOD_ID, "block/stone_pillar_top"));
        blockItem(ModBlocks.STONE_PILLAR);

        stairsBlock(((StairBlock)ModBlocks.CRACKED_STONE_BRICK_STAIRS.get()), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        stairsBlock(((StairBlock)ModBlocks.SMOOTH_STONE_STAIRS.get()), blockTexture(Blocks.SMOOTH_STONE));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_STONE_BRICK_SLAB.get()), blockTexture(Blocks.CRACKED_STONE_BRICKS), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        wallBlock(((WallBlock)ModBlocks.CRACKED_STONE_BRICK_WALL.get()), blockTexture(Blocks.CRACKED_STONE_BRICKS));

        wallBlock(((WallBlock)ModBlocks.STONE_WALL.get()), blockTexture(Blocks.STONE));
        wallBlock(((WallBlock)ModBlocks.SMOOTH_STONE_WALL.get()), blockTexture(Blocks.SMOOTH_STONE));
        wallBlock(((WallBlock)ModBlocks.POLISHED_ANDESITE_WALL.get()), blockTexture(Blocks.POLISHED_ANDESITE));
        wallBlock(((WallBlock)ModBlocks.POLISHED_DIORITE_WALL.get()), blockTexture(Blocks.POLISHED_DIORITE));
        wallBlock(((WallBlock)ModBlocks.POLISHED_GRANITE_WALL.get()), blockTexture(Blocks.POLISHED_GRANITE));
        //DEEPSLATE
        stairsBlock(((StairBlock)ModBlocks.DEEPSLATE_STAIRS.get()), blockTexture(Blocks.DEEPSLATE));
        slabBlock(((SlabBlock)ModBlocks.DEEPSLATE_SLAB.get()), blockTexture(Blocks.DEEPSLATE), blockTexture(Blocks.DEEPSLATE));
        wallBlock(((WallBlock)ModBlocks.DEEPSLATE_WALL.get()), blockTexture(Blocks.DEEPSLATE));
        stairsBlock(((StairBlock)ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        wallBlock(((WallBlock)ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        stairsBlock(((StairBlock)ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        wallBlock(((WallBlock)ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get()), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));

        blockWithItem(ModBlocks.SKULKED_COBBLED_DEEPSLATE);
        blockWithItem(ModBlocks.SKULKED_DEEPSLATE_TILES);
        blockWithItem(ModBlocks.SKULKED_DEEPSLATE_BRICKS);

        stairsBlock(((StairBlock)ModBlocks.SKULKED_COBBLED_DEEPSLATE_STAIRS.get()), blockTexture(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get()));
        stairsBlock(((StairBlock)ModBlocks.SKULKED_DEEPSLATE_TILE_STAIRS.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_TILES.get()));
        stairsBlock(((StairBlock)ModBlocks.SKULKED_DEEPSLATE_BRICK_STAIRS.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.SKULKED_COBBLED_DEEPSLATE_SLAB.get()), blockTexture(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get()), blockTexture(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get()));
        slabBlock(((SlabBlock)ModBlocks.SKULKED_DEEPSLATE_TILE_SLAB.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_TILES.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_TILES.get()));
        slabBlock(((SlabBlock)ModBlocks.SKULKED_DEEPSLATE_BRICK_SLAB.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.SKULKED_COBBLED_DEEPSLATE_WALL.get()), blockTexture(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get()));
        wallBlock(((WallBlock)ModBlocks.SKULKED_DEEPSLATE_TILE_WALL.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_TILES.get()));
        wallBlock(((WallBlock)ModBlocks.SKULKED_DEEPSLATE_BRICK_WALL.get()), blockTexture(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get()));


        //GILDED BLACKSTONE
        stairsBlock(((StairBlock)ModBlocks.GILDED_BLACKSTONE_STAIRS.get()), blockTexture(Blocks.GILDED_BLACKSTONE));
        slabBlock(((SlabBlock)ModBlocks.GILDED_BLACKSTONE_SLAB.get()), blockTexture(Blocks.GILDED_BLACKSTONE), blockTexture(Blocks.GILDED_BLACKSTONE));
        wallBlock(((WallBlock)ModBlocks.GILDED_BLACKSTONE_WALL.get()), blockTexture(Blocks.GILDED_BLACKSTONE));

        //CRACKED BLACKSTONE BRICKS
        stairsBlock(((StairBlock)ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        slabBlock(((SlabBlock)ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get()), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        wallBlock(((WallBlock)ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get()), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

        //GILDED BLACKSTONE BRICKS
        stairsBlock(((StairBlock)ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));
        slabBlock(((SlabBlock)ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));
        wallBlock(((WallBlock)ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));

        //CALCITE
        stairsBlock(((StairBlock)ModBlocks.CALCITE_STAIRS.get()), blockTexture(Blocks.CALCITE));
        slabBlock(((SlabBlock)ModBlocks.CALCITE_SLAB.get()), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        wallBlock(((WallBlock)ModBlocks.CALCITE_WALL.get()), blockTexture(Blocks.CALCITE));

        //DRIPSTONE
        stairsBlock(((StairBlock)ModBlocks.DRIPSTONE_STAIRS.get()), blockTexture(Blocks.DRIPSTONE_BLOCK));
        slabBlock(((SlabBlock)ModBlocks.DRIPSTONE_SLAB.get()), blockTexture(Blocks.DRIPSTONE_BLOCK), blockTexture(Blocks.DRIPSTONE_BLOCK));
        wallBlock(((WallBlock)ModBlocks.DRIPSTONE_WALL.get()), blockTexture(Blocks.DRIPSTONE_BLOCK));


    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject)  {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(BensAddons.MOD_ID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }



}
