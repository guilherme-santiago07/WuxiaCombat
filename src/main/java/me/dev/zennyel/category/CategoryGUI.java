package me.dev.zennyel.category;

import me.dev.zennyel.stats.Cultivator;
import me.dev.zennyel.stats.CultivatorAPI;
import me.dev.zennyel.utils.ItemAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CategoryGUI {

    private Inventory inventory;
    private Cultivator cultivator;
    private Category category;

    public CategoryGUI(Player player){
        inventory = Bukkit.createInventory(player, 9*3, "§8§lESCOLHA SUA CLASSE");
        new ItemAPI(inventory, 3, "§6§lARQUEIRO", "§7Clique para escolher", Material.ARROW);
        new ItemAPI(inventory, 5, "§6§lMAGO", "§7Clique para escolher", Material.DIAMOND_HOE);
        new ItemAPI(inventory, 7, "§6§lGUERREIRO", "§7Clique para escolher", Material.DIAMOND_SWORD);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Cultivator getCultivator() {
        return cultivator;
    }

    public void setCultivator(Cultivator cultivator) {
        this.cultivator = cultivator;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
