package net.btbob.bensaddons.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BensAddonsCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    static {
        BUILDER.push("Configs for Bens Addons");

        //DEFINE CONFIGS

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
