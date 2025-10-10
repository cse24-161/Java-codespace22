public class ChequeAccount extends Account {

    public ChequeAccount(String accountNumber, double initialBalance, String branch, Customer customer) {
        super(accountNumber, initialBalance, branch, customer);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Cheque Account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    @Override
    public void addMonthlyInterest() {
        // Cheque accounts usually do not earn interest
        System.out.println("Cheque Account " + accountNumber + " does not earn interest.");
    }
}

