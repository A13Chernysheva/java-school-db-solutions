package hw3;

import hw3.heroes.Hero;

import java.util.Random;

public class Weapon {
    public static String kickByTears(Hero hero) {
        return "hp " + hero.getHp() + " and power " + hero.getPower();
    }

    public static String kickByForce(Hero hero, int my_power) {
        if (hero.getPower() < my_power) {
            hero.setHp(0);
        }
        else {
            hero.setPower(hero.getPower() - 1);
        }
        return "hp " + hero.getHp() + " and power " + hero.getPower();
    }

    public static String kickBySword(Hero hero, int my_power) {

        Random rand = new Random();
        hero.setHp(hero.getHp() - rand.nextInt(my_power));

        return "hp " + hero.getHp() + " and power " + hero.getPower();
    }
}
