package com.imgood.hyperdimensionaltech.block;

import com.imgood.hyperdimensionaltech.tiles.rendertiles.TileFeild;
import com.imgood.hyperdimensionaltech.tiles.rendertiles.TileParticleStream;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.ArrayList;

import static com.imgood.hyperdimensionaltech.utils.Enums.MOD;

/**
 * @program: Hyperdimensional-Tech
 * @description: SUD特效
 * @author: Imgood
 * @create: 2024-07-17 13:35
 **/
public class BlockRenderParticleStream extends Block {
    String textureFile;
    String objFile;

    public BlockRenderParticleStream() {
        super(Material.iron);
        this.setResistance(20f);
        this.setHardness(-1.0f);
        this.setBlockName("ht.sud_render");
        this.setLightLevel(100.0f);
        GameRegistry.registerBlock(this, getUnlocalizedName());
    }

    public BlockRenderParticleStream(String blockRenderId, String textureFile, String objFile) {
        super(Material.iron);
        this.setResistance(20f);
        this.setHardness(-1.0f);
        this.setBlockName(blockRenderId);
        this.setLightLevel(100.0f);
        this.textureFile = textureFile;
        this.objFile = objFile;
        GameRegistry.registerBlock(this, getUnlocalizedName());
    }

    public BlockRenderParticleStream(String blockRenderId) {
        super(Material.iron);
        this.setResistance(20f);
        this.setHardness(-1.0f);
        this.setBlockName(blockRenderId);
        this.setLightLevel(100.0f);
        GameRegistry.registerBlock(this, getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(MOD.ID + ":TRANSPARENT");
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean canRenderInPass(int a) {
        return true;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileParticleStream();
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune) {
        return new ArrayList<>();
    }
}
