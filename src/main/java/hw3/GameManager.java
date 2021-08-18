package hw3;

import hw3.heroes.Hero;

public class GameManager {

    void fight(Hero hero1, Hero hero2) {
        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println(hero1.getRole() + " " + hero1.getName() + " kicked " +
                    hero2.getRole() + " " + hero2.getName() + " for " + hero1.kick(hero2));
            System.out.println(hero2.getRole() + " " + hero2.getName() + " kicked " +
                    hero1.getRole() + " " + hero1.getName() + " for " + hero2.kick(hero1));
        }
    }
}
