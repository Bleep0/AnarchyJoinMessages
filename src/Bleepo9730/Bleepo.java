package Bleepo9730;

import Bleepo9730.events.PlayerFirstJoin;
import Bleepo9730.events.PlayerJoin;
import Bleepo9730.events.PlayerLeave;
import org.bukkit.plugin.java.JavaPlugin;

public class Bleepo extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AnarchyJoinMessages by Bleepo has been loaded and enabled!");
        getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(this), this);
        getServer().getPluginManager().registerEvents(new PlayerFirstJoin(this), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("AnarchyJoinMessages by Bleepo has been unloaded and disabled!");
    }
}
