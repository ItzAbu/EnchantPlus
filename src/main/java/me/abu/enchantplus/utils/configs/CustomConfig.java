package me.abu.enchantplus.utils.configs;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CustomConfig {

    private static File file;
    private static FileConfiguration customPmenu;


    public static void setup() {

        file = new File(Bukkit.getServer().getPluginManager().getPlugin("EnchantPlus").getDataFolder(), "EnchantPlus.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println("Impossibile creare il file EnchantMenu.yml");
            }
        }



        customPmenu = YamlConfiguration.loadConfiguration(file);


    }

    public static FileConfiguration getPmenu() {
        return customPmenu;
    }


    public static void save() {
        try {
            customPmenu.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reload() {
        customPmenu = YamlConfiguration.loadConfiguration(file);
    }


}
