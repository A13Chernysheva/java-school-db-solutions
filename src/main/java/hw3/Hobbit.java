package hw3;

class Hobbit extends Hero{

    Hobbit() {
        power = 0;
        hp = 3;
        role = "Hobbit";
    }

    @Override
    public String kick(Hero hero) {
        return Weapon.kickByTears(hero);
    }
}
