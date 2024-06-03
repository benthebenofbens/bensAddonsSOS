package net.btbob.bensaddons.worldgen.tree;

import net.btbob.bensaddons.BensAddons;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModTreeDecoratorType {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR = DeferredRegister.create(Registries.TREE_DECORATOR_TYPE, BensAddons.MOD_ID);

    public static void register(IEventBus eventBus) {
        TREE_DECORATOR.register(eventBus);
    }
}
