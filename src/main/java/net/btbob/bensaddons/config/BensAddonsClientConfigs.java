package net.btbob.bensaddons.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BensAddonsClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> TRUE_PSYCHEDELIA;

    static {
        BUILDER.push("Configs for Bens Addons");

        //DEFINE CONFIGS

        TRUE_PSYCHEDELIA = BUILDER.comment("Stronger Psychedelia Effects.").define("Psychedelia Effect Active", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
