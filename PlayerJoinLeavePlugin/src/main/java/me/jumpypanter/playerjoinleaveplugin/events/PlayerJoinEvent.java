package me.jumpypanter.playerjoinleaveplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {

    @EventHandler
    void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.AQUA +"Welcome to the server "+ChatColor.RED + player.getDisplayName());

    }


}
