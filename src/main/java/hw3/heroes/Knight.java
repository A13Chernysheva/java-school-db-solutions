package hw3.heroes;


import hw3.Weapon;

import java.util.Random;

public class Knight extends Hero{

    int maxHp = 12;
    int minHp = 2;

    int maxPower = 12;
    int minPower = 2;

    Knight() {
        Random rand = new Random();
        hp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        power = rand.nextInt((maxPower - minPower) + 1) + minPower;
        role = "Knight";

    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickBySword(hero, power);
    }
}
