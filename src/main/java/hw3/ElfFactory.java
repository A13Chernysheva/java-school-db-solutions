package hw3;

class ElfFactory implements HeroFactory{

    public Hero createHero() {
        return new Elf();
    }
}