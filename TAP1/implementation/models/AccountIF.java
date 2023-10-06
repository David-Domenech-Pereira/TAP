package TAP1.implementation.models;

public class AccountIF extends Account {
    //interest_rate = 0.34, we cannot retrieve money

    public AccountIF(int id, Customer customer) {
        super(id, customer);
        interestRate = 0.34;

    }
    @Override
    public void withdrawMoney(double amount){
        return;
    }
}
