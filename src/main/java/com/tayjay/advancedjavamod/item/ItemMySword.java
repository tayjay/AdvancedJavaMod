package com.tayjay.advancedjavamod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by tayjay on 2017-02-01.
 */
public class ItemMySword  extends ItemSword
{
    public ItemMySword(ToolMaterial material,String name)
    {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }


}
