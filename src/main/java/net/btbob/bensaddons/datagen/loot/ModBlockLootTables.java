package net.btbob.bensaddons.datagen.loot;

import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.ModItems;
import net.minecraft.advancements.critereon.BlockPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.BlockPos;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
       //DECORATIVE PLANTS
        this.dropSelf(ModBlocks.TRUMPET_PITCHER.get());
        this.add(ModBlocks.POTTED_TRUMPET_PITCHER.get(), createPotFlowerItemTable(ModBlocks.TRUMPET_PITCHER.get()));

        this.dropSelf(ModBlocks.YELLOW_CELOSIA.get());
        this.add(ModBlocks.POTTED_YELLOW_CELOSIA.get(), createPotFlowerItemTable(ModBlocks.YELLOW_CELOSIA.get()));
        this.dropSelf(ModBlocks.ORANGE_CELOSIA.get());
        this.add(ModBlocks.POTTED_ORANGE_CELOSIA.get(), createPotFlowerItemTable(ModBlocks.ORANGE_CELOSIA.get()));
        this.dropSelf(ModBlocks.MAGENTA_CELOSIA.get());
        this.add(ModBlocks.POTTED_MAGENTA_CELOSIA.get(), createPotFlowerItemTable(ModBlocks.MAGENTA_CELOSIA.get()));
        this.dropSelf(ModBlocks.PINK_CELOSIA.get());
        this.add(ModBlocks.POTTED_PINK_CELOSIA.get(), createPotFlowerItemTable(ModBlocks.PINK_CELOSIA.get()));

        this.dropSelf(ModBlocks.CUT_PEONY.get());
        this.add(ModBlocks.POTTED_CUT_PEONY.get(), createPotFlowerItemTable(ModBlocks.CUT_PEONY.get()));

        this.dropSelf(ModBlocks.LUCKY_CLOVER.get());
        this.add(ModBlocks.POTTED_LUCKY_CLOVER.get(), createPotFlowerItemTable(ModBlocks.LUCKY_CLOVER.get()));

        this.dropSelf(ModBlocks.CLOVER.get());
        this.add(ModBlocks.POTTED_CLOVER.get(), createPotFlowerItemTable(ModBlocks.CLOVER.get()));

        this.dropSelf(ModBlocks.DAFFODIL.get());
        this.add(ModBlocks.POTTED_DAFFODIL.get(), createPotFlowerItemTable(ModBlocks.DAFFODIL.get()));

        this.dropSelf(ModBlocks.SEA_THRIFT.get());
        this.add(ModBlocks.POTTED_SEA_THRIFT.get(), createPotFlowerItemTable(ModBlocks.POTTED_SEA_THRIFT.get()));
        this.dropSelf(ModBlocks.HONEYSUCKLE_VINES.get());

        this.dropSelf(ModBlocks.IRIS.get());
        this.add(ModBlocks.POTTED_IRIS.get(), createPotFlowerItemTable(ModBlocks.IRIS.get()));

        this.dropSelf(ModBlocks.PANSY.get());
        this.add(ModBlocks.POTTED_PANSY.get(), createPotFlowerItemTable(ModBlocks.PANSY.get()));

        this.dropSelf(ModBlocks.CREEPER_PANSY.get());
        this.add(ModBlocks.POTTED_CREEPER_PANSY.get(), createPotFlowerItemTable(ModBlocks.CREEPER_PANSY.get()));

        this.dropSelf(ModBlocks.FIRE_PANSY.get());
        this.add(ModBlocks.POTTED_FIRE_PANSY.get(), createPotFlowerItemTable(ModBlocks.FIRE_PANSY.get()));

        this.dropSelf(ModBlocks.DAHLIA.get());
        this.add(ModBlocks.POTTED_DAHLIA.get(), createPotFlowerItemTable(ModBlocks.DAHLIA.get()));

        this.dropSelf(ModBlocks.BLUE_HYACINTH.get());
        this.add(ModBlocks.POTTED_BLUE_HYACINTH.get(), createPotFlowerItemTable(ModBlocks.BLUE_HYACINTH.get()));

        this.dropSelf(ModBlocks.MAGENTA_HYACINTH.get());
        this.add(ModBlocks.POTTED_MAGENTA_HYACINTH.get(), createPotFlowerItemTable(ModBlocks.MAGENTA_HYACINTH.get()));

        this.dropSelf(ModBlocks.PURPLE_HYACINTH.get());
        this.add(ModBlocks.POTTED_PURPLE_HYACINTH.get(), createPotFlowerItemTable(ModBlocks.PURPLE_HYACINTH.get()));

        this.dropSelf(ModBlocks.WHITE_LILY.get());
        this.add(ModBlocks.POTTED_WHITE_LILY.get(), createPotFlowerItemTable(ModBlocks.WHITE_LILY.get()));
        this.dropSelf(ModBlocks.PURPLE_LILY.get());
        this.add(ModBlocks.POTTED_PURPLE_LILY.get(), createPotFlowerItemTable(ModBlocks.PURPLE_LILY.get()));
        this.dropSelf(ModBlocks.ORANGE_LILY.get());
        this.add(ModBlocks.POTTED_ORANGE_LILY.get(), createPotFlowerItemTable(ModBlocks.ORANGE_LILY.get()));
        this.dropSelf(ModBlocks.PINK_LILY.get());
        this.add(ModBlocks.POTTED_PINK_LILY.get(), createPotFlowerItemTable(ModBlocks.PINK_LILY.get()));

        this.dropSelf(ModBlocks.CONEFLOWER.get());
        this.add(ModBlocks.POTTED_CONEFLOWER.get(), createPotFlowerItemTable(ModBlocks.CONEFLOWER.get()));

        this.dropSelf(ModBlocks.CUT_LILAC.get());
        this.add(ModBlocks.POTTED_CUT_LILAC.get(), createPotFlowerItemTable(ModBlocks.CUT_LILAC.get()));

        this.dropSelf(ModBlocks.CUT_ROSE.get());
        this.add(ModBlocks.POTTED_CUT_ROSE.get(), createPotFlowerItemTable(ModBlocks.CUT_ROSE.get()));
        this.dropSelf(ModBlocks.BLUE_CUT_ROSE.get());
        this.add(ModBlocks.POTTED_BLUE_CUT_ROSE.get(), createPotFlowerItemTable(ModBlocks.BLUE_CUT_ROSE.get()));
        this.dropSelf(ModBlocks.PURPLE_CUT_ROSE.get());
        this.add(ModBlocks.POTTED_PURPLE_CUT_ROSE.get(), createPotFlowerItemTable(ModBlocks.PURPLE_CUT_ROSE.get()));
        this.dropSelf(ModBlocks.WHITE_CUT_ROSE.get());
        this.add(ModBlocks.POTTED_WHITE_CUT_ROSE.get(), createPotFlowerItemTable(ModBlocks.WHITE_CUT_ROSE.get()));

        this.dropSelf(ModBlocks.RED_CUT_HIBISCUS.get());
        this.dropSelf(ModBlocks.PINK_CUT_HIBISCUS.get());
        this.dropSelf(ModBlocks.YELLOW_CUT_HIBISCUS.get());
        this.dropSelf(ModBlocks.ORANGE_CUT_HIBISCUS.get());

        this.add(ModBlocks.POTTED_YELLOW_CUT_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.YELLOW_CUT_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_PINK_CUT_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.PINK_CUT_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_RED_CUT_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.RED_CUT_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_ORANGE_CUT_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.ORANGE_CUT_HIBISCUS.get()));

        this.dropSelf(ModBlocks.WHITE_CUT_HYDRANGEA.get());
        this.dropSelf(ModBlocks.BLUE_CUT_HYDRANGEA.get());
        this.dropSelf(ModBlocks.PURPLE_CUT_HYDRANGEA.get());
        this.dropSelf(ModBlocks.MAGENTA_CUT_HYDRANGEA.get());

        this.add(ModBlocks.POTTED_WHITE_CUT_HYDRANGEA.get(), createPotFlowerItemTable(ModBlocks.WHITE_CUT_HYDRANGEA.get()));
        this.add(ModBlocks.POTTED_BLUE_CUT_HYDRANGEA.get(), createPotFlowerItemTable(ModBlocks.BLUE_CUT_HYDRANGEA.get()));
        this.add(ModBlocks.POTTED_PURPLE_CUT_HYDRANGEA.get(), createPotFlowerItemTable(ModBlocks.PURPLE_CUT_HYDRANGEA.get()));
        this.add(ModBlocks.POTTED_MAGENTA_CUT_HYDRANGEA.get(), createPotFlowerItemTable(ModBlocks.MAGENTA_CUT_HYDRANGEA.get()));

        this.dropSelf(ModBlocks.WHITE_CUT_RHODODENDRON.get());
        this.dropSelf(ModBlocks.BLUE_CUT_RHODODENDRON.get());
        this.dropSelf(ModBlocks.PURPLE_CUT_RHODODENDRON.get());
        this.dropSelf(ModBlocks.MAGENTA_CUT_RHODODENDRON.get());

        this.add(ModBlocks.POTTED_WHITE_CUT_RHODODENDRON.get(), createPotFlowerItemTable(ModBlocks.WHITE_CUT_RHODODENDRON.get()));
        this.add(ModBlocks.POTTED_BLUE_CUT_RHODODENDRON.get(), createPotFlowerItemTable(ModBlocks.BLUE_CUT_RHODODENDRON.get()));
        this.add(ModBlocks.POTTED_PURPLE_CUT_RHODODENDRON.get(), createPotFlowerItemTable(ModBlocks.PURPLE_CUT_RHODODENDRON.get()));
        this.add(ModBlocks.POTTED_MAGENTA_CUT_RHODODENDRON.get(), createPotFlowerItemTable(ModBlocks.MAGENTA_CUT_RHODODENDRON.get()));


        this.add(ModBlocks.BLUE_ROSE_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.BLUE_ROSE_BUSH.get()));
        this.add(ModBlocks.PURPLE_ROSE_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.PURPLE_ROSE_BUSH.get()));
        this.add(ModBlocks.WHITE_ROSE_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.WHITE_ROSE_BUSH.get()));
        this.add(ModBlocks.YELLOW_HIBISCUS_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.YELLOW_HIBISCUS_BUSH.get()));
        this.add(ModBlocks.ORANGE_HIBISCUS_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.ORANGE_HIBISCUS_BUSH.get()));
        this.add(ModBlocks.PINK_HIBISCUS_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.PINK_HIBISCUS_BUSH.get()));
        this.add(ModBlocks.RED_HIBISCUS_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.RED_HIBISCUS_BUSH.get()));
        this.add(ModBlocks.WHITE_HYDRANGEA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.WHITE_HYDRANGEA_BUSH.get()));
        this.add(ModBlocks.PURPLE_HYDRANGEA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.PURPLE_HYDRANGEA_BUSH.get()));
        this.add(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.MAGENTA_HYDRANGEA_BUSH.get()));
        this.add(ModBlocks.BLUE_HYDRANGEA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.BLUE_HYDRANGEA_BUSH.get()));
        this.add(ModBlocks.ZOMBIE_BLOOM.get(), createDoublePlantShearsDrop(ModBlocks.ZOMBIE_BLOOM.get()));
        this.add(ModBlocks.TEOSINTE.get(), createTallPlantWithSeedDrops(ModBlocks.TEOSINTE.get(), ModItems.CORN_SEEDS.get(), 0.05F));
        this.add(ModBlocks.PINEAPPLE_PLANT.get(), createSingleItemTableWithSilkTouch(ModBlocks.PINEAPPLE_PLANT.get(), ModItems.PINEAPPLE.get()));
        this.add(ModBlocks.CATTAIL.get(), createDoublePlantShearsDrop(ModBlocks.CATTAIL.get()));
        this.add(ModBlocks.YUCCA.get(), createDoublePlantShearsDrop(ModBlocks.YUCCA.get()));
        this.add(ModBlocks.PINK_CELOSIA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.PINK_CELOSIA_BUSH.get()));
        this.add(ModBlocks.YELLOW_CELOSIA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.YELLOW_CELOSIA_BUSH.get()));
        this.add(ModBlocks.ORANGE_CELOSIA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.ORANGE_CELOSIA_BUSH.get()));
        this.add(ModBlocks.MAGENTA_CELOSIA_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.MAGENTA_CELOSIA_BUSH.get()));
        this.add(ModBlocks.PURPLE_RHODODENDRON.get(), createDoublePlantShearsDrop(ModBlocks.PURPLE_RHODODENDRON.get()));
        this.add(ModBlocks.BLUE_RHODODENDRON.get(), createDoublePlantShearsDrop(ModBlocks.BLUE_RHODODENDRON.get()));
        this.add(ModBlocks.MAGENTA_RHODODENDRON.get(), createDoublePlantShearsDrop(ModBlocks.MAGENTA_RHODODENDRON.get()));
        this.add(ModBlocks.WHITE_RHODODENDRON.get(), createDoublePlantShearsDrop(ModBlocks.WHITE_RHODODENDRON.get()));

        this.add(ModBlocks.PINK_CELOSIA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.YELLOW_CELOSIA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.ORANGE_CELOSIA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.MAGENTA_CELOSIA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.BLUE_ROSE_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.PURPLE_ROSE_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.WHITE_ROSE_BUSH_BOTTOM.get(),noDrop());
        this.add(ModBlocks.YELLOW_HIBISCUS_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.ORANGE_HIBISCUS_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.RED_HIBISCUS_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.PINK_HIBISCUS_BUSH_BOTTOM.get(),noDrop());
        this.add(ModBlocks.WHITE_HYDRANGEA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.PURPLE_HYDRANGEA_BUSH_BOTTOM.get(), noDrop());
        this.add(ModBlocks.MAGENTA_HYDRANGEA_BUSH_BOTTOM.get(),noDrop());
        this.add(ModBlocks.BLUE_HYDRANGEA_BUSH_BOTTOM.get(),noDrop());
        this.add(ModBlocks.ZOMBIE_BLOOM_BOTTOM.get(),noDrop());
        this.add(ModBlocks.TEOSINTE_BOTTOM.get(),noDrop());
        this.add(ModBlocks.PINEAPPLE_PLANT_BOTTOM.get(),noDrop());
        this.add(ModBlocks.CATTAIL_BOTTOM.get(),noDrop());
        this.add(ModBlocks.YUCCA_BOTTOM.get(),noDrop());
        this.add(ModBlocks.PURPLE_RHODODENDRON_BOTTOM.get(),noDrop());
        this.add(ModBlocks.BLUE_RHODODENDRON_BOTTOM.get(),noDrop());
        this.add(ModBlocks.MAGENTA_RHODODENDRON_BOTTOM.get(),noDrop());
        this.add(ModBlocks.WHITE_RHODODENDRON_BOTTOM.get(),noDrop());

        this.dropSelf(ModBlocks.SALVIA.get());
        this.add(ModBlocks.POTTED_SALVIA.get(), createPotFlowerItemTable(ModBlocks.SALVIA.get()));

        this.dropSelf(ModBlocks.CEDAR_SALVIA.get());
        this.add(ModBlocks.POTTED_CEDAR_SALVIA.get(), createPotFlowerItemTable(ModBlocks.CEDAR_SALVIA.get()));

        this.dropSelf(ModBlocks.VIOLET.get());
        this.add(ModBlocks.POTTED_VIOLET.get(), createPotFlowerItemTable(ModBlocks.VIOLET.get()));

        this.dropSelf(ModBlocks.BIRD_OF_PARADISE.get());
        this.add(ModBlocks.POTTED_BIRD_OF_PARADISE.get(), createPotFlowerItemTable(ModBlocks.BIRD_OF_PARADISE.get()));

        //MUSHROOMS
        this.dropSelf(ModBlocks.FAIRY_RING.get());


        //MUSHROOM BLOCKS
        this.add(ModBlocks.INK_CAP_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.INK_CAP_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));
        this.dropSelf(ModBlocks.INK_VINES.get());

        this.add(ModBlocks.PUFFBALL_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.PUFFBALL_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.DAPPERLING_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.DAPPERLING_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.OYSTER_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.OYSTER_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.MOREL_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.MOREL_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.MILK_CAP_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.MILK_CAP_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.TRUFFLE_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.TRUFFLE_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.WAX_CAP_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.WAX_CAP_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.RUSSULA_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.RUSSULA_MUSHROOM_BLOCK.get(), ModBlocks.PUFFBALL_MUSHROOM_BLOCK.get()));

        this.add(ModBlocks.CHANGLE_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.CHANGLE_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        this.add(ModBlocks.LOBSTER_TAIL_MUSHROOM_BLOCK.get(),
                block ->  createMushroomBlockDrop(
                        ModBlocks.LOBSTER_TAIL_MUSHROOM_BLOCK.get(), MushroomBlocks.GIANT_PUFFBALL.get()));

        //PLATINUM BLOCKS
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.add(ModBlocks.PLATINUM_ORE.get(), block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));

        //PYRITE
        this.dropSelf(ModBlocks.PYRITE_BLOCK.get());
        this.add(ModBlocks.PYRITE_ORE.get(), block -> createOreDrop(ModBlocks.PYRITE_ORE.get(), ModItems.PYRITE_NUGGET.get()));

        //JADE BLOCKS
        this.dropSelf(ModBlocks.JADE_BLOCK.get());
        this.add(ModBlocks.JADE_ORE.get(), block -> createOreDrop(ModBlocks.JADE_ORE.get(), ModItems.JADE.get()));

        //NODULE AND FOSSILS
        this.add(ModBlocks.STONE_NODULE.get(),
                block -> createSingleItemTableWithSilkTouch(ModBlocks.STONE_NODULE.get(),
                        ModBlocks.AMMONITE_FOSSIL.get().asItem()));
        this.dropSelf(ModBlocks.AMMONITE_FOSSIL.get());
        this.dropSelf(ModBlocks.FERN_FOSSIL.get());
        this.dropSelf(ModBlocks.CLAW_FOSSIL.get());
        this.dropSelf(ModBlocks.TORCHFLOWER_FOSSIL.get());
        this.dropSelf(ModBlocks.ANOMALOCARIS_FOSSIL.get());
        this.dropSelf(ModBlocks.TRILOBITE_FOSSIL.get());
        this.dropSelf(ModBlocks.SPOOK_FOSSIL.get());
        this.dropSelf(ModBlocks.FOOTPRINTS_FOSSIL.get());

        this.add(ModBlocks.SNIFFER_FOSSIL1.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL1.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL2.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL2.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL3.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL3.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL4.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL4.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL5.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL5.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL6.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL6.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL7.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL7.get()));
        this.add(ModBlocks.SNIFFER_FOSSIL8.get(), block -> createSilkTouchOnlyTable(ModBlocks.SNIFFER_FOSSIL8.get()));


        //MAPLE WOOD
        this.dropSelf(ModBlocks.MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.MAPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_WOOD.get());
        this.dropSelf(ModBlocks.MAPLE_SAPLING.get());
        this.add(ModBlocks.POTTED_MAPLE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.MAPLE_SAPLING.get()));
        this.add(ModBlocks.MAPLE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.MAPLE_PLANKS.get());
        this.dropSelf(ModBlocks.MAPLE_STAIRS.get());
        this.dropSelf(ModBlocks.MAPLE_BUTTON.get());
        this.dropSelf(ModBlocks.MAPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAPLE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MAPLE_FENCE.get());
        this.dropSelf(ModBlocks.MAPLE_FENCE_GATE.get());
        this.add(ModBlocks.MAPLE_SLAB.get(), block -> createSlabItemTable(ModBlocks.MAPLE_SLAB.get()));
        this.add(ModBlocks.MAPLE_DOOR.get(), block -> createDoorTable(ModBlocks.MAPLE_DOOR.get()));
        //TREE TAP
        this.add(ModBlocks.TREE_TAP.get(), createSingleItemTable(ModItems.TREE_TAP_ITEM.get()));
        //LEAF PILES
        this.dropSelf(ModBlocks.MAPLE_LEAF_PILE.get());
        this.dropSelf(ModBlocks.PALM_LEAF_PILE.get());
        this.dropSelf(ModBlocks.OAK_LEAF_PILE.get());
        this.dropSelf(ModBlocks.BIRCH_LEAF_PILE.get());
        this.dropSelf(ModBlocks.SPRUCE_LEAF_PILE.get());
        this.dropSelf(ModBlocks.DARK_OAK_LEAF_PILE.get());
        this.dropSelf(ModBlocks.JUNGLE_LEAF_PILE.get());
        this.dropSelf(ModBlocks.ACACIA_LEAF_PILE.get());
        this.dropSelf(ModBlocks.AZALEA_LEAF_PILE.get());
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAF_PILE.get());
        this.dropSelf(ModBlocks.CHERRY_LEAF_PILE.get());
        this.dropSelf(ModBlocks.MANGROVE_LEAF_PILE.get());



        //PALM WOOD
        this.dropSelf(ModBlocks.PALM_WOOD.get());
        this.dropSelf(ModBlocks.PALM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PALM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PALM_WOOD.get());
       this.dropSelf(ModBlocks.PALM_SHOOT.get());
      this.add(ModBlocks.POTTED_PALM_SHOOT.get(), createPotFlowerItemTable(ModBlocks.PALM_SHOOT.get()));
        this.add(ModBlocks.PALM_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.PALM_SHOOT.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.PALM_PLANKS.get());
        this.dropSelf(ModBlocks.PALM_STAIRS.get());
        this.dropSelf(ModBlocks.PALM_BUTTON.get());
        this.dropSelf(ModBlocks.PALM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PALM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PALM_FENCE.get());
        this.dropSelf(ModBlocks.PALM_FENCE_GATE.get());
        this.add(ModBlocks.PALM_SLAB.get(), block -> createSlabItemTable(ModBlocks.PALM_SLAB.get()));
        this.add(ModBlocks.PALM_DOOR.get(), block -> createDoorTable(ModBlocks.PALM_DOOR.get()));
        this.add(ModBlocks.COCONUT_BUNCH.get(), createCoconutBlockDrops(ModBlocks.COCONUT_BUNCH.get(), ModItems.COCONUT.get()));

        //BAOBAB WOOD
        this.dropSelf(ModBlocks.BAOBAB_WOOD.get());
        this.dropSelf(ModBlocks.BAOBAB_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BAOBAB_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BAOBAB_WOOD.get());
        this.dropSelf(ModBlocks.BAOBAB_SAPLING.get());
        this.add(ModBlocks.POTTED_BAOBAB_SAPLING.get(), createPotFlowerItemTable(ModBlocks.BAOBAB_SAPLING.get()));
       // this.add(ModBlocks.BAOBAB_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.BAOBAB_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.BAOBAB_PLANKS.get());
        this.dropSelf(ModBlocks.BAOBAB_STAIRS.get());
        this.dropSelf(ModBlocks.BAOBAB_BUTTON.get());
        this.dropSelf(ModBlocks.BAOBAB_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BAOBAB_TRAPDOOR.get());
        this.dropSelf(ModBlocks.BAOBAB_FENCE.get());
        this.dropSelf(ModBlocks.BAOBAB_FENCE_GATE.get());
        this.add(ModBlocks.BAOBAB_SLAB.get(), block -> createSlabItemTable(ModBlocks.BAOBAB_SLAB.get()));
        this.add(ModBlocks.BAOBAB_DOOR.get(), block -> createDoorTable(ModBlocks.BAOBAB_DOOR.get()));
        //MISC NATURAL BLOCKS
        this.dropSelf(ModBlocks.PEAT.get());
        this.dropSelf(ModBlocks.RED_CLAY.get());
        this.dropSelf(ModBlocks.LEAFY_PODZOL.get());
        this.dropSelf(ModBlocks.GRASSY_PEAT.get());
        this.dropSelf(ModBlocks.MYCELIATED_DIRT.get());
        this.dropSelf(ModBlocks.ROCK_SALT.get());
        this.dropSelf(ModBlocks.PUMICE.get());
        this.dropSelf(ModBlocks.BLENDER.get());

        //WOOD MOSAICS
        this.dropSelf(ModBlocks.OAK_MOSAIC.get());
        this.dropSelf(ModBlocks.ACACIA_MOSAIC.get());
        this.dropSelf(ModBlocks.BAOBAB_MOSAIC.get());
        this.dropSelf(ModBlocks.BIRCH_MOSAIC.get());
        this.dropSelf(ModBlocks.CRIMSON_MOSAIC.get());
        this.dropSelf(ModBlocks.DARK_OAK_MOSAIC.get());
        this.dropSelf(ModBlocks.JUNGLE_MOSAIC.get());
        this.dropSelf(ModBlocks.PALM_MOSAIC.get());
        this.dropSelf(ModBlocks.SPRUCE_MOSAIC.get());
        this.dropSelf(ModBlocks.WARPED_MOSAIC.get());
        this.dropSelf(ModBlocks.CHERRY_MOSAIC.get());
        this.dropSelf(ModBlocks.MANGROVE_MOSAIC.get());
        this.dropSelf(ModBlocks.MAPLE_MOSAIC.get());

        this.dropSelf(ModBlocks.RED_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.ORANGE_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.YELLOW_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.LIME_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.BLUE_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.MAGENTA_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.WHITE_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.GRAY_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_PAINTED_PLANKS.get());
        this.dropSelf(ModBlocks.BROWN_PAINTED_PLANKS.get());

        this.dropSelf(ModBlocks.BAMBOO_BUNDLE.get());
        this.dropSelf(ModBlocks.STRIPPED_BAMBOO_BUNDLE.get());

        //GNEISS
        this.dropSelf(ModBlocks.GNEISS.get());
        this.dropSelf(ModBlocks.COBBLED_GNEISS.get());
        this.dropSelf(ModBlocks.ENERGIZED_COBBLED_GNEISS.get());
        this.dropSelf(ModBlocks.POLISHED_GNEISS.get());
        this.dropSelf(ModBlocks.CHISELED_GNEISS.get());
        this.dropSelf(ModBlocks.GNEISS_BRICKS.get());
        this.dropSelf(ModBlocks.ENERGIZED_GNEISS_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_GNEISS_BRICKS.get());
        this.dropSelf(ModBlocks.GNEISS_TILES.get());
        this.dropSelf(ModBlocks.CRACKED_GNEISS_TILES.get());
        this.dropSelf(ModBlocks.ENERGIZED_GNEISS_TILES.get());

        this.dropSelf(ModBlocks.SMOOTH_GNEISS.get());
        this.add(ModBlocks.SMOOTH_GNEISS_SLAB.get(), block -> createSlabItemTable(ModBlocks.SMOOTH_GNEISS_SLAB.get()));


        //CHERT
        this.dropSelf(ModBlocks.CHERT.get());
        this.dropSelf(ModBlocks.CHERT_STAIRS.get());
        this.dropSelf(ModBlocks.CHERT_WALL.get());
        this.add(ModBlocks.CHERT_SLAB.get(), block -> createSlabItemTable(ModBlocks.CHERT_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_CHERT.get());
        this.dropSelf(ModBlocks.POLISHED_CHERT_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_CHERT_WALL.get());
        this.add(ModBlocks.POLISHED_CHERT_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_CHERT_SLAB.get()));
        this.dropSelf(ModBlocks.CHERT_BRICKS.get());
        this.dropSelf(ModBlocks.CHERT_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CHERT_BRICK_WALL.get());
        this.add(ModBlocks.CHERT_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CHERT_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_CHERT_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_CHERT_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_CHERT_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_CHERT_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_CHERT_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_CHERT.get());
        this.dropSelf(ModBlocks.CHERT_TILES.get());
        this.dropSelf(ModBlocks.CRACKED_CHERT_TILES.get());
        this.dropSelf(ModBlocks.CRYSTALLINE_CHERT_TILES.get());
        this.dropSelf(ModBlocks.CRYSTALLINE_CHERT_BRICKS.get());

        //GABBRO
        this.dropSelf(ModBlocks.GABBRO.get());
        this.dropSelf(ModBlocks.GABBRO_STAIRS.get());
        this.dropSelf(ModBlocks.GABBRO_WALL.get());
        this.add(ModBlocks.GABBRO_SLAB.get(), block -> createSlabItemTable(ModBlocks.GABBRO_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_GABBRO.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO_WALL.get());
        this.add(ModBlocks.POLISHED_GABBRO_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_GABBRO_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_GABBRO_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GABBRO_BRICK_WALL.get());
        this.add(ModBlocks.POLISHED_GABBRO_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_GABBRO_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_POLISHED_GABBRO_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_POLISHED_GABBRO_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_POLISHED_GABBRO.get());

        //LIMESTONE
        this.add(ModBlocks.LIMESTONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.LIMESTONE.get(), ModBlocks.COBBLED_LIMESTONE.get()));
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.add(ModBlocks.LIMESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.COBBLED_LIMESTONE.get());
        this.dropSelf(ModBlocks.LICHENY_COBBLED_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_LIMESTONE_WALL.get());
        this.add(ModBlocks.COBBLED_LIMESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.COBBLED_LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.LICHENY_COBBLED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LICHENY_COBBLED_LIMESTONE_WALL.get());
        this.add(ModBlocks.LICHENY_COBBLED_LIMESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.LICHENY_COBBLED_LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_WALL.get());
        this.add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.LIMESTONE_TILE.get());
        this.dropSelf(ModBlocks.LIMESTONE_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_TILE_WALL.get());
        this.add(ModBlocks.LIMESTONE_TILE_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIMESTONE_TILE_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LICHENY_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICK_WALL.get());
        this.add(ModBlocks.LIMESTONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.LIMESTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_LIMESTONE_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_LIMESTONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_LIMESTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.LICHENY_LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LICHENY_LIMESTONE_BRICK_WALL.get());
        this.add(ModBlocks.LICHENY_LIMESTONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.LICHENY_LIMESTONE_BRICK_SLAB.get()));

        //SLATE
        this.dropSelf(ModBlocks.COBBLED_SLATE.get());
        this.dropSelf(ModBlocks.BEDAZZLED_COBBLED_SLATE.get());
        this.add(ModBlocks.SLATE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.SLATE.get(), ModBlocks.COBBLED_SLATE.get()));

        this.dropSelf(ModBlocks.SLATE_STAIRS.get());
        this.dropSelf(ModBlocks.SLATE_WALL.get());
        this.add(ModBlocks.SLATE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SLATE_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_SLATE.get());
        this.dropSelf(ModBlocks.SLATE_BRICKS.get());
        this.dropSelf(ModBlocks.BEDAZZLED_SLATE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_SLATE_BRICKS.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SLATE_BRICK_WALL.get());
        this.add(ModBlocks.SLATE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.SLATE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_SLATE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_SLATE_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_SLATE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_SLATE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_SLATE.get());
        this.dropSelf(ModBlocks.POLISHED_SLATE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SLATE_WALL.get());
        this.add(ModBlocks.POLISHED_SLATE_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_SLATE_SLAB.get()));
        this.dropSelf(ModBlocks.SLATE_TILES.get());
        this.dropSelf(ModBlocks.CRACKED_SLATE_TILES.get());
        this.dropSelf(ModBlocks.BEDAZZLED_SLATE_TILES.get());
        this.dropSelf(ModBlocks.SLATE_PILLAR.get());
        this.dropSelf(ModBlocks.SMOOTH_SLATE.get());
        this.add(ModBlocks.SMOOTH_SLATE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SMOOTH_SLATE_SLAB.get()));


        //MARBLE
        this.add(ModBlocks.MARBLE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.MARBLE.get(), ModBlocks.COBBLED_MARBLE.get()));
        this.dropSelf(ModBlocks.MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.MARBLE_WALL.get());
        this.add(ModBlocks.MARBLE_SLAB.get(), block -> createSlabItemTable(ModBlocks.MARBLE_SLAB.get()));
        this.dropSelf(ModBlocks.COBBLED_MARBLE.get());
        this.dropSelf(ModBlocks.PAINTED_COBBLED_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE_WALL.get());
        this.add(ModBlocks.POLISHED_MARBLE_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_MARBLE_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_MARBLE.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.PAINTED_MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_MARBLE_BRICK_WALL.get());
        this.add(ModBlocks.POLISHED_MARBLE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_MARBLE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_POLISHED_MARBLE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.MARBLE_TILES.get());
        this.dropSelf(ModBlocks.CRACKED_MARBLE_TILES.get());
        this.dropSelf(ModBlocks.PAINTED_MARBLE_TILES.get());

        this.dropSelf(ModBlocks.MARBLE_PILLAR.get());


        //AMETHYST
        this.dropSelf(ModBlocks.POLISHED_AMETHYST.get());
        this.dropSelf(ModBlocks.SMOOTH_AMETHYST.get());
        this.dropSelf(ModBlocks.CUT_AMETHYST.get());
        this.dropSelf(ModBlocks.CHISELED_AMETHYST.get());
        this.dropSelf(ModBlocks.AMETHYST_BRICKS.get());
        this.dropSelf(ModBlocks.AMETHYST_PILLAR.get());

        //RUBY
        this.add(ModBlocks.RUBY_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.RUBY_CLUSTER.get(), ModItems.RUBY_SHARD.get()));
        this.dropSelf(ModBlocks.BUDDING_RUBY.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_RUBY_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_RUBY_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_RUBY_BUD.get());
        this.dropSelf(ModBlocks.RUBY_BLOCK.get());

        this.dropSelf(ModBlocks.POLISHED_RUBY.get());
        this.dropSelf(ModBlocks.SMOOTH_RUBY.get());
        this.dropSelf(ModBlocks.CUT_RUBY.get());
        this.dropSelf(ModBlocks.CHISELED_RUBY.get());
        this.dropSelf(ModBlocks.RUBY_BRICKS.get());
      //  this.dropSelf(ModBlocks.RUBY_PILLAR.get());

        //TOPAZ
        this.add(ModBlocks.TOPAZ_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.TOPAZ_CLUSTER.get(), ModItems.TOPAZ_SHARD.get()));
        this.dropSelf(ModBlocks.BUDDING_TOPAZ.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_TOPAZ_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_TOPAZ_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_TOPAZ_BUD.get());
        this.dropSelf(ModBlocks.TOPAZ_BLOCK.get());

        this.dropSelf(ModBlocks.CHISELED_TOPAZ.get());
        this.dropSelf(ModBlocks.TOPAZ_BRICKS.get());


        this.add(ModBlocks.CITRINE_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.CITRINE_CLUSTER.get(), ModItems.CITRINE_SHARD.get()));
        this.dropSelf(ModBlocks.BUDDING_CITRINE.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_CITRINE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_CITRINE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_CITRINE_BUD.get());
        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());

        //PERIDOT
        this.add(ModBlocks.PERIDOT_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.PERIDOT_CLUSTER.get(), ModItems.PERIDOT_SHARD.get()));
        this.dropSelf(ModBlocks.BUDDING_PERIDOT.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_PERIDOT_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_PERIDOT_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_PERIDOT_BUD.get());
        this.dropSelf(ModBlocks.PERIDOT_BLOCK.get());

        this.dropSelf(ModBlocks.POLISHED_PERIDOT.get());
        this.dropSelf(ModBlocks.SMOOTH_PERIDOT.get());
        this.dropSelf(ModBlocks.CUT_PERIDOT.get());
        this.dropSelf(ModBlocks.CHISELED_PERIDOT.get());
        this.dropSelf(ModBlocks.PERIDOT_BRICKS.get());
        this.dropSelf(ModBlocks.PERIDOT_PILLAR.get());

        //AQUAMARINE
        this.add(ModBlocks.AQUAMARINE_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.AQUAMARINE_CLUSTER.get(), ModItems.AQUAMARINE_SHARD.get()));
        this.dropSelf(ModBlocks.BUDDING_AQUAMARINE.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_AQUAMARINE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_AQUAMARINE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_AQUAMARINE_BUD.get());
        this.dropSelf(ModBlocks.AQUAMARINE_BLOCK.get());

        this.dropSelf(ModBlocks.POLISHED_AQUAMARINE.get());
        this.dropSelf(ModBlocks.SMOOTH_AQUAMARINE.get());
        this.dropSelf(ModBlocks.CHISELED_AQUAMARINE.get());
        this.dropSelf(ModBlocks.AQUAMARINE_BRICKS.get());

        //SAPPHIRE
        this.add(ModBlocks.SAPPHIRE_CLUSTER.get(), block -> createClusterBlockDrops(ModBlocks.SAPPHIRE_CLUSTER.get(), Items.BLUE_DYE)); //TODO: SWAP TO SAPPHIRE CRYSTAL
        this.dropSelf(ModBlocks.BUDDING_SAPPHIRE.get());
        this.dropWhenSilkTouch(ModBlocks.LARGE_SAPPHIRE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.MEDIUM_SAPPHIRE_BUD.get());
        this.dropWhenSilkTouch(ModBlocks.SMALL_SAPPHIRE_BUD.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

        //PINK SAND
        this.dropSelf(ModBlocks.PINK_SAND.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE_WALL.get());
        this.add(ModBlocks.PINK_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.PINK_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE_WALL.get());
        this.add(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.PINK_CHISELED_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_CUT_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_CUT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_CUT_SANDSTONE_WALL.get());
        this.add(ModBlocks.PINK_CUT_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.PINK_CUT_SANDSTONE_SLAB.get()));

        //BLACK SAND
        this.dropSelf(ModBlocks.BLACK_SAND.get());
        this.dropSelf(ModBlocks.BLACK_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLACK_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_SANDSTONE_WALL.get());
        this.add(ModBlocks.BLACK_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLACK_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE_WALL.get());
        this.add(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.BLACK_CHISELED_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLACK_CUT_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLACK_CUT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_CUT_SANDSTONE_WALL.get());
        this.add(ModBlocks.BLACK_CUT_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.BLACK_CUT_SANDSTONE_SLAB.get()));

        //WHITE SAND
        this.dropSelf(ModBlocks.WHITE_SAND.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE_WALL.get());
        this.add(ModBlocks.WHITE_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.WHITE_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get());
        this.add(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.WHITE_CHISELED_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_CUT_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_CUT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_CUT_SANDSTONE_WALL.get());
        this.add(ModBlocks.WHITE_CUT_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.WHITE_CUT_SANDSTONE_SLAB.get()));

        //IRIDESCENT SAND
        this.dropSelf(ModBlocks.IRIDESCENT_SAND.get());
        this.dropSelf(ModBlocks.IRIDESCENT_SANDSTONE.get());
        this.dropSelf(ModBlocks.IRIDESCENT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.IRIDESCENT_SANDSTONE_WALL.get());
        this.add(ModBlocks.IRIDESCENT_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.IRIDESCENT_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_STAIRS.get());
        this.add(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.IRIDESCENT_SMOOTH_SANDSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.IRIDESCENT_CHISELED_SANDSTONE.get());
        this.dropSelf(ModBlocks.IRIDESCENT_CUT_SANDSTONE.get());
        this.dropSelf(ModBlocks.IRIDESCENT_CUT_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.IRIDESCENT_CUT_SANDSTONE_WALL.get());
        this.add(ModBlocks.IRIDESCENT_CUT_SANDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.IRIDESCENT_CUT_SANDSTONE_SLAB.get()));

        //SAND PLANTS AND SUCCULENTS
        this.add(ModBlocks.BEACHGRASS.get(), createGrassDrops(ModBlocks.BEACHGRASS.get()));
        this.add(ModBlocks.POTTED_BEACHGRASS.get(), createPotFlowerItemTable(ModBlocks.BEACHGRASS.get()));

        this.dropSelf(ModBlocks.BARREL_CACTUS.get());
        this.add(ModBlocks.POTTED_BARREL_CACTUS.get(), createPotFlowerItemTable(ModBlocks.BARREL_CACTUS.get()));
        this.dropSelf(ModBlocks.ALOE.get());
        this.add(ModBlocks.POTTED_ALOE.get(), createPotFlowerItemTable(ModBlocks.ALOE.get()));
        this.dropSelf(ModBlocks.HAWORTHIA.get());
        this.add(ModBlocks.POTTED_HAWORTHIA.get(), createPotFlowerItemTable(ModBlocks.HAWORTHIA.get()));
        this.dropSelf(ModBlocks.FLOWERING_CACTUS.get());
        this.add(ModBlocks.POTTED_FLOWERING_CACTUS.get(), createPotFlowerItemTable(ModBlocks.FLOWERING_CACTUS.get()));
        this.add(ModBlocks.AEONIUM_BUSH.get(), createDoublePlantShearsDrop(ModBlocks.AEONIUM_BUSH.get()));
        this.add(ModBlocks.AEONIUM_BUSH_BOTTOM.get(), noDrop());
        this.dropSelf(ModBlocks.CUT_AEONIUM.get());
        this.add(ModBlocks.POTTED_CUT_AEONIUM.get(), createPotFlowerItemTable(ModBlocks.CUT_AEONIUM.get()));
        this.add(ModBlocks.OPUNTIA_CACTUS.get(), createDoublePlantShearsDrop(ModBlocks.OPUNTIA_CACTUS.get()));
        this.add(ModBlocks.OPUNTIA_CACTUS_BOTTOM.get(), noDrop());
        this.dropSelf(ModBlocks.CUT_OPUNTIA_CACTUS.get());
        this.add(ModBlocks.POTTED_CUT_OPUNTIA_CACTUS.get(), createPotFlowerItemTable(ModBlocks.CUT_OPUNTIA_CACTUS.get()));



        //LEGACY BLOCKS
        this.dropSelf(ModBlocks.ANCIENT_STONE.get());
        this.dropSelf(ModBlocks.OLDSTONE.get());
        this.dropSelf(ModBlocks.NETHERSTONE.get());
        this.dropSelf(ModBlocks.GLOWRACK.get());
        this.dropSelf(ModBlocks.ANCIENT_ALLOY_BLOCK.get());
        this.dropSelf(ModBlocks.MOSSY_OLDSTONE.get());
        this.dropSelf(ModBlocks.SHATTERED_OLDSTONE.get());
        this.dropSelf(ModBlocks.ANCIENT_BRICK.get());
        this.dropSelf(ModBlocks.PRESERVED_WOOD.get());
        this.dropSelf(ModBlocks.PRESERVED_WOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PRESERVED_GRASS_BLOCK.get());
        this.add(ModBlocks.PRESERVED_WOOD_DOOR.get(), block -> createDoorTable(ModBlocks.PRESERVED_WOOD_DOOR.get()));



        this.dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get());

        this.dropSelf(ModBlocks.CUT_QUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.CUT_QUARTZ_STAIRS.get());
        this.dropSelf(ModBlocks.CUT_QUARTZ_WALL.get());
        this.add(ModBlocks.CUT_QUARTZ_SLAB.get(), block -> createSlabItemTable(ModBlocks.CUT_QUARTZ_SLAB.get()));
        this.dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICK_WALL.get());
        this.dropSelf(ModBlocks.QUARTZ_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());
        this.add(ModBlocks.QUARTZ_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB.get()));



        this.dropSelf(ModBlocks.BRICK_TILE.get());
        this.dropSelf(ModBlocks.BRICK_PILLAR.get());
        this.dropSelf(ModBlocks.BRICK_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.BRICK_TILE_WALL.get());
        this.add(ModBlocks.BRICK_TILE_SLAB.get(), block -> createSlabItemTable(ModBlocks.BRICK_TILE_SLAB.get()));
    this.dropSelf(ModBlocks.CHISELED_BRICKS.get());
    this.dropSelf(ModBlocks.CRACKED_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_BRICK_SLAB.get()));

        this.add(ModBlocks.MAPLE_SIGN.get(), block -> createSingleItemTable(ModItems.MAPLE_SIGN.get()));
        this.add(ModBlocks.MAPLE_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.MAPLE_SIGN.get()));
        this.add(ModBlocks.MAPLE_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.MAPLE_HANGING_SIGN.get()));
        this.add(ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.MAPLE_HANGING_SIGN.get()));

        this.add(ModBlocks.PALM_SIGN.get(), block -> createSingleItemTable(ModItems.PALM_SIGN.get()));
        this.add(ModBlocks.PALM_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.PALM_SIGN.get()));
        this.add(ModBlocks.PALM_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PALM_HANGING_SIGN.get()));
        this.add(ModBlocks.PALM_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PALM_HANGING_SIGN.get()));

        this.add(ModBlocks.BAOBAB_SIGN.get(), block -> createSingleItemTable(ModItems.BAOBAB_SIGN.get()));
        this.add(ModBlocks.BAOBAB_WALL_SIGN.get(), block -> createSingleItemTable(ModItems.BAOBAB_SIGN.get()));
        this.add(ModBlocks.BAOBAB_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BAOBAB_HANGING_SIGN.get()));
        this.add(ModBlocks.BAOBAB_WALL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.BAOBAB_HANGING_SIGN.get()));

        //STAIR-SLAB-WALL
        //CRACKED STONE BRICK
        this.dropSelf(ModBlocks.POLISHED_STONE.get());
        this.dropSelf(ModBlocks.STONE_PILLAR.get());
        this.dropSelf(ModBlocks.POLISHED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_STONE_WALL.get());

        this.add(ModBlocks.POLISHED_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.POLISHED_STONE_SLAB.get()));


        this.dropSelf(ModBlocks.CRACKED_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_WALL.get());
        this.dropSelf(ModBlocks.STONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_WALL.get());
        this.add(ModBlocks.CRACKED_STONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_STONE_BRICK_SLAB.get()));

        //DEEPSLATE
        this.dropSelf(ModBlocks.DEEPSLATE_STAIRS.get());
        this.dropSelf(ModBlocks.DEEPSLATE_WALL.get());
        this.add(ModBlocks.DEEPSLATE_SLAB.get(), block -> createSlabItemTable(ModBlocks.DEEPSLATE_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL.get());
        this.add(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get()));

        this.dropSelf(ModBlocks.SKULKED_COBBLED_DEEPSLATE.get());
        this.dropSelf(ModBlocks.SKULKED_COBBLED_DEEPSLATE_STAIRS.get());
        this.dropSelf(ModBlocks.SKULKED_COBBLED_DEEPSLATE_WALL.get());
        this.add(ModBlocks.SKULKED_COBBLED_DEEPSLATE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SKULKED_COBBLED_DEEPSLATE_SLAB.get()));

        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_BRICKS.get());
        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_BRICK_WALL.get());
        this.add(ModBlocks.SKULKED_DEEPSLATE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.SKULKED_DEEPSLATE_BRICK_SLAB.get()));

        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_TILES.get());
        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.SKULKED_DEEPSLATE_TILE_WALL.get());
        this.add(ModBlocks.SKULKED_DEEPSLATE_TILE_SLAB.get(), block -> createSlabItemTable(ModBlocks.SKULKED_DEEPSLATE_TILE_SLAB.get()));





        //GILDED BLACKSTONE
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_WALL.get());
        this.add(ModBlocks.GILDED_BLACKSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.GILDED_BLACKSTONE_SLAB.get()));

        //CRACKED BLACKSTONE BRICKS
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());
        this.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get()));

        //GILDED BLACKSTONE BRICKS
        this.dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get());
        this.add(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get()));

        //CALCITE
        this.dropSelf(ModBlocks.CALCITE_STAIRS.get());
        this.dropSelf(ModBlocks.CALCITE_WALL.get());
        this.add(ModBlocks.CALCITE_SLAB.get(), block -> createSlabItemTable(ModBlocks.CALCITE_SLAB.get()));

        //DRIPSTONE
        this.dropSelf(ModBlocks.DRIPSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DRIPSTONE_WALL.get());
        this.add(ModBlocks.DRIPSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.DRIPSTONE_SLAB.get()));

    }


    protected LootTable.Builder createTallPlantWithSeedDrops(Block pBlock, Item pSeeds, float pProbability) {
        LootPoolEntryContainer.Builder<?> builder = LootItem.lootTableItem(pBlock).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1F))).when(HAS_SHEARS).otherwise(this.applyExplosionCondition(pBlock, LootItem.lootTableItem(pSeeds)).when(LootItemRandomChanceCondition.randomChance(pProbability)));
        return LootTable.lootTable().withPool(LootPool.lootPool().add(builder).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER))).when(LocationCheck.checkLocation(LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER))), new BlockPos(0, 1, 0)))).withPool(LootPool.lootPool().add(builder).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER))).when(LocationCheck.checkLocation(LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(pBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER))), new BlockPos(0, -1, 0))));
    }

    protected LootTable.Builder createClusterBlockDrops(Block pBlock, Item pItem) {
            return createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)).when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES))).otherwise(this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
    }

    protected LootTable.Builder createCoconutBlockDrops(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)).when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES))).otherwise(this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
