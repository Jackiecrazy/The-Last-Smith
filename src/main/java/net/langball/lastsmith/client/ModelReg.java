package net.langball.lastsmith.client;

import cofh.CoFHCore;
import ic2.core.IC2;
import mods.flammpfeil.slashblade.tileentity.DummyTileEntity;
import net.langball.lastsmith.blade.BladeLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumcraft.Thaumcraft;

public class ModelReg {
	static final ModelResourceLocation modelLoc = new ModelResourceLocation("flammpfeil.slashblade:model/named/blade.obj");
    public static final ModelResourceLocation dummyLoc = new ModelResourceLocation("flammpfeil.slashblade:emptymodel");

    public ModelReg() {
        Slashblade_model(BladeLoader.blade);
        Slashblade_model(BladeLoader.bladeNamed);
        
        Slashblade_model(BladeLoader.wrapper);
        Slashblade_model(BladeLoader.wrapper_bamboo);
        if(Loader.isModLoaded(IC2.MODID)) Slashblade_model(BladeLoader.euBlade);
        if(Loader.isModLoaded(CoFHCore.MOD_ID)) Slashblade_model(BladeLoader.rfblade);
        if(Loader.isModLoaded(Thaumcraft.MODID)){
            Slashblade_model(BladeLoader.thaumiumBlade);
            Slashblade_model(BladeLoader.windBlade);
            Slashblade_model(BladeLoader.voidBlade);
            Slashblade_model(BladeLoader.crimsonBlade);
        }
    }
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }

    @SuppressWarnings("deprecation")
	public static void Slashblade_model(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, modelLoc);
        ForgeHooksClient.registerTESRItemStack(item, 0, DummyTileEntity.class);
  	}
    
}
