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
public class CaseInsensitiveComparator implements Comparator<String>{

   public int compare(String s1, String s2){
      return s1.compareToIgnoreCase(s2);
   }
}
