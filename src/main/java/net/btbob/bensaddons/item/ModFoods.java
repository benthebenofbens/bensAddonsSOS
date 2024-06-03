package net.btbob.bensaddons.item;

import net.btbob.bensaddons.util.ModTags;
import net.btbob.bensaddons.world.effect.ModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties EDIBLE_MUSHROOM = new FoodProperties.Builder().nutrition(3).saturationMod(.3f).build();
    public static final FoodProperties INEDIBLE_MUSHROOM = new FoodProperties.Builder().nutrition(1).saturationMod(.3f).effect(() -> new MobEffectInstance(ModMobEffects.MUSHROOM_POISONING.get(), 100,0), .3F).build();
    public static final FoodProperties PSYCHEDELIC_MUSHROOM = new FoodProperties.Builder().nutrition(1).saturationMod(.3f).effect(() -> new MobEffectInstance(ModMobEffects.PSYCHEDELIA.get(), 500,0), 1F).effect(() -> new MobEffectInstance(ModMobEffects.BAD_TRIP.get(), 500,0), 0.1F).build();
    public static final FoodProperties POISON_MUSHROOM = new FoodProperties.Builder().nutrition(1).fast().saturationMod(.3f).effect(() -> new MobEffectInstance(ModMobEffects.MUSHROOM_POISONING.get(), 200, 0), 1f).build();
    public static final FoodProperties DEADLY_MUSHROOM = new FoodProperties.Builder().nutrition(1).fast().saturationMod(.3f).effect(() -> new MobEffectInstance(ModMobEffects.MUSHROOM_POISONING.get(), 500, 0), 1f).build();


    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(4).saturationMod(.3f).build();
    public static final FoodProperties PINEAPPLE = new FoodProperties.Builder().nutrition(8).saturationMod(2f).build();
    public static final FoodProperties COCONUT = new FoodProperties.Builder().nutrition(6).saturationMod(2f).build();


    public static final FoodProperties PRESERVED_MEAT = new FoodProperties.Builder().nutrition(6).saturationMod(2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200,1), .3F).build();
}
