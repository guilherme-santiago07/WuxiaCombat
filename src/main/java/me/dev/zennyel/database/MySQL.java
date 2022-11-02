package me.dev.zennyel.database;

import me.dev.zennyel.Stats;
import me.dev.zennyel.category.Category;
import me.dev.zennyel.classes.Archer;
import me.dev.zennyel.classes.Mage;
import me.dev.zennyel.classes.Warrior;
import me.dev.zennyel.stats.Cultivator;
import org.bukkit.entity.Player;

import java.sql.*;

public class MySQL {
    private static Connection connection;

    public static Connection openConnection() {
        String password = Stats.getInstance().getConfig().getString("Sql.password");
        String user = Stats.getInstance().getConfig().getString("Sql.user");
        String host = Stats.getInstance().getConfig().getString("Sql.host");
        String port = Stats.getInstance().getConfig().getString("Sql.port");
        String database = Stats.getInstance().getConfig().getString("Sql.database");
        String type = "jdbc:mysql://";
        String url = type+host+":"+port+"/"+database;

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void createTable(){
        connection = openConnection();
        String query = "CREATE TABLE IF NOT EXISTS category(id VARCHAR(32), type VARCHAR(8));";

        try(Statement stm = connection.createStatement()){
            stm.execute(query);
        }catch (SQLException e){e.printStackTrace();}
    }


    public static void insertCategory(Player p,String type){
        connection = openConnection();
        String id =  p.getUniqueId().toString();

        String query = "INSERT INTO `category`(`id`, `type`,) VALUES ('" + id + "'," + type + ");";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateCategory(Player p, String type){
        connection = openConnection();
        String id = p.getUniqueId().toString();
        String query = "UPDATE `category` SET `type` = " + type + " WHERE id = '" + id + "';";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static Category getCategory(Player p){
        connection = openConnection();
        String id = p.getUniqueId().toString();
        Category category = null;
        String query = "SELECT `type` FROM `category` WHERE `id` = '" + id + "';";
        try(Statement stm = connection.createStatement()){
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                String type = rs.getString("type");
                switch (type){
                    case "archer":
                        category = Archer.getCategory();
                        break;
                    case "mage":
                        category = Mage.getCategory();
                        break;
                    case "warrior":
                        category = Warrior.getCategory();
                        break;
                }
                return  category;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return category;
    }


    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        MySQL.connection = connection;
    }
}
