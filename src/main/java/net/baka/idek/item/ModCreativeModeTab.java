package net.baka.idek.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TMTH_TAB_MATERIALS = new CreativeModeTab("tmth_tab_materials") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.TMWLOGO.get());}
    };

   // public static final CreativeModeTab IDEK_TAB_ARMOR = new CreativeModeTab("idek_tab_armor") {
        //@Override
       // public ItemStack makeIcon() {
           // return new ItemStack(ModItems.Jaxrite.get());
     //   }
   // };

    //public static final CreativeModeTab IDEK_TAB_TOOLS = new CreativeModeTab("idek_tab_tools") {
      //  @Override
        //public ItemStack makeIcon() {
          //  return new ItemStack(ModItems.Jaxrite_Sword.get());
        //}
    //};
}
