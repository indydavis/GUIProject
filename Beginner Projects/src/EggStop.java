/* Indiana Davis, TCSS 142B, October 3, 2013
 * This program prints characters on the screen*/
 
/** Outputs characters to the console
  * @author Indiana Davis
  * @version 1.0 */
class EggStop{
   /** Main method, displays characters. 
     * @param args is not used, ignored. */ 
   public static void main(String[] args){
      //methods to get the characters
      method1();
      method2();
      System.out.println();
      method1();
      method2();
      method3();
      System.out.println();
      method1();
      System.out.println("|  Stop  |");
      method2();
      method3();
   }
   /** Method 1, displays characters. 
     * @param args is not used, ignored. */ 
   public static void method1(){
      //Characters
      System.out.println("  ______");
      System.out.println(" /      \\");
      System.out.println("/        \\");
   }
   /** Method 2, displays characters. 
     * @param args is not used, ignored. */ 
   public static void method2(){
      //Characters
      System.out.println("\\        /");
      System.out.println(" \\______/");
   }
   /** Method 3, displays characters. 
     * @param args is not used, ignored. */ 
   public static void method3(){
      //Characters
      System.out.println("+--------+");
   }
}