package com.imgood.hyperdimensionaltech.loader;

import com.imgood.hyperdimensionaltech.block.BasicBlocks;
import com.imgood.hyperdimensionaltech.block.BlockRenderFeild;
import com.imgood.hyperdimensionaltech.block.BlockRenderParticleStream;
import com.imgood.hyperdimensionaltech.tiles.rendertiles.TileFeild;
import com.imgood.hyperdimensionaltech.tiles.rendertiles.TileParticleStream;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksLoader {
    public static void loadBlocks() {
        GameRegistry.registerTileEntity(TileFeild.class, "FeildRender");
        GameRegistry.registerTileEntity(TileParticleStream.class, "ParticleStreamRender");
        BasicBlocks.Block_RenderParticleStream = new BlockRenderParticleStream("ht.sud_render");
        BasicBlocks.Block_RenderField = new BlockRenderFeild();

    }
}
