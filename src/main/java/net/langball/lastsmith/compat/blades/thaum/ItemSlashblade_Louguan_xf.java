package net.langball.lastsmith.compat.blades.thaum;

import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.named.event.LoadEvent.InitEvent;
import net.langball.lastsmith.Last_worker;
import net.langball.lastsmith.blade.BladeLoader;
import net.langball.lastsmith.blade.ItemSlashBladeNamedSS;
import net.langball.lastsmith.recipe.InfusionRecipeAwakeBlade;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.items.ItemsTC;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.lib.enchantment.EnumInfusionEnchantment;

public class ItemSlashblade_Louguan_xf {
	   @SubscribeEvent
	   public void init(InitEvent event) {
		   
	      String name = "flammpfeil.slashblade.named.roukan_xf";
	      String name2 = "flammpfeil.slashblade.named.roukan";
	      ItemStack customblade = new ItemStack(BladeLoader.windBlade, 1, 0);
	      NBTTagCompound tag = new NBTTagCompound();
	      customblade.setTagCompound(tag);
	      ItemSlashBladeNamedSS.CurrentItemName.set(tag, name);
	      ItemSlashBladeNamedSS.CustomMaxDamage.set(tag, Integer.valueOf(50));
	      ItemSlashBlade.setBaseAttackModifier(tag, 6.0F + ToolMaterial.IRON.getAttackDamage());
	      ItemSlashBladeNamedSS.IsDefaultBewitched.set(tag, Boolean.valueOf(true));
	      ItemSlashBlade.TextureName.set(tag, "named/louguan/texture_xf");
	      ItemSlashBlade.ModelName.set(tag, "named/louguan/model");
	      ItemSlashBlade.SpecialAttackType.set(tag, Integer.valueOf(3));
	      BladeLoader.registerCustomItemStack(name, customblade);
	      ItemSlashBladeNamedSS.NamedBlades.add(name);
	      customblade.addEnchantment(Enchantments.POWER, 3);
	      customblade.addEnchantment(Enchantments.SHARPNESS, 7);
	      EnumInfusionEnchantment.addInfusionEnchantment(customblade, EnumInfusionEnchantment.ARCING, 3);
	      ItemStack blade=BladeLoader.findItemStack(Last_worker.MODID,name2,1);
	      NBTTagCompound reqTag = ItemSlashBlade.getItemTagCompound(blade);
	      ItemSlashBlade.KillCount.set(reqTag, Integer.valueOf(2500));
	      ItemSlashBlade.ProudSoul.set(reqTag, Integer.valueOf(25000));
	      ItemSlashBlade.RepairCount.set(reqTag, Integer.valueOf(5));
	      
		  ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation(Last_worker.MODID,name), new InfusionRecipeAwakeBlade("ROUKANSENPUUZIN",BladeLoader.findItemStack(Last_worker.MODID,name,1), 1, new AspectList()
		    	      .add(Aspect.ENERGY, 90).add(Aspect.SOUL, 90).add(Aspect.AVERSION,90),blade, 
		    	      new Object[] {
		    	    		  SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.ProudSoulStr, 1)
		    	    		 ,SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.ProudSoulStr, 1)
		    	    		 ,SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.IngotBladeSoulStr, 1)
		    	    		 ,SlashBlade.findItemStack("flammpfeil.slashblade", SlashBlade.IngotBladeSoulStr, 1)
		    	    		 , new ItemStack(ItemsTC.nuggets, 1, 10)
		    	    		 , ConfigItems.AIR_CRYSTAL
		    	    		 }
			));


	   }

}
