package com.github.HouseMD75.AllInOne;

import org.bukkit.plugin.PluginManager;

import org.bukkit.plugin.java.JavaPlugin;

public class AllInOne extends JavaPlugin {
	 
    public void onDisable() {}

    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new AllInOnePlayerListener(this), this);
        pm.registerEvents(new AllInOneBlockListener(this), this);
        pm.registerEvents(new AllInOneEntityListener(this), this);  
    }

}
