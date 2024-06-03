package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.ModFoods;
import net.btbob.bensaddons.item.ModItems;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, BensAddons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ModTags.Items.SMALL_MUSHROOMS).add(
                MushroomBlocks.GIANT_PUFFBALL.get().asItem(),
                MushroomBlocks.SUBBS_MUSHROOMS.get().asItem(),
                MushroomBlocks.INDIGO_MILKCAP.get().asItem(),
                MushroomBlocks.SANDY_STILTBALL.get().asItem(),
                MushroomBlocks.GOLDEN_HALO.get().asItem(),
                MushroomBlocks.BLACK_TRUFFLE.get().asItem(),
                MushroomBlocks.LILAC_BONNETS.get().asItem(),
                MushroomBlocks.DESERT_SHAGGY_MANE.get().asItem(),
                MushroomBlocks.BASKET_STINKHORN.get().asItem(),
                MushroomBlocks.FIRE_CORAL.get().asItem(),
                MushroomBlocks.GLOWING_MUSHROOMS.get().asItem(),
                MushroomBlocks.YELLOW_PARASOLS.get().asItem(),
                MushroomBlocks.DEATH_CAP.get().asItem(),
                MushroomBlocks.DESTROYING_ANGEL.get().asItem(),
                MushroomBlocks.EARTHBALL.get().asItem(),
                MushroomBlocks.FALSE_DEATH_CAP.get().asItem(),
                MushroomBlocks.GRAY_MOREL.get().asItem(),
                MushroomBlocks.INKY_CAP.get().asItem(),
                Blocks.BROWN_MUSHROOM.asItem(),
                Blocks.RED_MUSHROOM.asItem(),
                MushroomBlocks.PORTABELLA.get().asItem()
        );

        this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MINECRAFT_MUSIC_DISC.get(), ModItems.WET_HANDS_MUSIC_DISC.get());
       this.tag(ItemTags.TRIMMABLE_ARMOR)
               .add(
                       ModItems.PLATINUM_HELMET.get(),
                       ModItems.PLATINUM_CHESTPLATE.get(),
                       ModItems.PLATINUM_LEGGINGS.get(),
                       ModItems.PLATINUM_BOOTS.get(),

                       ModItems.PYRITE_HELMET.get(),
                       ModItems.PYRITE_CHESTPLATE.get(),
                       ModItems.PYRITE_LEGGINGS.get(),
                       ModItems.PYRITE_BOOTS.get(),

                       ModItems.JADE_HELMET.get(),
                       ModItems.JADE_CHESTPLATE.get(),
                       ModItems.JADE_LEGGINGS.get(),
                       ModItems.JADE_BOOTS.get()
               );

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(
                        ModBlocks.MAPLE_LOG.get().asItem(),
                        ModBlocks.MAPLE_WOOD.get().asItem(),
                        ModBlocks.STRIPPED_MAPLE_WOOD.get().asItem(),
                        ModBlocks.STRIPPED_MAPLE_LOG.get().asItem(),
                        ModBlocks.PALM_LOG.get().asItem(),
                        ModBlocks.PALM_WOOD.get().asItem(),
                        ModBlocks.STRIPPED_PALM_LOG.get().asItem(),
                        ModBlocks.STRIPPED_PALM_WOOD.get().asItem(),
                        ModBlocks.BAOBAB_LOG.get().asItem(),
                        ModBlocks.BAOBAB_WOOD.get().asItem(),
                        ModBlocks.STRIPPED_BAOBAB_LOG.get().asItem(),
                        ModBlocks.STRIPPED_BAOBAB_WOOD.get().asItem()
                );

        this.tag(ItemTags.PLANKS)
                .add(
                     ModBlocks.MAPLE_PLANKS.get().asItem(),
                     ModBlocks.BAOBAB_PLANKS.get().asItem(),
                     ModBlocks.PALM_PLANKS.get().asItem()
                );

        this.tag(ItemTags.SWORDS).add(ModItems.PLATINUM_SWORD.get(),
                ModItems.MACUAHUITL.get(),
                ModItems.PYRITE_SWORD.get(),
                ModItems.ANCIENT_SWORD.get()
        );


    }

}
