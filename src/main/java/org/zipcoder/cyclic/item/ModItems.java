package org.zipcoder.cyclic.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.zipcoder.cyclic.Cyclic;
import org.zipcoder.cyclic.item.glowHelmet.GlowHelmet;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Cyclic.MOD_ID);

    public static final RegistryObject<Item> GLOW_HELMET = ITEMS.register("glowing_helmet", () -> new GlowHelmet());


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
