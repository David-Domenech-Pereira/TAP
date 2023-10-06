package TAP1.implementation.models;

public class AccountCA extends Account {
    

    public AccountCA(int id, Customer customer) {
        super(id, customer);
        interestRate = 0.1;

    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void monthlyRevision(){
        //balance = balance + balance * interest_rate - accout_comission
        money = money + money * interestRate;
    }
}
