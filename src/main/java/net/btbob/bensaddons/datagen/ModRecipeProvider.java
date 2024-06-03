package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.ModItems;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    //GROUPING PLATINUM SMELTABLES
    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),
            ModBlocks.PLATINUM_ORE.get(),
            ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
    private static final List<ItemLike> JADE_SMELTABLES = List.of(ModBlocks.JADE_ORE.get());
    private static final List<ItemLike> GLASS_SMELTABLES = List.of(ModBlocks.PINK_SAND.get(),ModBlocks.BLACK_SAND.get(),ModBlocks.WHITE_SAND.get(),ModBlocks.IRIDESCENT_SAND.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        //MORTAR AND PESTLE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MORTAR_AND_PESTLE.get(), 1).requires(Blocks.ANDESITE).requires(Items.BOWL).unlockedBy(getHasName(Blocks.ANDESITE), has(Blocks.ANDESITE)).unlockedBy(getHasName(Items.BOWL), has(Items.BOWL)).save(pRecipeOutput);
        //LILAC BUSH TO CUT LILAC
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CUT_LILAC.get(), 3).requires(Blocks.LILAC).unlockedBy(getHasName(Blocks.LILAC), has(Blocks.LILAC)).save(pRecipeOutput, new ResourceLocation("lilac_override"));

        //ROSE BUSH TO CUT ROSE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CUT_ROSE.get(), 3).requires(Blocks.ROSE_BUSH).unlockedBy(getHasName(Blocks.ROSE_BUSH), has(Blocks.ROSE_BUSH)).save(pRecipeOutput, new ResourceLocation("rose_bush_override"));

        //PAINT ROSE RED
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CUT_ROSE.get(), 1).requires(ModBlocks.WHITE_CUT_ROSE.get()).requires(Items.RED_DYE).unlockedBy(getHasName(ModBlocks.WHITE_CUT_ROSE.get()), has(ModBlocks.WHITE_CUT_ROSE.get())).unlockedBy(getHasName(Items.RED_DYE), has(Items.RED_DYE)).save(pRecipeOutput, new ResourceLocation("white_to_red_rose"));

        //CRUSH TO MATERIALS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CORN_MEAL.get(), 3).requires(ModItems.CORN.get()).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(ModItems.CORN.get()), has(ModItems.CORN.get())).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("corn_to_corn_meal"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 3).requires(Items.SUGAR_CANE).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(Items.SUGAR_CANE), has(Items.SUGAR_CANE)).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("sugar_cane_to_sugar_override"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLAZE_POWDER, 3).requires(Items.BLAZE_ROD).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(Items.BLAZE_ROD), has(Items.BLAZE_ROD)).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("blaze_rod_to_blaze_powder_override"));
        //HIBISCUS BUSH TO DYE
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 4, ModBlocks.YELLOW_HIBISCUS_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 4, ModBlocks.ORANGE_HIBISCUS_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 4, ModBlocks.PINK_HIBISCUS_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 4, ModBlocks.RED_HIBISCUS_BUSH);
        //CUT HIBISCUS BUSH
        cutPlant(pRecipeOutput, ModBlocks.YELLOW_CUT_HIBISCUS,ModBlocks.YELLOW_HIBISCUS_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.ORANGE_CUT_HIBISCUS,ModBlocks.ORANGE_HIBISCUS_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.PINK_CUT_HIBISCUS,ModBlocks.PINK_HIBISCUS_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.RED_CUT_HIBISCUS,ModBlocks.RED_HIBISCUS_BUSH);
        //CUT HIBISCUS TO DYE
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 1, ModBlocks.YELLOW_CUT_HIBISCUS);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 1, ModBlocks.ORANGE_CUT_HIBISCUS);
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 1, ModBlocks.PINK_CUT_HIBISCUS);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 1, ModBlocks.RED_CUT_HIBISCUS);
        //PEONY BUSH TO CUT PEONY
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CUT_PEONY.get(), 3).requires(Blocks.PEONY).unlockedBy(getHasName(Blocks.PEONY), has(Blocks.PEONY)).save(pRecipeOutput, new ResourceLocation("peony_cut"));
        //PEONY BUSH TO DYE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE, 4).requires(Blocks.PEONY).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(Blocks.PEONY), has(Blocks.PEONY)).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("peony_bush_to_dye_override"));
        //CUT PEONY TO DYE
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 1, ModBlocks.CUT_PEONY);
        //LILAC BUSH TO DYE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE, 4).requires(Blocks.LILAC).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(Blocks.LILAC), has(Blocks.LILAC)).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("lilac_bush_to_dye_override"));
        //CUT PEONY TO DYE
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 1, ModBlocks.CUT_LILAC);
        //RHODODENDRON BUSH TO DYE
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 4, ModBlocks.WHITE_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 4, ModBlocks.PURPLE_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 4, ModBlocks.BLUE_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 4, ModBlocks.MAGENTA_RHODODENDRON);
        cutPlant(pRecipeOutput, ModBlocks.PURPLE_CUT_RHODODENDRON, ModBlocks.PURPLE_RHODODENDRON);
        cutPlant(pRecipeOutput, ModBlocks.WHITE_CUT_RHODODENDRON, ModBlocks.WHITE_RHODODENDRON);
        cutPlant(pRecipeOutput, ModBlocks.BLUE_CUT_RHODODENDRON, ModBlocks.BLUE_RHODODENDRON);
        cutPlant(pRecipeOutput, ModBlocks.MAGENTA_CUT_RHODODENDRON, ModBlocks.MAGENTA_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 1, ModBlocks.WHITE_CUT_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 1, ModBlocks.PURPLE_CUT_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 1, ModBlocks.BLUE_CUT_RHODODENDRON);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 1, ModBlocks.MAGENTA_CUT_RHODODENDRON);
        //HYDRANGEA BUSH TO DYE
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 4, ModBlocks.WHITE_HYDRANGEA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 4, ModBlocks.PURPLE_HYDRANGEA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 4, ModBlocks.BLUE_HYDRANGEA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 4, ModBlocks.MAGENTA_HYDRANGEA_BUSH);
        //CUT HYDRANGEA BUSH
        cutPlant(pRecipeOutput, ModBlocks.WHITE_CUT_HYDRANGEA,ModBlocks.WHITE_HYDRANGEA_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.PURPLE_CUT_HYDRANGEA,ModBlocks.PURPLE_HYDRANGEA_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.BLUE_CUT_HYDRANGEA,ModBlocks.BLUE_HYDRANGEA_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.MAGENTA_CUT_HYDRANGEA,ModBlocks.MAGENTA_HYDRANGEA_BUSH);
        //CUT HYDRANGEA TO DYE
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 1, ModBlocks.WHITE_CUT_HYDRANGEA);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 1, ModBlocks.PURPLE_CUT_HYDRANGEA);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 1, ModBlocks.BLUE_CUT_HYDRANGEA);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 1, ModBlocks.MAGENTA_CUT_HYDRANGEA);
        //ROSE BUSH TO DYE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE, 4).requires(Blocks.ROSE_BUSH).requires(ModItems.MORTAR_AND_PESTLE.get()).unlockedBy(getHasName(Blocks.ROSE_BUSH), has(Blocks.ROSE_BUSH)).unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get())).save(pRecipeOutput, new ResourceLocation("rose_bush_to_dye_override"));
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 4, ModBlocks.PURPLE_ROSE_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.CYAN_DYE, 4, ModBlocks.BLUE_ROSE_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_GRAY_DYE, 4, ModBlocks.WHITE_ROSE_BUSH);
        //CUT ROSE BUSH
        cutPlant(pRecipeOutput, ModBlocks.WHITE_CUT_ROSE,ModBlocks.WHITE_ROSE_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.PURPLE_CUT_ROSE,ModBlocks.PURPLE_ROSE_BUSH);
        cutPlant(pRecipeOutput, ModBlocks.BLUE_CUT_ROSE,ModBlocks.BLUE_ROSE_BUSH);
        //CUT ROSE TO DYE
        plantCrushedToDye(pRecipeOutput, Items.CYAN_DYE, 1, ModBlocks.BLUE_CUT_ROSE);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 1, ModBlocks.CUT_ROSE);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 1, ModBlocks.PURPLE_CUT_ROSE);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_GRAY_DYE, 1, ModBlocks.WHITE_CUT_ROSE);
        //CUT CELOSIA
        cutPlant(pRecipeOutput, ModBlocks.ORANGE_CELOSIA_BUSH, ModBlocks.ORANGE_CELOSIA);
        cutPlant(pRecipeOutput, ModBlocks.MAGENTA_CELOSIA_BUSH, ModBlocks.MAGENTA_CELOSIA);
        cutPlant(pRecipeOutput, ModBlocks.PINK_CELOSIA_BUSH, ModBlocks.PINK_CELOSIA);
        cutPlant(pRecipeOutput, ModBlocks.YELLOW_CELOSIA_BUSH, ModBlocks.YELLOW_CELOSIA);
        //CELOSIA TO DYE
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 4, ModBlocks.YELLOW_CELOSIA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 1, ModBlocks.YELLOW_CELOSIA);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 4, ModBlocks.ORANGE_CELOSIA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 1, ModBlocks.ORANGE_CELOSIA);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 4, ModBlocks.MAGENTA_CELOSIA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 1, ModBlocks.MAGENTA_CELOSIA);
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 4, ModBlocks.PINK_CELOSIA_BUSH);
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 1, ModBlocks.PINK_CELOSIA);
        //LILLIES TO DYE
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 2, ModBlocks.PINK_LILY);
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 2, ModBlocks.WHITE_LILY);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 2, ModBlocks.PURPLE_LILY);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 2, ModBlocks.ORANGE_LILY);
        //HYACINTH TO DYE
        plantCrushedToDye(pRecipeOutput, Items.CYAN_DYE, 2, ModBlocks.BLUE_HYACINTH);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 2, ModBlocks.PURPLE_HYACINTH);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.MAGENTA_HYACINTH);
        //PANSY
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 2, ModBlocks.PANSY);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 2, ModBlocks.FIRE_PANSY);
        plantCrushedToDye(pRecipeOutput, Items.GREEN_DYE, 2, ModBlocks.CREEPER_PANSY);
        //MISC PLANTS TO DYE
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 2, ModBlocks.SALVIA);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 2, ModBlocks.CEDAR_SALVIA);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.TRUMPET_PITCHER);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.DAHLIA);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 2, ModBlocks.VIOLET);
        plantCrushedToDye(pRecipeOutput, Items.PURPLE_DYE, 2, ModBlocks.IRIS);
        plantCrushedToDye(pRecipeOutput, Items.ORANGE_DYE, 2, ModBlocks.BIRD_OF_PARADISE);
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 2, ModBlocks.DAFFODIL);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 4, ModBlocks.ZOMBIE_BLOOM);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_GRAY_DYE, 4, ModBlocks.YUCCA);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.CONEFLOWER);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.SEA_THRIFT);
        plantCrushedToDye(pRecipeOutput, Items.MAGENTA_DYE, 2, ModBlocks.HONEYSUCKLE_VINES);
        //MUSHROOMS TO DYE
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 2, MushroomBlocks.GIANT_PUFFBALL);
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 2, MushroomBlocks.CHICKEN_OF_THE_WOODS);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_BLUE_DYE, 2, MushroomBlocks.INDIGO_MILKCAP);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_GRAY_DYE, 2, MushroomBlocks.DESERT_SHAGGY_MANE);
        plantCrushedToDye(pRecipeOutput, Items.BROWN_DYE, 2, MushroomBlocks.PORTABELLA);
        plantCrushedToDye(pRecipeOutput, Items.BROWN_DYE, 2, MushroomBlocks.SANDY_STILTBALL);
        plantCrushedToDye(pRecipeOutput, Items.BROWN_DYE, 2, MushroomBlocks.SUBBS_MUSHROOMS);
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 2, MushroomBlocks.GOLDEN_HALO);
        plantCrushedToDye(pRecipeOutput, Items.GRAY_DYE, 2, MushroomBlocks.BLACK_TRUFFLE);
        plantCrushedToDye(pRecipeOutput, Items.PINK_DYE, 2, MushroomBlocks.LILAC_BONNETS);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 2, MushroomBlocks.BASKET_STINKHORN);
        plantCrushedToDye(pRecipeOutput, Items.LIGHT_GRAY_DYE, 2, MushroomBlocks.OYSTER);
        plantCrushedToDye(pRecipeOutput, Items.RED_DYE, 2, MushroomBlocks.FIRE_CORAL);
        plantCrushedToDye(pRecipeOutput, Items.LIME_DYE, 2, MushroomBlocks.GLOWING_MUSHROOMS);
        plantCrushedToDye(pRecipeOutput, Items.YELLOW_DYE, 2, MushroomBlocks.YELLOW_PARASOLS);
        plantCrushedToDye(pRecipeOutput, Items.GREEN_DYE, 2, MushroomBlocks.DEATH_CAP);
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 2, MushroomBlocks.DESTROYING_ANGEL);
        plantCrushedToDye(pRecipeOutput, Items.BLACK_DYE, 2, MushroomBlocks.EARTHBALL);
        plantCrushedToDye(pRecipeOutput, Items.WHITE_DYE, 2, MushroomBlocks.FALSE_DEATH_CAP);
        plantCrushedToDye(pRecipeOutput, Items.GRAY_DYE, 2, MushroomBlocks.GRAY_MOREL);
        plantCrushedToDye(pRecipeOutput, Items.BLACK_DYE, 2, MushroomBlocks.INKY_CAP);
        //SUCCULENTS TO DYES
        succulentSmeltedToDye(pRecipeOutput, Items.GREEN_DYE, ModBlocks.BARREL_CACTUS);
        succulentSmeltedToDye(pRecipeOutput, Items.GREEN_DYE, ModBlocks.ALOE);
        succulentSmeltedToDye(pRecipeOutput, Items.CYAN_DYE, ModBlocks.HAWORTHIA);
        cutPlant(pRecipeOutput, ModBlocks.CUT_AEONIUM, ModBlocks.AEONIUM_BUSH);
        succulentSmeltedToDye(pRecipeOutput, Items.LIME_DYE, ModBlocks.CUT_AEONIUM);
        cutPlant(pRecipeOutput, ModBlocks.CUT_OPUNTIA_CACTUS, ModBlocks.OPUNTIA_CACTUS);
        succulentSmeltedToDye(pRecipeOutput, Items.GREEN_DYE, ModBlocks.CUT_OPUNTIA_CACTUS);
        //TREE TAP
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TREE_TAP.get()).pattern("II").pattern("N ").define('I', Items.IRON_INGOT).define('N', Items.IRON_NUGGET).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET)).save(pRecipeOutput);
        //PLATINUM TO SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TROWEL.get()).pattern("  I").pattern(" C ").pattern("S  ").define('I', Items.IRON_INGOT).define('C', Items.COPPER_INGOT).define('S', Items.STICK).unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pRecipeOutput);
        //SMELT TO PLATINUM BARS
        oreBlasting(pRecipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(),0.25f, 100, "platinum");
        oreSmelting(pRecipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(),0.25f, 100, "platinum");

        //RAW PLATINUM ORE TO BLOCK RECIPE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get()).pattern("SSS").pattern("SSS").pattern("SSS").define('S', ModItems.RAW_PLATINUM.get()).unlockedBy(getHasName(ModItems.RAW_PLATINUM.get()), has(ModItems.RAW_PLATINUM.get())).save(pRecipeOutput);

        //RAW PLATINUM BLOCK TO ORE RECIPE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(), 9).requires(ModBlocks.RAW_PLATINUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_PLATINUM_BLOCK.get()), has(ModBlocks.RAW_PLATINUM_BLOCK.get())).save(pRecipeOutput);

        // PLATINUM INGOT TO BLOCK RECIPE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get()).pattern("SSS").pattern("SSS").pattern("SSS").define('S', ModItems.PLATINUM_INGOT.get()).unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get())).save(pRecipeOutput);

        // PLATINUM BLOCK TO INGOT RECIPE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9).requires(ModBlocks.PLATINUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.get()), has(ModBlocks.RAW_PLATINUM_BLOCK.get())).save(pRecipeOutput);


        //PLATINUM TO PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_PICKAXE.get())
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")
                .define('S', Items.STICK)
                .define('P', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);

        //PLATINUM TO SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SHOVEL.get())
                .pattern("P")
                .pattern("S")
                .pattern("S")
                .define('S', Items.STICK)
                .define('P', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);

        //PLATINUM TO SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SWORD.get())
                .pattern("P")
                .pattern("P")
                .pattern("S")
                .define('S', Items.STICK)
                .define('P', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);

        //PLATINUM TO AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_AXE.get())
                .pattern("PP")
                .pattern("PS")
                .pattern(" S")
                .define('S', Items.STICK)
                .define('P', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);
        //PLATINUM TO HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_HOE.get())
                .pattern("PP")
                .pattern(" S")
                .pattern(" S")
                .define('S', Items.STICK)
                .define('P', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);



        //MAPLE PLANKS TO STAIRS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO SLABS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO BUTTON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_BUTTON.get())
                .requires(ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO PRESSURE PLATE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO FENCE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_FENCE.get(), 3)
                .pattern("#S#")
                .pattern("#S#")
                .define('S', Items.STICK)
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);
        //MAPLE PLANKS TO FENCE GATE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_FENCE_GATE.get())
                .pattern("S#S")
                .pattern("S#S")
                .define('S', Items.STICK)
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO TRAPDOOR
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);

        //MAPLE PLANKS TO DOOR
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.MAPLE_PLANKS.get())
                .unlockedBy(getHasName(ModBlocks.MAPLE_PLANKS.get()), has(ModBlocks.MAPLE_PLANKS.get()))
                .save(pRecipeOutput);


        //MAPLE LOG TO WOOD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_WOOD.get(), 3).pattern("##").pattern("##").define('#', ModBlocks.MAPLE_LOG.get()).unlockedBy(getHasName(ModBlocks.MAPLE_LOG.get()), has(ModBlocks.MAPLE_LOG.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_MAPLE_WOOD.get(), 3).pattern("##").pattern("##").define('#', ModBlocks.STRIPPED_MAPLE_LOG.get()).unlockedBy(getHasName(ModBlocks.STRIPPED_MAPLE_LOG.get()), has(ModBlocks.STRIPPED_MAPLE_LOG.get())).save(pRecipeOutput);

        //MAPLE LOGS TO PLANK
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4).requires(ModBlocks.MAPLE_LOG.get()).unlockedBy(getHasName(ModBlocks.MAPLE_LOG.get()), has(ModBlocks.MAPLE_LOG.get())).save(pRecipeOutput, new ResourceLocation("maple_log_to_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4).requires(ModBlocks.MAPLE_WOOD.get()).unlockedBy(getHasName(ModBlocks.MAPLE_WOOD.get()), has(ModBlocks.MAPLE_WOOD.get())).save(pRecipeOutput, new ResourceLocation("maple_wood_to_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4).requires(ModBlocks.STRIPPED_MAPLE_WOOD.get()).unlockedBy(getHasName(ModBlocks.STRIPPED_MAPLE_WOOD.get()), has(ModBlocks.STRIPPED_MAPLE_WOOD.get())).save(pRecipeOutput, new ResourceLocation("stripped_maple_wood_to_planks"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MAPLE_PLANKS.get(), 4).requires(ModBlocks.STRIPPED_MAPLE_LOG.get()).unlockedBy(getHasName(ModBlocks.STRIPPED_MAPLE_LOG.get()), has(ModBlocks.STRIPPED_MAPLE_LOG.get())).save(pRecipeOutput, new ResourceLocation("stripped_maple_log_to_planks"));


        oreSmelting(pRecipeOutput, GLASS_SMELTABLES, RecipeCategory.MISC, Blocks.GLASS,0.25f, 100, "glass");
        //JADE
        oreBlasting(pRecipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(),0.25f, 100, "jade");
        oreSmelting(pRecipeOutput, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(),0.25f, 100, "jade");

        // JADE TO JADE BLOCK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JADE_BLOCK.get()).pattern("SSS").pattern("SSS").pattern("SSS").define('S', ModItems.JADE.get()).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).save(pRecipeOutput);
        // JADE BLOCK TO JADE
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JADE.get(), 9).requires(ModBlocks.JADE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.JADE_BLOCK.get()), has(ModBlocks.JADE_BLOCK.get())).save(pRecipeOutput);
        //JADE TO TOOLS
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MACUAHUITL.get()).pattern("O").pattern("J").pattern("S").define('S', Items.STICK).define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_HOE.get()).pattern("JO").pattern(" S").pattern(" S").define('S', Items.STICK).define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_AXE.get()).pattern("JO").pattern("JS").pattern(" S").define('S', Items.STICK).define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_SHOVEL.get()).pattern("J").pattern("O").pattern("S").define('S', Items.STICK).define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_PICKAXE.get()).pattern("JOJ").pattern(" S ").pattern(" S ").define('S', Items.STICK).define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Items.STICK), has(Items.STICK)).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);

        //JADE TO ARMOR
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_HELMET.get()).pattern("OJO").pattern("J J").define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_CHESTPLATE.get()).pattern("J J").pattern("JOJ").pattern("OOO").define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_LEGGINGS.get()).pattern("JOJ").pattern("O O").pattern("J J").define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_BOOTS.get()).pattern("J J").pattern("O O").define('J', ModItems.JADE.get()).define('O', Blocks.OBSIDIAN).unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get())).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LICHENY_COBBLED_LIMESTONE.get(), 1).requires(ModBlocks.COBBLED_LIMESTONE.get()).requires(Blocks.GLOW_LICHEN).unlockedBy(getHasName(ModBlocks.COBBLED_LIMESTONE.get()), has(ModBlocks.COBBLED_LIMESTONE.get())).unlockedBy(getHasName(Blocks.GLOW_LICHEN), has(Blocks.GLOW_LICHEN)).save(pRecipeOutput);

        //BRICK TILES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRICK_TILE.get())
                .pattern(" B ")
                .pattern("BCB")
                .define('B', Items.BRICK)
                .define('C', Items.CLAY_BALL)
                .unlockedBy(getHasName(Items.BRICK), has(Items.BRICK))
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                .save(pRecipeOutput);

        dyedWood(pRecipeOutput, Items.RED_DYE, ModBlocks.RED_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.ORANGE_DYE, ModBlocks.ORANGE_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.YELLOW_DYE, ModBlocks.YELLOW_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.GREEN_DYE, ModBlocks.GREEN_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.LIME_DYE, ModBlocks.LIME_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.BLUE_DYE, ModBlocks.BLUE_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.LIGHT_BLUE_DYE, ModBlocks.LIGHT_BLUE_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.CYAN_DYE, ModBlocks.CYAN_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.PURPLE_DYE, ModBlocks.PURPLE_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.MAGENTA_DYE, ModBlocks.MAGENTA_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.PINK_DYE, ModBlocks.PINK_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.WHITE_DYE, ModBlocks.WHITE_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.LIGHT_GRAY_DYE, ModBlocks.LIGHT_GRAY_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.GRAY_DYE, ModBlocks.GRAY_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.BROWN_DYE, ModBlocks.BROWN_PAINTED_PLANKS);
        dyedWood(pRecipeOutput, Items.BLACK_DYE, ModBlocks.BLACK_PAINTED_PLANKS);

        //BLENDER
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLENDER.get())
                .pattern(" S ")
                .pattern("GIG")
                .pattern("SRS")
                .define('G', Blocks.GLASS)
                .define('S', Blocks.SMOOTH_STONE_SLAB)
                .define('R', Items.REDSTONE)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pRecipeOutput);
    }



    //CUT PLANT
    private static void cutPlant(RecipeOutput pRecipeOutput, RegistryObject<Block> pPlant, RegistryObject<Block> pBush) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pPlant.get(), 3)
                .requires(pBush.get())

                .unlockedBy(getHasName(pBush.get()), has(pPlant.get()))
                .save(pRecipeOutput, new ResourceLocation(pBush.getId() + "_cut"));
    }
    //MORTAR PESTLE + VANILLA PLANT

    //MORTAR PESTLE + MODDED PLANT
    private static void plantCrushedToDye(RecipeOutput pRecipeOutput, ItemLike pDye, int d, RegistryObject<Block> pPlant) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pDye, d)
                .requires(pPlant.get())
                .requires(ModItems.MORTAR_AND_PESTLE.get())

                .unlockedBy(getHasName(pPlant.get()), has(pPlant.get()))
                .unlockedBy(getHasName(ModItems.MORTAR_AND_PESTLE.get()), has(ModItems.MORTAR_AND_PESTLE.get()))
                .save(pRecipeOutput, new ResourceLocation(pPlant.getId() + "_to_dye"));
    }

    private static void dyedWood(RecipeOutput pRecipeOutput, ItemLike pDye, RegistryObject<Block> pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult.get(), 8)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PPP")
                .define('P', ItemTags.PLANKS)
                .define('D', pDye)
                .unlockedBy(getHasName(pDye), has(pDye))
                .save(pRecipeOutput);
    }

    private static void succulentSmeltedToDye(RecipeOutput pRecipeOutput, ItemLike pDye, RegistryObject<Block> pPlant) {
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(pPlant.get().asItem()),
                RecipeCategory.MISC, pDye, 1.0F, 200)
                .unlockedBy(getHasName(pPlant.get()), has(pPlant.get()))
                .save(pRecipeOutput, new ResourceLocation(pPlant.getId() + "_smelted_to_dye"));
    }

    //EDITED RECIPE
    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }


    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, BensAddons.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }
}
