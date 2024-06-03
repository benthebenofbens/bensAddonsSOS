package net.btbob.bensaddons.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

public class VanillaMushroomBlockItem extends BlockItem {
    String name;
    public VanillaMushroomBlockItem(Block pBlock, Properties pProperties, String displayName) {
        super(pBlock, pProperties);
        displayName = name;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }
    public MutableComponent getDisplayName() {
        return Component.translatable(name);
    }

}
