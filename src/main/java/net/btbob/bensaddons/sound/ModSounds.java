package net.btbob.bensaddons.sound;

import net.btbob.bensaddons.BensAddons;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BensAddons.MOD_ID);

    public static final RegistryObject<SoundEvent> WET_HANDS_DISC = registerSoundEvents("wet_hands_disc");
    public static final RegistryObject<SoundEvent> MINECRAFT_DISC = registerSoundEvents("minecraft_disc");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) { return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(BensAddons.MOD_ID, name))); }

    public static void register(IEventBus eventBus) {SOUND_EVENTS.register(eventBus);}
}
