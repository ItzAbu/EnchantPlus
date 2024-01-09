package me.abu.enchantplus.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public final class ColorUtil {
    public static String cctrans( String textToTranslate) {
        return ChatColor.translateAlternateColorCodes( '&', textToTranslate );
    }

    public static ArrayList<String> cctrans(ArrayList<String> textToTranslate) {
        ArrayList<String> translated = new ArrayList<>();
        for (String s : textToTranslate) {
            translated.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        return translated;
    }
    public static List<String> cctrans(List<String> textToTranslate) {
        List<String> translated = new ArrayList<>();
        for (String s : textToTranslate) {
            translated.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        return translated;
    }
}
