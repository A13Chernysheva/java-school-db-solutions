package hw3.heroes;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
public abstract class Hero {
    protected final String name;
    protected String role;
    @Setter
    protected Integer power;
    @Setter
    protected Integer hp;

    public Hero() {
        Faker faker = new Faker();
        name = faker.gameOfThrones().character();
    }

    public abstract String kick(Hero hero);

    public final boolean isAlive() {
        return (hp > 0);
    }
}
