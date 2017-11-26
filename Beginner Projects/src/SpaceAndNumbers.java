/** 
  * Indiana Davis, TCSS 142B, Autum 2013
  */
  
/** Prints stars, with for loops.
  * @author Indiana Davis
  * @version October 10, 2013
  */

//Runs the loop.
public class SpaceAndNumbers{

/** Outputs numbers to the console using for loops. 
  * @param args not used, ignored. */
  
   public static void main(String[] args){
   //Sets the for loop.
      for (int i = 1; i <= 5; i++){
         for (int j = 1; j >= i; j--){
            System.out.print("    ");
         }
         System.out.println("1");
      }
   }
}
