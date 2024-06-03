package net.btbob.bensaddons.event;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.entity.ModEntities;
import net.btbob.bensaddons.entity.custom.SpookEntity;
import net.btbob.bensaddons.world.effect.ModMobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.client.event.RenderNameTagEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BensAddons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
   public static void registerAttributes(EntityAttributeCreationEvent event) {
       event.put(ModEntities.SPOOK.get(), SpookEntity.createAttributes().build());
   }

}
