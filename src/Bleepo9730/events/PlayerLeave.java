package Bleepo9730.events;

import Bleepo9730.Bleepo;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {
    private final Bleepo plugin;

    public PlayerLeave(Bleepo plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    void onPlayerJoin(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        String leave = plugin.getConfig().getString("leavemessage");
        e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', leave.replace("{player}", player.getDisplayName())));
    }
}
