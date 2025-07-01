
package bank_account;


public class Check extends Account {
    @Override
   public void showInfo(){
    System.out.println("Check account: " + accName + " Number: " + accNumber + " Balance: $" + balance);  
   }
}
