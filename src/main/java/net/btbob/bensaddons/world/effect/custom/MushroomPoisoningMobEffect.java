package net.btbob.bensaddons.world.effect.custom;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.datagen.ModDamageTypes;
import net.btbob.bensaddons.util.BADamageTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class MushroomPoisoningMobEffect extends MobEffect {
    public MushroomPoisoningMobEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }



    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        super.applyEffectTick(pLivingEntity, pAmplifier);
        pLivingEntity.hurt(pLivingEntity.damageSources().wither(), 1.4F);

    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}
