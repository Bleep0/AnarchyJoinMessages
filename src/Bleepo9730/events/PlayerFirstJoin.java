package Bleepo9730.events;

import Bleepo9730.Bleepo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerFirstJoin implements Listener {
    private final Bleepo plugin;

    public PlayerFirstJoin(Bleepo plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (!player.hasPlayedBefore()) {
            String firstJoin = plugin.getConfig().getString("firstjoinmessage");
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', firstJoin.replace("{player}", player.getDisplayName())));

        }
    }
}
