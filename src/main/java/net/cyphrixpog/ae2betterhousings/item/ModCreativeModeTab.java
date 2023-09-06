package net.cyphrixpog.ae2betterhousings.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BetterHousings = new CreativeModeTab("ae2betterhousingstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.onekstoragehousing.get());
        }
    };
}
