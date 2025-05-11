package com.benbenlaw.placers.data;

import com.benbenlaw.placers.block.PlacersBlocks;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethodStage;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class PlacersLootTableProvider extends VanillaBlockLoot {

    public PlacersLootTableProvider(HolderLookup.Provider provider) {
        super(provider);
    }

    @Override
    protected void generate() {

        this.dropSelf(PlacersBlocks.IMMERSIVE_MULTIBLOCK_CONTROLLER.get());

    }

    @Override
    protected void add(@NotNull Block block, @NotNull LootTable.Builder table) {
        super.add(block, table);
        knownBlocks.add(block);
    }

    private final Set<Block> knownBlocks = new ReferenceOpenHashSet<>();

    @NotNull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }
}
