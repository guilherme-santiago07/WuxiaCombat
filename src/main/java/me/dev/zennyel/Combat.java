package me.dev.zennyel;

import me.dev.zennyel.Listeners.PlayerListeners;
import me.dev.zennyel.database.MySQL;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Combat extends JavaPlugin {

    @Override
    public void onEnable() {
        MySQL.createTable();
        registerEvents();
        loadConfiguration();
    }

    @Override
    public void onDisable() {
    }
    public void registerEvents(){
        Bukkit.getPluginManager().registerEvents(new PlayerListeners(), this);
    }

    public void loadConfiguration(){
        getConfig().options().copyDefaults(false);
        saveDefaultConfig();
    }


}
