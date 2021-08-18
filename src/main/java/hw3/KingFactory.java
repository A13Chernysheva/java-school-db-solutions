package hw3;

public class KingFactory implements HeroFactory{

        public Hero createHero() {
            return new King();
        }

}
