package Tasks;

import java.util.Scanner;

public class ATM_Interface  {
    static int balance = 5000;
    static int withdraw;
    static int deposit;
    static int transferAmount;
    static int updatedBalance;
    static int receiverAccount;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter user id: ");
        int userId = input.nextInt();

        System.out.print("Enter user pin: ");
        int userPin = input.nextInt();

        if (userId == 987654 && userPin == 1234) {
            System.out.println("\nAccess granted!\n");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nTransaction History");
                    System.out.println("Your current balance is " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = input.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("=====================");
                        System.out.println("\nWithdraw successful");
                        System.out.println("Your current balance is " + balance);
                        System.out.println("======================");
                    } else {
                        System.out.println("\nInsufficient balance");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    deposit = input.nextInt();
                    balance = balance + deposit;
                    System.out.println("====================");
                    System.out.println("\nDeposit successful");
                    System.out.println("Your current balance is " + balance);
                    System.out.println("====================");
                    break;
                case 4:
                    System.out.println("Enter the receiver's account number: ");
                    receiverAccount = input.nextInt();

                    System.out.println("Enter the amount to be transferred: ");
                    transferAmount = input.nextInt();

                    if (transferAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        updatedBalance = balance - transferAmount;
                        System.out.println("===============================");
                        System.out.println("Money transferred successfully!");
                        System.out.println("Your updated balance is: " + updatedBalance);
                        System.out.println("===============================");
                    }
                    break;
                case 5:
                    System.out.println("==================================");
                    System.out.println("\nThank you for using our services");
                    System.out.println("===================================");
                    System.exit(0);
                default:
                    System.out.println("================");
                    System.out.println("\nInvalid choice");
                    System.out.println("================");
            }
        } else {
            System.out.println("\nAccess denied");
        }

    }
}
