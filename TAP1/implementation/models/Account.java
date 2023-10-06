package TAP1.implementation.models;

public class Account {
    // all accounts have a comission of 10 eusros
    private static final double COMISSION = 10.0;
    private int id;
    private double money;
    private Customer customer;

    public Account(int id) {
        this.id = id;
    }

    public void depositMoney(double amount) {
        money = money + amount;
    }

    public void withdrawMoney(double amount) {
        // balance > 0
        if (money - amount >= 0) {
            money = money - amount;
        }
    }

    public double checkBalance() {
        return money;
    }

    public void changeCus(Customer customer) {
        this.customer = customer;
    }

}
