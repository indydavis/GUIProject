/** Indiana Davis
  * BankAccount
  * TCSS 143B - Winter 2014
  */
/** This program links up with multiple classes to provide bank account information.
  * @author Indiana Davis
  * @version January 18, 2014
  */
public class BankAccount{

   String nameOfOwner;
   double interestRate;
   double balance;
   int myMonthlyWithdrawCount;
   double myMonthlyServiceCharges;   
      
   /** method BankAccount, begins the program by setting importaunt perameters.
     * @param String, used to get the name of the owner of the account.
     * @param interestRate, used to get the interest rate for the account.
     */
   public BankAccount(final String nameOfOwner, final double interestRate){
      this.nameOfOwner = nameOfOwner;
      balance = 0.00;
      myMonthlyWithdrawCount = 0;
      myMonthlyServiceCharges = 0.00;
      if(interestRate > 0){
         this.interestRate = interestRate;
      }
   }
      /** method getBalance, used to get the current balance of the account.
     */
   public double getBalance(){
      return balance;
   }
   /** method processDeposit, deposits amount into the balance of the account if amount is adiquate.
     * @param amount, used to get the amount of the deposit.
     */
   public boolean processDeposit(final double amount){
      boolean deposit = false;
      if(amount > 0){
         this.balance += amount;
         deposit = true;
      }
      return deposit;
   }
   /** method processWithdrawal, used to withdrawal amount from the balance if adiquate.
     * @param amount, used to get the amount to withdrawal.
     */
   public boolean processWithdrawal(final double amount){
      boolean withdrawal = false;
      if(amount > 0 && amount <= balance){
         balance -= amount;
         withdrawal = true;
         myMonthlyWithdrawCount++;
      }
      return withdrawal;
   }
   /** method calculateInterest, used to calculate the interest for the account.
     */
   public double calculateInterest(){
      double interest = 0;
      interest = (balance * interestRate) / 12;
      return interest;
   }
   /** method performMonthlyProcess, preforms monthly account processes.
     */
   public void performMonthlyProcess(){
      if(balance >= myMonthlyServiceCharges){
         balance -= myMonthlyServiceCharges;
         balance += calculateInterest();
      }else{
         balance = 0;
      }
      myMonthlyWithdrawCount = 0;
      myMonthlyServiceCharges = 0;
   }
   /** method toString, used to desplay the account information.
     */
   public String toString(){
      String bankInfo = "BankAccount[owner: " + nameOfOwner + ", balance: " + balance + ", interest rate: " + 
         interestRate + "\n\tnumber of withdrawals this month: " + myMonthlyWithdrawCount + 
         ", service charges this month: " + myMonthlyServiceCharges + "]"; 
      return bankInfo; 
   }
   /** method setAccountHolderName, sets the name of owner.
     * @param newName gets the name of the account holder.
     */
   public void setAccountHolderName(final String newName){
      nameOfOwner = newName;
   }
   /** method getAccountHolderName returns the name of the owner of the account.
     */
   public String getAccountHolderName(){
      return nameOfOwner;      
   }
}