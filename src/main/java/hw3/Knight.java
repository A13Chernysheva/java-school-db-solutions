package hw3;


import java.util.Random;

class Knight extends Hero{

    private int maxHp = 12;
    private int minHp = 2;

    private int maxPower = 12;
    private int minPower = 2;

    private Random rand = new Random();

    Knight() {

        hp = rand.nextInt((maxHp - minHp) + 1) + minHp;
        power = rand.nextInt((maxPower - minPower) + 1) + minPower;
        role = "Knight";

    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickBySword(hero, power);
    }
}
