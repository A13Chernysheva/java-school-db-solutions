package hw3;

public class Main {
    public static void main(String[] args) {
        GameManager manager = new GameManager();
        Hero hero1 = manager.createHero();
        Hero hero2 = manager.createHero();

        System.out.println(hero1);
        System.out.println(hero2);

        manager.fight(hero1, hero2);
    }
}
