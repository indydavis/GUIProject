import java.util.*;
import java.io.*;
/** Indiana Davis
  * NumbersMain
  * TCSS 142B - Autumn 2013
  * Homework 7
  */
/** This program prints statistics based on a user inputed random array.
  * @author Indiana Davis
  * @version November 21, 2013
  */
public class NumbersMain{
   /** Main method, links to other methods.
	  * @param args is not used, ignored.
	  */
   public static void main(String[] args){
      int size = 0;
      int rangeMin = -10;
      int rangeMax = 10;
      displayIntroduction();
      size = promptForArraySize(size);
      while(size != -1){
      displayArrayStatistics(size, rangeMin, rangeMax);
      size = promptForArraySize(size);
      }
      System.out.println("Goodbye!");
   }
   /** displayIntroduction method, introduces the user to the program.
     */
   public static void displayIntroduction(){
      System.out.println("This program asks you for an array length and prints statistics " +
         "based on the random numbers within the array.");
   }
   /** promptForArraySize method, prompts the user for an array size between 4 and 15.
     * @param int size, used to get the size of the array.
     */
   public static int promptForArraySize(int size){
      System.out.print("Please enter the size of the array (must be between 4 and 15): ");
      Scanner number = new Scanner(System.in);
      size = number.nextInt();
      while(size != -1 && (size < 4 || size > 15)){
         System.out.println("Please try again. The number must be between 4 and 15: ");
         number = new Scanner(System.in);
         size = number.nextInt();
      }
      return size;
   }
   /** displayArrayStatistics method, used to gather the required information from the array.
     * @param int size, used to provide the size of the array.
     * @param int rangeMin, used to provide the minimum range of the array.
     * @param int rangeMax, used to provide the maximum range of the array.
     */
   public static void displayArrayStatistics(int size, int rangeMin, int rangeMax){
      double average = 0.0;
      double median = 0.0;
      int sum = 0;
      double deviation = 0.0;
      int min = 0;
      int max = 0;
      int[] array = Numbers.createRandomIntArray(size, rangeMin, rangeMax);
      min = Numbers.findMin(array);
      max = Numbers.findMax(array);
      sum = Numbers.calculateSum(array);
      average = Numbers.calculateAverage(array);
      median = Numbers.calculateMedian(array);
      deviation = Numbers.calculateStandardDeviation(array);
      displayExitMessage(min, max, sum, average, median, deviation);
   }
   /** displayExitMessage method, used to display the gathered infomation.
     * @param int min, used to give the minimum of the array.
     * @param int max, used to give the maximum of the array.
     * @param int sum, used to give the sum of the array.
     * @param double average, used to give the average of the array.
     * @param double deviation, used to give the standard deviation of the array.
     */
   public static void displayExitMessage(int min, int max, int sum, double average, double median, double deviation){
      System.out.println("The minimum of the array is: " + min + ".");
      System.out.println("The maximum of the array is: " + max + ".");
      System.out.println("The sum of the array is: " + sum + ".");
      System.out.println("The average of the array is: " + average + ".");
      System.out.println("The median of the array is: " + median + ".");
      System.out.println("The standard deviation of the array is: " + deviation + ".");
      writeFile(min, max, sum, average, median, deviation);
   }
   /** writeFile method, used to write the collected array information to a file.
     * @param int min, used to give the minimum of the array.
     * @param int max, used to give the maximum of the array.
     * @param int sum, used to give the sum of the array.
     * @param double average, used to give the average of the array.
     * @param double deviation, used to give the standard deviation of the array.
     */
   public static void writeFile(int min, int max, int sum, double average, double median, double deviation){
      try{
         PrintStream out = new PrintStream(new File("output.txt"));
         out.println("The minimum of the array is: " + min + ".");
         out.println("The maximum of the array is: " + max + ".");
         out.println("The sum of the array is: " + sum + ".");
         out.println("The average of the array is: " + average + ".");
         out.println("The median of the array is: " + median + ".");
         out.println("The standard deviation of the array is: " + deviation + ".");
      }catch(FileNotFoundException e){
      System.out.println("Could not write to file.");
      }
   }
}