package hw3.heroes;


import hw3.Weapon;

public class Elf extends Hero{

    Elf() {
        hp = 10;
        power = 10;
        role = "Elf";
    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickByForce(hero, power);
    }

}
