package com.benbenlaw.placers.util;

import com.benbenlaw.core.util.CoreTags;
import com.benbenlaw.placers.Placers;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class PlacersTags {
    public static class Blocks extends CoreTags.Blocks {

        //Blocks
    }

    public static class Items extends CoreTags.Items {
        //Items
        public static final TagKey<Item> PLACERS = tag(Placers.MOD_ID, "placers");
        public static final TagKey<Item> IMMERSIVE_ENGINEERING_PLACERS = tag(Placers.MOD_ID, "placers/immersive_engineering");
    }


}
