package com.benbenlaw.placers.data;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import blusunrize.immersiveengineering.common.register.IEBlocks;
import blusunrize.immersiveengineering.common.register.IEItems;
import com.benbenlaw.core.tag.CommonTags;
import com.benbenlaw.core.tag.ResourceNames;
import com.benbenlaw.placers.Placers;
import com.benbenlaw.placers.block.PlacersBlocks;
import com.benbenlaw.placers.item.PlacersItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

import static com.benbenlaw.core.tag.CommonTags.ResourceType.DUSTS;
import static com.benbenlaw.core.tag.CommonTags.ResourceType.PLATES;
import static com.benbenlaw.core.tag.ResourceNames.IRON;
import static com.benbenlaw.core.tag.ResourceNames.STEEL;

public class PlacersRecipeProvider extends RecipeProvider {

    public PlacersRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        createHammerShapelessRecipe(consumer, PlacersBlocks.IMMERSIVE_MULTIBLOCK_CONTROLLER.toStack(), Items.FURNACE, "controller");

        createHammerShapelessRecipe(consumer, PlacersItems.ASSEMBLER_PLACER.toStack(), Items.CRAFTING_TABLE, "assembler_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.METAL_PRESS_PLACER.toStack(), CommonTags.getTag(IRON, PLATES), "metal_press_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.ARC_FURNACE_PLACER.toStack(), CommonTags.getTag(STEEL, PLATES), "arc_furnace_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.CRUSHER_PLACER.toStack(), CommonTags.getTag(IRON, DUSTS), "crusher_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.MIXER_PLACER.toStack(), IEBlocks.MetalDevices.FLUID_PIPE, "mixer_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.REFINERY_PLACER.toStack(), IEBlocks.MetalDecoration.ENGINEERING_HEAVY, "refinery_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.BOTTLING_MACHINE_PLACER.toStack(), Items.GLASS_BOTTLE, "bottling_machine_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.BLAST_FURNACE_PLACER.toStack(), IEBlocks.StoneDecoration.BLASTBRICK, "blast_furnace_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.IMPROVED_BLAST_FURNACE_PLACER.toStack(), IEBlocks.StoneDecoration.BLASTBRICK_REINFORCED, "improved_blast_furnace_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.FERMENTER_PLACER.toStack(), Items.CAULDRON, "fermenter_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.AUTO_WORKBENCH_PLACER.toStack(), IEBlocks.WoodenDevices.CRAFTING_TABLE, "auto_workbench_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.CHUNK_LOADER_PLACER.toStack(), Items.SCULK, "chunk_loader_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.DIESEL_GENERATOR_PLACER.toStack(), IEItems.Misc.JERRYCAN, "diesel_generator_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.EXCAVATOR_PLACER.toStack(), Items.IRON_PICKAXE, "excavator_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.LIGHTNING_ROD_PLACER.toStack(), Items.LIGHTNING_ROD, "lightning_rod_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.RADIO_TOWER_PLACER.toStack(), IEBlocks.StoneDecoration.CONCRETE, "radio_tower_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.SAWMILL_PLACER.toStack(), Items.OAK_LOG, "sawmill_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.SHEETMETAL_TANK_PLACER.toStack(), IEBlocks.WoodenDecoration.TREATED_FENCE, "sheetmetal_tank_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.SILO_PLACER.toStack(), BuiltInRegistries.ITEM.get(ResourceLocation.parse("immersiveengineering:sheetmetal_iron")).getDefaultInstance().getItem(), "silo_placer");
        createHammerShapelessRecipe(consumer, PlacersItems.SQUEEZER_PLACER.toStack(), Tags.Items.SEEDS, "squeezer_placer");







    }

    public void createHammerShapelessRecipe(RecipeOutput consumer, ItemStack result, ItemLike item, String id) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, result)
                .requires(IEItems.Tools.HAMMER.get())
                .requires(item)
                .unlockedBy("has_item", has(IEItems.Tools.HAMMER.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Placers.MOD_ID, "immersive_engineering/" + id));

    }

    public void createHammerShapelessRecipe(RecipeOutput consumer, ItemStack result, TagKey<Item> item, String id) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, result)
                .requires(IEItems.Tools.HAMMER.get())
                .requires(item)
                .unlockedBy("has_item", has(IEItems.Tools.HAMMER.get()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(Placers.MOD_ID, "immersive_engineering/" + id));

    }
}





