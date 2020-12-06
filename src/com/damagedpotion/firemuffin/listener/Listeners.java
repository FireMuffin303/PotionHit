package com.damagedpotion.firemuffin.listener;

import org.bukkit.ChatColor;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Listeners implements Listener {

    @EventHandler
    public static void fromEntityDamage(EntityDamageByEntityEvent event){
        if (!(event.getEntity() instanceof Player)) {
            return;
        }
        RandomEffect a = new RandomEffect();
        Player player = (Player) event.getEntity();
        if (!player.isBlocking()) {
            player.addPotionEffect(new PotionEffect(a.type, a.durarand, a.amprand));
        }
    }
        @EventHandler
    public static void onPlayerDamaged(EntityDamageEvent event){
            if (!(event.getEntity() instanceof Player)) {
                return;
            }
            RandomEffect a = new RandomEffect();
            Player player = (Player) event.getEntity();
        if (event.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK|| event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION || event.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION || event.getCause() == EntityDamageEvent.DamageCause.PROJECTILE) {
               return;
        }
        else {
            player.addPotionEffect(new PotionEffect(a.type, a.durarand, a.amprand));
        }
        }


}
