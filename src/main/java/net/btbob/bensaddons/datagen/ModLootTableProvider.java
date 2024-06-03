package net.btbob.bensaddons.datagen;

import net.btbob.bensaddons.datagen.loot.ModBlockLootTables;
import net.btbob.bensaddons.datagen.loot.MushroomBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ModLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTables:: new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(MushroomBlockLootTables:: new, LootContextParamSets.BLOCK)
        ));
    }
}
