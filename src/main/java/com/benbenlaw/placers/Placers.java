package com.benbenlaw.placers;

import com.benbenlaw.placers.block.PlacersBlocks;
import com.benbenlaw.placers.item.PlacersCreativeTab;
import com.benbenlaw.placers.item.PlacersItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Placers.MOD_ID)
public class Placers {
    public static final String MOD_ID = "placers";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Placers(final IEventBus eventBus, final ModContainer modContainer) {

        PlacersBlocks.BLOCKS.register(eventBus);
        PlacersItems.ITEMS.register(eventBus);
        PlacersCreativeTab.CREATIVE_MODE_TABS.register(eventBus);

    }
}
