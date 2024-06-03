package net.btbob.bensaddons.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.btbob.bensaddons.worldgen.tree.ModFoliagePlacers;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class MapleFoliagePlacer extends FoliagePlacer {

    public static final Codec<MapleFoliagePlacer> CODEC = RecordCodecBuilder.create(mapleFoliagePlacerInstance
            -> foliagePlacerParts(mapleFoliagePlacerInstance).and(Codec.intRange(0, 16).fieldOf("height")
            .forGetter(fp -> fp.height)).apply(mapleFoliagePlacerInstance, MapleFoliagePlacer::new));


    private final int height;

    public MapleFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacers.MAPLE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig,
                                 int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        BlockPos blockpos = pAttachment.pos();
        int h = 3;
        int r = 0;

        while (h > -12) {
            this.placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, blockpos, r, h, pAttachment.doubleTrunk());
            if (h == 1 || h == -1 || h == -2) {
                r += 1;
            } else if (h == -9 || h == -10) {
                r -= 1;
            }
            h -= 1;
        }
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
       //return false;
        //SPRUCE BELOW
       // return pLocalX == pRange && pLocalZ == pRange && pRange > 0;
        //JUNGLE BELOW
        if (pLocalX + pLocalZ >= 2 && pLocalY == 0
        || pLocalX + pLocalZ >= 3 && pLocalY == -2
                || pLocalX + pLocalZ >=3 && pLocalY == -3
                || pLocalX + pLocalZ >=4 && pLocalY == -4
                || pLocalX + pLocalZ >=5 && pLocalY == -5
                || pLocalX + pLocalZ >=5 && pLocalY == -6
                || pLocalX + pLocalZ >=6 && pLocalY == -7
                || pLocalX + pLocalZ >=6 && pLocalY == -8
                || pLocalX + pLocalZ >=5 && pLocalY == -9
                || pLocalX + pLocalZ >=4 && pLocalY == -10
                || pLocalX + pLocalZ >=2 && pLocalY == -11
        ) {
            return true;
        }  else {
            return false;
        }
    }
}
