package bank_account;

//Create an abstract class for the account

import java.util.Scanner;

public abstract class Account {
    
    //Properties for all accounts
    final String accName;
    protected double balance;
    final String tfn;
    
    protected String accNumber;
    
    //Create a constructor to set up the account
    protected Account() {
        //Prompts the user for account name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! To create a new account, please type your name: ");       
        accName = scanner.nextLine();
        
        //Prompts the user for initial deposit
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the initial deposit: ");
        balance = scanner2.nextDouble();
        
        //Prompts the user for tfn number
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Type your tfn number: ");       
        tfn = scanner3.nextLine();
            
        //Set account number
        accNumber = genAccNumber();                       
    }
      
    //Generate account number
    private String genAccNumber() {
            
            //Get a 3 digits random number
            int randNumb = (int) (Math.random() * 1000);
            
            //Get the first 3 digits of TFN
            String firstThree = tfn.substring(0, 3);
            
            return "XXXPH" + firstThree + randNumb ;
        }
    
    public void deposit(){
        System.out.println("Plese informe the deposit amount: ");
        
        Scanner scanner = new Scanner(System.in);
               
        balance += scanner.nextDouble();
    }
    
    public void withdrawal(){
        System.out.println("Plese informe the amount you want to withdraw: ");
        
        Scanner scanner = new Scanner(System.in);
               
        balance -= scanner.nextDouble();
    }
    
    public void showInfo() {
        System.out.println("Account: " + accName + " Number: " + accNumber + " Balance: $" + balance);
    }
    
    
}
