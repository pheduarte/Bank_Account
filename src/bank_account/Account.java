package bank_account;

//Create an abstract class for the account

import java.util.Scanner;

public abstract class Account {

    // Properties for all accounts
    protected double balance = 0;
    protected String accNumber;
    public double baseRate = 0.0485;

    //Implement deposit capability
    public void deposit(Scanner scanner) {
        System.out.println("Plese informe the deposit amount: ");
        balance += scanner.nextDouble();
        System.out.println("Your new balance: " + balance);
    }

    //Implement withdrawal capability
    public void withdrawal(Scanner scanner) {
        double value;
        
        System.out.println("Plese informe the amount you want to withdraw: ");
        
        value = scanner.nextDouble();
        scanner.nextLine(); //Clear scanner
        
        //Check if the balance is sufficient
        if (value > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        //Check if the available notes 20, 50, or 100
            if (value % 20 == 0 || value % 50 == 0 || value % 100 == 0) {
                System.out.println("Take your money");
            } else {
                System.out.println("Only $20, $50, and $100 notes available from this ATM.");
            }
            
            balance -= value;
            
            System.out.println("Your new balance: " + balance);
    }

    //Display account information
    public abstract void showInfo();

    //Calculate compound interest
    public abstract void compound();
}
