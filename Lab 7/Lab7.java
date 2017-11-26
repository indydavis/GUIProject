import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program sorts word from an input file.
  * @author Indiana Davis
  * @version February 26, 2014
  */
public class Lab7{

   public static void main(String[] args){
      ArrayList<String> list = new ArrayList<String>();
      try{
         Scanner input = new Scanner(new File("WordFile.txt"));
         PrintStream out = new PrintStream(new File("Result.txt"));
         while(input.hasNext()){
            list.add(input.next());
         }
         outputList(out, list, "Here is the original list:");
         Collections.sort(list);
         outputList(out, list, "Here is the basic sorted list:");
         Collections.sort(list, new CaseInsensitiveComparator());
         outputList(out, list, "Here is the alphabetically sorted list:");
         Collections.sort(list, new LengthOfString());
         outputList(out, list, "Here is the size sorted list:");
         Collections.sort(list, new VowelCount());
         outputList(out, list, "Here is the vowel count sorted list:");
      }catch(FileNotFoundException e){
         System.out.println("Couldn't find file.");
      }
   }
   
   public static void outputList(PrintStream out, ArrayList<String> list, String s1){
      out.println(s1);
      for(int i = 0; i < list.size(); i++){
         out.println(list.get(i));
      }
      out.println();
   }
}
