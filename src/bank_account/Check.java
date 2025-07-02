
package bank_account;


public class Check extends Account {
   @Override
   public void showInfo(){
    System.out.println("Check account"  + " balance: $" + balance);  
   }
   
   @Override
    public void compound() {
       balance *= Math.pow(1 + baseRate, 30.0 / 365);
    }
}