package com.benbenlaw.placers.data;

import com.benbenlaw.placers.Placers;
import com.benbenlaw.placers.item.PlacersItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.loaders.DynamicFluidContainerModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;


public class PlacersItemModelProvider extends ItemModelProvider {

    public PlacersItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Placers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Molds
        simpleItem(PlacersItems.ARC_FURNACE_PLACER);
        simpleItem(PlacersItems.METAL_PRESS_PLACER);
        simpleItem(PlacersItems.CRUSHER_PLACER);
        simpleItem(PlacersItems.MIXER_PLACER);
        simpleItem(PlacersItems.REFINERY_PLACER);
        simpleItem(PlacersItems.BOTTLING_MACHINE_PLACER);
        simpleItem(PlacersItems.BLAST_FURNACE_PLACER);
        simpleItem(PlacersItems.IMPROVED_BLAST_FURNACE_PLACER);
        simpleItem(PlacersItems.FERMENTER_PLACER);
        simpleItem(PlacersItems.ASSEMBLER_PLACER);
        simpleItem(PlacersItems.AUTO_WORKBENCH_PLACER);
        simpleItem(PlacersItems.CHUNK_LOADER_PLACER);
        simpleItem(PlacersItems.DIESEL_GENERATOR_PLACER);
        simpleItem(PlacersItems.EXCAVATOR_PLACER);
        simpleItem(PlacersItems.LIGHTNING_ROD_PLACER);
        simpleItem(PlacersItems.RADIO_TOWER_PLACER);
        simpleItem(PlacersItems.SAWMILL_PLACER);
        simpleItem(PlacersItems.SHEETMETAL_TANK_PLACER);
        simpleItem(PlacersItems.SILO_PLACER);
        simpleItem(PlacersItems.FERMENTER_PLACER);
        simpleItem(PlacersItems.SQUEEZER_PLACER);





    }

    private void simpleItem(DeferredItem<Item> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Placers.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Placers.MOD_ID,"item/" + item.getId().getPath()));
    }


    @Override
    public String getName() {
        return Placers.MOD_ID + " Item Models";
    }
}
