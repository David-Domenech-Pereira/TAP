package TAP1.implementation.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    
    //list of customers and list of accounts
    private List<Customer> customers;
    private List<Account> accounts;

    public Bank(){
        customers = new ArrayList<>();
        accounts = new ArrayList<>();

    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        //check if the customer has accounts, in that case, do not remove
        if(customer.getAccounts().isEmpty()){
        customers.remove(customer);
        }
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public List<Account> getAccounts() {
        return accounts;
    }
}
