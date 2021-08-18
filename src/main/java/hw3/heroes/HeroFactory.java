package hw3.heroes;

import java.util.Random;

public class HeroFactory {

    public Hero createHero() {
        HobbitFactory hobbit = new HobbitFactory();
        ElfFactory elf = new ElfFactory();
        KingFactory king = new KingFactory();
        KnightFactory knight = new KnightFactory();

        Random rand = new Random();
        HeroFactory[] factories = {hobbit, elf, king, knight};
        HeroFactory factory = factories[rand.nextInt(factories.length)];

        return factory.createHero();

    }


    private class HobbitFactory extends HeroFactory {

        public Hero createHero() {
            return new Hobbit();
        }
    }

    private class ElfFactory extends HeroFactory{

        public Hero createHero() {
            return new Elf();
        }
    }

    private class KingFactory extends HeroFactory{

        public Hero createHero() {
            return new King();
        }
    }

    private class KnightFactory extends HeroFactory{

        public Hero createHero() {
            return new Knight();
        }
    }

//    private List<Hero> heros;




//    Hero createHero() {
//        int i = //choose random number
//
//
//    }

//    private static class Elf implements Hero {
//
//        @Override
//        public String kick() {
//            return null;
//        }
//
//        @Override
//        public boolean isAlive() {
//            return false;
//        }
//    }
//
//    private static class Hobbit implements Hero {
//
//        @Override
//        public String kick() {
//            return null;
//        }
//
//        @Override
//        public boolean isAlive() {
//            return false;
//        }
//    }
//
//    private static class King implements Hero {
//
//        @Override
//        public String kick() {
//            return null;
//        }
//
//        @Override
//        public boolean isAlive() {
//            return false;
//        }
//    }
//
//    private static class Knight implements Hero {
//
//        @Override
//        public String kick() {
//            return null;
//        }
//
//        @Override
//        public boolean isAlive() {
//            return false;
//        }
//    }
}
