package net.btbob.bensaddons.util.color;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.block.ModBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BensAddons.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModColorHandler {

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, tintIndex) -> {
                    BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return event.getBlockColors().getColor(state, null, null, tintIndex); },
                ModBlocks.GRASSY_PEAT.get(), ModBlocks.OAK_LEAF_PILE.get(), ModBlocks.ACACIA_LEAF_PILE.get(), ModBlocks.DARK_OAK_LEAF_PILE.get(), ModBlocks.JUNGLE_LEAF_PILE.get(),
                ModBlocks.SPRUCE_LEAF_PILE.get(), ModBlocks.BIRCH_LEAF_PILE.get(), ModBlocks.PALM_LEAVES.get(), ModBlocks.PALM_LEAF_PILE.get(), ModBlocks.MANGROVE_LEAF_PILE.get());
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
    //GRASS
        event.getBlockColors().register((state,world,pos,tintIndex) ->
                world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D),
                ModBlocks.GRASSY_PEAT.get()
                );
    //NORMAL FOLIAGE
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.OAK_LEAF_PILE.get(), ModBlocks.ACACIA_LEAF_PILE.get(), ModBlocks.DARK_OAK_LEAF_PILE.get(), ModBlocks.JUNGLE_LEAF_PILE.get());
    //EVERGREEN FOLIAGE
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getEvergreenColor(),
                ModBlocks.SPRUCE_LEAF_PILE.get());
    //BIRCH FOLIAGE
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getBirchColor(),
                ModBlocks.BIRCH_LEAF_PILE.get(), ModBlocks.PALM_LEAVES.get(), ModBlocks.PALM_LEAF_PILE.get());
    //MANGROVE FOLIAGE
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getMangroveColor(),
                ModBlocks.MANGROVE_LEAF_PILE.get());
    }
}
