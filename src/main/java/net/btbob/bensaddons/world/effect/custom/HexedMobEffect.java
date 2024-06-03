package net.btbob.bensaddons.world.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class HexedMobEffect extends MobEffect {
    public HexedMobEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }



    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        super.applyEffectTick(pLivingEntity, pAmplifier);
        pLivingEntity.setCustomNameVisible(false);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}

