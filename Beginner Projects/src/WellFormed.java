/* Indiana Davis, TCSS 142B, October 3, 2013
 * This program prints instructions on the screen*/
 
/** Outputs instructions to the console
  * @author Indiana Davis
  * @version 1.0 */
class WellFormed{
   /** Main method, displays instructions. 
     * @param args is not used, ignored. */ 
   public static void main(String[] args){
      //First phrase
      System.out.println("A well-formed Java program has");
      System.out.println("a main method with { and }");
      System.out.println("braces.");
      System.out.println();
      //Second phrase
      System.out.println("A System.out.println statement");
      System.out.println("has ( and ) and usually a");
      System.out.println("String that starts and ends");
      System.out.println("with a \" character.");
      System.out.println("(But we type \\\" instead!)");
   }
}