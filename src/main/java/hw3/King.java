package hw3;

import java.util.Random;

class King extends Hero{

    private int maxHp = 15;
    private int minHp = 5;

    private int maxPower = 15;
    private int minPower = 5;

    private Random rand = new Random();

    King() {

        hp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        power = rand.nextInt((maxPower - minPower) + 1) + minPower;
        role = "King";

    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickBySword(hero, power);
    }
}
