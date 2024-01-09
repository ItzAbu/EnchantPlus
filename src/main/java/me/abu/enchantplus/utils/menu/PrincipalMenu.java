package me.abu.enchantplus.utils.menu;

import me.abu.enchantplus.utils.configs.CustomConfig;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static me.abu.enchantplus.EnchantPlus.plugin;
import static me.abu.enchantplus.utils.ColorUtil.cctrans;

public class PrincipalMenu {




    public static Inventory getMainInv(Player p) {

        String name = CustomConfig.getPmenu().getString("MainMenu.Header");
        Inventory inv;
        inv = Bukkit.createInventory(p, 54, cctrans(name) );

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(cctrans(CustomConfig.getPmenu().getString("MainMenu.SwordName")));

        List<String> lore = CustomConfig.getPmenu().getStringList("MainMenu.SwordLore");
        lore = cctrans(lore);
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(38, item);






        //Item 2
        ItemStack item2 = new ItemStack(Material.BARRIER);
        ItemMeta meta2 = item2.getItemMeta();
        meta2.setDisplayName(cctrans(CustomConfig.getPmenu().getString("MainMenu.CloseName")));
        List<String> lore2 = CustomConfig.getPmenu().getStringList("MainMenu.CloseLore");
        lore2 = cctrans(lore2);
        meta2.setLore(lore2);
        item2.setItemMeta(meta2);
        inv.setItem(53, item2);

        return inv;

    }



}
