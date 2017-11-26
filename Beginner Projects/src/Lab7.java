import java.util.*;
import java.io.*;

public class Lab7{

   public static void main(String[] args) throws FileNotFoundException {
      File f = new File("file.txt");
      //countCoins();
      //collapseSpaces();
      //wordWrap();
      printDuplicates(new Scanner(f));
      //stripHtmlTags();
   }
   public static void countCoins(Scanner file){
      double total = 0.0;
      while(file.hasNext()){
         int number = file.nextInt();
         String word = file.next();
         if(word.equalsIgnoreCase("pennies")){
            total+=.01 * number;
         }else if(word.equalsIgnoreCase("nickels")){
            total+=.05 * number;
         }else if(word.equalsIgnoreCase("dimes")){
            total+=.10 * number;
         }else if(word.equalsIgnoreCase("quarters")){
            total+=.25 * number;
         }
      }
      System.out.printf("Total money: $%.2f", total);
      System.out.println();
   }
   public static void collapseSpaces(Scanner file){
      while(file.hasNextLine()){
         String text = file.nextLine();
         fix(text);
      }
   }
   public static void fix(String text){
      Scanner data = new Scanner(text);
      if(data.hasNext()){
         System.out.print(data.next());
         while(data.hasNext()){
            System.out.print(" " + data.next());
         }
      }
      System.out.println();
   }
   public static void wordWrap(Scanner file){
      while(file.hasNextLine()){
         String text = file.nextLine();
         Scanner line = new Scanner(text);
         while(text.length() > 60){
               System.out.print(text.substring(0, 60));
               text = text.substring(60);
               System.out.println();
         }
         System.out.print(text);
         System.out.println();
      }
   }
   public static void printDuplicates(Scanner file){
   String word = file.next();
      while(file.hasNext()){
         int number = 1;
         if(file.hasNext()){
            String lastword = word;
            word = file.next();
            while(lastword.equals(word)){
               number++;
               lastword = word;
               word = file.next();
            }
               if(number > 1){
               System.out.println(lastword + "*" + number + " ");
               number = 1;
               }
         }
      }
   }
}