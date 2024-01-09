package me.abu.enchantplus.listeners;

import me.abu.enchantplus.EnchantPlus;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;

import static me.abu.enchantplus.EnchantPlus.plugin;
import static me.abu.enchantplus.utils.menu.SwordsChoseMenu.openSwordChoseMenu;

public class MainMenuListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        HashMap map = plugin.getInvs();

        if(e.getClickedInventory() == e.getWhoClicked().getInventory() || e.getClickedInventory() == null) {
            return;
        }
        Inventory inv = e.getClickedInventory();
        Integer i = (Integer) map.get(inv);
        if(i == 1) {
            if(e.getCurrentItem() == null) {
                return;
            }
            switch (e.getCurrentItem().getType()) {
                case DIAMOND_SWORD:
                    e.getWhoClicked().closeInventory();
                    Inventory SwordChose = openSwordChoseMenu();
                    e.getWhoClicked().openInventory(SwordChose);
                    break;
                case BARRIER:
                    e.getWhoClicked().closeInventory();
                    break;
            }
            e.setCancelled(true);

        }

    }


}
