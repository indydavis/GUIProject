import java.io.*;
import java.util.*;
/** Indiana Davis
  * Book
  * TCSS 143B - Autumn 2013
  */
/** This program preforms various tasks for book upkeep.
  * @author Indiana Davis
  * @version January 1, 2013
  */
public class Book implements Comparable<Book>{

   String book = "";
   final String title;
   final ArrayList<String> authors = new ArrayList<String>();

   public Book(String title, ArrayList<String>  authors){
      if(title.equals(null) || authors.equals(null)){
         throws new IllegalArgumentException();
      }else{
         this.title = title;
         this.authors = authors;
      }
   }
   
   public String getTitle(){
      return title;
   }
   
   public ArrayList<String> getAuthors(){
      return authors;
   }
   
   public String toString(){
      book += ("\"" + title + ",\" by ");
      book += (authors);
      return book;
   }
   
   public int compareTo(Book other){
      return toString().compareTo(other.toString());
   }
   
   public boolean equals(Object o){
      boolean equals = false;
      if(o.instanceOf(String)){
         compareTo(o);
      }else{
         compareTo((String) o);
      }
      return equals;
   }
}