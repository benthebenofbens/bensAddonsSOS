package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.util.BADamageTypes;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.damagesource.DamageType;

public class ModDamageTypes {

    protected static void bootstrap(BootstapContext<DamageType> context) {
        context.register(BADamageTypes.MUSHROOM_POISON, new DamageType("mushroom_poison", 1.0F));
        context.register(BADamageTypes.MUSHROOM_POISON, new DamageType("bad_trip", 0.1F));
    }
}
