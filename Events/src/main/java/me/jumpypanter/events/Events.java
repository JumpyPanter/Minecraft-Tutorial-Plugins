package me.jumpypanter.events;

import me.jumpypanter.events.events.OnDeath;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Events extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin had been loaded");

        getServer().getPluginManager().registerEvents(new OnDeath(), this);

    }
}


