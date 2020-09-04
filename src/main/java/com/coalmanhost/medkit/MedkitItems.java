package com.coalmanhost.medkit;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.item.PotionItem;

public class MedkitItems {
    public static final Item MEDKIT = new MedkitItem(new Item.Properties().group(ItemGroup.MISC).setNoRepair());
}
