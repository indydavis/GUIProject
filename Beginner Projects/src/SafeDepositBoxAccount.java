/** Indiana Davis
  * BankAccount
  * TCSS 143B - Winter 2014
  */
/** This program links up with multiple classes to provide bank account information.
  * @author Indiana Davis
  * @version January 18, 2014
  */
  
public class SafeDepositBoxAccount implements NamedAccount{
  
   String nameOfHolder;
   /** method SafeDepositBoxAccount, sets the name of the account holder.
     * @param nameOfHolder, used to get the name of the holder for the account.
     */
   public SafeDepositBoxAccount(final String nameOfHolder){
      this.nameOfHolder = nameOfHolder;
   }
   /** method getAccountHolderName, returns the name of the account holder.
     */
   public String getAccountHolderName(){
      return nameOfHolder;
   }
   /** method setAccountHolderName, changes the name of the account holder to the given name.
     * @parm newName, used to get the new name of the account holder.
     */
   public void setAccountHolderName(final String newName){
      this.nameOfHolder = newName;
   }
   /** method toString, used to desplay the account information.
     */
   public String toString(){
      String safeInfo = "";
      safeInfo = "SavingsAccount[owner: " + nameOfHolder + "]";
      return safeInfo;
   }
}