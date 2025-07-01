
package bank_account;


public class Fixed extends Account {
   @Override
   public void showInfo(){
    System.out.println("Fixed account: " + accName + " Number: " + accNumber + " Balance: $" + balance);  
   }
   
   @Override
    public void compound() {
       balance *= Math.pow(1 + baseRate, 30.0 / 365);
    }
}
