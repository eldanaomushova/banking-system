# Personal account banking system

 The PersonalAccount class represents a personal bank account.
 It allows for depositing and withdrawing money while keeping track of transaction history.

 



## Usage
```java
import java.util.ArrayList;


public class PersonalAccount {
    // Fields
    private int accountNumber;          // The account number
    private String accountHolder;       // The account holder's name
    private double balance;             // The current balance
    public ArrayList<Amount> transactions = new ArrayList<>(); // Stores transaction history

    /**
     * Creates a new PersonalAccount with the specified account number and account holder.
     * Initializes the balance to 0.0.
     *
     * @param accountNumber The account number.
     * @param accountHolder The account holder's name.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    /**
     * Deposit the specified amount into the account.
     * Adds a "deposit" transaction to the transaction history.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        Amount a = new Amount(amount, "deposit");
        balance += amount;
        transactions.add(a);
        System.out.println("The deposit: " + amount);
        System.out.println("You have now " + getBalance());
    }

    /**
     * Withdraw the specified amount from the account if the balance is sufficient.
     * Adds a "withdraw" transaction to the transaction history.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        Amount a = new Amount(amount, "withdraw");
        if (balance >= amount) {
            balance -= amount;
            transactions.add(a);
            System.out.println("The amount: " + amount);
            System.out.println("You have now " + getBalance());
        } else {
            System.out.println("Not enough balance");
        }
    }

    /**
     * Print the transaction history for this account.
     * Displays details of all deposits and withdrawals.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for " + getAccountHolder() + " Account #" + getAccountNumber());
        for (Amount transaction : transactions) {
            System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
        }
    }

    /**
     * Get the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Get the account number.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get the account holder's name.
     *
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}

/**
 * The Amount class represents a financial transaction.
 * It includes the transaction amount and type.
 */
public class Amount {
    // Fields
    private double amount;            // The transaction amount
    private String transactionType;   // The transaction type ("deposit" or "withdraw")

    /**
     * Creates a new Amount object with the specified amount and transaction type.
     *
     * @param amount          The transaction amount.
     * @param transactionType The transaction type ("deposit" or "withdraw").
     */
    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Get the transaction amount.
     *
     * @return The transaction amount.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Get the transaction type.
     *
     * @return The transaction type ("deposit" or "withdraw").
     */
    public String getDescription() {
        return this.transactionType;
    }
}

/**
 * The Main class contains the main method for running the program.
 */
import java.util.Scanner;

public class Main {
    /**
     * The main method is the entry point of the program.
     * It creates a PersonalAccount, performs operations, and prints the transaction history.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonalAccount personalAccount = new PersonalAccount(4169, "Eldana");
        personalAccount.deposit(5000);
        personalAccount.withdraw(100);
        personalAccount.deposit(3000);
        personalAccount.withdraw(200);
        personalAccount.printTransactionHistory();
    }
}


```
     