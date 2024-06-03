package net.btbob.bensaddons.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SuspiciousEffectHolder;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class SucculentBlock extends DesertBushBlock implements SuspiciousEffectHolder {
    protected static final float AABB_OFFSET = 3.0F;
    protected static final VoxelShape SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D);
    private final List<SuspiciousEffectHolder.EffectEntry> suspiciousStewEffects;

    public SucculentBlock(MobEffect pSuspiciousStewEffect, int pEffectDuration, BlockBehaviour.Properties pProperties) {
        super(pProperties);
        int i;
        if (pSuspiciousStewEffect.isInstantenous()) {
            i = pEffectDuration;
        } else {
            i = pEffectDuration * 20;
        }

        this.suspiciousStewEffects = List.of(new SuspiciousEffectHolder.EffectEntry(pSuspiciousStewEffect, i));    }
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Vec3 vec3 = pState.getOffset(pLevel, pPos);
        return SHAPE.move(vec3.x, vec3.y, vec3.z);
    }

    public List<SuspiciousEffectHolder.EffectEntry> getSuspiciousEffects() {
        return this.suspiciousStewEffects;
    }
}
