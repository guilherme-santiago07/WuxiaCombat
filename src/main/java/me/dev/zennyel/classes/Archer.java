package me.dev.zennyel.classes;

import me.dev.zennyel.category.Category;

public class Archer {

    private static Category category = new Category("Archer", 20, 5, 20, 10, 1.5, 0.5, 1.5, 0.5, 1.3, 0.2);

    public static Category getCategory() {
        return category;
    }

}
