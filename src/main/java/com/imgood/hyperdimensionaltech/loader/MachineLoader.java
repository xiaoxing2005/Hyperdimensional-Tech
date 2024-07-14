package com.imgood.hyperdimensionaltech.loader;

import com.imgood.hyperdimensionaltech.HyperdimensionalTech;
import com.imgood.hyperdimensionaltech.block.BasicBlocks;
import com.imgood.hyperdimensionaltech.machines.HT_UniversalMineralProcessor;
import com.imgood.hyperdimensionaltech.machines.MachineBase.HT_MultiMachineBase;
import com.imgood.hyperdimensionaltech.machines.machineaAttributes.HT_MachineConstrucs;
import com.imgood.hyperdimensionaltech.machines.HT_SingularityUnravelingDevice;
import com.imgood.hyperdimensionaltech.machines.machineaAttributes.HT_MachineTextureBuilder;
import com.imgood.hyperdimensionaltech.machines.machineaAttributes.HT_MachineTooltips;
import com.imgood.hyperdimensionaltech.recipemap.HT_RecipeMap;
import net.minecraft.item.ItemStack;

import com.imgood.hyperdimensionaltech.HT_ItemList;
import com.imgood.hyperdimensionaltech.machines.HT_HyperdimensionalResonanceEvolver;
import com.imgood.hyperdimensionaltech.utils.HTTextLocalization;

public class MachineLoader {

    public static ItemStack HyperdimensionalResonanceEvolver;
    public static ItemStack SingularityUnravelingDevice;
    public static ItemStack UniversalMineralProcessor;

    public static void loadMachines() {

        //region Machine Base
        HyperdimensionalResonanceEvolver = new HT_HyperdimensionalResonanceEvolver(
            10000,
            "NameHyperdimensionalResonanceEvolver",
            HTTextLocalization.NameHyperdimensionalResonanceEvolver).getStackForm(1);
        HT_ItemList.HyperdimensionalResonanceEvolver.set(HyperdimensionalResonanceEvolver);
        //endregion
        //region Lite Machine Base
        SingularityUnravelingDevice = new HT_SingularityUnravelingDevice(
            10001,
            "SingularityUnravelingDevice",
            HTTextLocalization.NameSingularityUnravelingDevice,
            HT_MachineConstrucs.CONSTRUCTOR_SingularrityUnravelingDevice,
            HT_RecipeMap.HyperdimensionalResonanceEvolverRecipes,
            false,
            (byte)0,
            new HT_MachineTooltips().getTooltip("SingularityUnravelingDevice"),
            5, 5, 5,
            BasicBlocks.Block_HRERender,
            false,
            31,16,3).getStackForm(1);
            HT_ItemList.SingularityUnravelingDevice.set(SingularityUnravelingDevice);
        UniversalMineralProcessor = new HT_UniversalMineralProcessor(10002,
            "UniversalMineralProcessor",
            HTTextLocalization.NameUniversalMineralProcessor)
            .setConstructor(HT_MachineConstrucs.CONSTRUCTOR_SingularrityUnravelingDevice)
            .setTooltipBuilder(new HT_MachineTooltips().getTooltip("SingularityUnravelingDevice"))
            .getStackForm(1);
        HT_ItemList.SingularityUnravelingDevice.set(UniversalMineralProcessor);
        //endregion
    }

    public static void loadMachinePostInit() {

    }
}
