import java.util.*;
/** Indiana Davis
  * TCSS 142B, Autum
  * October 24, 2013
  */
public class Lab5{
/** Calls methods to be executed.
  * @param args not used, ignored.
  * @author Indiana Davis
  */
   public static void main(String[] args){
      fractionSum(1);
      pow(5, 5);
      printRange(5, 5);
      printGPA();
   }
   /** Uses sum to return increasing values divided by 1. */
   public static double fractionSum(int n){
      double sum = 0;
      for (int i = 1; i <= n; i++){
         sum = sum + (1.0/i);
         }
         return sum;
   }
   /** Takes two parameters and calculates them as base and exponent. */
   public static int pow(int p, int q){
      int sum = 1;
      for (int b = 1; b <= q; b++){
         sum = sum * p;
      }
      return sum;
   }
   /** Takes two parameters and prints out a string of numbers based on the parameters. */
   public static void printRange(int r, int t){
      if (r < t){
      for (int h = r; h <= t; h++){
      System.out.print(h + " "); 
      }
      } else if (r > t){
      for (int o = r; o >= t; o--){
      System.out.print(o + " ");
      }
      } else {
      System.out.print(r);
      }
   }
   /** Requests information from the user and outputs a GPA percentage. */
   public static void printGPA(){
      Scanner GPA = new Scanner(System.in);
      System.out.print("Enter a student record: ");
      String name = GPA.next();
      int number = GPA.nextInt();
      int sum = 0;
      for (int y = 1; y <= number; y++){
         sum += GPA.nextInt();
      }
      System.out.printf(name + "'s grade is %.2f", (double) sum / number);
   }
}