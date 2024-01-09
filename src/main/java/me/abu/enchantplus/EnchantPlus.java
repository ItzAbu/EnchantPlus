package me.abu.enchantplus;

import me.abu.enchantplus.commands.EnchReload;
import me.abu.enchantplus.commands.MainMenuOpener;
import me.abu.enchantplus.listeners.MainMenuListener;
import me.abu.enchantplus.utils.configs.CustomConfig;
import me.abu.enchantplus.utils.menu.PrincipalMenu;
import me.abu.enchantplus.utils.menu.SwordsChoseMenu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class EnchantPlus extends JavaPlugin {

    public static EnchantPlus plugin;
    HashMap<Inventory, Integer> invs = new HashMap<>();

    public HashMap<Inventory,Integer> getInvs() {
        return invs;
    }

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        plugin = this;

        CustomConfig.setup();

        //MainMenuSetup
        CustomConfig.getPmenu().addDefault("MainMenu.Header", "&b&lEnchantMenu");
        CustomConfig.getPmenu().addDefault("MainMenu.SwordName", "&b&lSpada");
        ArrayList<String> Swordlore = new ArrayList<>();
        Swordlore.add("&7Enchanta la tua spada per renderla potentissima!");
        Swordlore.add("&7Clicca per aprire il menu!");
        CustomConfig.getPmenu().getConfigurationSection("MainMenu").addDefault("SwordLore", Swordlore);
        CustomConfig.getPmenu().addDefault("MainMenu.CloseName", "&c&lChiudi");
        ArrayList<String> Closelore = new ArrayList<>();
        Closelore.add("&7Clicca per chiudere il menu!");
        CustomConfig.getPmenu().getConfigurationSection("MainMenu").addDefault("CloseLore", Closelore);

        //SwordMenuSetup
        CustomConfig.getPmenu().addDefault("SwordChooseMenu.Header", "&b&lEnchantMenu");
        CustomConfig.getPmenu().addDefault("SwordChooseMenu.DiamondSword", "&b&lSpada di Diamante");
        ArrayList<String> DiamondSwordlore = new ArrayList<>();
        DiamondSwordlore.add("&7Enchanta la tua spada di diamante!");
        CustomConfig.getPmenu().getConfigurationSection("SwordChooseMenu").addDefault("DiamondSwordLore", DiamondSwordlore);
        CustomConfig.getPmenu().addDefault("SwordChooseMenu.IronSword", "&b&lSpada di Ferro");
        ArrayList<String> IronSwordlore = new ArrayList<>();
        IronSwordlore.add("&7Enchanta la tua spada di ferro!");
        CustomConfig.getPmenu().getConfigurationSection("SwordChooseMenu").addDefault("IronSwordLore", IronSwordlore);
        CustomConfig.getPmenu().addDefault("SwordChooseMenu.StoneSword", "&b&lSpada di Pietra");
        ArrayList<String> StoneSwordlore = new ArrayList<>();
        StoneSwordlore.add("&7Enchanta la tua spada di pietra!");
        CustomConfig.getPmenu().getConfigurationSection("SwordChooseMenu").addDefault("StoneSwordLore", StoneSwordlore);
        CustomConfig.getPmenu().addDefault("SwordChooseMenu.WoodSword", "&b&lSpada di Legno");
        ArrayList<String> WoodSwordlore = new ArrayList<>();
        WoodSwordlore.add("&7Enchanta la tua spada di legno!");
        CustomConfig.getPmenu().getConfigurationSection("SwordChooseMenu").addDefault("WoodSwordLore", WoodSwordlore);



        CustomConfig.getPmenu().options().copyDefaults(true);



        CustomConfig.save();
        //Commands;
        getCommand("enchantplus").setExecutor(new MainMenuOpener());
        getCommand("enchantplusreload").setExecutor(new EnchReload());

        //Events
        getServer().getPluginManager().registerEvents(new MainMenuListener(), this);



        //InventorySetup




        System.out.println("EnchantPlus is enabled!");

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
