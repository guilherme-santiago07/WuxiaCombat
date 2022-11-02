package me.dev.zennyel.classes;

import me.dev.zennyel.category.Category;

public class Mage {

    private static Category category = new Category("Mage", 25, 1, 20, 10, 1.5, 0.0, 2.0, 0.5, 1.3, 0.2);

    public static Category getCategory() {
        return category;
    }


}
