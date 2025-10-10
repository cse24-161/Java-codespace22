public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double initialBalance, String branch, Customer customer) {
        super(accountNumber, initialBalance, branch, customer);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Savings Account.");
    }

    @Override
    public void addMonthlyInterest() {
        double interest = balance * 0.0005; // 0.05%
        balance += interest;
        System.out.println("Added monthly interest (0.05%) to Savings Account " + accountNumber);
    }
}


