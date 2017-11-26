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

   final String title;
   final ArrayList<String> authors;

   public Book(String title, ArrayList<String>  authors){
      if(title.equals(null) || authors.equals(null)){
         throw new IllegalArgumentException("Either the title or the authors array is null.");
      }else{
         this.title = title;
         this.authors = new ArrayList<String>(authors);
      }
   }
   
   public String getTitle(){
      return title;
   }
   
   public ArrayList<String> getAuthors(){
      return authors;
   }
   
   public String toString(){
      String book = "";
      book += ("\"" + title + ",\" by ");
      book += (authors);
      return book;
   }
   
   public int compareTo(Book other){
      int test;
      test = title.compareTo(other.getTitle());
      if(test == 0){
         test = authors.get(0).compareTo(other.getAuthors().get(0));
      }
      return test;
   }
   
   public boolean equals(Object o){
      boolean equals = false;
      int test = 0;
      if(o instanceof Book){
         title.compareTo(((Book) o).getTitle());
         for(int i = 0; i < authors.size(); i++){
            test = authors.get(i).compareTo(((Book) o).getAuthors().get(i));
         }
         if(test == 0){
            equals = true;
         }
      }
      return equals;
   }
}