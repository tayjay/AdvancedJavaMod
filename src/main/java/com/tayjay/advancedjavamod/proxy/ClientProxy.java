package com.tayjay.advancedjavamod.proxy;

import com.tayjay.advancedjavamod.AdvancedJavaMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by tayjay on 2017-02-01.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String name)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(AdvancedJavaMod.MODID + ":" + name, "inventory"));
    }

    @Override
    public void preInit()
    {
        super.preInit();
    }

    @Override
    public void init()
    {
        super.init();
    }

    @Override
    public void postInit()
    {
        super.postInit();
    }


}
