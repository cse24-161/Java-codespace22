public class InvestmentAccount extends Account {
    private static final double MIN_DEPOSIT = 500.0;

    public InvestmentAccount(String accountNumber, double initialBalance, String branch, Customer customer) {
        super(accountNumber, initialBalance, branch, customer);
        if (initialBalance < MIN_DEPOSIT) {
            throw new IllegalArgumentException("Initial deposit must be at least BWP 500.00");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Investment Account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    @Override
    public void addMonthlyInterest() {
        double interest = balance * 0.05; // 5%
        balance += interest;
        System.out.println("Added 5% monthly interest to Investment Account " + accountNumber);
    }
}
