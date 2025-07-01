
package bank_account;


public class Savings extends Account {    
    
    public Savings() {    
    }

   @Override
   public void showInfo(){
    System.out.println("Saving account: " + accName + " Number: " + accNumber + " Balance: $" + balance);  
   }
    
}
