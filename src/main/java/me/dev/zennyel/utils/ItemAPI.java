package me.dev.zennyel.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class ItemAPI {

    private static Material material;
    private static ItemStack itemStack;
    private static Inventory inventory;

    private static String title;

    private static ItemMeta meta;
    private static List<String> lore = new ArrayList<>();

    public ItemAPI(Inventory inv){
        inventory = inv;
    }

    public ItemAPI(Inventory inv,int pos,String title, String lore, Material material){
        setMaterial(material);
        setMeta();
        setTitle(title);
        addLore(lore);
        setInventory(inv, pos);
        inventory = inv;
    }


    public static String getTitle() {
        return title;
    }

    public static ItemMeta getMeta() {
        return meta;
    }

    public static void setMeta() {
        ItemAPI.meta = itemStack.getItemMeta();
    }

    public static List<String> getLore() {
        return lore;
    }

    public static void setLore(List<String> lore) {
        ItemAPI.lore = lore;
    }

    public static void setTitle(String title){
        meta.setDisplayName("title");
    }

    public static void addEnchantment(Enchantment enchantment, int level, boolean booleana){
        meta.addEnchant(enchantment, level, booleana);
    }

    public static void addLore(String s){
        lore.add(s);
        meta.setLore(lore);
    }

    public static void setMaterial(Material mat) {
        material = mat;
        itemStack = new ItemStack(material);
    }

    public static void setItemStack(ItemStack item) {
        itemStack = item;
    }

    public static void setInventory(Inventory inv, int location) {
        inv.setItem(location, itemStack);
    }

    public static Material getMaterial() {
        return material;
    }

    public static ItemStack getItemStack() {
        return itemStack;
    }

    public static Inventory getInventory() {
        return inventory;
    }
}
