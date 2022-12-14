package net.baka.idek.block;


import net.baka.idek.block.custom.RedHotSteelBlock;
import net.baka.idek.idek;
import net.baka.idek.item.ModCreativeModeTab;
import net.baka.idek.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class ModBlocks {
public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, idek.MOD_ID);
//jaxrite
// public  static final  RegistryObject<Block> Jaxrite_Block = registerBlock("jaxrite_block",
  //      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.IDEK_TAB_MATERIALS);
//public  static final  RegistryObject<Block> Jaxrite_Ore = registerBlock("jaxrite_ore",
  //      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.IDEK_TAB_MATERIALS);
//public  static final  RegistryObject<Block> Compressed_Jaxrite_Block = registerBlock("compressed_jaxrite_block",
  //      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.IDEK_TAB_MATERIALS);

    public  static final  RegistryObject<Block> Steel_Block = registerBlock("steel_block",
                  () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TMTH_TAB_MATERIALS);
    public static final RegistryObject<Block> RED_HOT_STEEL = registerBlock("red_hot_steel",
            () -> new RedHotSteelBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.TMTH_TAB_MATERIALS);


private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
}
private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                        CreativeModeTab tab) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(tab)));
}

public  static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}







}