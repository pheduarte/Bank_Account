
package bank_account;

import java.util.Scanner;

public class Check extends Account {
   @Override
   public void showInfo() {
      System.out.println("Check account balance: $" + balance);
   }

   // Calculate compound interest
   @Override
   public double compound() {
       return 0;
   }
   
   @Override
   public void limit(){       
   }
}