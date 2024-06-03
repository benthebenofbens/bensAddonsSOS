package net.btbob.bensaddons.block.nature;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.custom.BAMushroomBlock;
import net.btbob.bensaddons.block.custom.FireCoralBlock;
import net.btbob.bensaddons.block.custom.MushroomGrowingBoxBlock;
import net.btbob.bensaddons.block.custom.MushroomShelfBlock;
import net.btbob.bensaddons.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MushroomBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BensAddons.MOD_ID);

    public static final RegistryObject<Block> MUSHROOM_GROWING_BOX = registerBlock("mushroom_growing_box", () -> new MushroomGrowingBoxBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));


    //EDIBLE
    public static final RegistryObject<Block> BLACK_TRUFFLE = registerBlock("black_truffle", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLACK_TRUFFLE = registerBlock("potted_black_truffle", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.BLACK_TRUFFLE, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GIANT_PUFFBALL = registerBlock("giant_puffball", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_GIANT_PUFFBALL = registerBlock("potted_giant_puffball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.GIANT_PUFFBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> INKY_CAP = registerBlock("inky_cap", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_INKY_CAP = registerBlock("potted_inky_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.INKY_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> PORTABELLA = registerBlock("portabella", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_PORTABELLA = registerBlock("potted_portabella", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.PORTABELLA, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //INEDIBLE
    public static final RegistryObject<Block> DESERT_SHAGGY_MANE = registerBlock("desert_shaggy_mane", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_DESERT_SHAGGY_MANE = registerBlock("potted_desert_shaggy_mane", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.DESERT_SHAGGY_MANE, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> FALSE_DEATH_CAP = registerBlock("false_death_cap", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FALSE_DEATH_CAP = registerBlock("potted_false_death_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.FALSE_DEATH_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GLOWING_MUSHROOMS = registerBlock("glowing_mushrooms", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()){@Override public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) { return 7; }});
    public static final RegistryObject<Block> POTTED_GLOWING_MUSHROOMS = registerBlock("potted_glowing_mushrooms", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.GLOWING_MUSHROOMS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> GRAY_MOREL = registerBlock("gray_morel", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_GRAY_MOREL = registerBlock("potted_gray_morel", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.GRAY_MOREL, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> INDIGO_MILKCAP = registerBlock("indigo_milkcap", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_INDIGO_MILKCAP = registerBlock("potted_indigo_milkcap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.INDIGO_MILKCAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> SANDY_STILTBALL = registerBlock("sandy_stiltball", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SANDY_STILTBALL = registerBlock("potted_sandy_stiltball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.SANDY_STILTBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //PSYCHOACTIVE
    public static final RegistryObject<Block> GOLDEN_HALO = registerBlock("golden_halo", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_GOLDEN_HALO = registerBlock("potted_golden_halo", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.GOLDEN_HALO, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> SUBBS_MUSHROOMS = registerBlock("subbs_mushrooms", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SUBBS_MUSHROOMS = registerBlock("potted_subbs_mushrooms", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.SUBBS_MUSHROOMS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //POISONOUS
    public static final RegistryObject<Block> BASKET_STINKHORN = registerBlock("basket_stinkhorn", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_BASKET_STINKHORN = registerBlock("potted_basket_stinkhorn", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.BASKET_STINKHORN, BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> EARTHBALL = registerBlock("earthball", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_EARTHBALL = registerBlock("potted_earthball", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.EARTHBALL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> LILAC_BONNETS = registerBlock("lilac_bonnets", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_LILAC_BONNETS = registerBlock("potted_lilac_bonnets", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.LILAC_BONNETS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_PARASOLS = registerBlock("yellow_parasols", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_PARASOLS = registerBlock("potted_yellow_parasols", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.YELLOW_PARASOLS, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //DEADLY
    public static final RegistryObject<Block> DEATH_CAP = registerBlock("death_cap", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_DEATH_CAP = registerBlock("potted_death_cap", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.DEATH_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> DESTROYING_ANGEL = registerBlock("destroying_angel", () -> new BAMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_DESTROYING_ANGEL = registerBlock("potted_destroying_angel", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.DESTROYING_ANGEL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));
    public static final RegistryObject<Block> FIRE_CORAL = registerBlock("fire_coral", () -> new FireCoralBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_FIRE_CORAL = registerBlock("potted_fire_coral", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), MushroomBlocks.FIRE_CORAL, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    //SHELVES
    public static final RegistryObject<Block> OYSTER = registerBlock("oyster", () -> new MushroomShelfBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));
    public static final RegistryObject<Block> CHICKEN_OF_THE_WOODS = registerBlock("chicken_of_the_woods", () -> new MushroomShelfBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission().noOcclusion()));

    //MUSHROOM BLOCKS


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
