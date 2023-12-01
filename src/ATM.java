// package jex;
import java.util.*;

class ATM {
    public static void main(String[] args) {
        // declare and initialize balance, withdraw, and deposit
        int balance = 50000;
        int withdraw, deposit;

        // create scanner class object to get the choice of the user
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM ... ");
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 for EXIT");
            System.out.print("Select the appropriate option you want to perform: ");

            // get the user-selected option
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    // accept the withdrawal amount from the user
                    withdraw = sc.nextInt();
                    // call the function and update the balance
                    balance = withdraw(balance, withdraw);
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    // accept the deposit amount from the user
                    deposit = sc.nextInt();
                    // call the function and update the balance
                    balance = deposit(balance, deposit);
                    break;
                case 3:
                    // print the total balance of the user
                    printBalance(balance);
                    System.out.println();
                    break;
                case 4:
                    // exit from the menu
                    System.exit(0);
            }
        }
    }

    // function to print the current balance in an account
    public static void printBalance(int balance) {
        System.out.println("The Current Balance: " + balance);
        System.out.println();
    }

    // The function to withdraw an amount and update the balance
    public static int withdraw(int balance, int withdrawAmount) {
        System.out.println("Withdrawal Operation:");
        System.out.println("The withdrawal Amount is: " + withdrawAmount);

        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money and remove the card");
            printBalance(balance);
        } else {
            System.out.println("Sorry! the balance is insufficient.");
            System.out.println();
        }
        return balance;
    }

    // The function to deposit an amount and update the balance
    public static int deposit(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("The depositing amount is: " + depositAmount);

        balance += depositAmount;
        System.out.println("Your Money has been successfully deposited");
        printBalance(balance);

        return balance;
    }
}

