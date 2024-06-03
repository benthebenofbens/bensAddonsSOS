package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BensAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //TOOLS
simpleItem(ModItems.MORTAR_AND_PESTLE);
simpleItem(ModItems.INDIGO_MILKCAP_SPORES);
//PLATINUM
simpleItem(ModItems.RAW_PLATINUM);
simpleItem(ModItems.PLATINUM_INGOT);

handheldItem(ModItems.PLATINUM_AXE);
handheldItem(ModItems.PLATINUM_SWORD);
handheldItem(ModItems.PLATINUM_HOE);
handheldItem(ModItems.PLATINUM_PICKAXE);
handheldItem(ModItems.PLATINUM_SHOVEL);

trimmedArmorItem(ModItems.PLATINUM_HELMET);
trimmedArmorItem(ModItems.PLATINUM_CHESTPLATE);
trimmedArmorItem(ModItems.PLATINUM_LEGGINGS);
trimmedArmorItem(ModItems.PLATINUM_BOOTS);


handheldItem(ModItems.TROWEL);
//PYRITE
        simpleItem(ModItems.PYRITE_NUGGET);
        simpleItem(ModItems.PYRITE_INGOT);


        handheldItem(ModItems.PYRITE_AXE);
        handheldItem(ModItems.PYRITE_SWORD);
        handheldItem(ModItems.PYRITE_HOE);
        handheldItem(ModItems.PYRITE_PICKAXE);
        handheldItem(ModItems.PYRITE_SHOVEL);

        trimmedArmorItem(ModItems.PYRITE_HELMET);
        trimmedArmorItem(ModItems.PYRITE_CHESTPLATE);
        trimmedArmorItem(ModItems.PYRITE_LEGGINGS);
        trimmedArmorItem(ModItems.PYRITE_BOOTS);

//CORN
simpleItem(ModItems.CORN);
simpleItem(ModItems.CORN_MEAL);
simpleItem(ModItems.CORN_SEEDS);

//COCONUT
        simpleItem(ModItems.COCONUT);
        simpleItem(ModItems.PINEAPPLE);

//MUSHROOMS
            simpleBlockItemBlockTexture(ModBlocks.FAIRY_RING);



        simpleBlockItemBlockTexture(ModBlocks.INK_VINES);


        //PUFFBALLS
        simpleBlockItemBlockTexture(MushroomBlocks.GIANT_PUFFBALL);
        bothBlockItem(ModItems.GIANT_PUFFBALL_ITEM, MushroomBlocks.GIANT_PUFFBALL);
        //MILKCAPS
        simpleBlockItemBlockTexture(MushroomBlocks.INDIGO_MILKCAP);
        bothBlockItem(ModItems.INDIGO_MILKCAP_ITEM, MushroomBlocks.INDIGO_MILKCAP);

        //SHELVES
        simpleBlockItemBlockTexture(MushroomBlocks.CHICKEN_OF_THE_WOODS);
        shelfItem(ModItems.CHICKEN_OF_THE_WOODS_ITEM);
        simpleBlockItemBlockTexture(MushroomBlocks.OYSTER);
        shelfItem(ModItems.OYSTER_ITEM);
        simpleBlockItemBlockTexture(MushroomBlocks.DESERT_SHAGGY_MANE);
        bothBlockItem(ModItems.DESERT_SHAGGY_MANE_ITEM, MushroomBlocks.DESERT_SHAGGY_MANE);
        simpleBlockItemBlockTexture(MushroomBlocks.PORTABELLA);
        bothBlockItem(ModItems.PORTABELLA_ITEM, MushroomBlocks.PORTABELLA);
        simpleBlockItemBlockTexture(MushroomBlocks.SANDY_STILTBALL);
        bothBlockItem(ModItems.SANDY_STILTBALL_ITEM, MushroomBlocks.SANDY_STILTBALL);
        simpleBlockItemBlockTexture(MushroomBlocks.SUBBS_MUSHROOMS);
        bothBlockItem(ModItems.SUBBS_MUSHROOMS_ITEM, MushroomBlocks.SUBBS_MUSHROOMS);
            simpleBlockItemBlockTexture(MushroomBlocks.FIRE_CORAL);
            bothBlockItem(ModItems.FIRE_CORAL_ITEM, MushroomBlocks.FIRE_CORAL);
            simpleBlockItemBlockTexture(MushroomBlocks.GLOWING_MUSHROOMS);
            bothBlockItem(ModItems.GLOWING_MUSHROOMS_ITEM, MushroomBlocks.GLOWING_MUSHROOMS);
            simpleBlockItemBlockTexture(MushroomBlocks.YELLOW_PARASOLS);
            bothBlockItem(ModItems.YELLOW_PARASOLS_ITEM, MushroomBlocks.YELLOW_PARASOLS);
        simpleBlockItemBlockTexture(MushroomBlocks.GOLDEN_HALO);
        bothBlockItem(ModItems.GOLDEN_HALO_ITEM, MushroomBlocks.GOLDEN_HALO);
        simpleBlockItemBlockTexture(MushroomBlocks.BLACK_TRUFFLE);
        bothBlockItem(ModItems.BLACK_TRUFFLE_ITEM, MushroomBlocks.BLACK_TRUFFLE);
        simpleBlockItemBlockTexture(MushroomBlocks.LILAC_BONNETS);
        bothBlockItem(ModItems.LILAC_BONNETS_ITEM, MushroomBlocks.LILAC_BONNETS);
        simpleBlockItemBlockTexture(MushroomBlocks.BASKET_STINKHORN);
        bothBlockItem(ModItems.BASKET_STINKHORN, MushroomBlocks.BASKET_STINKHORN);
        simpleBlockItemBlockTexture(MushroomBlocks.DEATH_CAP);
        bothBlockItem(ModItems.DEATH_CAP_ITEM, MushroomBlocks.DEATH_CAP);
        simpleBlockItemBlockTexture(MushroomBlocks.DESTROYING_ANGEL);
        bothBlockItem(ModItems.DESTROYING_ANGEL_ITEM, MushroomBlocks.DESTROYING_ANGEL);
        simpleBlockItemBlockTexture(MushroomBlocks.EARTHBALL);
        bothBlockItem(ModItems.EARTHBALL_ITEM, MushroomBlocks.EARTHBALL);
        simpleBlockItemBlockTexture(MushroomBlocks.FALSE_DEATH_CAP);
        bothBlockItem(ModItems.FALSE_DEATH_CAP_ITEM, MushroomBlocks.FALSE_DEATH_CAP);
        simpleBlockItemBlockTexture(MushroomBlocks.GRAY_MOREL);
        bothBlockItem(ModItems.GRAY_MOREL_ITEM, MushroomBlocks.GRAY_MOREL);
        simpleBlockItemBlockTexture(MushroomBlocks.INKY_CAP);
        bothBlockItem(ModItems.INKY_CAP_ITEM, MushroomBlocks.INKY_CAP);



        //MOJANG
        brownMushroomBlockItem(ModItems.BROWN_MUSHROOM_ITEM);
        redMushroomBlockItem(ModItems.RED_MUSHROOM_ITEM);

//FLOWERS AND PLANTS
simpleBlockItemBlockTexture(ModBlocks.TRUMPET_PITCHER);
simpleBlockItemBlockTexture(ModBlocks.VIOLET);
simpleBlockItemBlockTexture(ModBlocks.BIRD_OF_PARADISE);
simpleBlockItemBlockTexture(ModBlocks.IRIS);
simpleBlockItemBlockTexture(ModBlocks.DAFFODIL);
simpleBlockItemBlockTexture(ModBlocks.DAHLIA);

simpleBlockItemBlockTexture(ModBlocks.PANSY);
simpleBlockItemBlockTexture(ModBlocks.FIRE_PANSY);
simpleBlockItemBlockTexture(ModBlocks.CREEPER_PANSY);

simpleBlockItemBlockTexture(ModBlocks.PURPLE_HYACINTH);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_HYACINTH);
simpleBlockItemBlockTexture(ModBlocks.BLUE_HYACINTH);

simpleBlockItemBlockTexture(ModBlocks.MAGENTA_CELOSIA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_CELOSIA);
simpleBlockItemBlockTexture(ModBlocks.PINK_CELOSIA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.PINK_CELOSIA);
simpleBlockItemBlockTexture(ModBlocks.ORANGE_CELOSIA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.ORANGE_CELOSIA);
simpleBlockItemBlockTexture(ModBlocks.YELLOW_CELOSIA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.YELLOW_CELOSIA_BUSH);

simpleBlockItemBlockTexture(ModBlocks.SALVIA);
simpleBlockItemBlockTexture(ModBlocks.CEDAR_SALVIA);

simpleBlockItemBlockTexture(ModBlocks.CONEFLOWER);

simpleBlockItemBlockTexture(ModBlocks.WHITE_LILY);
simpleBlockItemBlockTexture(ModBlocks.PINK_LILY);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_LILY);
simpleBlockItemBlockTexture(ModBlocks.ORANGE_LILY);
simpleBlockItemBlockTexture(ModBlocks.SEA_THRIFT);
simpleBlockItemBlockTexture(ModBlocks.HONEYSUCKLE_VINES);

simpleBlockItemBlockTexture(ModBlocks.LUCKY_CLOVER);
simpleBlockItemBlockTexture(ModBlocks.CLOVER);

simpleBlockItemBlockTexture(ModBlocks.CUT_PEONY);
simpleBlockItemBlockTexture(ModBlocks.CUT_LILAC);

simpleBlockItemBlockTexture(ModBlocks.CUT_ROSE);
simpleBlockItemBlockTexture(ModBlocks.BLUE_CUT_ROSE);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_CUT_ROSE);
simpleBlockItemBlockTexture(ModBlocks.WHITE_CUT_ROSE);
simpleBlockItemBlockTexture(ModBlocks.RED_CUT_HIBISCUS);
simpleBlockItemBlockTexture(ModBlocks.YELLOW_CUT_HIBISCUS);
simpleBlockItemBlockTexture(ModBlocks.PINK_CUT_HIBISCUS);
simpleBlockItemBlockTexture(ModBlocks.ORANGE_CUT_HIBISCUS);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_CUT_HYDRANGEA);
simpleBlockItemBlockTexture(ModBlocks.BLUE_CUT_HYDRANGEA);
simpleBlockItemBlockTexture(ModBlocks.WHITE_CUT_HYDRANGEA);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_CUT_HYDRANGEA);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_CUT_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.WHITE_CUT_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.BLUE_CUT_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_CUT_RHODODENDRON);


simpleBlockItemBlockTexture(ModBlocks.BLUE_ROSE_BUSH);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_ROSE_BUSH);
simpleBlockItemBlockTexture(ModBlocks.WHITE_ROSE_BUSH);
simpleBlockItemBlockTexture(ModBlocks.YELLOW_HIBISCUS_BUSH);
simpleBlockItemBlockTexture(ModBlocks.ORANGE_HIBISCUS_BUSH);
simpleBlockItemBlockTexture(ModBlocks.PINK_HIBISCUS_BUSH);
simpleBlockItemBlockTexture(ModBlocks.RED_HIBISCUS_BUSH);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_HYDRANGEA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.WHITE_HYDRANGEA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.BLUE_HYDRANGEA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_HYDRANGEA_BUSH);
simpleBlockItemBlockTexture(ModBlocks.MAGENTA_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.PURPLE_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.BLUE_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.WHITE_RHODODENDRON);
simpleBlockItemBlockTexture(ModBlocks.TEOSINTE);
simpleBlockItemBlockTexture(ModBlocks.PINEAPPLE_PLANT);
simpleBlockItemBlockTexture(ModBlocks.ZOMBIE_BLOOM);
simpleBlockItemBlockTexture(ModBlocks.CATTAIL);
simpleBlockItemBlockTexture(ModBlocks.YUCCA);

//SUCCULENTS
simpleBlockItemBlockTexture(ModBlocks.BARREL_CACTUS);
simpleBlockItemBlockTexture(ModBlocks.BEACHGRASS);
simpleBlockItemBlockTexture(ModBlocks.ALOE);
simpleBlockItemBlockTexture(ModBlocks.HAWORTHIA);
simpleBlockItemBlockTexture(ModBlocks.FLOWERING_CACTUS);
simpleBlockItemBlockTexture(ModBlocks.AEONIUM_BUSH);
simpleBlockItemBlockTexture(ModBlocks.CUT_AEONIUM);
simpleBlockItemBlockTexture(ModBlocks.OPUNTIA_CACTUS);
simpleBlockItemBlockTexture(ModBlocks.CUT_OPUNTIA_CACTUS);





//MAPLE WOOD
simpleBlockItem(ModBlocks.MAPLE_DOOR);
simpleBlockItemBlockTexture(ModBlocks.MAPLE_SAPLING);
fenceItem(ModBlocks.MAPLE_FENCE, ModBlocks.MAPLE_PLANKS);
buttonItem(ModBlocks.MAPLE_BUTTON, ModBlocks.MAPLE_PLANKS);
evenSimplerBlockItem(ModBlocks.MAPLE_STAIRS);
evenSimplerBlockItem(ModBlocks.MAPLE_SLAB);
evenSimplerBlockItem(ModBlocks.MAPLE_PRESSURE_PLATE);
evenSimplerBlockItem(ModBlocks.MAPLE_FENCE_GATE);
trapdoorItem(ModBlocks.MAPLE_TRAPDOOR);

treeTapItem(ModItems.TREE_TAP_ITEM);

        simpleBlockItem(ModBlocks.PRESERVED_WOOD_DOOR);
        handheldItem(ModItems.ANCIENT_SWORD);
        simpleItem(ModItems.PRESERVED_MEAT);
        trapdoorItem(ModBlocks.PRESERVED_WOOD_TRAPDOOR);


//PALM WOOD
       simpleBlockItem(ModBlocks.PALM_DOOR);
        simpleBlockItemBlockTexture(ModBlocks.PALM_SHOOT);
        fenceItem(ModBlocks.PALM_FENCE, ModBlocks.PALM_PLANKS);
        buttonItem(ModBlocks.PALM_BUTTON, ModBlocks.PALM_PLANKS);
        evenSimplerBlockItem(ModBlocks.PALM_STAIRS);
        evenSimplerBlockItem(ModBlocks.PALM_SLAB);
        evenSimplerBlockItem(ModBlocks.PALM_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.PALM_FENCE_GATE);
        trapdoorItem(ModBlocks.PALM_TRAPDOOR);
        simpleBlockItemBlockTexture(ModBlocks.COCONUT_BUNCH);

        //BAOBAB WOOD
        simpleBlockItem(ModBlocks.BAOBAB_DOOR);
        simpleBlockItemBlockTexture(ModBlocks.BAOBAB_SAPLING);
        fenceItem(ModBlocks.BAOBAB_FENCE, ModBlocks.BAOBAB_PLANKS);
        buttonItem(ModBlocks.BAOBAB_BUTTON, ModBlocks.BAOBAB_PLANKS);
        evenSimplerBlockItem(ModBlocks.BAOBAB_STAIRS);
        evenSimplerBlockItem(ModBlocks.BAOBAB_SLAB);
        evenSimplerBlockItem(ModBlocks.BAOBAB_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.BAOBAB_FENCE_GATE);
        trapdoorItem(ModBlocks.BAOBAB_TRAPDOOR);
        //LEAF PILES
        leafPileItem(ModBlocks.MAPLE_LEAF_PILE, ModBlocks.MAPLE_LEAVES);
        leafPileItem(ModBlocks.PALM_LEAF_PILE, ModBlocks.PALM_LEAVES);
        vanillaLeafPileItem(ModBlocks.OAK_LEAF_PILE, "oak_leaves");
        vanillaLeafPileItem(ModBlocks.BIRCH_LEAF_PILE, "birch_leaves");
        vanillaLeafPileItem(ModBlocks.SPRUCE_LEAF_PILE, "spruce_leaves");
        vanillaLeafPileItem(ModBlocks.DARK_OAK_LEAF_PILE, "dark_oak_leaves");
        vanillaLeafPileItem(ModBlocks.JUNGLE_LEAF_PILE, "jungle_leaves");
        vanillaLeafPileItem(ModBlocks.ACACIA_LEAF_PILE, "acacia_leaves");
        vanillaLeafPileItem(ModBlocks.AZALEA_LEAF_PILE, "azalea_leaves");
        vanillaLeafPileItem(ModBlocks.FLOWERING_AZALEA_LEAF_PILE, "flowering_azalea_leaves");
        vanillaLeafPileItem(ModBlocks.CHERRY_LEAF_PILE, "cherry_leaves");
        vanillaLeafPileItem(ModBlocks.MANGROVE_LEAF_PILE, "mangrove_leaves");


//PEAT
bothBlockItemBlockShape(ModItems.PEAT, ModBlocks.PEAT);
//IRIDESCENT SAND
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.IRIDESCENT_SANDSTONE_WALL, ModBlocks.IRIDESCENT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_CUT_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_CUT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.IRIDESCENT_CUT_SANDSTONE_WALL, ModBlocks.IRIDESCENT_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_CHISELED_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_STAIRS);
        wallItem(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_WALL, ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE);

//BLACK SAND
        evenSimplerBlockItem(ModBlocks.BLACK_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_SANDSTONE_STAIRS);
        wallItem(ModBlocks.BLACK_SANDSTONE_WALL, ModBlocks.BLACK_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_CUT_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_CUT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.BLACK_CUT_SANDSTONE_WALL, ModBlocks.BLACK_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_CHISELED_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS);
        wallItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_WALL, ModBlocks.BLACK_SMOOTH_SANDSTONE);

//WHITE SAND
        evenSimplerBlockItem(ModBlocks.WHITE_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.WHITE_SANDSTONE_STAIRS);
        wallItem(ModBlocks.WHITE_SANDSTONE_WALL, ModBlocks.WHITE_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_CUT_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.WHITE_CUT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.WHITE_CUT_SANDSTONE_WALL, ModBlocks.WHITE_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_CHISELED_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS);
        wallItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_WALL, ModBlocks.WHITE_SMOOTH_SANDSTONE);

//PINK SAND
        evenSimplerBlockItem(ModBlocks.PINK_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.PINK_SANDSTONE_STAIRS);
        wallItem(ModBlocks.PINK_SANDSTONE_WALL, ModBlocks.PINK_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_CUT_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.PINK_CUT_SANDSTONE_STAIRS);
        wallItem(ModBlocks.PINK_CUT_SANDSTONE_WALL, ModBlocks.PINK_CUT_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_CHISELED_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE);
        evenSimplerBlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS);
        wallItem(ModBlocks.PINK_SMOOTH_SANDSTONE_WALL, ModBlocks.PINK_SMOOTH_SANDSTONE);


//FOSSILS
fossilItem(ModBlocks.AMMONITE_FOSSIL);
fossilItem(ModBlocks.FERN_FOSSIL);
fossilItem(ModBlocks.TORCHFLOWER_FOSSIL);
fossilItem(ModBlocks.CLAW_FOSSIL);
fossilItem(ModBlocks.ANOMALOCARIS_FOSSIL);
fossilItem(ModBlocks.SPOOK_FOSSIL);
fossilItem(ModBlocks.FOOTPRINTS_FOSSIL);
fossilItem(ModBlocks.TRILOBITE_FOSSIL);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL1);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL2);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL3);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL4);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL5);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL6);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL7);
evenSimplerBlockItem(ModBlocks.SNIFFER_FOSSIL8);

//STONES
        //GABBRO
        wallItem(ModBlocks.GABBRO_WALL, ModBlocks.GABBRO);
        evenSimplerBlockItem(ModBlocks.GABBRO_SLAB);
        evenSimplerBlockItem(ModBlocks.GABBRO_STAIRS);
        wallItem(ModBlocks.POLISHED_GABBRO_WALL, ModBlocks.POLISHED_GABBRO);
        evenSimplerBlockItem(ModBlocks.POLISHED_GABBRO_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_GABBRO_STAIRS);
        wallItem(ModBlocks.POLISHED_GABBRO_BRICK_WALL, ModBlocks.POLISHED_GABBRO_BRICKS);
        evenSimplerBlockItem(ModBlocks.POLISHED_GABBRO_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_GABBRO_BRICK_STAIRS);
        wallItem(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_WALL, ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_STAIRS);

        //LIMESTONE
        wallItem(ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_STAIRS);
        wallItem(ModBlocks.COBBLED_LIMESTONE_WALL, ModBlocks.COBBLED_LIMESTONE);
        evenSimplerBlockItem(ModBlocks.COBBLED_LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.COBBLED_LIMESTONE_STAIRS);
        wallItem(ModBlocks.LICHENY_COBBLED_LIMESTONE_WALL, ModBlocks.LICHENY_COBBLED_LIMESTONE);
        evenSimplerBlockItem(ModBlocks.LICHENY_COBBLED_LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.LICHENY_COBBLED_LIMESTONE_STAIRS);
        wallItem(ModBlocks.POLISHED_LIMESTONE_WALL, ModBlocks.POLISHED_LIMESTONE);
        evenSimplerBlockItem(ModBlocks.POLISHED_LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        wallItem(ModBlocks.LIMESTONE_TILE_WALL, ModBlocks.LIMESTONE_TILE);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_TILE_STAIRS);
        wallItem(ModBlocks.LIMESTONE_BRICK_WALL, ModBlocks.LIMESTONE_BRICKS);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_BRICK_STAIRS);
        wallItem(ModBlocks.LICHENY_LIMESTONE_BRICK_WALL, ModBlocks.LICHENY_LIMESTONE_BRICKS);
        evenSimplerBlockItem(ModBlocks.LICHENY_LIMESTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.LICHENY_LIMESTONE_BRICK_STAIRS);
        wallItem(ModBlocks.CRACKED_LIMESTONE_BRICK_WALL, ModBlocks.CRACKED_LIMESTONE_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_LIMESTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_LIMESTONE_BRICK_STAIRS);

        //SLATE
        wallItem(ModBlocks.SLATE_WALL, ModBlocks.SLATE);
        evenSimplerBlockItem(ModBlocks.SLATE_SLAB);
        evenSimplerBlockItem(ModBlocks.SLATE_STAIRS);
        wallItem(ModBlocks.SLATE_BRICK_WALL, ModBlocks.SLATE_BRICKS);
        evenSimplerBlockItem(ModBlocks.SLATE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.SLATE_BRICK_STAIRS);
        wallItem(ModBlocks.CRACKED_SLATE_BRICK_WALL, ModBlocks.CRACKED_SLATE_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_SLATE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_SLATE_BRICK_STAIRS);
        wallItem(ModBlocks.POLISHED_SLATE_WALL, ModBlocks.POLISHED_SLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_SLATE_SLAB);
        evenSimplerBlockItem(ModBlocks.SMOOTH_SLATE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_SLATE_STAIRS);

        //GNEISS
        evenSimplerBlockItem(ModBlocks.SMOOTH_GNEISS_SLAB);

        //CHERT
        wallItem(ModBlocks.CHERT_WALL, ModBlocks.CHERT);
        evenSimplerBlockItem(ModBlocks.CHERT_SLAB);
        evenSimplerBlockItem(ModBlocks.CHERT_STAIRS);
        wallItem(ModBlocks.POLISHED_CHERT_WALL, ModBlocks.POLISHED_CHERT);
        evenSimplerBlockItem(ModBlocks.POLISHED_CHERT_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_CHERT_STAIRS);
        wallItem(ModBlocks.CHERT_BRICK_WALL, ModBlocks.CHERT_BRICKS);
        evenSimplerBlockItem(ModBlocks.CHERT_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CHERT_BRICK_STAIRS);
        wallItem(ModBlocks.CRACKED_CHERT_BRICK_WALL, ModBlocks.CRACKED_CHERT_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_CHERT_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_CHERT_BRICK_STAIRS);

        //MARBLE
        wallItem(ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        evenSimplerBlockItem(ModBlocks.MARBLE_SLAB);
        evenSimplerBlockItem(ModBlocks.MARBLE_STAIRS);
        wallItem(ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE);
        evenSimplerBlockItem(ModBlocks.POLISHED_MARBLE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_MARBLE_STAIRS);
        wallItem(ModBlocks.POLISHED_MARBLE_BRICK_WALL, ModBlocks.POLISHED_MARBLE_BRICKS);
        evenSimplerBlockItem(ModBlocks.POLISHED_MARBLE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS);
        wallItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_WALL, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_STAIRS);

        //DISCS
            simpleItem(ModItems.MINECRAFT_MUSIC_DISC);
            simpleItem(ModItems.WET_HANDS_MUSIC_DISC);

//SHELL
        simpleItem(ModItems.SHELL);
        handheldItem(ModItems.SHELL_AXE);
        handheldItem(ModItems.SHELL_SHOVEL);
        handheldItem(ModItems.SHELL_PICKAXE);

//JADE
simpleItem(ModItems.JADE);
handheldItem(ModItems.MACUAHUITL);
handheldItem(ModItems.JADE_AXE);
handheldItem(ModItems.JADE_HOE);
handheldItem(ModItems.JADE_PICKAXE);
handheldItem(ModItems.JADE_SHOVEL);
        trimmedArmorItem(ModItems.JADE_HELMET);
        trimmedArmorItem(ModItems.JADE_CHESTPLATE);
        trimmedArmorItem(ModItems.JADE_LEGGINGS);
        trimmedArmorItem(ModItems.JADE_BOOTS);

        //RUBY
        simpleBlockItemBlockTexture(ModBlocks.RUBY_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_RUBY_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_RUBY_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_RUBY_BUD);
        simpleItem(ModItems.RUBY_SHARD);


        //TOPAZ
        simpleBlockItemBlockTexture(ModBlocks.TOPAZ_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_TOPAZ_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_TOPAZ_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_TOPAZ_BUD);
        simpleItem(ModItems.TOPAZ_SHARD);

        //CITRINE
        simpleBlockItemBlockTexture(ModBlocks.CITRINE_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_CITRINE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_CITRINE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_CITRINE_BUD);
        simpleItem(ModItems.CITRINE_SHARD);

        //PERIDOT
        simpleBlockItemBlockTexture(ModBlocks.PERIDOT_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_PERIDOT_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_PERIDOT_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_PERIDOT_BUD);
        simpleItem(ModItems.PERIDOT_SHARD);
        //AQUAMARINE
        simpleBlockItemBlockTexture(ModBlocks.AQUAMARINE_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_AQUAMARINE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_AQUAMARINE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_AQUAMARINE_BUD);
        simpleItem(ModItems.AQUAMARINE_SHARD);

            //SAPPHIRE
        simpleBlockItemBlockTexture(ModBlocks.SAPPHIRE_CLUSTER);
        simpleBlockItemBlockTexture(ModBlocks.SMALL_SAPPHIRE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.MEDIUM_SAPPHIRE_BUD);
        simpleBlockItemBlockTexture(ModBlocks.LARGE_SAPPHIRE_BUD);

        //DECORATIVE
        wallItem(ModBlocks.BRICK_TILE_WALL, ModBlocks.BRICK_TILE);
        evenSimplerBlockItem(ModBlocks.BRICK_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.BRICK_TILE_STAIRS);
        wallItem(ModBlocks.CRACKED_BRICK_WALL, ModBlocks.CRACKED_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_BRICK_STAIRS);

        wallItem(ModBlocks.POLISHED_STONE_WALL, ModBlocks.POLISHED_STONE);
        evenSimplerBlockItem(ModBlocks.POLISHED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_STONE_STAIRS);

        wallItem(ModBlocks.CUT_QUARTZ_WALL, ModBlocks.CUT_QUARTZ_BLOCK);
        evenSimplerBlockItem(ModBlocks.CUT_QUARTZ_SLAB);
        evenSimplerBlockItem(ModBlocks.CUT_QUARTZ_STAIRS);
        vanillaWallItem(ModBlocks.QUARTZ_BRICK_WALL, "quartz_bricks");
        evenSimplerBlockItem(ModBlocks.QUARTZ_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        vanillaWallItem(ModBlocks.QUARTZ_WALL, "quartz_block_top");
        vanillaWallItem(ModBlocks.SMOOTH_QUARTZ_WALL, "quartz_block_bottom");


        simpleItem(ModItems.MAPLE_SIGN);
        simpleItem(ModItems.PALM_SIGN);
        simpleItem(ModItems.BAOBAB_SIGN);
        simpleItem(ModItems.MAPLE_HANGING_SIGN);
        simpleItem(ModItems.PALM_HANGING_SIGN);
        simpleItem(ModItems.BAOBAB_HANGING_SIGN);
        blenderBlock(ModBlocks.BLENDER);



        //STAIR SLAB WALL
        //CRACKED STONE BRICK
        evenSimplerBlockItem(ModBlocks.CRACKED_STONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.SMOOTH_STONE_STAIRS);
        vanillaWallItem(ModBlocks.CRACKED_STONE_BRICK_WALL, "cracked_stone_bricks");

        vanillaWallItem(ModBlocks.STONE_WALL, "stone");
        vanillaWallItem(ModBlocks.SMOOTH_STONE_WALL, "smooth_stone");
        vanillaWallItem(ModBlocks.POLISHED_ANDESITE_WALL, "polished_andesite");
        vanillaWallItem(ModBlocks.POLISHED_DIORITE_WALL, "polished_diorite");
        vanillaWallItem(ModBlocks.POLISHED_GRANITE_WALL, "polished_granite");
        //DEEPSLATE
        evenSimplerBlockItem(ModBlocks.DEEPSLATE_SLAB);
        evenSimplerBlockItem(ModBlocks.DEEPSLATE_STAIRS);
        vanillaWallItem(ModBlocks.DEEPSLATE_WALL, "deepslate");
        evenSimplerBlockItem(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        vanillaWallItem(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL, "cracked_deepslate_bricks");
        evenSimplerBlockItem(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        vanillaWallItem(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL, "cracked_deepslate_tiles");

        wallItem(ModBlocks.SKULKED_COBBLED_DEEPSLATE_WALL, ModBlocks.SKULKED_COBBLED_DEEPSLATE);
        evenSimplerBlockItem(ModBlocks.SKULKED_COBBLED_DEEPSLATE_SLAB);
        evenSimplerBlockItem(ModBlocks.SKULKED_COBBLED_DEEPSLATE_STAIRS);
        wallItem(ModBlocks.SKULKED_DEEPSLATE_BRICK_WALL, ModBlocks.SKULKED_DEEPSLATE_BRICKS);
        evenSimplerBlockItem(ModBlocks.SKULKED_DEEPSLATE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.SKULKED_DEEPSLATE_BRICK_STAIRS);
        wallItem(ModBlocks.SKULKED_DEEPSLATE_TILE_WALL, ModBlocks.SKULKED_DEEPSLATE_TILES);
        evenSimplerBlockItem(ModBlocks.SKULKED_DEEPSLATE_TILE_SLAB);
        evenSimplerBlockItem(ModBlocks.SKULKED_DEEPSLATE_TILE_STAIRS);

        //GILDED BLACKSTONE
        evenSimplerBlockItem(ModBlocks.GILDED_BLACKSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        vanillaWallItem(ModBlocks.GILDED_BLACKSTONE_WALL, "gilded_blackstone");
        //CRACKED BLACKSTONE BRICKS
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        vanillaWallItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, "cracked_polished_blackstone_bricks");
        //GILDED BLACKSTONE BRICKS
        evenSimplerBlockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        wallItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL, ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS);
        //CALCITE
        evenSimplerBlockItem(ModBlocks.CALCITE_SLAB);
        evenSimplerBlockItem(ModBlocks.CALCITE_STAIRS);
        vanillaWallItem(ModBlocks.CALCITE_WALL, "calcite");
        //DRIPSTONE
        evenSimplerBlockItem(ModBlocks.DRIPSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.DRIPSTONE_STAIRS);
        vanillaWallItem(ModBlocks.DRIPSTONE_WALL, "dripstone_block");
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),

                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder shelfItem(RegistryObject<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),

                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder bothBlockItem(RegistryObject<BlockItem> item, RegistryObject<Block> block) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "block/" + block.getId().getPath()));
    }

    public void bothBlockItemBlockShape(RegistryObject<BlockItem> item, RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" +ForgeRegistries.ITEMS.getKey(item.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder redMushroomBlockItem(RegistryObject<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation("minecraft","block/red_mushroom"));
    }
    private ItemModelBuilder brownMushroomBlockItem(RegistryObject<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation("minecraft","block/brown_mushroom"));
    }

    //model generator
    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "block/" + item.getId().getPath()));
    }

    //trapdoor maker
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" +ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void doublePlantItem(RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    //fence maker
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(BensAddons.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    //button maker
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(BensAddons.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    //wall maker
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(BensAddons.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void vanillaWallItem(RegistryObject<Block> block, String textureBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation("block/" + textureBlock));
    }

    public void fossilItem(RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/fossil_inventory")).texture("1", new ResourceLocation(BensAddons.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void blenderBlock(RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/blender_inventory"));
    }


    public void leafPileItem(RegistryObject<Block> block, RegistryObject<Block> textureBlock) {
        this.withExistingParent(BensAddons.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/leaf_pile_inventory")).texture("0", new ResourceLocation(BensAddons.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(textureBlock.get()).getPath()));
    }
    public void vanillaLeafPileItem(RegistryObject<Block> block, String textureBlock) {
        this.withExistingParent(BensAddons.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/leaf_pile_inventory")).texture("0", new ResourceLocation("block/" + textureBlock));
    }

    private ItemModelBuilder treeTapItem(RegistryObject<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

        public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(BensAddons.MOD_ID + ":" +ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BensAddons.MOD_ID, "item/" + item.getId().getPath()));
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = BensAddons.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                        mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }


}
