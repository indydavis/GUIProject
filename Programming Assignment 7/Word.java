import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program holds different forms of a word.
  * @author Indiana Davis
  * @version February 26, 2014
  */
public class Word implements Comparable<Word>{

   String normalForm;
   String canonicalForm;
   /** method word, used to store the normal and canonical form of a word.
     * @param normalForm, used to store the normal form of a word.
     * @param canonicalForm, used to store the canonical form of a word.
     */
   public Word(String normalForm){
      LinkedList<Word> object = new LinkedList<Word>();
      if(normalForm.equals(null)){
         throw new IllegalArgumentException("Either the normalForm or the canonicalForm is null.");
      }else{
         this.normalForm = normalForm;
         this.canonicalForm = toCanonical(normalForm);
      }
   }
   /** method getNormal, returns the normal form of a word.
     */
   public String getNormal(){
     return normalForm;
   }
   /** method getCanonical, returns the canonical form of a word.
     */
   public String getCanonical(){
     return canonicalForm;
   }
   /** method compareTo, used to compare word objects.
     * @param other used to get another word object.
     */
   public int compareTo(Word other){
      return canonicalForm.compareTo(other.getCanonical());
   }
   /** method toCanonical, changes a string into cononical form.
     * @param s, used to get the string being changed to canonical form.
     */
   public String toCanonical(String s){
      String canonical = "";
      char[] word = s.toCharArray();
      Arrays.sort(word);
      for(int i = 0; i < word.length; i++){
         canonical += word[i];
      }
      return canonical;
   }
   /** method toString, returns a string representation of the word object.
     */
   public String toString(){
      String s = (canonicalForm + ": " + normalForm);
      return s;
   }
}