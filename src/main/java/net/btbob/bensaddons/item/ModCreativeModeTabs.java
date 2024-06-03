package net.btbob.bensaddons.item;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BensAddons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BA_NATURE_TAB = CREATIVE_MODE_TABS.register("ba_nature_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MORTAR_AND_PESTLE.get()))
                    .title(Component.translatable("creativetab.ba_nature_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //HARVEST TOOLS
                        pOutput.accept(ModItems.MORTAR_AND_PESTLE.get());

                        //NATURAL BLOCKS
                        pOutput.accept(MushroomBlocks.MUSHROOM_GROWING_BOX.get());
                        pOutput.accept(ModBlocks.LEAFY_PODZOL.get());
                        pOutput.accept(ModBlocks.GRASSY_PEAT.get());
                        pOutput.accept(ModBlocks.PEAT.get());
                        pOutput.accept(ModBlocks.MYCELIATED_DIRT.get());

                        //MISC DECORATIVE PLANTS
                        pOutput.accept(ModBlocks.CATTAIL.get());
                        pOutput.accept(ModBlocks.CLOVER.get());
                        pOutput.accept(ModBlocks.LUCKY_CLOVER.get());
                        pOutput.accept(ModBlocks.TRUMPET_PITCHER.get());
                        pOutput.accept(ModBlocks.ZOMBIE_BLOOM.get());
                        pOutput.accept(ModBlocks.YUCCA.get());

                        //SAGE or SALVIA
                        pOutput.accept(ModBlocks.SALVIA.get());
                        pOutput.accept(ModBlocks.CEDAR_SALVIA.get());

                        //SINGLE FLOWERS
                        pOutput.accept(ModBlocks.DAFFODIL.get());
                        pOutput.accept(ModBlocks.IRIS.get());
                        pOutput.accept(ModBlocks.VIOLET.get());
                        pOutput.accept(ModBlocks.BIRD_OF_PARADISE.get());
                        pOutput.accept(ModBlocks.CONEFLOWER.get());
                        pOutput.accept(ModBlocks.DAHLIA.get());

                        //LILLIES
                        pOutput.accept(ModBlocks.WHITE_LILY.get());
                        pOutput.accept(ModBlocks.ORANGE_LILY.get());
                        pOutput.accept(ModBlocks.PURPLE_LILY.get());
                        pOutput.accept(ModBlocks.PINK_LILY.get());

                        //PANSY
                        pOutput.accept(ModBlocks.PANSY.get());
                        pOutput.accept(ModBlocks.FIRE_PANSY.get());
                        pOutput.accept(ModBlocks.CREEPER_PANSY.get());

                        //HYACINTH
                        pOutput.accept(ModBlocks.BLUE_HYACINTH.get());
                        pOutput.accept(ModBlocks.PURPLE_HYACINTH.get());
                        pOutput.accept(ModBlocks.MAGENTA_HYACINTH.get());

                        //CELOSIA
                        pOutput.accept(ModBlocks.MAGENTA_CELOSIA_BUSH.get());
                        pOutput.accept(ModBlocks.MAGENTA_CELOSIA.get());
                        pOutput.accept(ModBlocks.PINK_CELOSIA_BUSH.get());
                        pOutput.accept(ModBlocks.PINK_CELOSIA.get());
                        pOutput.accept(ModBlocks.ORANGE_CELOSIA_BUSH.get());
                        pOutput.accept(ModBlocks.ORANGE_CELOSIA.get());
                        pOutput.accept(ModBlocks.YELLOW_CELOSIA_BUSH.get());
                        pOutput.accept(ModBlocks.YELLOW_CELOSIA.get());

                        //CUT PEONY AND LILAC
                        pOutput.accept(ModBlocks.CUT_PEONY.get());
                        pOutput.accept(ModBlocks.CUT_LILAC.get());
                        //ROSE
                        pOutput.accept(ModBlocks.CUT_ROSE.get());
                        pOutput.accept(ModBlocks.BLUE_ROSE_BUSH.get());
                        pOutput.accept(ModBlocks.BLUE_CUT_ROSE.get());
                        pOutput.accept(ModBlocks.PURPLE_ROSE_BUSH.get());
                        pOutput.accept(ModBlocks.PURPLE_CUT_ROSE.get());
                        pOutput.accept(ModBlocks.WHITE_ROSE_BUSH.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_ROSE.get());

                        //HIBISCUS
                        pOutput.accept(ModBlocks.RED_HIBISCUS_BUSH.get());
                        pOutput.accept(ModBlocks.RED_CUT_HIBISCUS.get());
                        pOutput.accept(ModBlocks.ORANGE_HIBISCUS_BUSH.get());
                        pOutput.accept(ModBlocks.ORANGE_CUT_HIBISCUS.get());
                        pOutput.accept(ModBlocks.YELLOW_HIBISCUS_BUSH.get());
                        pOutput.accept(ModBlocks.YELLOW_CUT_HIBISCUS.get());
                        pOutput.accept(ModBlocks.PINK_HIBISCUS_BUSH.get());
                        pOutput.accept(ModBlocks.PINK_CUT_HIBISCUS.get());

                        //HYDRANGEA
                        pOutput.accept(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get());
                        pOutput.accept(ModBlocks.MAGENTA_CUT_HYDRANGEA.get());
                        pOutput.accept(ModBlocks.BLUE_HYDRANGEA_BUSH.get());
                        pOutput.accept(ModBlocks.BLUE_CUT_HYDRANGEA.get());
                        pOutput.accept(ModBlocks.PURPLE_HYDRANGEA_BUSH.get());
                        pOutput.accept(ModBlocks.PURPLE_CUT_HYDRANGEA.get());
                        pOutput.accept(ModBlocks.WHITE_HYDRANGEA_BUSH.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_HYDRANGEA.get());

                        //RHODODENDRON
                        pOutput.accept(ModBlocks.MAGENTA_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.MAGENTA_CUT_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.BLUE_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.BLUE_CUT_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.PURPLE_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.PURPLE_CUT_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.WHITE_RHODODENDRON.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_RHODODENDRON.get());


                        pOutput.accept(ModBlocks.HONEYSUCKLE_VINES.get());
                        //SUCCULENTS AND DESERT PLANTS
                        pOutput.accept(ModBlocks.BEACHGRASS.get());
                        pOutput.accept(ModBlocks.SEA_THRIFT.get());

                        pOutput.accept(ModBlocks.ALOE.get());
                        pOutput.accept(ModBlocks.BARREL_CACTUS.get());
                        pOutput.accept(ModBlocks.FLOWERING_CACTUS.get());
                        pOutput.accept(ModBlocks.OPUNTIA_CACTUS.get());
                        pOutput.accept(ModBlocks.CUT_OPUNTIA_CACTUS.get());
                        pOutput.accept(ModBlocks.HAWORTHIA.get());
                        pOutput.accept(ModBlocks.AEONIUM_BUSH.get());
                        pOutput.accept(ModBlocks.CUT_AEONIUM.get());
                        //MUSHROOMS

                        pOutput.accept(MushroomBlocks.DESTROYING_ANGEL.get());
                        pOutput.accept(MushroomBlocks.GIANT_PUFFBALL.get());
                        pOutput.accept(MushroomBlocks.GOLDEN_HALO.get());
                        pOutput.accept(MushroomBlocks.GRAY_MOREL.get());
                        pOutput.accept(MushroomBlocks.BLACK_TRUFFLE.get());
                        pOutput.accept(MushroomBlocks.FALSE_DEATH_CAP.get());
                        pOutput.accept(MushroomBlocks.SANDY_STILTBALL.get());
                        pOutput.accept(Blocks.BROWN_MUSHROOM);
                        pOutput.accept(MushroomBlocks.PORTABELLA.get());
                        pOutput.accept(ModBlocks.FAIRY_RING.get());
                        pOutput.accept(Blocks.RED_MUSHROOM);
                        pOutput.accept(MushroomBlocks.BASKET_STINKHORN.get());
                        pOutput.accept(MushroomBlocks.FIRE_CORAL.get());
                        pOutput.accept(MushroomBlocks.SUBBS_MUSHROOMS.get());
                        pOutput.accept(MushroomBlocks.EARTHBALL.get());
                        pOutput.accept(MushroomBlocks.DESERT_SHAGGY_MANE.get());
                        pOutput.accept(MushroomBlocks.YELLOW_PARASOLS.get());
                        pOutput.accept(MushroomBlocks.GLOWING_MUSHROOMS.get());
                        pOutput.accept(MushroomBlocks.DEATH_CAP.get());
                        pOutput.accept(MushroomBlocks.INDIGO_MILKCAP.get());
                        pOutput.accept(ModItems.INDIGO_MILKCAP_SPORES.get());
                        pOutput.accept(MushroomBlocks.INKY_CAP.get());
                        pOutput.accept(MushroomBlocks.LILAC_BONNETS.get());


                        //SHELF MUSHROOMS
                        pOutput.accept(MushroomBlocks.CHICKEN_OF_THE_WOODS.get());
                        pOutput.accept(MushroomBlocks.OYSTER.get());



                        //MUSHROOM BLOCKS
                        //TODO: FIRE CORAL MUSHROOM BLOCK
                        pOutput.accept(Blocks.RED_MUSHROOM_BLOCK);
                        pOutput.accept(ModBlocks.LOBSTER_TAIL_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.DAPPERLING_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.RUSSULA_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.WAX_CAP_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.MILK_CAP_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.CHANGLE_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.OYSTER_MUSHROOM_BLOCK.get());
                        pOutput.accept(Blocks.BROWN_MUSHROOM_BLOCK);
                        pOutput.accept(ModBlocks.INK_CAP_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.MOREL_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.TRUFFLE_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.PUFFBALL_MUSHROOM_BLOCK.get());
                        pOutput.accept(ModBlocks.INK_VINES.get());




                        //MAPLE ITEMS
                        pOutput.accept(ModBlocks.TREE_TAP.get());

                        pOutput.accept(ModBlocks.MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.MAPLE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(ModBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(ModBlocks.MAPLE_SAPLING.get());
                        //PALM ITEMS
                        pOutput.accept(ModBlocks.PALM_WOOD.get());
                        pOutput.accept(ModBlocks.PALM_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PALM_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PALM_LOG.get());
                        pOutput.accept(ModBlocks.PALM_LEAVES.get());
                        pOutput.accept(ModBlocks.PALM_SHOOT.get());
                        //BAOBAB ITEMS
                        pOutput.accept(ModBlocks.BAOBAB_WOOD.get());
                        pOutput.accept(ModBlocks.BAOBAB_LOG.get());
                       // pOutput.accept(ModBlocks.STRIPPED_PALM_WOOD.get());
                       // pOutput.accept(ModBlocks.STRIPPED_PALM_LOG.get());
                      //  pOutput.accept(ModBlocks.PALM_LEAVES.get());
                        pOutput.accept(ModBlocks.BAOBAB_SAPLING.get());

                        pOutput.accept(ModBlocks.BAMBOO_BUNDLE.get());
                        pOutput.accept(ModBlocks.STRIPPED_BAMBOO_BUNDLE.get());

                        pOutput.accept(ModBlocks.OAK_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.BIRCH_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.SPRUCE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.JUNGLE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.DARK_OAK_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.ACACIA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.AZALEA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.FLOWERING_AZALEA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.CHERRY_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.MANGROVE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.MAPLE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.PALM_LEAF_PILE.get());



                        //CORN
                        pOutput.accept(ModBlocks.TEOSINTE.get());
                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());
                        pOutput.accept(ModItems.CORN_MEAL.get());
                        //COCONUT
                        pOutput.accept(ModBlocks.COCONUT_BUNCH.get());
                        pOutput.accept(ModItems.COCONUT.get());
                        //PINEAPPLE
                        pOutput.accept(ModBlocks.PINEAPPLE_PLANT.get());
                        pOutput.accept(ModItems.PINEAPPLE.get());
                        //SHELL
                        pOutput.accept(ModItems.SHELL.get());
                        pOutput.accept(ModItems.SHELL_PICKAXE.get());
                        pOutput.accept(ModItems.SHELL_AXE.get());
                        pOutput.accept(ModItems.SHELL_SHOVEL.get());
                    })
                    .build());

    //PLATINUM + ADDITIONAL ORES AND GEMSTONE LATER :>
    public static final RegistryObject<CreativeModeTab> BA_ORES_TAB = CREATIVE_MODE_TABS.register("ba_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PLATINUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.ba_ores_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModItems.PLATINUM_INGOT.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());

                        pOutput.accept(ModItems.PLATINUM_SWORD.get());
                        pOutput.accept(ModItems.PLATINUM_PICKAXE.get());
                        pOutput.accept(ModItems.PLATINUM_AXE.get());
                        pOutput.accept(ModItems.PLATINUM_SHOVEL.get());
                        pOutput.accept(ModItems.PLATINUM_HOE.get());

                        pOutput.accept(ModItems.PLATINUM_HELMET.get());
                        pOutput.accept(ModItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(ModItems.PLATINUM_BOOTS.get());

                        pOutput.accept(ModBlocks.JADE_ORE.get());
                        pOutput.accept(ModBlocks.JADE_BLOCK.get());

                        pOutput.accept(ModItems.JADE.get());

                        pOutput.accept(ModItems.MACUAHUITL.get());
                        pOutput.accept(ModItems.JADE_PICKAXE.get());
                        pOutput.accept(ModItems.JADE_AXE.get());
                        pOutput.accept(ModItems.JADE_SHOVEL.get());
                        pOutput.accept(ModItems.JADE_HOE.get());

                        pOutput.accept(ModItems.JADE_HELMET.get());
                        pOutput.accept(ModItems.JADE_CHESTPLATE.get());
                        pOutput.accept(ModItems.JADE_LEGGINGS.get());
                        pOutput.accept(ModItems.JADE_BOOTS.get());

                        pOutput.accept(ModBlocks.PYRITE_ORE.get());
                        pOutput.accept(ModItems.PYRITE_NUGGET.get());
                        pOutput.accept(ModBlocks.PYRITE_BLOCK.get());

                        pOutput.accept(ModItems.PYRITE_SWORD.get());
                        pOutput.accept(ModItems.PYRITE_PICKAXE.get());
                        pOutput.accept(ModItems.PYRITE_AXE.get());
                        pOutput.accept(ModItems.PYRITE_SHOVEL.get());
                        pOutput.accept(ModItems.PYRITE_HOE.get());

                        pOutput.accept(ModItems.PYRITE_HELMET.get());
                        pOutput.accept(ModItems.PYRITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.PYRITE_LEGGINGS.get());
                        pOutput.accept(ModItems.PYRITE_BOOTS.get());


                        pOutput.accept(ModItems.ANCIENT_SWORD.get());
                        pOutput.accept(ModItems.MINECRAFT_MUSIC_DISC.get());
                        pOutput.accept(ModItems.WET_HANDS_MUSIC_DISC.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BA_BUILDING_BLOCKS = CREATIVE_MODE_TABS.register("ba_building_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LEAFY_PODZOL.get()))
                    .title(Component.translatable("creativetab.ba_building_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.LEAFY_PODZOL.get());
                        pOutput.accept(ModBlocks.GRASSY_PEAT.get());
                        pOutput.accept(ModBlocks.PEAT.get());
                        pOutput.accept(ModBlocks.RED_CLAY.get());
                        pOutput.accept(ModBlocks.ROCK_SALT.get());
                        pOutput.accept(ModBlocks.PUMICE.get());

                        //PINK SAND
                        pOutput.accept(ModBlocks.PINK_SAND.get());
                        pOutput.accept(ModBlocks.PINK_SANDSTONE.get());
                        pOutput.accept(ModBlocks.PINK_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.PINK_SMOOTH_SANDSTONE.get());
                        pOutput.accept(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_SMOOTH_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.PINK_CUT_SANDSTONE.get());
                        pOutput.accept(ModBlocks.PINK_CUT_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_CUT_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_CUT_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.PINK_CHISELED_SANDSTONE.get());
                        //BLACK SAND
                        pOutput.accept(ModBlocks.BLACK_SAND.get());
                        pOutput.accept(ModBlocks.BLACK_SANDSTONE.get());
                        pOutput.accept(ModBlocks.BLACK_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.BLACK_SMOOTH_SANDSTONE.get());
                        pOutput.accept(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_SMOOTH_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.BLACK_CUT_SANDSTONE.get());
                        pOutput.accept(ModBlocks.BLACK_CUT_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_CUT_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_CUT_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.BLACK_CHISELED_SANDSTONE.get());
                        //WHITE SAND
                        pOutput.accept(ModBlocks.WHITE_SAND.get());
                        pOutput.accept(ModBlocks.WHITE_SANDSTONE.get());
                        pOutput.accept(ModBlocks.WHITE_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.WHITE_SMOOTH_SANDSTONE.get());
                        pOutput.accept(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_SMOOTH_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_SANDSTONE.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_CUT_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.WHITE_CHISELED_SANDSTONE.get());
                        //IRIDESCENT SAND
                        pOutput.accept(ModBlocks.IRIDESCENT_SAND.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SANDSTONE.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_CUT_SANDSTONE.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_CUT_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_CUT_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_CUT_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.IRIDESCENT_CHISELED_SANDSTONE.get());


                        //GABBRO
                        pOutput.accept(ModBlocks.GABBRO.get());
                        pOutput.accept(ModBlocks.GABBRO_STAIRS.get());
                        pOutput.accept(ModBlocks.GABBRO_SLAB.get());
                        pOutput.accept(ModBlocks.GABBRO_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_BRICKS.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_GABBRO_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CHISELED_POLISHED_GABBRO.get());


                        //GNEISS
                        pOutput.accept(ModBlocks.GNEISS.get());
                        pOutput.accept(ModBlocks.COBBLED_GNEISS.get());
                        pOutput.accept(ModBlocks.ENERGIZED_COBBLED_GNEISS.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS.get());
                        pOutput.accept(ModBlocks.CHISELED_GNEISS.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_GNEISS_BRICKS.get());
                        pOutput.accept(ModBlocks.ENERGIZED_GNEISS_BRICKS.get());
                        pOutput.accept(ModBlocks.GNEISS_TILES.get());
                        pOutput.accept(ModBlocks.CRACKED_GNEISS_TILES.get());
                        pOutput.accept(ModBlocks.ENERGIZED_GNEISS_TILES.get());
                        pOutput.accept(ModBlocks.SMOOTH_GNEISS.get());
                        pOutput.accept(ModBlocks.SMOOTH_GNEISS_SLAB.get());

                        //CHERT
                        pOutput.accept(ModBlocks.CHERT.get());
                        pOutput.accept(ModBlocks.CHERT_STAIRS.get());
                        pOutput.accept(ModBlocks.CHERT_SLAB.get());
                        pOutput.accept(ModBlocks.CHERT_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_CHERT.get());
                        pOutput.accept(ModBlocks.POLISHED_CHERT_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_CHERT_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_CHERT_WALL.get());
                        pOutput.accept(ModBlocks.CHERT_BRICKS.get());
                        pOutput.accept(ModBlocks.CHERT_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CHERT_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CHERT_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_CHERT_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_CHERT_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_CHERT_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_CHERT_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CHISELED_CHERT.get());
                        pOutput.accept(ModBlocks.CHERT_TILES.get());
                        pOutput.accept(ModBlocks.CRACKED_CHERT_TILES.get());
                        pOutput.accept(ModBlocks.CRYSTALLINE_CHERT_BRICKS.get());
                        pOutput.accept(ModBlocks.CRYSTALLINE_CHERT_TILES.get());

                        //LIMESTONE
                        pOutput.accept(ModBlocks.LIMESTONE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.LICHENY_COBBLED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.LICHENY_COBBLED_LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.LICHENY_COBBLED_LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.LICHENY_COBBLED_LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.CHISELED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.LICHENY_LIMESTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.LICHENY_LIMESTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LICHENY_LIMESTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LICHENY_LIMESTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_LIMESTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_LIMESTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_LIMESTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.LIMESTONE_TILE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_TILE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_TILE_WALL.get());

                        //SLATE
                        pOutput.accept(ModBlocks.SLATE.get());
                        pOutput.accept(ModBlocks.SLATE_STAIRS.get());
                        pOutput.accept(ModBlocks.SLATE_SLAB.get());
                        pOutput.accept(ModBlocks.SLATE_WALL.get());
                        pOutput.accept(ModBlocks.COBBLED_SLATE.get());
                        pOutput.accept(ModBlocks.BEDAZZLED_COBBLED_SLATE.get());

                        pOutput.accept(ModBlocks.SLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.SLATE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.SLATE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.SLATE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_SLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_SLATE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_SLATE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_SLATE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.BEDAZZLED_SLATE_BRICKS.get());

                        pOutput.accept(ModBlocks.CHISELED_SLATE.get());
                        pOutput.accept(ModBlocks.SMOOTH_SLATE.get());
                        pOutput.accept(ModBlocks.SMOOTH_SLATE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_SLATE.get());
                        pOutput.accept(ModBlocks.POLISHED_SLATE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_SLATE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_SLATE_WALL.get());

                        pOutput.accept(ModBlocks.SLATE_TILES.get());
                        pOutput.accept(ModBlocks.CRACKED_SLATE_TILES.get());
                        pOutput.accept(ModBlocks.BEDAZZLED_SLATE_TILES.get());
                        pOutput.accept(ModBlocks.SLATE_PILLAR.get());

                        //MARBLE
                        pOutput.accept(ModBlocks.MARBLE.get());
                        pOutput.accept(ModBlocks.MARBLE_STAIRS.get());
                        pOutput.accept(ModBlocks.MARBLE_SLAB.get());
                        pOutput.accept(ModBlocks.MARBLE_WALL.get());
                        pOutput.accept(ModBlocks.COBBLED_MARBLE.get());
                        pOutput.accept(ModBlocks.PAINTED_COBBLED_MARBLE.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.PAINTED_MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.CHISELED_MARBLE.get());
                        pOutput.accept(ModBlocks.MARBLE_TILES.get());
                        pOutput.accept(ModBlocks.CRACKED_MARBLE_TILES.get());
                        pOutput.accept(ModBlocks.PAINTED_MARBLE_TILES.get());
                        pOutput.accept(ModBlocks.MARBLE_PILLAR.get());


                        //TODO::ADD VANILLA ALTS
                        //DECORATIVE
                        pOutput.accept(ModBlocks.BLENDER.get());

                        pOutput.accept(ModBlocks.PRESERVED_GRASS_BLOCK.get());
                        pOutput.accept(ModBlocks.ANCIENT_STONE.get());
                        pOutput.accept(ModBlocks.OLDSTONE.get());
                        pOutput.accept(ModBlocks.MOSSY_OLDSTONE.get());
                        pOutput.accept(ModBlocks.SHATTERED_OLDSTONE.get());
                        pOutput.accept(ModBlocks.ANCIENT_BRICK.get());
                        pOutput.accept(ModBlocks.ANCIENT_ALLOY_BLOCK.get());
                        pOutput.accept(ModBlocks.NETHERSTONE.get());
                        pOutput.accept(ModBlocks.GLOWRACK.get());
                        pOutput.accept(ModBlocks.PRESERVED_WOOD.get());
                        pOutput.accept(ModBlocks.PRESERVED_WOOD_DOOR.get());
                        pOutput.accept(ModBlocks.PRESERVED_WOOD_TRAPDOOR.get());

                        pOutput.accept(ModBlocks.STONE_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_STONE.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_WALL.get());


                        pOutput.accept(ModBlocks.SMOOTH_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.SMOOTH_STONE_WALL.get());

                        pOutput.accept(ModBlocks.CRACKED_STONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_STONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_STONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.STONE_PILLAR.get());

                        pOutput.accept(ModBlocks.POLISHED_GRANITE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_DIORITE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_ANDESITE_WALL.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_STAIRS.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SLAB.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_WALL.get());

                        pOutput.accept(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get());
                        pOutput.accept(ModBlocks.SKULKED_COBBLED_DEEPSLATE_STAIRS.get());
                        pOutput.accept(ModBlocks.SKULKED_COBBLED_DEEPSLATE_SLAB.get());
                        pOutput.accept(ModBlocks.SKULKED_COBBLED_DEEPSLATE_WALL.get());

                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get());

                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_TILES.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_TILE_STAIRS.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.SKULKED_DEEPSLATE_TILE_WALL.get());



                        pOutput.accept(ModBlocks.CALCITE_STAIRS.get());
                        pOutput.accept(ModBlocks.CALCITE_SLAB.get());
                        pOutput.accept(ModBlocks.CALCITE_WALL.get());

                        pOutput.accept(ModBlocks.DRIPSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.DRIPSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.DRIPSTONE_WALL.get());

                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.GILDED_BLACKSTONE_WALL.get());

                        pOutput.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.CUT_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.CUT_QUARTZ_STAIRS.get());
                        pOutput.accept(ModBlocks.CUT_QUARTZ_SLAB.get());
                        pOutput.accept(ModBlocks.CUT_QUARTZ_WALL.get());

                       pOutput.accept(ModBlocks.QUARTZ_WALL.get());
                       pOutput.accept(ModBlocks.SMOOTH_QUARTZ_WALL.get());
                       pOutput.accept(ModBlocks.QUARTZ_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.QUARTZ_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.QUARTZ_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.BRICK_TILE.get());
                        pOutput.accept(ModBlocks.BRICK_TILE_STAIRS.get());
                        pOutput.accept(ModBlocks.BRICK_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.BRICK_TILE_WALL.get());
                        pOutput.accept(ModBlocks.CHISELED_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.BRICK_PILLAR.get());

                        //FOSSILS
                        pOutput.accept(ModBlocks.STONE_NODULE.get());
                        pOutput.accept(ModBlocks.AMMONITE_FOSSIL.get());
                        pOutput.accept(ModBlocks.ANOMALOCARIS_FOSSIL.get());
                        pOutput.accept(ModBlocks.CLAW_FOSSIL.get());
                        pOutput.accept(ModBlocks.FERN_FOSSIL.get());
                        pOutput.accept(ModBlocks.FOOTPRINTS_FOSSIL.get());
                        pOutput.accept(ModBlocks.SPOOK_FOSSIL.get());
                        pOutput.accept(ModBlocks.TORCHFLOWER_FOSSIL.get());
                        pOutput.accept(ModBlocks.TRILOBITE_FOSSIL.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL1.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL2.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL3.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL4.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL5.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL6.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL7.get());
                        pOutput.accept(ModBlocks.SNIFFER_FOSSIL8.get());

                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.JADE_ORE.get());
                        pOutput.accept(ModBlocks.JADE_BLOCK.get());
                        pOutput.accept(ModBlocks.PYRITE_ORE.get());
                        pOutput.accept(ModBlocks.PYRITE_BLOCK.get());

                        pOutput.accept(ModBlocks.POLISHED_AMETHYST.get());
                        pOutput.accept(ModBlocks.SMOOTH_AMETHYST.get());
                        pOutput.accept(ModBlocks.CHISELED_AMETHYST.get());
                        pOutput.accept(ModBlocks.CUT_AMETHYST.get());
                        pOutput.accept(ModBlocks.AMETHYST_BRICKS.get());
                        pOutput.accept(ModBlocks.AMETHYST_PILLAR.get());

                        //RUBY
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_RUBY.get());
                        pOutput.accept(ModBlocks.SMALL_RUBY_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_RUBY_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_RUBY_BUD.get());
                        pOutput.accept(ModBlocks.RUBY_CLUSTER.get());
                        pOutput.accept(ModItems.RUBY_SHARD.get());

                        pOutput.accept(ModBlocks.POLISHED_RUBY.get());
                        pOutput.accept(ModBlocks.SMOOTH_RUBY.get());
                        pOutput.accept(ModBlocks.CHISELED_RUBY.get());
                        pOutput.accept(ModBlocks.CUT_RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BRICKS.get());
                       // pOutput.accept(ModBlocks.RUBY_PILLAR.get());

                        //TOPAZ
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_TOPAZ.get());
                        pOutput.accept(ModBlocks.SMALL_TOPAZ_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_TOPAZ_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_TOPAZ_BUD.get());
                        pOutput.accept(ModBlocks.TOPAZ_CLUSTER.get());
                        pOutput.accept(ModItems.TOPAZ_SHARD.get());

                        pOutput.accept(ModBlocks.CHISELED_TOPAZ.get());
                        pOutput.accept(ModBlocks.TOPAZ_BRICKS.get());

                        //CITRINE
                        pOutput.accept(ModBlocks.CITRINE_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_CITRINE.get());
                        pOutput.accept(ModBlocks.SMALL_CITRINE_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_CITRINE_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_CITRINE_BUD.get());
                        pOutput.accept(ModBlocks.CITRINE_CLUSTER.get());
                        pOutput.accept(ModItems.CITRINE_SHARD.get());


                        //PERIDOT SET
                        pOutput.accept(ModBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_PERIDOT.get());
                        pOutput.accept(ModBlocks.SMALL_PERIDOT_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_PERIDOT_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_PERIDOT_BUD.get());
                        pOutput.accept(ModBlocks.PERIDOT_CLUSTER.get());
                        pOutput.accept(ModItems.PERIDOT_SHARD.get());


                        pOutput.accept(ModBlocks.POLISHED_PERIDOT.get());
                        pOutput.accept(ModBlocks.SMOOTH_PERIDOT.get());
                        pOutput.accept(ModBlocks.CHISELED_PERIDOT.get());
                        pOutput.accept(ModBlocks.CUT_PERIDOT.get());
                        pOutput.accept(ModBlocks.PERIDOT_BRICKS.get());
                        pOutput.accept(ModBlocks.PERIDOT_PILLAR.get());

                        //AQUAMARINE
                        pOutput.accept(ModBlocks.AQUAMARINE_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_AQUAMARINE.get());
                        pOutput.accept(ModBlocks.SMALL_AQUAMARINE_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_AQUAMARINE_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_AQUAMARINE_BUD.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_CLUSTER.get());
                        pOutput.accept(ModItems.AQUAMARINE_SHARD.get());

                        pOutput.accept(ModBlocks.POLISHED_AQUAMARINE.get());
                        pOutput.accept(ModBlocks.SMOOTH_AQUAMARINE.get());
                        pOutput.accept(ModBlocks.CHISELED_AQUAMARINE.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_BRICKS.get());



                        //SAPPHIRE
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.BUDDING_SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SMALL_SAPPHIRE_BUD.get());
                        pOutput.accept(ModBlocks.MEDIUM_SAPPHIRE_BUD.get());
                        pOutput.accept(ModBlocks.LARGE_SAPPHIRE_BUD.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_CLUSTER.get());

                        pOutput.accept(ModBlocks.TREE_TAP.get());
                        pOutput.accept(ModItems.TROWEL.get());


                        pOutput.accept(ModBlocks.MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.MAPLE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(ModBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(ModBlocks.MAPLE_STAIRS.get());
                        pOutput.accept(ModBlocks.MAPLE_SLAB.get());
                        pOutput.accept(ModBlocks.MAPLE_FENCE.get());
                        pOutput.accept(ModBlocks.MAPLE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.MAPLE_DOOR.get());
                        pOutput.accept(ModBlocks.MAPLE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.MAPLE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.MAPLE_BUTTON.get());
                        pOutput.accept(ModBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(ModItems.MAPLE_SIGN.get());
                        pOutput.accept(ModItems.MAPLE_HANGING_SIGN.get());

                        //PALM
                        pOutput.accept(ModBlocks.PALM_WOOD.get());
                        pOutput.accept(ModBlocks.PALM_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PALM_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PALM_LOG.get());
                        pOutput.accept(ModBlocks.PALM_PLANKS.get());
                        pOutput.accept(ModBlocks.PALM_STAIRS.get());
                        pOutput.accept(ModBlocks.PALM_SLAB.get());
                        pOutput.accept(ModBlocks.PALM_FENCE.get());
                        pOutput.accept(ModBlocks.PALM_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PALM_DOOR.get());
                        pOutput.accept(ModBlocks.PALM_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.PALM_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PALM_BUTTON.get());
                        pOutput.accept(ModItems.PALM_SIGN.get());
                        pOutput.accept(ModItems.PALM_HANGING_SIGN.get());

                        //BAOBAB
                        pOutput.accept(ModBlocks.BAOBAB_WOOD.get());
                        pOutput.accept(ModBlocks.BAOBAB_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BAOBAB_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BAOBAB_LOG.get());
                        pOutput.accept(ModBlocks.BAOBAB_PLANKS.get());
                        pOutput.accept(ModBlocks.BAOBAB_STAIRS.get());
                        pOutput.accept(ModBlocks.BAOBAB_SLAB.get());
                        pOutput.accept(ModBlocks.BAOBAB_FENCE.get());
                        pOutput.accept(ModBlocks.BAOBAB_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BAOBAB_DOOR.get());
                        pOutput.accept(ModBlocks.BAOBAB_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.BAOBAB_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BAOBAB_BUTTON.get());
                       // pOutput.accept(ModBlocks.PALM_LEAVES.get());
                        pOutput.accept(ModItems.BAOBAB_SIGN.get());
                        pOutput.accept(ModItems.BAOBAB_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.OAK_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.BIRCH_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.SPRUCE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.JUNGLE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.DARK_OAK_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.ACACIA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.AZALEA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.FLOWERING_AZALEA_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.CHERRY_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.MANGROVE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.MAPLE_LEAF_PILE.get());
                        pOutput.accept(ModBlocks.PALM_LEAF_PILE.get());
                        //pOutput.accept(ModBlocks.BAOBAB_LEAF_PILE.get());

                        pOutput.accept(ModBlocks.BAMBOO_BUNDLE.get());
                        pOutput.accept(ModBlocks.STRIPPED_BAMBOO_BUNDLE.get());
                        pOutput.accept(ModBlocks.OAK_MOSAIC.get());
                        pOutput.accept(ModBlocks.BIRCH_MOSAIC.get());
                        pOutput.accept(ModBlocks.SPRUCE_MOSAIC.get());
                        pOutput.accept(ModBlocks.JUNGLE_MOSAIC.get());
                        pOutput.accept(ModBlocks.DARK_OAK_MOSAIC.get());
                        pOutput.accept(ModBlocks.ACACIA_MOSAIC.get());
                        pOutput.accept(ModBlocks.CHERRY_MOSAIC.get());
                        pOutput.accept(ModBlocks.MANGROVE_MOSAIC.get());
                        pOutput.accept(ModBlocks.CRIMSON_MOSAIC.get());
                        pOutput.accept(ModBlocks.WARPED_MOSAIC.get());
                        pOutput.accept(ModBlocks.MAPLE_MOSAIC.get());
                        pOutput.accept(ModBlocks.PALM_MOSAIC.get());
                        pOutput.accept(ModBlocks.BAOBAB_MOSAIC.get());


                        pOutput.accept(ModBlocks.WHITE_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.GRAY_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLACK_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.BROWN_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.RED_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.ORANGE_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.YELLOW_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIME_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.GREEN_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.CYAN_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.BLUE_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.PURPLE_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_PAINTED_PLANKS.get());
                        pOutput.accept(ModBlocks.PINK_PAINTED_PLANKS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
