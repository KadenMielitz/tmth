package net.baka.idek.item;
import net.baka.idek.idek;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, idek.MOD_ID);

    public static  final RegistryObject<Item> Steel = ITEMS.register("steel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TMTH_TAB_MATERIALS)));
    public static  final RegistryObject<Item> TMWLOGO = ITEMS.register("tmwlogo",
            ()-> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> Steel_Dust = ITEMS.register("steel_dust",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TMTH_TAB_MATERIALS)));
    public static  final RegistryObject<Item> Coal_Dust = ITEMS.register("coal_dust",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TMTH_TAB_MATERIALS)));




   // public static final RegistryObject<Item> Jaxrite = ITEMS.register("jaxrite",
            //() -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_MATERIALS)));
    //public static final RegistryObject<Item> Jaxrite_Sword = ITEMS.register("jaxrite_sword",
            //() -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_TOOLS)));
    //public static final RegistryObject<Item> Jaxrite_Axe = ITEMS.register("jaxrite_axe",
      //      () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_TOOLS)));
   // public static final RegistryObject<Item> Jaxrite_Pickaxe = ITEMS.register("jaxrite_pickaxe",
        //    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_TOOLS)));
   // public static final RegistryObject<Item> Jaxrite_Hoe = ITEMS.register("jaxrite_hoe",
          //  () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_TOOLS)));
   // public static final RegistryObject<Item> Jaxrite_Shovel = ITEMS.register("jaxrite_shovel",
           // () -> new Item(new Item.Properties().tab(ModCreativeModeTab.IDEK_TAB_TOOLS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}