package com.tayjay.advancedjavamod;

import com.tayjay.advancedjavamod.init.ModItems;
import com.tayjay.advancedjavamod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.tayjay.advancedjavamod.AdvancedJavaMod.MODID;

/**
 * Created by tayjay on 2017-02-01.
 */
@Mod(modid = AdvancedJavaMod.MODID,name = AdvancedJavaMod.NAME, version = AdvancedJavaMod.VERSION)
public class AdvancedJavaMod
{
    public static final String MODID = "advancedjavamod";
    public static final String NAME = "Advanced Java Mod";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static AdvancedJavaMod instance;

    @SidedProxy(serverSide = "com.tayjay.advancedjavamod.proxy.CommonProxy",clientSide = "com.tayjay.advancedjavamod.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static CreativeTabs customTab = new CreativeTabs("mod_items")
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.NETHER_STAR;
        }
    };


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("Pre-Init for Advanced Java mod");

        ModItems.initItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Init for Advanced Java mod");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("Post-Init for Advanced Java mod");
    }
}
