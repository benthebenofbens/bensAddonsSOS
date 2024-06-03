package net.btbob.bensaddons.util;

import net.btbob.bensaddons.BensAddons;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;

public class BADamageTypes {
    public static final ResourceKey<DamageType> MUSHROOM_POISON = register("mushroom_poison");
    public static final ResourceKey<DamageType> BAD_TRIP = register("bad_trip");


    private static ResourceKey<DamageType> register(String name) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(BensAddons.MOD_ID, name));
    }

}
