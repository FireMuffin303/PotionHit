package com.damagedpotion.firemuffin;

import com.damagedpotion.firemuffin.listener.Listeners;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    private static main instance;
    public static main getInstance() { return instance; }

    @Override
    public void onEnable() {
        instance = this;
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN +"Potion Enabled");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Potion Disabled");
    }
}

