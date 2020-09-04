package com.coalmanhost.medkit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class MedkitItem extends Item {

    public MedkitItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return 1;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 100;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }



    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        PlayerEntity player = p_77659_2_;
        Hand hand = p_77659_3_;
        if (hand == Hand.OFF_HAND) {
            if (player.getHealth() < player.getMaxHealth()) {
                player.heal(0.4f);
                player.inventory.offHandInventory.get(0).damageItem(2, player, new Consumer<PlayerEntity>() {
                    @Override
                    public void accept(PlayerEntity playerEntity) {
                        return;
                    }
                });
            }
        }
        else if (hand == Hand.MAIN_HAND) {
            if (player.getHealth() < player.getMaxHealth()) {
                player.heal(0.4f);
                player.inventory.getCurrentItem().damageItem(2, player, new Consumer<PlayerEntity>() {
                    @Override
                    public void accept(PlayerEntity playerEntity) {
                        return;
                    }
                });
            }
        }
        return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
