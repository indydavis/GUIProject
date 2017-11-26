import java.util.*;
import java.io.*;
/** Indiana Davis
  * Library
  * TCSS 143B - Autumn 2013
  */
/** This program preforms various tasks for keeping books catalogged.
  * @author Indiana Davis
  * @version January 1, 2013
  */
public class Library{

   final ArrayList<Book> library;
   
   public Library(ArrayList<Book> other){
      if(other.equals(null)){
         throw new NullPointerException("The other value is null.");
      }else{
         library = new ArrayList<Book>(other);
      }
   }
   
   public Library(){
      this(new ArrayList<Book>());
   }
   
   public boolean add(Book book){
      boolean test = false;
      if(book.equals(null)){
         throw new IllegalArgumentException("The book value is null.");
      }
      return library.add(book);
   }
   
   public ArrayList<Book> findTitles(String title){
      ArrayList<Book> match = new ArrayList<Book>();
      String found = "";
      for(int i = 0; i < library.size(); i++){
         found = library.get(i).getTitle();
         if(found.compareTo(title) == 0){
            match.add(library.get(i));
         }
      }
      return match;
   }
   
   public void sort(){
      Collections.sort(library);
   }
   
   public String toString(){
      String book = "";
      for(int i = 0; i < library.size(); i++){
         book += (library.get(i) + "\n");
      }
         return book;
   }
}