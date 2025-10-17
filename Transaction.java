import java.util.Date;

public class Transaction {
    private final String transactionId;
    private final Date date;
    private String accountType;
    private double amount;

    public Transaction(String transactionId, String accountType, double amount, double postBalance) {
        this.transactionId = transactionId;
        this.date = new Date();
        this.accountType = accountType;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    @Override
    public String toString() {
        return "Transaction ID: " + transactionId +
                ", Date: " + date +
                ", Account Type: " + accountType +
                ", Amount: " + amount;
    }


}

