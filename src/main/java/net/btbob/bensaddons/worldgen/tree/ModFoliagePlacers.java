package net.btbob.bensaddons.worldgen.tree;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.worldgen.tree.custom.MapleFoliagePlacer;
import net.btbob.bensaddons.worldgen.tree.custom.PalmFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, BensAddons.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<MapleFoliagePlacer>> MAPLE_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("maple_foliage_placer", () -> new FoliagePlacerType<>(MapleFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<PalmFoliagePlacer>> PALM_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("palm_foliage_placer", () -> new FoliagePlacerType<>(PalmFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
