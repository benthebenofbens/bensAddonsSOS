package net.btbob.bensaddons.block.entity;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BensAddons.MOD_ID);

    public static final RegistryObject<BlockEntityType<MushroomGrowingBoxBlockEntity>> MUSHROOM_GROWING_BE =
            BLOCK_ENTITIES.register("mushroom_growing_be",() ->
                    BlockEntityType.Builder.of(MushroomGrowingBoxBlockEntity::new,
                            MushroomBlocks.MUSHROOM_GROWING_BOX.get()).build(null));


    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
            BlockEntityType.Builder.of(ModSignBlockEntity::new,
                    ModBlocks.MAPLE_SIGN.get(),ModBlocks.MAPLE_WALL_SIGN.get(),
                    ModBlocks.BAOBAB_SIGN.get(),ModBlocks.BAOBAB_WALL_SIGN.get(),
                    ModBlocks.PALM_SIGN.get(),ModBlocks.PALM_WALL_SIGN.get()).build(null)
            );

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.MAPLE_HANGING_SIGN.get(),ModBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                            ModBlocks.BAOBAB_HANGING_SIGN.get(),ModBlocks.BAOBAB_WALL_HANGING_SIGN.get(),
                            ModBlocks.PALM_HANGING_SIGN.get(),ModBlocks.PALM_WALL_HANGING_SIGN.get()
                    ).build(null));

    public static void register(IEventBus eventBus) { BLOCK_ENTITIES.register(eventBus);}
}
