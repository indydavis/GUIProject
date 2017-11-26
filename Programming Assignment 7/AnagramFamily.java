import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program holds each family of anagrams.
  * @author Indiana Davis
  * @version February 26, 2014
  */
public class AnagramFamily{
   
   final LinkedList<Word> list;
   int count;
   /** method AnagramFamily, creates the AnagramFamily object.
     * @param count, used to set the number of times an anagram appears.
     * @param list, used to hold the words belonging to the same anagram family.
     * @param canonical, used to store the canonical form of a word.
     */
   public AnagramFamily(int count, LinkedList<Word> other){
      if(other == null){
         throw new NullPointerException("The linked list is null.");
      }
      if(other.size() == 0){
         throw new IllegalArgumentException("The linked list is empty.");
      }
      list = new LinkedList<Word>(other);
      this.count = count;
   }
   /** method getCount, used to get the count of words in an anagram family.
     */
   public int getCount(){
      return count;
   }
   /** method toString, returns a string representation of the anagramFamily object.
     */
   public String toString(){
      Iterator<Word> itr = list.iterator();
      Word temp = itr.next();
      String s = (temp.getCanonical() + ": " + getCount() + ": " + temp.getNormal());
      while(itr.hasNext()){
         s += ", " + itr.next().getNormal();
      }
      return s;
   }
}