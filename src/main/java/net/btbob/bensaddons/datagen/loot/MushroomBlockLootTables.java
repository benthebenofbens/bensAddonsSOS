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
import net.minecraft.world.level.storage.loot.predicates.LocationCheck;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MushroomBlockLootTables extends BlockLootSubProvider {

    public MushroomBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(MushroomBlocks.MUSHROOM_GROWING_BOX.get());

        //PUFFBALLS
        this.add(MushroomBlocks.GIANT_PUFFBALL.get(), createSingleItemTable(ModItems.GIANT_PUFFBALL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_GIANT_PUFFBALL.get(), createPotFlowerItemTable(MushroomBlocks.GIANT_PUFFBALL.get()));
        this.add(MushroomBlocks.INDIGO_MILKCAP.get(), createSingleItemTable(ModItems.INDIGO_MILKCAP_ITEM.get()));
        this.add(MushroomBlocks.POTTED_INDIGO_MILKCAP.get(), createPotFlowerItemTable(MushroomBlocks.INDIGO_MILKCAP.get()));
        this.add(MushroomBlocks.CHICKEN_OF_THE_WOODS.get(), createSingleItemTable(ModItems.CHICKEN_OF_THE_WOODS_ITEM.get()));
        this.add(MushroomBlocks.OYSTER.get(), createSingleItemTable(ModItems.OYSTER_ITEM.get()));

        this.add(MushroomBlocks.DESERT_SHAGGY_MANE.get(), createSingleItemTable(ModItems.DESERT_SHAGGY_MANE_ITEM.get()));
        this.add(MushroomBlocks.POTTED_DESERT_SHAGGY_MANE.get(), createPotFlowerItemTable(MushroomBlocks.DESERT_SHAGGY_MANE.get()));
        this.add(MushroomBlocks.PORTABELLA.get(), createSingleItemTable(ModItems.PORTABELLA_ITEM.get()));
        this.add(MushroomBlocks.POTTED_PORTABELLA.get(), createPotFlowerItemTable(MushroomBlocks.PORTABELLA.get()));
        this.add(MushroomBlocks.SANDY_STILTBALL.get(), createSingleItemTable(ModItems.SANDY_STILTBALL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_SANDY_STILTBALL.get(), createPotFlowerItemTable(MushroomBlocks.SANDY_STILTBALL.get()));
        this.add(MushroomBlocks.DEATH_CAP.get(), createSingleItemTable(ModItems.DEATH_CAP_ITEM.get()));
        this.add(MushroomBlocks.POTTED_DEATH_CAP.get(), createPotFlowerItemTable(MushroomBlocks.DEATH_CAP.get()));
        this.add(MushroomBlocks.DESTROYING_ANGEL.get(), createSingleItemTable(ModItems.DESTROYING_ANGEL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_DESTROYING_ANGEL.get(), createPotFlowerItemTable(MushroomBlocks.DESTROYING_ANGEL.get()));
        this.add(MushroomBlocks.EARTHBALL.get(), createSingleItemTable(ModItems.EARTHBALL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_EARTHBALL.get(), createPotFlowerItemTable(MushroomBlocks.EARTHBALL.get()));
        this.add(MushroomBlocks.FALSE_DEATH_CAP.get(), createSingleItemTable(ModItems.FALSE_DEATH_CAP_ITEM.get()));
        this.add(MushroomBlocks.POTTED_FALSE_DEATH_CAP.get(), createPotFlowerItemTable(MushroomBlocks.FALSE_DEATH_CAP.get()));
        this.add(MushroomBlocks.SUBBS_MUSHROOMS.get(), createSingleItemTable(ModItems.SUBBS_MUSHROOMS_ITEM.get()));
        this.add(MushroomBlocks.POTTED_SUBBS_MUSHROOMS.get(), createPotFlowerItemTable(MushroomBlocks.SUBBS_MUSHROOMS.get()));

        this.add(MushroomBlocks.BLACK_TRUFFLE.get(), createSingleItemTable(ModItems.BLACK_TRUFFLE_ITEM.get()));
        this.add(MushroomBlocks.POTTED_BLACK_TRUFFLE.get(), createPotFlowerItemTable(MushroomBlocks.BLACK_TRUFFLE.get()));
        this.add(MushroomBlocks.GOLDEN_HALO.get(), createSingleItemTable(ModItems.GOLDEN_HALO_ITEM.get()));
        this.add(MushroomBlocks.POTTED_GOLDEN_HALO.get(), createPotFlowerItemTable(MushroomBlocks.GOLDEN_HALO.get()));
        this.add(MushroomBlocks.LILAC_BONNETS.get(), createSingleItemTable(ModItems.LILAC_BONNETS_ITEM.get()));
        this.add(MushroomBlocks.POTTED_LILAC_BONNETS.get(), createPotFlowerItemTable(MushroomBlocks.LILAC_BONNETS.get()));
        this.add(MushroomBlocks.BASKET_STINKHORN.get(), createSingleItemTable(ModItems.BASKET_STINKHORN.get()));
        this.add(MushroomBlocks.POTTED_BASKET_STINKHORN.get(), createPotFlowerItemTable(MushroomBlocks.BASKET_STINKHORN.get()));
        this.add(MushroomBlocks.FIRE_CORAL.get(), createSingleItemTable(ModItems.FIRE_CORAL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_FIRE_CORAL.get(), createPotFlowerItemTable(MushroomBlocks.FIRE_CORAL.get()));
        this.add(MushroomBlocks.GLOWING_MUSHROOMS.get(), createSingleItemTable(ModItems.GLOWING_MUSHROOMS_ITEM.get()));
        this.add(MushroomBlocks.POTTED_GLOWING_MUSHROOMS.get(), createPotFlowerItemTable(MushroomBlocks.GLOWING_MUSHROOMS.get()));
        this.add(MushroomBlocks.YELLOW_PARASOLS.get(), createSingleItemTable(ModItems.YELLOW_PARASOLS_ITEM.get()));
        this.add(MushroomBlocks.POTTED_YELLOW_PARASOLS.get(), createPotFlowerItemTable(MushroomBlocks.YELLOW_PARASOLS.get()));
        this.add(MushroomBlocks.INKY_CAP.get(), createSingleItemTable(ModItems.INKY_CAP_ITEM.get()));
        this.add(MushroomBlocks.POTTED_INKY_CAP.get(), createPotFlowerItemTable(MushroomBlocks.INKY_CAP.get()));
        this.add(MushroomBlocks.GRAY_MOREL.get(), createSingleItemTable(ModItems.GRAY_MOREL_ITEM.get()));
        this.add(MushroomBlocks.POTTED_GRAY_MOREL.get(), createPotFlowerItemTable(MushroomBlocks.GRAY_MOREL.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MushroomBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
