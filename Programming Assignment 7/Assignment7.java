import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program sorts words from a file.
  * @author Indiana Davis
  * @version February 26, 2014
  * system.CurrentTime.millis
  */
public class Assignment7{
   /** method main, goes through the program's processes and calls other methods and classes.
     * @param args, not used/ignored.
     */
   public static void main(String[] args){
      Scanner input = null;
      PrintStream out = null;
      LinkedList<Word> list = new LinkedList<Word>();
      try{
         input = new Scanner(new File("words.txt"));
         out = new PrintStream(new File("out7.txt"));
      }catch(FileNotFoundException e){
         System.out.println("Couldn't find file.");
      }
      while(input.hasNext()){
         Word word = new Word(input.next());
         list.add(word);
      }
      Collections.sort(list);
      Iterator<Word> itr = list.iterator();
      LinkedList<AnagramFamily> finalList = new LinkedList<AnagramFamily>();
      Word first = null;
      Word second = itr.next();
      while(itr.hasNext()){   //Used to get words with matching canonical forms togeather.
         LinkedList<Word> list2 = new LinkedList<Word>();
         int test = 0;
         int count = 1;
         first = second;
         list2.add(first);
         while(test == 0 && itr.hasNext()){
            second = itr.next();
            test = (first.getCanonical().compareTo(second.getCanonical()));
            if(test == 0){
               count++;
               list2.add(second);
            }
         }
      AnagramFamily anagramFamily = new AnagramFamily(count, list2);
      finalList.add(anagramFamily);
      }
      Collections.sort(finalList, new LengthOfList());
      outputList(out, finalList, "Here are the ten longest families in order from longest to shortest:");
   }
   /** method outputList, prints information to a file.
     * @param out, used to hold the name of the file to output to.
     * @param list, used to get the list being printed out to the file.
     * @param s1, used to print a title for the list being printed out.
     */
   public static void outputList(PrintStream out, LinkedList<AnagramFamily> list, String s1){
      out.println(s1);
      for(int i = 0; i <= 9; i++){
         out.println(list.get(i));
      }
   }
}