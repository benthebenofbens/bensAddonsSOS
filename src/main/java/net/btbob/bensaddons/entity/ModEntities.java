package net.btbob.bensaddons.entity;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.entity.custom.SpookEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BensAddons.MOD_ID);

    public static final RegistryObject<EntityType<SpookEntity>> SPOOK =
            ENTITY_TYPES.register("spook", () -> EntityType.Builder.of(SpookEntity::new, MobCategory.MONSTER).sized(1.0f,2.0f).build("spook"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
