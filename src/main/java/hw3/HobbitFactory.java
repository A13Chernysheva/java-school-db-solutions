package hw3;

public class HobbitFactory implements HeroFactory{

        public Hero createHero() {
            return new Hobbit();
        }

}
