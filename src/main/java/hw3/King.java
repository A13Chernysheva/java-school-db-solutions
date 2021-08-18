package hw3;

import java.util.Random;

class King extends Hero{

    int maxHp = 15;
    int minHp = 5;

    int maxPower = 15;
    int minPower = 5;

    King() {
        Random rand = new Random();
        hp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        power = rand.nextInt((maxPower - minPower) + 1) + minPower;
        role = "King";

    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickBySword(hero, power);
    }
}
