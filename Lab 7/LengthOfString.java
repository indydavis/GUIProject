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
public class LengthOfString implements Comparator<String>{

   public int compare(String s1, String s2){
      int result = s2.length() - s1.length();
      if(result == 0){
         result = -(s1.compareTo(s2));
      }
      return result;
   }
}
