package com.benbenlaw.placers.block;

import com.benbenlaw.core.block.brightable.BrightCraftingTable;
import com.benbenlaw.core.block.colored.ColoredSapling;
import com.benbenlaw.placers.Placers;
import com.benbenlaw.placers.item.PlacersItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PlacersBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(Placers.MOD_ID);

    public static final DeferredBlock<Block> IMMERSIVE_MULTIBLOCK_CONTROLLER = registerBlock("immersive_multiblock_controller",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).sound(SoundType.STONE)
                    .noOcclusion()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = (DeferredBlock<T>) BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        PlacersItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }
}
