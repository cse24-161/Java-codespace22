import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private int accountCounter;

    public Bank() {
        customers = new ArrayList<>();
        accountCounter = 1000;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Added new customer: " + customer.getFullName());
    }

    public String generateAccountNumber() {
        return "ACC" + (accountCounter++);
    }

    public void addMonthlyInterestToAccounts() {
        for (Customer c : customers) {
            for (Account a : c.getAccounts()) {
                a.addMonthlyInterest();
            }
        }
    }
}

