package org.zipcoder.cyclic.materials;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

import static org.zipcoder.cyclic.Cyclic.MOD_ID;

public class ModToolMaterials {


    //after stone then COPPER
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            //harvestLevel, uses, toolSpeed, damage, enchantability
            new ForgeTier(
                    Tiers.STONE.getLevel(),
                    (int) (Tiers.STONE.getUses() * 1.5f),
                    Tiers.STONE.getSpeed() * 1.5f,
                    Tiers.STONE.getAttackDamageBonus() * 1.5f,
                    Tiers.IRON.getEnchantmentValue() * 1,
                    BlockTags.create(new ResourceLocation(MOD_ID, "needs_copper_tool")),
                    () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(MOD_ID, "copper"),
            List.of(Tiers.STONE), List.of(Tiers.IRON));
    //then RON
    //after iron is AMYTH
    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            //harvestLevel, uses, toolSpeed, damage, enchantability
            new ForgeTier(
                    Tiers.IRON.getLevel(),
                    (int) (Tiers.IRON.getUses() * 1.5f),
                    Tiers.IRON.getSpeed() * 1.5f,
                    Tiers.IRON.getAttackDamageBonus() * 1f,
                    Tiers.IRON.getEnchantmentValue() * 1,
                    BlockTags.create(new ResourceLocation(MOD_ID, "needs_amethyst_tool")),
                    () -> Ingredient.of(Items.AMETHYST_SHARD)),
            new ResourceLocation(MOD_ID, "amethyst"),
            List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    //then diamond
    //after diamond is
    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            //harvestLevel, uses, toolSpeed, damage, enchantability
            new ForgeTier(
                    Tiers.GOLD.getLevel() * 1,
                    Tiers.DIAMOND.getUses() * 1,
                    Tiers.GOLD.getSpeed() * 2,
                    Tiers.DIAMOND.getAttackDamageBonus() * 0.75f,
                    Tiers.GOLD.getEnchantmentValue() * 2,

                    BlockTags.create(new ResourceLocation(MOD_ID, "needs_emerald_tool")),
                    () -> Ingredient.of(Items.EMERALD)),//Repair
            new ResourceLocation(MOD_ID, "emerald"),
            List.of(Tiers.GOLD), //after
            List.of(Tiers.DIAMOND) //before
    );
    //then netherite then
//    //after netherite
//    public static final Tier GEMOBSIDIAN = TierSortingRegistry.registerTier(
//            //harvestLevel, uses, toolSpeed, damage, enchantability
//            new ForgeTier(Tiers.NETHERITE.getLevel(),
//                    Tiers.DIAMOND.getUses() * 4, Tiers.DIAMOND.getSpeed() * 4, // uses aka durability
//                    OBS_DMG.get().floatValue(), Tiers.GOLD.getEnchantmentValue() + 1,
//                    BlockTags.create(new ResourceLocation(MOD_ID, "needs_obsidian_tool")),
//                    () -> Ingredient.of(ItemRegistry.GEM_OBSIDIAN.get())),
//            new ResourceLocation(MOD_ID, "gem_obsidian"),
//            List.of(Tiers.NETHERITE), List.of());

    //Creative tier
    public static final Tier CREATIVE = TierSortingRegistry.registerTier(
            //harvestLevel, uses, toolSpeed, damage, enchantability
            new ForgeTier(
                    Tiers.NETHERITE.getLevel(),
                    Tiers.NETHERITE.getUses() * 9999,
                    Tiers.NETHERITE.getSpeed() * 9999, // uses aka durability
                    Tiers.NETHERITE.getAttackDamageBonus() * 9999,  //Attack damage bonus
                    Tiers.NETHERITE.getEnchantmentValue() * 9999,

                    BlockTags.create(new ResourceLocation(MOD_ID, "needs_netherite_tool")), //Tag

                    () -> Ingredient.of(Items.DIAMOND)),//Repair ingredient

            new ResourceLocation(MOD_ID, "creative"),
            List.of(Tiers.NETHERITE), List.of());

}