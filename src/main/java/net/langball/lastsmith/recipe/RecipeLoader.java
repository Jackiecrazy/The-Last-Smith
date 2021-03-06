package net.langball.lastsmith.recipe;

import mods.flammpfeil.slashblade.RecipeUpgradeBlade;
import mods.flammpfeil.slashblade.SlashBlade;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.item.crafting.BladeIngredient;
import net.langball.lastsmith.ConfigLoader;
import net.langball.lastsmith.blade.BladeLoader;
import net.langball.lastsmith.blocks.BlastRecipes;
import net.langball.lastsmith.blocks.BlockLoader;
import net.langball.lastsmith.items.ItemLoader;
import net.langball.lastsmith.util.RecipesUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.ForgeRegistry;

public class RecipeLoader {

	public RecipeLoader() {
		
		 ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		 recipeRegistry.remove(new ResourceLocation(SlashBlade.modid,"recipexes"));
		 recipeRegistry.remove(new ResourceLocation(SlashBlade.modid,"bamboolight"));
		 recipeRegistry.remove(new ResourceLocation(SlashBlade.modid,"white"));
		 recipeRegistry.remove(new ResourceLocation(SlashBlade.modid,"white2"));
		 recipeRegistry.remove(new ResourceLocation(SlashBlade.modid,"white3"));

		RecipesUtil.addRecipe("hammer", new ShapedOreRecipe(new ResourceLocation(""), ItemLoader.hammer, new Object[]{
				" I "," LI","L  ",'I',"ingotIron",'L',"logWood"
		}));
		RecipesUtil.addRecipe("blast", new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.BlastItem, new Object[]{
				"BBB","BFB","BIB",'I',"blockIron",'B',Blocks.BRICK_BLOCK,'F',Blocks.FURNACE
		}));
		RecipesUtil.addRecipe("blast_top", new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.BlastTopItem, new Object[]{
				"BIB","BIB","BIB",'I',"blockIron",'B',Blocks.BRICK_BLOCK
		}));
		
		RecipesUtil.addRecipe("casket", new ShapedOreRecipe(new ResourceLocation(""), BlockLoader.CasketItem, new Object[]{
				"BIB","BPB","B B",'I',Items.WATER_BUCKET,'B',"logWood",'P',"plankWood"
		}));
		RecipesUtil.addRecipe("yakibatsuchi", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,5), new Object[]{Items.CLAY_BALL,"dustCoal","dustCoal"}));
		RecipesUtil.addRecipe("coal_dust", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,6), new Object[]{ItemLoader.hammer,"gemCoal"}));
		
		RecipesUtil.addRecipe("paper_arthurs", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,11), new Object[]{
				"BBB","BIB","BBB",'B',new ItemStack(ItemLoader.material,1,8),'I',"paper"
		}));
		RecipesUtil.addRecipe("sakura_ingot_unfinished", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,9), new Object[]{
				"BFB","FIF","BFB",'B',new ItemStack(ItemLoader.material,1,8),'I',SlashBlade.findItemStack("flammpfeil.slashblade",SlashBlade.IngotBladeSoulStr, 1),'F',SlashBlade.findItemStack("flammpfeil.slashblade",SlashBlade.ProudSoulStr, 1)
		}));
		BlastRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.material,1,9), new ItemStack(ItemLoader.material,1,10), 0F);
		RecipesUtil.addRecipe("sakura_full", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,8), new Object[]{
				"BBB","BIB","BBB",'B',new ItemStack(ItemLoader.material,1,7),'I',SlashBlade.findItemStack("flammpfeil.slashblade",SlashBlade.ProudSoulStr, 1)
		}));
		if(!ConfigLoader.steel){
		BlastRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.material,1,0), new ItemStack(ItemLoader.material,1,1), 0F);
		RecipesUtil.addRecipe("steel_ingot", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,2), new Object[]{ItemLoader.hammer,new ItemStack(ItemLoader.material,1,1),new ItemStack(ItemLoader.material,1,1)}));
		RecipesUtil.addRecipe("crushed_iron", new ShapelessOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.material,1,0), new Object[]{ItemLoader.hammer,"oreIron"}));
	}
		RecipesUtil.addRecipe("red_dye", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(Items.DYE,1,1), new Object[]{new ItemStack(ItemLoader.material,1,7),new ItemStack(ItemLoader.material,1,7)}));
		
		RecipesUtil.addRecipe("wooden_blade", new ShapedOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.material,1,3), new Object[]{
				" PP","PP ","L  ",'P',"plankWood",'L',"logWood"
		}));
		RecipesUtil.addRecipe("wooden_saya", new ShapedOreRecipe(new ResourceLocation(""),BladeLoader.wrapper, new Object[]{
				" PL","PLP","LP ",'P',"plankWood",'L',"logWood"
		}));
		SlashBlade.addRecipe("slashbladeWood",new ShapedOreRecipe(new ResourceLocation(SlashBlade.modid,"recipexes"), new ItemStack(SlashBlade.bladeWood) , new Object[]{
				"  W"," B ","L  ",Character.valueOf('W'),BladeLoader.wrapper,Character.valueOf('B'),new ItemStack(ItemLoader.material,1,3),Character.valueOf('L'),"logWood"
		}));
		
		RecipesUtil.addRecipe("blade_unfinished", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,3), new Object[]{
				" PP","PP ","L H",'P',"ingotIron",'L',SlashBlade.findItemStack("flammpfeil.slashblade", "ingot_bladesoul", 1),'H',ItemLoader.hammer
		}));
		RecipesUtil.addRecipe("blade_2_unfinished", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,4), new Object[]{
				" IP","IP ","L H",'I',"ingotSteel",'P',"ingotIron",'L',SlashBlade.findItemStack("flammpfeil.slashblade", "ingot_bladesoul", 1),'H',ItemLoader.hammer
		}));
		RecipesUtil.addRecipe("blade_3_unfinished", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,5), new Object[]{
				" LP","LP ","L H",'P',"ingotIron",'L',SlashBlade.findItemStack("flammpfeil.slashblade", "ingot_bladesoul", 1),'H',ItemLoader.hammer
		}));
		RecipesUtil.addRecipe("blade_unfinished_2", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,6), new Object[]{
				"  I"," I ","B H",'I',"ingotIron",'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,3)
		}));
		RecipesUtil.addRecipe("blade_2_unfinished_2", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,7), new Object[]{
				"  I"," I ","B H",'I',"ingotSteel",'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,4)
		}));
		RecipesUtil.addRecipe("blade_3_unfinished_2", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,8), new Object[]{
				"  I"," I ","B H",'I',SlashBlade.findItemStack("flammpfeil.slashblade", "ingot_bladesoul", 1),'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,5)
		}));
		
		BlastRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.blade,1,9), new ItemStack(ItemLoader.blade_heatted,1,0), 0F);
		BlastRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.blade,1,10), new ItemStack(ItemLoader.blade_heatted,1,1), 0F);
		BlastRecipes.instance().addSmeltingRecipe(new ItemStack(ItemLoader.blade,1,11), new ItemStack(ItemLoader.blade_heatted,1,2), 0F);
		
		RecipesUtil.addRecipe("blade_unfinished_3", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,9), new Object[]{new ItemStack(ItemLoader.blade,1,6),new ItemStack(ItemLoader.material,1,5)}));
		RecipesUtil.addRecipe("blade_2_unfinished_3", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,10), new Object[]{new ItemStack(ItemLoader.blade,1,7),new ItemStack(ItemLoader.material,1,5)}));
		RecipesUtil.addRecipe("blade_3_unfinished_3", new ShapelessOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,11), new Object[]{new ItemStack(ItemLoader.blade,1,8),new ItemStack(ItemLoader.material,1,5)}));
		
		RecipesUtil.addRecipe("blade", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,0), new Object[]{
				"  C"," I ","B H",'I',"ingotGold",'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,12),'C',"cobblestone"
		}));
		RecipesUtil.addRecipe("blade_2", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,1), new Object[]{
				"  C"," I ","B H",'I',"ingotGold",'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,13),'C',"cobblestone"
		}));
		RecipesUtil.addRecipe("blade_3", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.blade,1,2), new Object[]{
				"  C"," I ","B H",'I',"ingotGold",'H',ItemLoader.hammer,'B',new ItemStack(ItemLoader.blade,1,14),'C',"cobblestone"
		}));
		

		
		if(OreDictionary.getOres("bamboo").isEmpty()){
			RecipesUtil.addRecipe("bamboo_blade", new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(ItemLoader.material,1,4), new Object[]{
					" BP","BP ","L  ",'B',Items.REEDS,'L',new ItemStack(ItemLoader.material,1,3),'P',"plankWood"
			}));
			RecipesUtil.addRecipe("bamboo_saya", new ShapedOreRecipe(new ResourceLocation(""),BladeLoader.wrapper_bamboo, new Object[]{
					" PL","PBP","LP ",'P',Items.REEDS,'L',"logWood",'B',BladeLoader.wrapper
			}));
            SlashBlade.addRecipe("slashbladeBambooLight",
                    new RecipeUpgradeBlade(new ResourceLocation(SlashBlade.modid,"bamboolight"),
                            new ItemStack(SlashBlade.bladeBambooLight),new Object[]{
				" PW","PBP","DP ",Character.valueOf('P'),Items.REEDS,Character.valueOf('B'),new ItemStack(ItemLoader.material,1,4),'W',BladeLoader.wrapper_bamboo,'D',new BladeIngredient(new ItemStack(SlashBlade.bladeWood,1))
		}));}else{
			RecipesUtil.addRecipe("bamboo_blade", new ShapedOreRecipe(new ResourceLocation(""),new ItemStack(ItemLoader.material,1,4), new Object[]{
					" BP","BP ","L  ",'B',"bamboo",'L',new ItemStack(ItemLoader.material,1,3),'P',"plankWood"
			}));
			RecipesUtil.addRecipe("bamboo_saya", new ShapedOreRecipe(new ResourceLocation(""),BladeLoader.wrapper_bamboo, new Object[]{
					" PL","PBP","LP ",'P',"bamboo",'L',"logWood",'B',BladeLoader.wrapper
			}));
            SlashBlade.addRecipe("slashbladeBambooLight",
                    new RecipeUpgradeBlade(new ResourceLocation(SlashBlade.modid,"bamboolight"),
                            new ItemStack(SlashBlade.bladeBambooLight),new Object[]{
				" PW","PBP","DP ",Character.valueOf('P'),"bamboo",Character.valueOf('B'),new ItemStack(ItemLoader.material,1,4),'W',BladeLoader.wrapper_bamboo,'D',new BladeIngredient(new ItemStack(SlashBlade.bladeWood,1))
		}));}
		
		SlashBlade.addRecipe("slashbladeWhite",new ShapedOreRecipe(new ResourceLocation(SlashBlade.modid,"white"), new ItemStack(SlashBlade.bladeWhiteSheath, 1, 70 / 3) , new Object[]{
				"  W"," B ","L H",Character.valueOf('W'),BladeLoader.wrapper,Character.valueOf('B'),new ItemStack(ItemLoader.blade,1,0),Character.valueOf('L'),new BladeIngredient(new ItemStack(SlashBlade.bladeWood,1)),'H',ItemLoader.hammer
		}));
		SlashBlade.addRecipe("slashbladeWhite2",new ShapedOreRecipe(new ResourceLocation(SlashBlade.modid,"white2"), new ItemStack(SlashBlade.bladeWhiteSheath, 1, 70 / 4) , new Object[]{
				"  W"," B ","L H",Character.valueOf('W'),BladeLoader.wrapper,Character.valueOf('B'),new ItemStack(ItemLoader.blade,1,1),Character.valueOf('L'),new BladeIngredient(new ItemStack(SlashBlade.bladeWood,1)),'H',ItemLoader.hammer
		}));
		SlashBlade.addRecipe("slashbladeWhite3",new ShapedOreRecipe(new ResourceLocation(SlashBlade.modid,"white3"), new ItemStack(SlashBlade.bladeWhiteSheath, 1) , new Object[]{
				"  W"," B ","L H",Character.valueOf('W'),BladeLoader.wrapper,Character.valueOf('B'),new ItemStack(ItemLoader.blade,1,2),Character.valueOf('L'),new BladeIngredient(new ItemStack(SlashBlade.bladeWood,1)),'H',ItemLoader.hammer
		}));

        ItemStack brokenBladeWhite = new ItemStack(SlashBlade.bladeWhiteSheath,1,0);
        brokenBladeWhite.setItemDamage(brokenBladeWhite.getMaxDamage());
        NBTTagCompound reqTag = ItemSlashBlade.getItemTagCompound(brokenBladeWhite);
        ItemSlashBlade.IsBroken.set(reqTag, true);
        ItemStack itemSphereBladeSoul = SlashBlade.findItemStack(SlashBlade.modid,SlashBlade.SphereBladeSoulStr,1);
		RecipesUtil.addRecipe(BladeLoader.blade, new ShapedOreRecipe(new ResourceLocation(""), new ItemStack(BladeLoader.blade, 1) , new Object[]{
				"P W"," B ","L H",'P',itemSphereBladeSoul,Character.valueOf('W'),BladeLoader.wrapper,Character.valueOf('B'),new ItemStack(ItemLoader.blade,1,2),Character.valueOf('L'),new BladeIngredient(brokenBladeWhite),'H',ItemLoader.hammer
		}));
	}
}
