import java.util.Objects;
import java.util.Scanner;

/**
 * The Main class is the entry point of the application, providing a simple banking system interface.
 */
public class Main {
    public static void main(String[] args) {
        DateAndTime dateAndTime = new DateAndTime();
        ChequingAccount chequingAccount = new ChequingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CreditCard creditCard = new CreditCard();
        User user = new User();

        System.out.println("\nWelcome to the bank!\n");

        Scanner scanner = new Scanner(System.in);

        boolean isAuthenticated = false;

        //authentication loop
        while (!isAuthenticated) {
            System.out.println("Please enter your login details: \n");

            System.out.println("Please enter your username: ");
            String username = scanner.next();
            if (!Objects.equals(username, user.getUsername())) {
                System.out.println("Incorrect username, please try again.");
                continue; //restart login
            }

            System.out.println("Please enter your password: ");
            String password = scanner.next();
            if (!Objects.equals(password, user.getPassword())) {
                System.out.println("Incorrect password, please try again.");
                continue; //restart login
            }

            isAuthenticated = true; //login successful
        }

        //application menu
        while (true) {
            System.out.println("\nPlease select from the following options:\n");
            System.out.println("----------------------------------------------");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("----------------------------------------------");

            int choice = scanner.nextInt();

            //view balance
            if (choice == 1) {
                System.out.println("\nYour choice: View Balance\n");
                System.out.println("Which account would you like to view?\n");
                System.out.println("----------------------------------------------");
                System.out.println("1. Chequings");
                System.out.println("2. Savings");
                System.out.println("3. Credit Card");
                System.out.println("----------------------------------------------");

                int accountChoice = scanner.nextInt();
                scanner.nextLine();

                if (accountChoice == 1) { //chequing
                    System.out.println("\nYour choice: Chequing Account\n");
                    System.out.printf("Your chequings account balance is: $%.2f", chequingAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (accountChoice == 2) { //savings
                    System.out.println("\nYour choice: Savings Account\n");
                    System.out.printf("Your savings account balance is: $%.2f", savingsAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (accountChoice == 3) { //credit card
                    System.out.println("\nYour choice: Credit Card\n");
                    System.out.printf("Your credit card balance is: $%.2f", creditCard.getBalance());
                    System.out.printf("\nYour credit limit is: $%.2f", creditCard.getBalanceLimit());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else {
                    System.out.println("\nError! Invalid account choice.");
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                }

            }
            //deposit to account
            else if (choice == 2) {
                System.out.println("\nYour choice: Deposit\n");
                System.out.println("----------------------------------------------");
                System.out.println("Which account would you like to deposit to?\n");
                System.out.println("1. Chequings");
                System.out.println("2. Savings");
                System.out.println("3. Credit Card");
                System.out.println("----------------------------------------------");

                int depositToAccount = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Please enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                scanner.nextLine();

                if (depositToAccount == 1) { //chequing
                    chequingAccount.setDeposit(depositAmount);
                    System.out.printf("Your new balance is: $%.2f", chequingAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (depositToAccount == 2) { //savings
                    savingsAccount.setDeposit(depositAmount);
                    System.out.printf("Your new balance is: $%.2f", savingsAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (depositToAccount == 3) { //credit card
                    creditCard.setDeposit(depositAmount);
                    System.out.printf("Your new balance is: $%.2f", creditCard.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else {
                    System.out.println("\nError! Invalid account choice.");
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                }

            }
            //withdraw from account
            else if (choice == 3) {
                System.out.println("\nYour choice: Withdraw\n");
                System.out.println("Which account would you like to withdraw from?\n");
                System.out.println("----------------------------------------------");
                System.out.println("1. Chequings");
                System.out.println("2. Savings");
                System.out.println("3. Credit Card");
                System.out.println("----------------------------------------------");

                int withdrawFromAccount = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Please enter the amount to withdraw: ");
                double withdrawalAmount = scanner.nextDouble();
                scanner.nextLine();

                if (withdrawFromAccount == 1) { //chequing
                    chequingAccount.setWithdrawal(withdrawalAmount);
                    System.out.printf("Your new balance is: $%.2f", chequingAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (withdrawFromAccount == 2) { //savings
                    savingsAccount.setWithdrawal(withdrawalAmount);
                    System.out.printf("Your new balance is: $%.2f", savingsAccount.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else if (withdrawFromAccount == 3) { //credit card
                    creditCard.setWithdrawal(withdrawalAmount);
                    System.out.printf("Your new balance is: $%.2f", creditCard.getBalance());
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                } else {
                    System.out.println("\nError! Invalid account choice.");
                    System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
                }

            }
            //non validated
            else {
                System.out.println("\nError! Invalid choice, please try again.");
                System.out.println("\nProcessed request at: " + dateAndTime.timeStamp());
            }
        }
    }
}




