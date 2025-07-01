
package bank_account;

import java.util.Scanner;


public class Bank_Account {

    public static void main(String[] args) {
        
        
        
        Savings newSavings = new Savings();
        
        newSavings.showInfo();
        
        newSavings.deposit();
        newSavings.showInfo();
        
        newSavings.withdrawal();
        newSavings.showInfo();
    }
    
}
