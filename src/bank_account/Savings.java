
package bank_account;


public class Savings extends Account {    

   @Override
   public void showInfo(){
    System.out.println("Saving account balance: $" + balance); 
   }
   
   //Calculate compound interest
   @Override
    public void compound() {
       balance *= Math.pow(1 + baseRate, 30.0 / 365);
    }
}
