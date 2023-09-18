public class Amount {
    private double amount;
    private String transactionType; //type of transaction "deposit" or "withdraw"

    public Amount(double amount, String transactionType) { //constructor allows to prepare an instance so that it is ready to use the moment it is needed
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public double getAmount() { //used to retrieve the value of amount
        return amount;
    }

    public String getDescription() { //used to retrieve the value of transactionType
        return transactionType;
    }
}
