/** 
  * Indiana Davis, TCSS 142B, Autum 2013
  */
  
/** Prints dollar symbol, with for loops.
  * @author Indiana Davis
  * @version October 10, 2013
  */

//Runs the loop.
public class DollarFigure{

/** Outputs dollar symbol to the console using for loops. 
  * @param args not used, ignored. */

   public static void main(String[] args){
      //Sets the for loops.
      for (int h = 1; h <= 7; h++){
          for (int j = 1; j <= ((h - 1) * 2); j++){
            System.out.print("*");
          }
      for (int i = 7; i >= h; i--){
            System.out.print("$");
      }
      for (int k = 7; k >= h; k--){
            System.out.print("**");
         }
      for (int m = 7; m >= h; m--){
            System.out.print("$");
}
      for (int n = 2; n <= h; n++){
            System.out.print("**");
}
            System.out.println();
   }
   }
}