package TAP1.implementation.models;

import java.util.List;

public class Customer {
    //Has the following atrributes: ID, name, address and phone number

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    //list of accounts
    private List<Account> accounts;

    public Customer(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
       return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }
    public List<Account> getAccounts(){
        return accounts;
    }
    
}
