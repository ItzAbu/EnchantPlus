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

public class SwordsChoseMenu {


    public static Inventory openSwordChoseMenu() {
        Inventory inv = Bukkit.createInventory(null, 27, cctrans(CustomConfig.getPmenu().getString("SwordChooseMenu.Header")));

        //Diamond Sword
        ItemStack DiamondSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta DiamondSwordMeta = DiamondSword.getItemMeta();
        DiamondSwordMeta.setDisplayName(cctrans(CustomConfig.getPmenu().getString("SwordChooseMenu.DiamondSword")));
        List<String> lore = cctrans(CustomConfig.getPmenu().getStringList("SwordChooseMenu.DiamondSwordLore"));
        DiamondSwordMeta.setLore(lore);
        DiamondSword.setItemMeta(DiamondSwordMeta);
        inv.setItem(11, DiamondSword);


        return inv;
    }


}
