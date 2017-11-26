import java.util.*;
/** 
  * Indiana Davis
  * TCSS 142B
  * Autum 2013
  * Lab 4
  */
  
/** Carries out functions based on input.
  * @author Indiana Davis
  * @version October 17, 2013
  */

//Runs the programs.
public class Lab4{

/** 
  * Calls on different methods. 
  * @param args not used, ignored. 
  */
   public static void main (String[] args){
   printNumbers(20);
   printPowersOf2(15);
   area(5.0);
   printReverse("Java is weird!");
   namedprintGrid(7, 3);
   }
      //Uses a for loop to print numbers in brackets.
      public static void printNumbers(int max){
         for (int i = 1; i <= max; i++){
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
         }
         System.out.println();
       }
      //Prints powers of 2 a given number of times.
      public static void printPowersOf2(int max){
         for (int a = 0; a <= max; a++){
            System.out.print((int) Math.pow(2, a));
            System.out.print(" ");
         }
         System.out.println();
      }
      //Prints the area of a circle given radius.
      public static void area(double max){
         System.out.println(Math.PI * Math.pow(max, 2));
      }
      //Prints a word or phrase backwards.
      public static void printReverse(String input){
         int phrase = input.length();
         for (int q = phrase - 1; q >= 0; q--){
         System.out.print(input.charAt(q));
         }
         System.out.println();
      }
      //Uses a parameter to print rows and columns of numbers.
      public static void namedprintGrid(int rows, int columns){
         for (int p = 1; p <= rows; p++){
            for (int l = 1; l <= columns; l++){
               System.out.print(p + ((l - 1) * rows) + ", ");
            }
               System.out.println();
         }
      }
}