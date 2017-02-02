package com.tayjay.advancedjavamod.event;

import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by tayjay on 2017-02-01.
 */
public class MyEventHandler
{
    @SubscribeEvent
    public void onPlayerRightClickEmpty(PlayerInteractEvent.RightClickEmpty event)
    {
        event.getEntityPlayer().dropItem(Items.DIAMOND, 1);
    }
}
