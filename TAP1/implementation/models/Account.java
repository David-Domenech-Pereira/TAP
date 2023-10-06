package TAP1.implementation.models;

public class Account{
    //all accounts have a comission of 10 eusros
    private static final double COMISSION = 10.0;
    private int id;
    protected double money;
    private Customer customer;
    protected double interestRate;
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        this.customer.addAccount(this); //add account to customer
    }
    /*
     * @brief deposit money in the account
     * @param amount the amount of money to deposit
     * @pre amount > 0
     */
    public void depositMoney(double amount){
        money= money + amount;
    } 

    /*
     * @brief withdraw money from the account
     * @param amount the amount of money to withdraw
     * 
     */
    public void withdrawMoney(double amount){
        //balance > 0
        if(money - amount >= 0){
            money = money - amount;
        }
    }
    /*
     * @brief check the balance of the account
     */
    public  double checkBalance(){
        return money;
    }
    /*
     * @brief change the customer of the account
     * @param customer the new customer
     */
    public void changeCustomer(Customer customer){
        this.customer.removeAccount(this);
        this.customer = customer;
        this.customer.addAccount(this);
    }
    /*
     * @brief get the customer of the account
     */
    public void monthlyRevision(){
        //balance = balance + balance * interest_rate - accout_comission
        money = money + money * interestRate - COMISSION;
    }

}

