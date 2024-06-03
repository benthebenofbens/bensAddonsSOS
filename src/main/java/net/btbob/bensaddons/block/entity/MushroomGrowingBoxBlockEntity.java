package net.btbob.bensaddons.block.entity;

import net.btbob.bensaddons.block.nature.MushroomBlocks;
import net.btbob.bensaddons.item.ModItems;
import net.btbob.bensaddons.screen.MushroomGrowingBoxMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MushroomGrowingBoxBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(2);

    private static final int MUSHROOM_INPUT_SLOT = 0;
    private static final int BASE_INPUT_SLOT = 1;
    private static final int FIRST_RESOURCE_INPUT_SLOT = 2;
    private static final int SECOND_RESOURCE_INPUT_SLOT = 3;
    private static final int OUTPUT_SLOT = 4;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;

    public MushroomGrowingBoxBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.MUSHROOM_GROWING_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> MushroomGrowingBoxBlockEntity.this.progress;
                    case 1 -> MushroomGrowingBoxBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch(pIndex) {
                    case 0 -> MushroomGrowingBoxBlockEntity.this.progress = pValue;
                    case 1 -> MushroomGrowingBoxBlockEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };

    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.bensaddons.mushroom_growing_box");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new MushroomGrowingBoxMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("mushroomgrowingboxblockentity.progress", progress);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("mushroomgrowingboxblockentity.progress");
    }


    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        if(hasRecipe()) {
            increaseGrowingProgress();
            setChanged(pLevel,pPos, pState);

            if(hasProgressFinished()) {
                beginGrowing();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void resetProgress() {
        progress = 0;
    }

    private void beginGrowing() {
        ItemStack result = new ItemStack(MushroomBlocks.INDIGO_MILKCAP.get(), 1);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(result.getItem(), this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + result.getCount()));

    }

    private boolean hasProgressFinished() {
        return progress >= maxProgress;
    }

    private void increaseGrowingProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        boolean hasSporeItem = this.itemHandler.getStackInSlot(MUSHROOM_INPUT_SLOT).getItem() == ModItems.INDIGO_MILKCAP_SPORES.get();
        boolean hasBaseItem = this.itemHandler.getStackInSlot(MUSHROOM_INPUT_SLOT).getItem() == Blocks.OAK_WOOD.asItem();
        boolean hasFirstItem = this.itemHandler.getStackInSlot(MUSHROOM_INPUT_SLOT).getItem() == Items.WHEAT;
        boolean hasSecondItem = this.itemHandler.getStackInSlot(MUSHROOM_INPUT_SLOT).getItem() == Items.WHEAT;
        ItemStack result = new ItemStack(ModItems.INDIGO_MILKCAP_ITEM.get());

        return hasSporeItem && hasBaseItem &&hasFirstItem && hasSecondItem && canInsertAmountIntoOutputSlot(result.getCount()) && canInsertItemIntoOutputSlot(result.getItem());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count <= this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
    }
}
