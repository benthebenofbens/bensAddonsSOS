package net.btbob.bensaddons.world.effect.custom;

import net.btbob.bensaddons.world.effect.ModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BadTripMobEffect extends MobEffect {
    public BadTripMobEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void onEffectStarted(LivingEntity pLivingEntity, int pAmplifier) {
        super.onEffectStarted(pLivingEntity, pAmplifier);
        if (pLivingEntity.hasEffect(ModMobEffects.PSYCHEDELIA.get())) {
            pLivingEntity.removeEffect(ModMobEffects.PSYCHEDELIA.get());
        }

    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        super.applyEffectTick(pLivingEntity, pAmplifier);
        pLivingEntity.hurt(pLivingEntity.damageSources().wither(), 1F);
        pLivingEntity.removeEffect(ModMobEffects.PSYCHEDELIA.get());
    }
}
