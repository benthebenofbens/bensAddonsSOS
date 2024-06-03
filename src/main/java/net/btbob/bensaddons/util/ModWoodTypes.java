package net.btbob.bensaddons.util;

import net.btbob.bensaddons.BensAddons;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType MAPLE = WoodType.register(new WoodType(BensAddons.MOD_ID + ":maple", BlockSetType.OAK));
    public static final WoodType PALM = WoodType.register(new WoodType(BensAddons.MOD_ID + ":palm", BlockSetType.ACACIA));
    public static final WoodType BAOBAB = WoodType.register(new WoodType(BensAddons.MOD_ID + ":baobab", BlockSetType.ACACIA));
}
