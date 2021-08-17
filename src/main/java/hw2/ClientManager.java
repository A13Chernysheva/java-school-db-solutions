package hw2;

import lombok.Getter;
import lombok.Setter;

public class ClientManager {
    @Setter
    private int debt;
    @Setter
    private int bonus;
    @Setter
    private String name;
    @Setter
    private int salary;
    @Getter
    private Client client;

    public Client createClient() {
        client = new Client(debt, bonus, name, salary);
        return client;
    }
}
