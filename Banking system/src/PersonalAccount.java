import java.util.ArrayList;// class in Java for creating dynamic arrays, which means you can add and remove elements from it without specifying a fixed size.
public class PersonalAccount {
    // creating private variable to not access it from different methods
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public ArrayList<Amount> transactions = new ArrayList<>(); // creating private arraylist transactions from Amount class to store the type of transactions "withdraw" and "deposit"
    public PersonalAccount(int accountNumber, String accountHolder) { //constructor allows to prepare an instance so that it is ready to use the moment it is needed
        this.accountNumber = 0;
        this.accountHolder = String.valueOf(0); // this method converts the integer value 0 to its string representation
        this.balance = 0.0; //set the innitial value 0.0 because it is empty and no value inside
    }
    public void deposit(double amount){ //this method allow us to add amount into our balance
        Amount a = new Amount(amount, "deposit"); //create a new object and take two values of amount object
        balance += amount; //we take the amount from user and add it into our balance
        transactions.add(a); //add this object a to our arraylist transaction
        System.out.println("The deposit: "+ amount);
        System.out.println("You have now " + getBalance()); //print out current balance using method getBalance()
    }
    public void withdraw(double amount){ //this method allow us to withdraw amount from our balance
        Amount a =  new Amount(amount, "withdraw");//create a new object and take two values of amount object
        if(balance > amount){ //we can withdraw money only if we have enough balance
            balance-=amount; //withdraw amount from balance
            transactions.add(a); //add this object a to our arraylist transaction
            System.out.println("The amount: "+ amount);
            System.out.println("You have now " + getBalance());//print out current balance using method getBalance()
        }else{
            System.out.println("Not enough balance"); //if we want to withdraw money and we don't have enough the message prints
        }
    }
    public void printTransactionHistory() {//this method used to print all the history of withdrawing and adding money from our balance
        System.out.println("Transaction History for " + getAccountHolder() + "Account #" + getAccountNumber());
        for (Amount transaction : transactions) { //declaring transaction of type Amount and initializing it with a reference to the arraylist transactions
            System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
        }
    }
    public double getBalance(){ //used to retrieve the value of balance
        return balance;
    }
    public  int getAccountNumber(){ //used to retrieve the value of accountNumber
        return accountNumber;
    }
    public  String getAccountHolder(){ //used to retrieve the value of accountHolder
        return accountHolder;
    }
}



