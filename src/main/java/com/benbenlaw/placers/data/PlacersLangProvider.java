package com.benbenlaw.placers.data;

import com.benbenlaw.placers.Placers;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PlacersLangProvider extends LanguageProvider {

    public PlacersLangProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Placers.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        //Creative Tab
        add("itemGroup.placers", "Placers");

        //Blocks
        addBlockTranslation("immersive_multiblock_controller", "Immersive Multiblock Controller");

        //Placers
        addItemTranslation("arc_furnace_placer", "Arc Furnace Placer");
        addItemTranslation("blast_furnace_placer", "Blast Furnace Placer");
        addItemTranslation("improved_blast_furnace_placer", "Improved Blast Furnace Placer");
        addItemTranslation("metal_press_placer", "Metal Press Placer");
        addItemTranslation("crusher_placer", "Crusher Placer");
        addItemTranslation("mixer_placer", "Mixer Placer");
        addItemTranslation("refinery_placer", "Refinery Placer");
        addItemTranslation("bottling_machine_placer", "Bottling Machine Placer");
        addItemTranslation("fermenter_placer", "Fermenter Placer");
        addItemTranslation("squeezer_placer", "Squeezer Placer");
        addItemTranslation("sawmill_placer", "Sawmill Placer");
        addItemTranslation("sheetmetal_tank_placer", "Sheetmetal Tank Placer");
        addItemTranslation("silo_placer", "Silo Placer");
        addItemTranslation("assembler_placer", "Assembler Placer");
        addItemTranslation("auto_workbench_placer", "Auto Workbench Placer");
        addItemTranslation("chunk_loader_placer", "Chunk Loader Placer");
        addItemTranslation("diesel_generator_placer", "Diesel Generator Placer");
        addItemTranslation("excavator_placer", "Excavator Placer");
        addItemTranslation("radio_tower_placer", "Radio Tower Placer");
        addItemTranslation("lightning_rod_placer", "Lightning Rod Placer");
    }

    private void addItemTranslation(String name, String translation) {
        add("item." + Placers.MOD_ID + "." + name, translation);
    }
    private void addBlockTranslation(String name, String translation) {
        add("block." + Placers.MOD_ID + "." + name, translation);
    }

    private void addChatTranslation(String name, String translation) {
        add("chat." + Placers.MOD_ID + "." + name, translation);
    }

}
