package TAP1.implementation.models;

public class AccountSA extends Account {
    
    //interest_rate = 0.2

    public AccountSA(int id, Customer customer) {
        super(id, customer);
        interestRate = 0.2;

    }

}
