package hw3;

import java.util.Random;

public class GameManager {

    private Random rand = new Random();

    Hero createHero() {
        HobbitFactory hobbit = new HobbitFactory();
        ElfFactory elf = new ElfFactory();
        KingFactory king = new KingFactory();
        KnightFactory knight = new  KnightFactory();

        HeroFactory[] factories = {hobbit, elf, king, knight};
        HeroFactory factory = factories[rand.nextInt(factories.length)];

        return factory.createHero();
    }

    void fight(Hero hero1, Hero hero2) {
        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println(hero1.getRole() + " " + hero1.getName() + " kicked " +
                    hero2.getRole() + " " + hero2.getName() + " for " + hero1.kick(hero2));
            System.out.println(hero2.getRole() + " " + hero2.getName() + " kicked " +
                    hero1.getRole() + " " + hero1.getName() + " for " + hero2.kick(hero1));
        }
    }
}
