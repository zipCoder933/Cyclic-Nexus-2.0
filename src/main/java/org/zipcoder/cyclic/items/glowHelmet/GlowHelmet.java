package org.zipcoder.cyclic.items.glowHelmet;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import org.zipcoder.cyclic.materials.ModArmorMaterials;

public class GlowHelmet extends ArmorItem {
    public static final double MAX_GAMMA = 10.0;

    public GlowHelmet() {
        super(
                ModArmorMaterials.GLOW_ARMOR,//Armor material
                Type.HELMET, //Type
                new Item.Properties().stacksTo(1)); //Properties
    }
}