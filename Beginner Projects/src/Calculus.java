import java.util.*;
import java.io.*;
/** Indiana Davis
  * Calculus
  * TCSS 143B - Autumn 2013
  * Calculus 1
  */
/** This program computes various calculus formulas.
  * @author Indiana Davis
  * @version January 1, 2013
  */
public class Calculus{
   /** Main method, links to other methods.
	  * @param args is not used, ignored.
	  */
   public static void main(String[] args){
      int[] array = {4, 9, 5, 4, 7, 6};
      //System.out.println(populationStandardDeviation(array));
      //System.out.println(sampleStandardDeviation(array));
      System.out.println(limit());
   }
   public static double populationStandardDeviation(int[] array){
      double sum = 0.0;
      double average = 0.0;
      double num = 0.0;
      for(int i = 0; i <= array.length - 1; i++){
         sum += array[i];
      }
         average = sum / array.length;
      for(int i = 0; i <= array.length - 1; i++){
         num += Math.pow(array[i] - average, 2);
      }
      num = num / (array.length - 1);
      return Math.sqrt(num);
   }
   public static double sampleStandardDeviation(int[] array){
      double sum = 0.0;
      double average = 0.0;
      double num = 0.0;
      for(int i = 0; i <= array.length - 1; i++){
         sum += array[i];
      }
         average = sum / array.length;
      for(int i = 0; i <= array.length - 1; i++){
         num += Math.pow(array[i] - average, 2);
      }
      num = num / (array.length - 2);
      return Math.sqrt(num);
   }
   //public static void top(){
   
   public static String limit(){
      Scanner number = new Scanner(System.in);
      double x = number.nextDouble();
      double top = (3 * x + 6);
      double bottom = x - 2;
      String formula = top + "\n_\n" + bottom;
      return formula;
   }
}