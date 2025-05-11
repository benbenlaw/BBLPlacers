package com.benbenlaw.placers.data;


import com.benbenlaw.placers.Placers;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Placers.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();


        //generator.addProvider(event.includeServer(), new CastingRecipes(packOutput, event.getLookupProvider()));
//
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(PlacersLootTableProvider::new, LootContextParamSets.BLOCK)), event.getLookupProvider()));
//
//
        PlacersBlockTags blockTags = new PlacersBlockTags(packOutput, lookupProvider, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);

        PlacersItemTags itemTags = new PlacersItemTags(packOutput, lookupProvider, blockTags, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), itemTags);

        generator.addProvider(event.includeClient(), new PlacersItemModelProvider(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new PlacersBlockStatesProvider(packOutput, event.getExistingFileHelper()));

        generator.addProvider(event.includeClient(), new PlacersLangProvider(packOutput, event.getExistingFileHelper()));

        generator.addProvider(event.includeClient(), new PlacersRecipeProvider(packOutput, lookupProvider));



    }


}
