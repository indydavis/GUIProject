import java.util.*;
/* Indiana Davis, TCSS 142B, November 7, 2013
 * This program prints outputs on the screen*/
 
/** Outputs answers to the console
  * @author Indiana Davis
  * @version 1.0 */
public class Lab6{
   /** Main method, calls methods. 
     * @param args is not used, ignored. */ 
   public static void main(String[] args){
   showTwos(18);
   randomX();
   printFactors(24);
   hasMidpoint(3, 1, 3);
   System.out.println(hasMidpoint(3, 1, 3)); 
   diceSum();
   toBinary(42);
   System.out.println(toBinary(42));
   }
   /** Prints out twos based on the number given. */
   public static void showTwos(int t){
   System.out.print(t + " = ");
   while (t % 2 == 0){
      System.out.print(2 + " * " );
      t = t / 2;
         }
      System.out.println(t);
   }
   /** Prints stars to the council. */
   public static void randomX(){
      Random rand = new Random();
      int stars = 0;
      while (stars < 16){
         stars = rand.nextInt(14) + 5;
         for(int i = 0; i <= stars; i++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   /** Prints the factors of the given number */
   public static void printFactors(int a){
      System.out.print("1");
      for(int g = 2; g <= a; g++){
         if (a % g == 0){
            System.out.print(" and " + g);
         }
      }
      System.out.println();
   }
   /** Takes three numbers and checks to see if one is a midpoint. */
   public static boolean hasMidpoint(int a, int b, int c){
      int min = Math.min(Math.min(a, b), c);
      int max = Math.max(Math.max(a, b), c);
      double midpoint = (min + max) / 2;
      return (a == midpoint) || (b == midpoint) || (c == midpoint);
   }
   /** Prints random numbers to the console till it equals the same as the user input. */
   public static void diceSum(){
      Scanner user = new Scanner(System.in);
      Random dice = new Random();
      int sum = 0;
      System.out.print("Desired dice sum: ");
      int number = user.nextInt();
      int dice_1 = 0, dice_2 = 0;
      while (sum != number){
         dice_1 = dice.nextInt(6) + 1;
         dice_2 = dice.nextInt(6) + 1;
         sum = dice_1 + dice_2;
         System.out.println(dice_1 + " and " + dice_2 + " = " + sum);
      }
   }
   public static String toBinary(int number){
      String binary = "";
      while(number > 0){
         if(number % 2 == 0){
            binary = binary + "1";
            number = number / 2;
            if(number % 2 == 1){
               binary = binary + "0";
               number = number / 2;
            }
         }
      }
      return binary;
   }
}
