package me.abu.enchantplus.commands;

import me.abu.enchantplus.utils.menu.PrincipalMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import static me.abu.enchantplus.EnchantPlus.plugin;
import static me.abu.enchantplus.utils.ColorUtil.cctrans;


public class MainMenuOpener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            String errore = cctrans(plugin.getConfig().getString("console.error"));
            sender.sendMessage(errore);
            return true;
        }
        Player player = (Player) sender;
        Inventory openinv = PrincipalMenu.getMainInv(player);
        player.openInventory(openinv);
        return true;

    }

}

