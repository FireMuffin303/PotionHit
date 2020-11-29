package com.damagedpotion.firemuffin.listener;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;
import java.util.Scanner;

public class RandomEffect {
    private Random rand = new Random();
    public int amprand = rand.nextInt(101);
    public int durarand = rand.nextInt(600);

    public PotionEffectType[] effects = new PotionEffectType[] {
            PotionEffectType.ABSORPTION, PotionEffectType.BAD_OMEN, PotionEffectType.BLINDNESS, PotionEffectType.CONDUIT_POWER, PotionEffectType.CONFUSION, PotionEffectType.DAMAGE_RESISTANCE, PotionEffectType.FAST_DIGGING, PotionEffectType.FIRE_RESISTANCE, PotionEffectType.GLOWING,
            PotionEffectType.HEAL, PotionEffectType.HEALTH_BOOST, PotionEffectType.HERO_OF_THE_VILLAGE, PotionEffectType.HUNGER, PotionEffectType.INVISIBILITY, PotionEffectType.JUMP, PotionEffectType.LEVITATION, PotionEffectType.LUCK, PotionEffectType.NIGHT_VISION,
            PotionEffectType.POISON, PotionEffectType.REGENERATION, PotionEffectType.SATURATION, PotionEffectType.SLOW, PotionEffectType.SLOW_DIGGING, PotionEffectType.SLOW_FALLING, PotionEffectType.SPEED, PotionEffectType.UNLUCK, PotionEffectType.WATER_BREATHING, PotionEffectType.WEAKNESS,
            PotionEffectType.WITHER };
    int fetchNum = rand.nextInt(28);
    public PotionEffectType type = this.effects[fetchNum];
}
