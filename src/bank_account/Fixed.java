
package bank_account;


public class Fixed extends Account {
   @Override
   public void showInfo(){
    System.out.println("Fixed account: " + accName + " Number: " + accNumber + " Balance: $" + balance);  
   }
}
