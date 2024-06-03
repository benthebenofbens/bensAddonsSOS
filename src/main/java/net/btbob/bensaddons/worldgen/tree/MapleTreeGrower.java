package net.btbob.bensaddons.worldgen.tree;

import net.btbob.bensaddons.worldgen.ModConfiguredFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class MapleTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?,?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return TreeFeatures.OAK;
    }
}
