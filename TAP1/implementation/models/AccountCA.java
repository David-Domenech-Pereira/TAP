package TAP1.implementation.models;

public class AccountCA extends Account {
    private double interestRate = 0.1;

    public AccountCA(int id) {
        super(id);

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
