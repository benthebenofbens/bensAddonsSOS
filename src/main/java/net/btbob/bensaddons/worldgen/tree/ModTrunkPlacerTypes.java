package net.btbob.bensaddons.worldgen.tree;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.worldgen.tree.custom.BaobabTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {

    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, BensAddons.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<BaobabTrunkPlacer>> BAOBAB_TRUNK_PLACER = TRUNK_PLACER.register("baobab_trunk_placer", () -> new TrunkPlacerType<>(BaobabTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
