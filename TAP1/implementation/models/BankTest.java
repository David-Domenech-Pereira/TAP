import java.util.ArrayList;
import java.util.List;



public class BankTest {

    private Bank bank;
    private Customer customer1;
    private Customer customer2;
    private Account account1;
    private Account account2;

    @Before
    public void setUp() {
        bank = new Bank();
        customer1 = new Customer(1, "Doe", "address", "phone");
        customer2 = new Customer(2, "Doe", "address", "phone");
        account1 = new Account(1, customer1);
        account2 = new Account(2, customer2);
    }


    @Test
    public void testRemoveCustomerWithAccounts() {
        bank.addCustomer(customer1);
        bank.addAccount(account1);
        bank.removeCustomer(customer1);
        assertTrue(bank.getCustomers().contains(customer1));
    }

    @Test
    public void testAddAccount() {
        bank.addAccount(account1);
        assertTrue(bank.getAccounts().contains(account1));
    }

    @Test
    public void testRemoveAccount() {
        bank.addAccount(account1);
        bank.removeAccount(account1);
        assertFalse(bank.getAccounts().contains(account1));
    }

    @Test
    public void testGetCustomers() {
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        assertEquals(2, bank.getCustomers().size());
    }

    @Test
    public void testGetAccounts() {
        bank.addAccount(account1);
        bank.addAccount(account2);
        assertEquals(2, bank.getAccounts().size());
    }
}