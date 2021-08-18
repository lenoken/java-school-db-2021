package homework.lab2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Client client = new Client.ClientBuilder()
                .debt(5)
                .bonus(1)
                .name("Ksi")
                .salary(100)
                .createClient();
    }
}
