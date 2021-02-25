package me.jumpypanter.playerjoinleaveplugin;

import me.jumpypanter.playerjoinleaveplugin.events.PlayerJoinEvent;
import me.jumpypanter.playerjoinleaveplugin.events.PlayerLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoinLeavePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeaveEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
