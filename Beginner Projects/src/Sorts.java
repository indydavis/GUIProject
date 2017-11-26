import java.util.*;
import java.io.*;

public class Sorts{

   ArrayList<Integer> numbers;
   
   public static void main(String[] args){
      numbers = new ArrayList<Integer>();
      numbers = {3, 2, 5, 12, 15, 22, 4, 8};
      bubbleSort(numbers);
   }
   
   public int[] bubbleSort(List<Integer> data){
     int lenD = data.length;
     int tmp = 0;
     for(int i = 0;i<lenD;i++){
       for(int j = (lenD-1);j>=(i+1);j--){
         data.isSorted();
         if(data[j]<data[j-1]){
           tmp = data[j];
           data[j]=data[j-1];
           data[j-1]=tmp;
         }
       }
     }
     return data;
   }
}