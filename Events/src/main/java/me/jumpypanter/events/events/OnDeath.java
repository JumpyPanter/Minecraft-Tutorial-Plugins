package me.jumpypanter.events.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnDeath implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        e.getEntity().sendMessage("Hahaha! You died!");
        e.getEntity().setFlying(true);
    }

}
