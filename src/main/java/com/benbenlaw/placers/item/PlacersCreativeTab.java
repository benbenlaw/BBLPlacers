package com.benbenlaw.placers.item;

import com.benbenlaw.Roomopolis;
import com.benbenlaw.placers.Placers;
import com.benbenlaw.roomopolis.block.RoomopolisBlocks;
import com.benbenlaw.roomopolis.item.KeyItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PlacersCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Placers.MOD_ID);

    public static final Supplier<CreativeModeTab> PLACERS_TAB = CREATIVE_MODE_TABS.register("placers", () -> CreativeModeTab.builder()
            .icon(() -> PlacersItems.ARC_FURNACE_PLACER.get().asItem().getDefaultInstance())
            .title(Component.translatable("itemGroup.placers"))
            .displayItems((parameters, output) -> {

                PlacersItems.ITEMS.getEntries().forEach(item -> {
                    output.accept(item.get());

                });

            }).build());

}
