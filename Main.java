void main() {
    Bank bank = new Bank();

    Customer c1 = new Customer("Abigail", "Mototegi", "Gaborone");
    c1.setEmploymentInfo("BAC Ltd", "Main Mall");

    bank.addCustomer(c1);

    Account inv = new InvestmentAccount(bank.generateAccountNumber(), 1000, "Main Branch", c1);
    Account sav = new SavingsAccount(bank.generateAccountNumber(), 200, "Main Branch", c1);

    c1.addAccount(inv);
    c1.addAccount(sav);

    inv.deposit(500);
    inv.withdraw(300);
    sav.deposit(100);

    bank.addMonthlyInterestToAccounts();

    IO.println("Investment Account Balance: " + inv.getBalance());
    IO.println("Savings Account Balance: " + sav.getBalance());
}

