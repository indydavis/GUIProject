import java.util.*;
/** Indiana Davis
  * NumbersMain
  * TCSS 142B - Autumn 2013
  * Homework 7
  */
/** This program prints statistics based on a user inputed random array.
  * @author Indiana Davis
  * @version November 21, 2013
  */
public class Numbers{
   /** createRandomIntArray method, creates a random array given the array size.
	  * @param int, used to give the size of the array.
	  */
   public static int[] createRandomIntArray(int size, int rangeMin, int rangeMax){
      int[] array = new int[size];
      for(int i = 0; i < size; i++){
         Random rand = new Random();
         int number = rand.nextInt(rangeMax - rangeMin + 1) + rangeMin;
         array[i] = number;
      }
      return array;
   }
   /** findMin method, used to find the minimum of the given array.
     * @param int[], used to provide the array and its contents.
     */
   public static int findMin(int[] array){
      int min = 100;
      for(int i = 0; i < array.length; i++){
         min = Math.min(min, array[i]);
      }
      return min;
   }
   /** findMax method, used to find the maximum of the given array.
     * @param int[], used to provide the array and its contents.
     */
   public static int findMax(int[] array){
      int max = 0;
      for(int i = 0; i < array.length; i++){
         max = Math.max(max, array[i]);
      }
      return max;
   }
   /** calculateSum method, used to find the sum of the given array.
     * @param int[], used to provide the array and its contents.
     */
   public static int calculateSum(int[] array){
      int sum = 0;
      for(int i = 0; i < array.length; i++){
         sum += array[i];
      }
      return sum;
   }
   /** calculateAverage method, used to find the average of the given array.
     * @param int, used to provide the size of the array and sum of the array's contents.
     */
   public static double calculateAverage(int[] array){
      int sum = 0;
      for(int i = 0; i < array.length; i++){
         sum += array[i];
      }
      double average = sum / array.length;
      return average;
   }
   /** calculateMedian method, used to find the median of the given array.
     * @param int[], used to provide the array and its contents.
     * @param int, used to provide the size of the array.
     */
   public static double calculateMedian(int[] array){
      double median = 0.0;
      int[] copy = Arrays.copyOf(array, array.length);
      Arrays.sort(copy);
      if(array.length % 2 == 0){
         int first = array.length / 2;
         int second = first - 1;
         median = (copy[first] + copy[second]) / 2;
      }else{
         int number = array.length / 2;
         median = Math.floor(number);
      }
      return median;
   }
   /** calculateStandardDeviation method, used to find the standard deviation of the given array.
     * @param int[], used to provide the array and its contents.
     * @param int, used to provide the size of the array.
     * @param double, used to provide the average of the array.
     */
   public static double calculateStandardDeviation(int[] array){
      double sum = 0.0;
      double average = 0.0;
      double deviation = 0.0;
      for(int i = 0; i <= array.length - 1; i++){
         sum += array[i];
      }
         average = sum / array.length;
      for(int i = 0; i <= array.length - 1; i++){
         deviation += Math.pow(array[i] - average, 2);
      }
      deviation = deviation / (array.length - 1);
      deviation = Math.sqrt(deviation);
      return deviation;
   }
}
