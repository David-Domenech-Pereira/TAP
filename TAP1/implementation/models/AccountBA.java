package TAP1.implementation.models;

public class AccountBA extends Account {
    //interest_rate = 0.6

    public AccountBA(int id, Customer customer) {
        super(id, customer);
        interestRate = 0.6;

    }
}
