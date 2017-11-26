import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program preforms various tasks for book upkeep.
  * @author Indiana Davis
  * @version February 26, 2014
  */
public class VowelCount implements Comparator<String>{

   public int compare(String s1, String s2){
      int length1 = vowelCount(s1);
      int length2 = vowelCount(s2);
      int result = length2 - length1;
      if(result == 0){
         result = s2.compareToIgnoreCase(s1);
      }
      return result;
   }
   public int vowelCount(String s){
      int count = 0;
      for(int i = 0; i < s.length(); i++){
         switch(s.charAt(i)){
            case 'a': case 'e': case 'i': 
            case 'o': case 'u': count++; break;
         }
      }
      return count;
   }
}