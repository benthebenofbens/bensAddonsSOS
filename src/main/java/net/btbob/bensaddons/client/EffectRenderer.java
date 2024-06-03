package net.btbob.bensaddons.client;

import net.btbob.bensaddons.world.effect.ModEffectRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class EffectRenderer {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onRender(TickEvent.RenderTickEvent event) {
        if(event == null || event.phase != TickEvent.Phase.END) {
            return;
        }
        ModEffectRenderer.renderMushroomEffect(event.renderTickTime);
    }
}
