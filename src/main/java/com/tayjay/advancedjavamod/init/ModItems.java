package com.tayjay.advancedjavamod.init;

import com.tayjay.advancedjavamod.AdvancedJavaMod;
import com.tayjay.advancedjavamod.item.ItemTest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by tayjay on 2017-02-01.
 */
public class ModItems
{

    public static Item testItem;

    public static void initItems()
    {
        testItem = register(new ItemTest("test_item"));
    }

    private static <T extends Item> T register(T item)
    {
        System.out.println("Registering "+item.getUnlocalizedName());
        GameRegistry.register(item,new ResourceLocation(AdvancedJavaMod.MODID,item.getUnlocalizedName().substring(5)));
        AdvancedJavaMod.proxy.registerItemRenderer(item,0,item.getUnlocalizedName().substring(5));
        return item;
    }
}
