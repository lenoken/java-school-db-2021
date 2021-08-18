package homework.lab2;

public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    public static class ClientBuilder {
        private int nestedDebt;
        private int nestedBonus;
        private String nestedName;
        private int nestedSalary;

        public ClientBuilder debt(int newDebt) {
            this.nestedDebt = newDebt;
            return this;
        }

        public ClientBuilder bonus(int newBonus) {
            this.nestedBonus = newBonus;
            return this;
        }

        public ClientBuilder name(String newName) {
            this.nestedName = newName;
            return this;
        }

        public ClientBuilder salary(int newSalary) {
            this.nestedSalary = newSalary;
            return this;
        }

        public Client createClient() {
            return new Client(nestedDebt, nestedBonus, nestedName, nestedSalary);
        }
    }
}