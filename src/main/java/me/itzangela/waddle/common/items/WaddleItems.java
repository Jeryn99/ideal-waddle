package me.itzangela.waddle.common.items;

import me.itzangela.waddle.Waddle;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WaddleItems {

    //Item group
    public static ItemGroup MAIN = new ItemGroup("waddle") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HATCHET.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Waddle.MODID);
    public static RegistryObject< Item > HATCHET = ITEMS.register("hatchet", () -> new HatchetItem(new Item.Properties().tab(MAIN)));

}
