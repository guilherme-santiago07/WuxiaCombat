package me.dev.zennyel.classes;

import me.dev.zennyel.category.Category;

public class Warrior {
    private static Category category = new Category("Warrior", 5, 15, 30, 5, 0.5, 1.5, 0, 2.0, 0.9, 0.6);

    public static Category getCategory() {
        return category;
    }

}
