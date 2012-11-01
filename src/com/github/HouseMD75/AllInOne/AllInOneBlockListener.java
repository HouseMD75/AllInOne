package com.github.HouseMD75.AllInOne;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
 
 
public class AllInOneBlockListener implements Listener {
 
        public AllInOne plugin;
       
        public AllInOneBlockListener(AllInOne instance) {
                plugin = instance;
        }
 
        @EventHandler
        public void onBlockPlace(BlockPlaceEvent event){
                Player player = event.getPlayer();
                Block block = event.getBlock();
 
                player.sendMessage("You placed a block with ID : " + block);
                //Display a message to the player telling them what type of block they placed.
 
        }
}
