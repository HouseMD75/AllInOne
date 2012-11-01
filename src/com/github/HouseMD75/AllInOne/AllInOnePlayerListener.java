package com.github.HouseMD75.AllInOne;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
 
 
public class AllInOnePlayerListener implements Listener {
       
        public AllInOne plugin;
       
        public AllInOnePlayerListener(AllInOne instance) {
                plugin = instance;
        }
 
        @EventHandler
        public void onPlayerMove(PlayerMoveEvent event){
                Player player = event.getPlayer();
                Location playerLoc = player.getLocation();
                player.sendMessage("Your X Coordinates : " + playerLoc.getX());
                player.sendMessage("Your Y Coordinates : " + playerLoc.getY());
                player.sendMessage("Your Z Coordinates : " + playerLoc.getZ());
        }
 
}
