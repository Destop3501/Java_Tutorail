
import java.util.Scanner;

public class BankStatementFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter 10-digit account name: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter current balance: ");
        double balance = scanner.nextDouble();

        StringBuilder statement = new StringBuilder();
        statement.append("Account Holder: ").append(name).append(", Balance: Rs. ").append(balance);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter transaction " + i + " description (e.g., \"Deposit - Rs. 5000\"): ");
            String transaction = scanner.nextLine();
            statement.append(transaction).append("\n");
        }

        String firstTwo = accountNumber.substring(0, 2);
        String lastTwo = accountNumber.substring(accountNumber.length() - 2);
        String maskedMiddle = "******";

        String maskedAccount = firstTwo.concat(maskedMiddle).concat(lastTwo);

        System.out.println(statement.toString());
        System.out.println("Masked Account Number: " + maskedAccount);

        scanner.close();
    }
}
