/** Indiana Davis
  * BankAccount
  * TCSS 143B - Winter 2014
  */
/** This program links up with multiple classes to provide bank account information.
  * @author Indiana Davis
  * @version January 18, 2014
  */
public class SavingsAccount extends BankAccount{
   
   int myMonthlyServiceCharges = 0;
   boolean myStatusIsActive;
   /** method BankAccount, begins the program by setting importaunt perameters.
     * @param String, used to get the name of the owner of the account.
     * @param interestRate, used to get the interest rate for the account.
     */
   public SavingsAccount(final String nameOfOwner, final double interestRate){
      super(nameOfOwner, interestRate);
      myStatusIsActive = false;
   }
   /** method processDeposit, deposits amount into the balance of the account if amount is adiquate.
     * @param amount, used to get the amount of the deposit.
     */
   public boolean processDeposit(final double amount){
      boolean deposit = super.processDeposit(amount);
      if(getBalance() >= 25){
         myStatusIsActive = true;
      }
      return deposit;
   }
   /** method processWithdrawal, used to withdrawal amount from the balance if adiquate and account is active.
     * @param amount, used to get the amount to withdrawal.
     */
   public boolean processWithdrawal(final double amount){
      boolean withdrawal = super.processWithdrawal(amount);
      if(myStatusIsActive && myMonthlyWithdrawCount >= 5){
         myMonthlyServiceCharges++;
      }else{
         balance += amount;
         withdrawal = false;
      }
      return withdrawal;
   }
   /** method performMonthlyProcess, preforms monthly account processes.
     */
   public void performMonthlyProcess(){
      super.performMonthlyProcess();
      if(getBalance() >= 25){
         myStatusIsActive = true;
      }else{
         myStatusIsActive = false;
      }
   }
   /** method toString, used to desplay the account information.
     */
   public String toString(){
      String savingsInfo = "SavingsAccount[owner: " + nameOfOwner + ", balance: " + balance + ", interest rate: " 
      + interestRate + "\n number of withdrawals this month: " + myMonthlyWithdrawCount + 
         ", service charges this month: " + myMonthlyServiceCharges + ", myStatusIsActive: " + 
         myStatusIsActive + "]";
      return savingsInfo; 
   }
}