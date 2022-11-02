package me.dev.zennyel.Listeners;

import me.dev.zennyel.category.Category;
import me.dev.zennyel.category.CategoryAPI;
import me.dev.zennyel.category.CategoryGUI;
import me.dev.zennyel.database.MySQL;
import me.dev.zennyel.stats.Cultivator;
import me.dev.zennyel.stats.CultivatorAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListeners implements Listener {

    @EventHandler public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        Cultivator cultivator = CultivatorAPI.getCultivator(p);
        Category category = CategoryAPI.getCategory(cultivator);

        if(category == null) {
            p.openInventory(new CategoryGUI(p).getInventory());
            return;
        }

        CategoryAPI.setCategory(MySQL.getCategory(p), p);

    }

    @EventHandler public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        Cultivator cultivator = CultivatorAPI.getCultivator(p);
        Category category = CategoryAPI.getCategory(cultivator);
        if(category.getType() != null){
            p.openInventory(new CategoryGUI(p).getInventory());
            MySQL.updateCategory(p, category.getType());
        }

    }



}
