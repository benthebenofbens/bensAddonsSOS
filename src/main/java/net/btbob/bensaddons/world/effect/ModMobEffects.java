package net.btbob.bensaddons.world.effect;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.world.effect.custom.BadTripMobEffect;
import net.btbob.bensaddons.world.effect.custom.HexedMobEffect;
import net.btbob.bensaddons.world.effect.custom.ModMobEffect;
import net.btbob.bensaddons.world.effect.custom.MushroomPoisoningMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BensAddons.MOD_ID);

    public static final RegistryObject<MobEffect> HEXED = registerEffect("hexed", () -> new HexedMobEffect(MobEffectCategory.NEUTRAL, 13382655));

    public static final RegistryObject<MobEffect> PSYCHEDELIA = registerEffect("psychedelia", () -> new HexedMobEffect(MobEffectCategory.NEUTRAL, 16738530));
    public static final RegistryObject<MobEffect> BAD_TRIP = registerEffect("bad_trip", () -> new BadTripMobEffect(MobEffectCategory.HARMFUL, 2889238));
    public static final RegistryObject<MobEffect> MUSHROOM_POISONING = registerEffect("mushroom_poisoning", () -> new MushroomPoisoningMobEffect(MobEffectCategory.HARMFUL, 6836818));

    public static final RegistryObject<MobEffect> SWEET_SCENT = registerEffect("sweet_scent", () -> new ModMobEffect(MobEffectCategory.BENEFICIAL, 13408563));
    public static final RegistryObject<MobEffect> PUTRID_SCENT = registerEffect("putrid_scent", () -> new ModMobEffect(MobEffectCategory.HARMFUL, 10066278));



    private static <T extends MobEffect> RegistryObject<T> registerEffect(String name, Supplier<T> effect) {
        RegistryObject<T> toReturn = MOB_EFFECT.register(name, effect);
        return toReturn;
    }


    public static void register(IEventBus eventBus) {
        MOB_EFFECT.register(eventBus);
    }
}
