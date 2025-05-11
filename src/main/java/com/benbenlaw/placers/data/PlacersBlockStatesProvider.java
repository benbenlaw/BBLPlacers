package com.benbenlaw.placers.data;


import com.benbenlaw.placers.Placers;
import com.benbenlaw.placers.block.PlacersBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class PlacersBlockStatesProvider extends BlockStateProvider {

    public PlacersBlockStatesProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Placers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Blocks
        sidedBlock(PlacersBlocks.IMMERSIVE_MULTIBLOCK_CONTROLLER.get(),
                "placers:block/immersive_multiblock_controller_top", "placers:block/immersive_multiblock_controller");


    }


    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void sidedBlock(Block sidedBlock, String defaultTexture, String sideTexture) {

        ResourceLocation craftingTableRegistryName = BuiltInRegistries.BLOCK.getKey(sidedBlock);
        ResourceLocation texture = ResourceLocation.parse(defaultTexture);
        ResourceLocation textureSide = ResourceLocation.parse(sideTexture + "_side");


        ModelFile cubeSides = models().withExistingParent(craftingTableRegistryName.getPath(), "minecraft:block/cube_all")
                .texture("down", texture)
                .texture("up", texture)
                .texture("north", textureSide)
                .texture("south", textureSide)
                .texture("west", textureSide)
                .texture("east", textureSide)
                .texture("particle", textureSide)
                .renderType("cutout");

        simpleBlockItem(sidedBlock, cubeSides);

        getVariantBuilder(sidedBlock).forAllStatesExcept(state ->
                ConfiguredModel.builder().modelFile(cubeSides).build());


    }


    @Override
    public String getName() {
        return Placers.MOD_ID + " Block States";
    }
}
