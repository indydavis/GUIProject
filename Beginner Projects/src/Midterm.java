import java.util.*;
/** Indiana Davis
  * TCSS 142B, Autum
  * October 24, 2013
  */
public class Midterm{
/** Calls methods to be carried out.
  * @param args not used, ignored.
  * @author Indiana Davis
  */
   public static void main(String[] args){
      meta();
      slashO(6);
      intercepts(1, -2, 1);
   }
   // Prints lines onto the console.
   public static void meta(){
      System.out.println("public class ThisIs { \\\\ Outputs This is Java");
      System.out.println("   public static void main(String[] args) {");
      System.out.println("      System.out.print(\"This is Java!\");");
      System.out.println("   }");
      System.out.println("}");
   }
   //Prints a box with a slash.
   public static void slashO(int a){
      for(int i = 1; i <= a; i++){
         for(int y = 1; y <= (i - 1); y++){
            System.out.print("o");
         }
         for(int h = 1; h <= (i / i); h++){
            System.out.print("\\");
         }
         for(int m = (a - 1); m >= i; m--){
            System.out.print("o");
         }
         System.out.println();
     }
   }
   //Prints out the intercepts of the parameters.
   public static void intercepts(double a, double b, double c){
      c = b * b - 4 * a * c;
      b = b * -1;
      a = 2 * a;
      double sum = (b + Math.sqrt(c)) / a;
      double sum2 = (b - Math.sqrt(c)) / a;
         if (a == 0){
            System.out.println("Not a quadratic function.");
         }else if (c < 0){
            System.out.println("Has no intercepts.");
         }else if(sum == sum2){      
            System.out.print("Intercepts: " + sum2);
         }else{
            System.out.print("Intercepts: " + sum + ", " + sum2);
         }
    }
}