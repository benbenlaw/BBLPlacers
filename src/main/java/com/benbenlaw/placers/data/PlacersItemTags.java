package com.benbenlaw.placers.data;

import com.benbenlaw.placers.Placers;
import com.benbenlaw.placers.item.PlacersItems;
import com.benbenlaw.placers.util.PlacersTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;


public class PlacersItemTags extends ItemTagsProvider {

    PlacersItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags.contentsGetter(), Placers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        //tag(Tags.Items.BRICKS).add(Casting.BLACK_BRICK.asItem());

        //Placers
        tag(PlacersTags.Items.PLACERS)
                .addTag(PlacersTags.Items.IMMERSIVE_ENGINEERING_PLACERS)
        ;

        //Immersive Placers
        tag(PlacersTags.Items.IMMERSIVE_ENGINEERING_PLACERS)
                .add(PlacersItems.ARC_FURNACE_PLACER.get())
                .add(PlacersItems.METAL_PRESS_PLACER.get())
                .add(PlacersItems.CRUSHER_PLACER.get())
                .add(PlacersItems.MIXER_PLACER.get())
                .add(PlacersItems.REFINERY_PLACER.get())
                .add(PlacersItems.BOTTLING_MACHINE_PLACER.get())
                .add(PlacersItems.BLAST_FURNACE_PLACER.get())
                .add(PlacersItems.IMPROVED_BLAST_FURNACE_PLACER.get())
                .add(PlacersItems.FERMENTER_PLACER.get())
                .add(PlacersItems.ASSEMBLER_PLACER.get())
                .add(PlacersItems.AUTO_WORKBENCH_PLACER.get())
                .add(PlacersItems.CHUNK_LOADER_PLACER.get())
                .add(PlacersItems.DIESEL_GENERATOR_PLACER.get())
                .add(PlacersItems.EXCAVATOR_PLACER.get())
                .add(PlacersItems.LIGHTNING_ROD_PLACER.get())
                .add(PlacersItems.RADIO_TOWER_PLACER.get())
                .add(PlacersItems.SAWMILL_PLACER.get())
                .add(PlacersItems.SHEETMETAL_TANK_PLACER.get())
                .add(PlacersItems.SILO_PLACER.get())
                .add(PlacersItems.FERMENTER_PLACER.get())
                .add(PlacersItems.SQUEEZER_PLACER.get())

        ;




    }
}
