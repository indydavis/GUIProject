import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program takes a file and ouputs the words with the given character.
  * @author Indiana Davis
  * @version February 21, 2014
  */
public class Assignment6{

      static Set<String> list = new HashSet<String>();

   /** method main, opens the file and calls methods as needed.
     * @param args, not used/ignored.
     */
   public static void main(String[] args){
      char c = 'a';
      try{
         Scanner myFile = new Scanner(new File("In6.txt"));
         String words = getWords(myFile, c);
         Set<String> list = getWordSet(words);
         PrintStream print = new PrintStream(new File("Out6.txt"));
         print.print(list);
      }catch(FileNotFoundException e){
         System.out.println("Couldn't find file");
      }
   }
   /** method getWords, takes the scanner and gets all the words that contain the given character.
     * @param myFile, used to read the given file.
     * @param c, used to store the character being searched for in the files words.
     */
   public static String getWords(Scanner myFile, char c){
      String words = "";
      if(myFile.hasNext()){
         String word = myFile.next();
         if(hasCharacter(word, c)){
            return word + " " + getWords(myFile, c);
         }else{
            return getWords(myFile, c);
         }
      }
      return words;
   }
   /** method hasCharacter, checks to see if a word has the given character and returns a boolean.
     * @param s, used to store the words being checked for the given character.
     * @param c, used to store the character bing searched for in the words.
     */
   public static Boolean hasCharacter(String s, char c){
      boolean test = false;
      if(s.length() >= 0){
         int count = 0;
         test = hasCharacter(s, c, count);
      }
      return test;
   }
   /** method hasCharacter, is a helper method that takes three variables and checks for the given character.
     * @param s, used to store the string being searched.
     * @param char, used to store the character being searched for.
     * @param count, used to store the number of where to search for the character.
     */
   public static Boolean hasCharacter(String s, char c, int count){
      boolean test = false;
      if(count < s.length()){
         if(s.charAt(count) == c || s.charAt(count) == c - 32){
            test = true;
         }else{
            return hasCharacter(s, c, ++count);
         }
      }
      return test;
   }
   /** method getWordSet, takes the words that contain the given character and puts the words into a set.
     * @param s, used to store the words that contain the given character.
     */
   public static Set<String> getWordSet(String s){
      if(s.length() > 0){
         int word = s.indexOf(' ');
         if(word != -1 && word != s.length() - 1){
            list.add(s.substring(0, word));
            return getWordSet(s.substring(word + 1, s.length()));
         }
      }
      return list;
   }
}