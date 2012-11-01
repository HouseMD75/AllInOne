package com.github.HouseMD75.AllInOne;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
 
 
public class AllInOneEntityListener implements Listener {
       
        public AllInOne plugin;
       
        public AllInOneEntityListener(AllInOne instance) {
                plugin = instance;
        }
 
        @EventHandler
        public void onEntityDamage(EntityDamageEvent event){
               
                if(event.getEntity() instanceof Player){
                //If the entity being damaged is a player then...
 
                        event.setCancelled(true);
                //Cancel the damage event, this will give the player unlimited health
                }
        }
 
}
