package me.abu.enchantplus.commands;

import me.abu.enchantplus.utils.configs.CustomConfig;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnchReload implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command label, String s, String[] strings) {

        CustomConfig.reload();


        return true;
    }
}
