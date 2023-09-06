package net.cyphrixpog.ae2betterhousings.item;

import net.cyphrixpog.ae2betterhousings.Ae2BetterHousings;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ae2BetterHousings.MOD_ID);
    //1k Housing
    public  static final RegistryObject<Item> onekstoragehousing = ITEMS.register("onekstoragehousing",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BetterHousings)));
    //4k Housing
    public  static final RegistryObject<Item> fourkstoragehousing = ITEMS.register("fourkstoragehousing",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BetterHousings)));
    //4k Housing
    public  static final RegistryObject<Item> sixteenkstoragehousing = ITEMS.register("sixteenkstoragehousing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BetterHousings)));
    //4k Housing
    public  static final RegistryObject<Item> sixtyfourkstoragehousing = ITEMS.register("sixtyfourkstoragehousing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BetterHousings)));
    //4k Housing
    public  static final RegistryObject<Item> twofiftysixkstoragehousing = ITEMS.register("twofiftysixkstoragehousing",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BetterHousings)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
