package me.dev.zennyel.category;

import me.dev.zennyel.stats.Cultivator;
import me.dev.zennyel.stats.CultivatorAPI;
import org.bukkit.entity.Player;

import java.util.HashMap;

public final class CategoryAPI {

    private static HashMap<Cultivator, Category> cultivatorCategory = new HashMap<>();
    private static Category category;

    public static Category getCategory(Cultivator cultivator) {
        category = cultivatorCategory.get(cultivator);
        return category;
    }

    public static void setCategory(Category c, Player player) {
        CategoryAPI.cultivatorCategory.put(CultivatorAPI.getCultivator(player), c);
    }

    public static HashMap<Cultivator, Category> getCultivatorCategory() {
        return cultivatorCategory;
    }

    public static void setCultivatorCategory(HashMap<Cultivator, Category> cultivatorCategory) {
        CategoryAPI.cultivatorCategory = cultivatorCategory;
    }

}
