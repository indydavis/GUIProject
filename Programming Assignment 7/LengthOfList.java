import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program compares two strings.
  * @author Indiana Davis
  * @version February 26, 2014
  */
public class LengthOfList implements Comparator<AnagramFamily>{
   /** method compare, uses the collections class to compare and sort the anagramFamily lists.
     * @param s1, used to get the first list object.
     * @param s2, used to get the second list object.
     */
   public int compare(AnagramFamily s1, AnagramFamily s2){
      int result = s2.getCount() - s1.getCount();
      return result;
   }
}