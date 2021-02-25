package me.jumpypanter.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has been loaded.");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin has shutdown.");
        // Plugin shutdown logic
    }
}
