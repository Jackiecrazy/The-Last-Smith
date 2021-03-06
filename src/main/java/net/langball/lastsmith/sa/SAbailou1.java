package net.langball.lastsmith.sa;

import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.specialattack.SpecialAttackBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SAbailou1 extends SpecialAttackBase {

	@Override
	public String toString() {
		return "miwang";
	}

	@Override
	public void doSpacialAttack(ItemStack stack, EntityPlayer player) {
		World world = player.world;

        NBTTagCompound tag = ItemSlashBlade.getItemTagCompound(stack);     
        if(!world.isRemote){
        	final int cost = -30;
            if(!ItemSlashBlade.ProudSoul.tryAdd(tag,cost,false)){
                ItemSlashBlade.damageItem(stack, 10, player);
            }
        	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 1200, 1));
            }
        ItemSlashBlade.setComboSequence(tag, ItemSlashBlade.ComboSequence.SlashEdge);
        }

	}
       
	
