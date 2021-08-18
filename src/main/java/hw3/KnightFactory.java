package hw3;

public class KnightFactory implements HeroFactory{

        public Hero createHero() {
            return new Knight();
        }

}
