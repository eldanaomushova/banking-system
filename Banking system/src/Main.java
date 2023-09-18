import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        PersonalAccount personalAccount = new PersonalAccount(4169, "Eldana");
        personalAccount.deposit(5000);
        personalAccount.withdraw(100);
        personalAccount.deposit(3000);
        personalAccount.withdraw(200);
        personalAccount.printTransactionHistory();
    }
}