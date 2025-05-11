package com.benbenlaw.placers.item;

import com.benbenlaw.placers.Placers;
import com.benbenlaw.roomopolis.item.KeyItem;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Optional;

public class PlacersItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Placers.MOD_ID);


    //Immersive placers
    public static final DeferredItem<Item> ARC_FURNACE_PLACER = ITEMS.register("arc_furnace_placer", () -> new KeyItem(new Item.Properties(),
            "placers:arc_furnace", 2, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> METAL_PRESS_PLACER = ITEMS.register("metal_press_placer", () -> new KeyItem(new Item.Properties(),
            "immersiveengineering:multiblocks/metal_press", 1, -1, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> CRUSHER_PLACER = ITEMS.register("crusher_placer", () -> new KeyItem(new Item.Properties(),
            "placers:crusher", 1, -1, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> MIXER_PLACER = ITEMS.register("mixer_placer", () -> new KeyItem(new Item.Properties(),
            "placers:mixer", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> REFINERY_PLACER = ITEMS.register("refinery_placer", () -> new KeyItem(new Item.Properties(),
            "placers:refinery", 1, -1, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> BOTTLING_MACHINE_PLACER = ITEMS.register("bottling_machine_placer", () -> new KeyItem(new Item.Properties(),
            "placers:bottling_machine", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> BLAST_FURNACE_PLACER = ITEMS.register("blast_furnace_placer", () -> new KeyItem(new Item.Properties(),
            "immersiveengineering:multiblocks/blast_furnace", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> IMPROVED_BLAST_FURNACE_PLACER = ITEMS.register("improved_blast_furnace_placer", () -> new KeyItem(new Item.Properties(),
            "placers:improved_blast_furnace", 2, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> FERMENTER_PLACER = ITEMS.register("fermenter_placer", () -> new KeyItem(new Item.Properties(),
            "placers:fermenter", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> ASSEMBLER_PLACER = ITEMS.register("assembler_placer", () -> new KeyItem(new Item.Properties(),
            "placers:assembler", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> AUTO_WORKBENCH_PLACER = ITEMS.register("auto_workbench_placer", () -> new KeyItem(new Item.Properties(),
            "placers:auto_workbench", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> CHUNK_LOADER_PLACER = ITEMS.register("chunk_loader_placer", () -> new KeyItem(new Item.Properties(),
            "placers:chunk_loader", 2, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));
    public static final DeferredItem<Item> DIESEL_GENERATOR_PLACER = ITEMS.register("diesel_generator_placer", () -> new KeyItem(new Item.Properties(),
            "placers:diesel_generator", 1, 1, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> EXCAVATOR_PLACER = ITEMS.register("excavator_placer", () -> new KeyItem(new Item.Properties(),
            "placers:excavator", 1, 3, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> LIGHTNING_ROD_PLACER = ITEMS.register("lightning_rod_placer", () -> new KeyItem(new Item.Properties(),
            "immersiveengineering:multiblocks/lightning_rod", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));

    public static final DeferredItem<Item> RADIO_TOWER_PLACER = ITEMS.register("radio_tower_placer", () -> new KeyItem(new Item.Properties(),
            "placers:radio_tower", 9, 1, "placers:immersive_multiblock_controller",
            false, false, true, true));
    public static final DeferredItem<Item> SAWMILL_PLACER = ITEMS.register("sawmill_placer", () -> new KeyItem(new Item.Properties(),
            "placers:sawmill", 1, -1, "placers:immersive_multiblock_controller",
            false, false, true, true));
    public static final DeferredItem<Item> SHEETMETAL_TANK_PLACER = ITEMS.register("sheetmetal_tank_placer", () -> new KeyItem(new Item.Properties(),
            "immersiveengineering:multiblocks/sheetmetal_tank", 2, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));
   public static final DeferredItem<Item> SILO_PLACER = ITEMS.register("silo_placer", () -> new KeyItem(new Item.Properties(),
            "immersiveengineering:multiblocks/silo", 3, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));
   public static final DeferredItem<Item> SQUEEZER_PLACER = ITEMS.register("squeezer_placer", () -> new KeyItem(new Item.Properties(),
            "placers:squeezer", 1, 0, "placers:immersive_multiblock_controller",
            false, false, true, true));








}
