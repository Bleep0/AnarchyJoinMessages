package Bleepo9730.events;

import Bleepo9730.Bleepo;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private final Bleepo plugin;

    public PlayerJoin(Bleepo plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String join = plugin.getConfig().getString("joinmessage");
        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', join.replace("{player}", player.getDisplayName())));

    }

}
