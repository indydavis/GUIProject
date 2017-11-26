import java.util.*;
import java.io.*;

public class Lab8{

   public static void main(String[] args){
      int[] array = {8, 3, 5, 7, 2, 4};
      //lastIndexOf();
      range(array);
      //countInRange();
      //isSorted();
      //stdev();
      System.out.print(range(array));
   }
   public static int lastIndexOf(int[] array, int number){
      int num = 0;
      int index = -1;
      for(int i = 0; i <= array.length - 1; i++){
         num = array[i];
         if(num == number){
            index = i;
         }
      }
      return index;
   }
   public static int range(int[] array){
      int min = array[0];
      int max = array[0];
      for(int i = 0; i <= array.length - 1; i++){
         min = Math.min(min, array[i]);
         max = Math.max(max, array[i]);
      }
      return (max - min + 1);
   }
   public static int countInRange(int[] array, int min, int max){
      int num = 0;
      for(int i = 0; i <= array.length - 1; i++){
         if((array[i] >= min) && (array[i] <= max)){
            num++;
         }
      }
      return num;
   }
   public static boolean isSorted(double[] array){
      double[] sorted = Arrays.copyOf(array, array.length);
      Arrays.sort(sorted);
      return Arrays.equals(sorted, array);
   }
   public static double stdev(int[] array){
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
}