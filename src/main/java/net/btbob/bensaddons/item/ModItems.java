package net.btbob.bensaddons.item;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.custom.FuelBlockItem;
import net.btbob.bensaddons.item.custom.MortarAndPestleItem;
import net.btbob.bensaddons.item.custom.MushroomBlockItem;
import net.btbob.bensaddons.item.custom.VanillaMushroomBlockItem;
import net.btbob.bensaddons.sound.ModSounds;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.registerItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BensAddons.MOD_ID);

    //ITEMS
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle", () -> new MortarAndPestleItem(new Item.Properties().durability(16)));

    public static final RegistryObject<Item> INDIGO_MILKCAP_SPORES = ITEMS.register("indigo_milkcap_spores", () -> new Item(new Item.Properties().food(ModFoods.MUSHROOM_SPORES)));
    //MUSHROOMS
    public static final RegistryObject<BlockItem> INDIGO_MILKCAP_ITEM = ITEMS.register("indigo_milkcap_item", () -> new MushroomBlockItem(MushroomBlocks.INDIGO_MILKCAP.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> DESERT_SHAGGY_MANE_ITEM = ITEMS.register("desert_shaggy_mane_item", () -> new MushroomBlockItem(MushroomBlocks.DESERT_SHAGGY_MANE.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> PORTABELLA_ITEM = ITEMS.register("portabella_item", () -> new MushroomBlockItem(MushroomBlocks.PORTABELLA.get(), new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> SANDY_STILTBALL_ITEM = ITEMS.register("sandy_stiltball_item", () -> new MushroomBlockItem(MushroomBlocks.SANDY_STILTBALL.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> SUBBS_MUSHROOMS_ITEM = ITEMS.register("subbs_mushrooms_item", () -> new MushroomBlockItem(MushroomBlocks.SUBBS_MUSHROOMS.get(), new Item.Properties().food(ModFoods.PSYCHEDELIC_MUSHROOM)));
    public static final RegistryObject<BlockItem> GOLDEN_HALO_ITEM = ITEMS.register("golden_halo_item", () -> new MushroomBlockItem(MushroomBlocks.GOLDEN_HALO.get(), new Item.Properties().food(ModFoods.PSYCHEDELIC_MUSHROOM)));
    public static final RegistryObject<BlockItem> BLACK_TRUFFLE_ITEM = ITEMS.register("black_truffle_item", () -> new MushroomBlockItem(MushroomBlocks.BLACK_TRUFFLE.get(), new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> LILAC_BONNETS_ITEM = ITEMS.register("lilac_bonnets_item", () -> new MushroomBlockItem(MushroomBlocks.LILAC_BONNETS.get(), new Item.Properties().food(ModFoods.POISON_MUSHROOM)));
    public static final RegistryObject<BlockItem> BASKET_STINKHORN = ITEMS.register("basket_stinkhorn_item", () -> new MushroomBlockItem(MushroomBlocks.BASKET_STINKHORN.get(), new Item.Properties().food(ModFoods.POISON_MUSHROOM)));
    public static final RegistryObject<BlockItem> FIRE_CORAL_ITEM = ITEMS.register("fire_coral_item", () -> new MushroomBlockItem(MushroomBlocks.FIRE_CORAL.get(), new Item.Properties().food(ModFoods.DEADLY_MUSHROOM)));
    public static final RegistryObject<BlockItem> GLOWING_MUSHROOMS_ITEM = ITEMS.register("glowing_mushrooms_item", () -> new MushroomBlockItem(MushroomBlocks.GLOWING_MUSHROOMS.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> YELLOW_PARASOLS_ITEM = ITEMS.register("yellow_parasols_item", () -> new MushroomBlockItem(MushroomBlocks.YELLOW_PARASOLS.get(), new Item.Properties().food(ModFoods.POISON_MUSHROOM)));
    public static final RegistryObject<BlockItem> DEATH_CAP_ITEM = ITEMS.register("death_cap_item", () -> new MushroomBlockItem(MushroomBlocks.DEATH_CAP.get(), new Item.Properties().food(ModFoods.DEADLY_MUSHROOM)));
    public static final RegistryObject<BlockItem> DESTROYING_ANGEL_ITEM = ITEMS.register("destroying_angel_item", () -> new MushroomBlockItem(MushroomBlocks.DESTROYING_ANGEL.get(), new Item.Properties().food(ModFoods.DEADLY_MUSHROOM)));
    public static final RegistryObject<BlockItem> EARTHBALL_ITEM = ITEMS.register("earthball_item", () -> new MushroomBlockItem(MushroomBlocks.EARTHBALL.get(), new Item.Properties().food(ModFoods.POISON_MUSHROOM)));
    public static final RegistryObject<BlockItem> FALSE_DEATH_CAP_ITEM = ITEMS.register("false_death_cap_item", () -> new MushroomBlockItem(MushroomBlocks.FALSE_DEATH_CAP.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> GRAY_MOREL_ITEM = ITEMS.register("gray_morel_item", () -> new MushroomBlockItem(MushroomBlocks.GRAY_MOREL.get(), new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> INKY_CAP_ITEM = ITEMS.register("inky_cap_item", () -> new MushroomBlockItem(MushroomBlocks.INKY_CAP.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));

    //POISON MUSHROOMS
    public static final RegistryObject<BlockItem> RED_MUSHROOM_ITEM = ITEMS.register("red_mushroom_item", () -> new VanillaMushroomBlockItem(Blocks.RED_MUSHROOM, new Item.Properties().food(ModFoods.PSYCHEDELIC_MUSHROOM), "block.bensaddons.red_mushroom.desc"));

    public static final RegistryObject<BlockItem> BROWN_MUSHROOM_ITEM = ITEMS.register("brown_mushroom_item", () -> new VanillaMushroomBlockItem(Blocks.BROWN_MUSHROOM, new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM), "block.bensaddons.brown_mushroom.desc"));
    public static final RegistryObject<BlockItem> GIANT_PUFFBALL_ITEM = ITEMS.register("giant_puffball_item", () -> new MushroomBlockItem(MushroomBlocks.GIANT_PUFFBALL.get(), new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> CHICKEN_OF_THE_WOODS_ITEM = ITEMS.register("chicken_of_the_woods_item", () -> new MushroomBlockItem(MushroomBlocks.CHICKEN_OF_THE_WOODS.get(), new Item.Properties().food(ModFoods.INEDIBLE_MUSHROOM)));
    public static final RegistryObject<BlockItem> OYSTER_ITEM = ITEMS.register("oyster_item", () -> new MushroomBlockItem(MushroomBlocks.OYSTER.get(), new Item.Properties().food(ModFoods.EDIBLE_MUSHROOM)));



    //CORN ITEMS
    public static final RegistryObject<Item> CORN_MEAL = ITEMS.register("corn_meal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds", () -> new Item(new Item.Properties()));

    //COCONUT ITEMS
    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut", () -> new Item(new Item.Properties().food(ModFoods.COCONUT)));

    //PINEAPPLE ITEMS
    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple", () -> new Item(new Item.Properties().food(ModFoods.PINEAPPLE)));

    //SHELL
    public static final RegistryObject<Item> SHELL = ITEMS.register("shell", () -> new InstrumentItem(new Item.Properties(), InstrumentTags.GOAT_HORNS));
    public static final RegistryObject<Item> SHELL_PICKAXE = ITEMS.register("shell_pickaxe", () -> new PickaxeItem(ModToolTiers.SHELL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SHELL_AXE = ITEMS.register("shell_axe", () -> new AxeItem(ModToolTiers.SHELL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SHELL_SHOVEL = ITEMS.register("shell_shovel", () -> new ShovelItem(ModToolTiers.SHELL, 1, 1, new Item.Properties()));

    //PLATINUM ITEMS
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(ModToolTiers.PLATINUM, 7, 2, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(ModToolTiers.PLATINUM, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(ModToolTiers.PLATINUM, 9, 1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(ModToolTiers.PLATINUM, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(ModToolTiers.PLATINUM, 1, 4, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));


    //GEMSTONE SHARDS
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_SHARD = ITEMS.register("topaz_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_SHARD = ITEMS.register("citrine_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHARD = ITEMS.register("peridot_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_SHARD = ITEMS.register("aquamarine_shard", () -> new Item(new Item.Properties()));

    //ANCIENT TOOLS
    public static final RegistryObject<Item> ANCIENT_SWORD = ITEMS.register("ancient_sword", () -> new SwordItem(Tiers.DIAMOND, 3, .2f, new Item.Properties()));
    public static final RegistryObject<Item> PRESERVED_MEAT = ITEMS.register("preserved_meat", () -> new Item(new Item.Properties().food(ModFoods.PRESERVED_MEAT)));

   //MISC TOOLS
    public static final RegistryObject<Item> TROWEL = ITEMS.register("trowel", () -> new BrushItem(new Item.Properties()));


    //JADE (STURDY BUT SLOW)
    public static final RegistryObject<Item> JADE = ITEMS.register("jade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MACUAHUITL = ITEMS.register("macuahuitl", () -> new SwordItem(ModToolTiers.JADE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe", () -> new PickaxeItem(ModToolTiers.JADE, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe", () -> new AxeItem(ModToolTiers.JADE, 9, 1, new Item.Properties()));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe", () -> new HoeItem(ModToolTiers.JADE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel", () -> new ShovelItem(ModToolTiers.JADE, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet", () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate", () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings", () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots", () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.BOOTS, new Item.Properties()));
    //PYRITE
    public static final RegistryObject<Item> PYRITE_NUGGET = ITEMS.register("pyrite_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_INGOT = ITEMS.register("pyrite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_SWORD = ITEMS.register("pyrite_sword", () -> new SwordItem(ModToolTiers.PYRITE, 7, 2, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_PICKAXE = ITEMS.register("pyrite_pickaxe", () -> new PickaxeItem(ModToolTiers.PYRITE, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_AXE = ITEMS.register("pyrite_axe", () -> new AxeItem(ModToolTiers.PYRITE, 9, 1, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_SHOVEL = ITEMS.register("pyrite_shovel", () -> new ShovelItem(ModToolTiers.PYRITE, 5, 1, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_HOE = ITEMS.register("pyrite_hoe", () -> new HoeItem(ModToolTiers.PYRITE, 1, 4, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_HELMET = ITEMS.register("pyrite_helmet", () -> new ArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_CHESTPLATE = ITEMS.register("pyrite_chestplate", () -> new ArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_LEGGINGS = ITEMS.register("pyrite_leggings", () -> new ArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_BOOTS = ITEMS.register("pyrite_boots", () -> new ArmorItem(ModArmorMaterials.PYRITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<BlockItem> TREE_TAP_ITEM = ITEMS.register("tree_tap_item", () -> new BlockItem(ModBlocks.TREE_TAP.get(), new Item.Properties()));

    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = ITEMS.register("maple_hanging_sign", () -> new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN.get(), ModBlocks.MAPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PALM_SIGN = ITEMS.register("palm_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PALM_SIGN.get(), ModBlocks.PALM_WALL_SIGN.get()));
    public static final RegistryObject<Item> PALM_HANGING_SIGN = ITEMS.register("palm_hanging_sign", () -> new HangingSignItem(ModBlocks.PALM_HANGING_SIGN.get(), ModBlocks.PALM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BAOBAB_SIGN = ITEMS.register("baobab_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BAOBAB_SIGN.get(), ModBlocks.BAOBAB_WALL_SIGN.get()));
    public static final RegistryObject<Item> BAOBAB_HANGING_SIGN = ITEMS.register("baobab_hanging_sign", () -> new HangingSignItem(ModBlocks.BAOBAB_HANGING_SIGN.get(), ModBlocks.BAOBAB_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //MUSIC
    public static final RegistryObject<Item> MINECRAFT_MUSIC_DISC = ITEMS.register("minecraft_music_disc", () -> new RecordItem(6, ModSounds.MINECRAFT_DISC,new Item.Properties().stacksTo(1), 5220)); //1800 for wet hands
    public static final RegistryObject<Item> WET_HANDS_MUSIC_DISC = ITEMS.register("wet_hands_music_disc", () -> new RecordItem(6, ModSounds.WET_HANDS_DISC,new Item.Properties().stacksTo(1), 1800)); //1800 for wet hands

    //PEAT BLOCK ITEM
    public static final RegistryObject<BlockItem> PEAT = ITEMS.register("peat_block",
            () -> new FuelBlockItem(ModBlocks.PEAT.get(), new Item.Properties(), 40));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
