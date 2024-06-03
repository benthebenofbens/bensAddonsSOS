package net.btbob.bensaddons.world.effect;

import com.google.gson.JsonSyntaxException;
import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.config.BensAddonsClientConfigs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class ModEffectRenderer {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final ResourceLocation PSYCHEDELIA = new ResourceLocation(BensAddons.MOD_ID, "shaders/post/psychedelia.json");
    private static final ResourceLocation STRONG_PSYCHEDELIA = new ResourceLocation(BensAddons.MOD_ID, "shaders/post/strong_psychedelia.json");
    private static final ResourceLocation BAD_TRIP = new ResourceLocation(BensAddons.MOD_ID, "shaders/post/bad_trip.json");
    private static final ResourceLocation STRONG_BAD_TRIP = new ResourceLocation(BensAddons.MOD_ID, "shaders/post/strong_bad_trip.json");

    private static PostChain psychedeliaShader;
    private static PostChain strongPsychedeliaShader;
    private static PostChain badTripShader;
    private static PostChain strongBadTripShader;

    private static int lastWidth = 0;
    private static int lastHeight = 0;
    private static boolean lastSetting = false;
    private static PostChain lastShader = null;

    public static void renderMushroomEffect(float renderTickTime) {
        LocalPlayer player = Minecraft.getInstance().player;

        if (player != null) {
            makeShaders();

            PostChain activeShader = null;
            if (player.hasEffect(ModMobEffects.PSYCHEDELIA.get()) && lastSetting == false && !player.hasEffect(ModMobEffects.BAD_TRIP.get())) {
                activeShader = psychedeliaShader;
            } else if (player.hasEffect(ModMobEffects.PSYCHEDELIA.get()) && lastSetting == true && !player.hasEffect(ModMobEffects.BAD_TRIP.get())) {
                activeShader = strongPsychedeliaShader;
            } else if (player.hasEffect(ModMobEffects.BAD_TRIP.get()) && lastSetting == false) {
                activeShader = badTripShader;
            } else if (player.hasEffect(ModMobEffects.BAD_TRIP.get()) && lastSetting == true) {
                activeShader = strongBadTripShader;
            }
            if (activeShader != null) {
                if(lastShader != activeShader) {
                    lastShader = activeShader;
                    lastWidth = 0;
                    lastHeight = 0;
                    lastSetting = false;
                }
                updateShaderGroupSize(activeShader);
                activeShader.process(renderTickTime);
                Minecraft.getInstance().getMainRenderTarget().bindWrite(false);
            }
        }

    }



    private static PostChain createShaderGroup(ResourceLocation location) {
        try {
            Minecraft mc = Minecraft.getInstance();
            return new PostChain(mc.getTextureManager(), mc.getResourceManager(), mc.getMainRenderTarget(), location);
        } catch (IOException ioexception) {
            LOGGER.warn("Failed to load shader: {}", location, ioexception);
        } catch (JsonSyntaxException jsonsyntaxexception) {
            LOGGER.warn("Failed to parse shader: {}", location, jsonsyntaxexception);
        }
        return null;
    }

    private static void makeShaders() {
        if (psychedeliaShader == null) {
            psychedeliaShader = createShaderGroup(PSYCHEDELIA);
        }
        if(strongPsychedeliaShader == null) {
            strongPsychedeliaShader = createShaderGroup(STRONG_PSYCHEDELIA);
        }
        if(badTripShader == null) {
            badTripShader = createShaderGroup(BAD_TRIP);
        }
        if(strongBadTripShader == null) {
            strongBadTripShader = createShaderGroup(STRONG_BAD_TRIP);
        }
    }

    private static void updateShaderGroupSize(PostChain shaderGroup) {
        if (shaderGroup != null) {
            Minecraft mc = Minecraft.getInstance();
            int width = mc.getWindow().getWidth();
            int height = mc.getWindow().getHeight();
            if (width != lastWidth || height != lastHeight) {
                lastWidth = width;
                lastHeight = height;
                shaderGroup.resize(width, height);
            }
            boolean setting = BensAddonsClientConfigs.TRUE_PSYCHEDELIA.get();

            if (setting != lastSetting) {
                lastSetting = setting;
            }
        }
    }
}
