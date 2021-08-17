package hw2;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClientManager clientManager = new ClientManager();
        clientManager.setName("Sara");
        clientManager.setDebt(100);
        clientManager.setBonus(10);
        clientManager.setSalary(1000000);
        Client client = clientManager.createClient();
        System.out.println(client);
        //todo this is ugly!!!! find solution for creating a client
        // with more readable way
    }
}
