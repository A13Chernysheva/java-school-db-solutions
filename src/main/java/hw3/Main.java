package hw3;

import hw3.heroes.Hero;
import hw3.heroes.HeroFactory;

public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        Hero hero1 =heroFactory.createHero();
        Hero hero2 =heroFactory.createHero();

        GameManager manager = new GameManager();
        manager.fight(hero1, hero2);

//        System.out.println(hero1);
//        System.out.println(hero2);
    }
}
