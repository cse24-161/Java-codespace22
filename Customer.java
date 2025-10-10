import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String surName;
    private String address;
    private String companyName;
    private String companyAddress;
    private List<Account> accounts;

    public Customer(String firstName, String surName, String address) {
        this.firstName = firstName;
        this.surName = surName;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void setEmploymentInfo(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public boolean isEmployed() {
        return companyName != null && !companyName.isEmpty();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getFullName() {
        return firstName + " " + surName;
    }
}

