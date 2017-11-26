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

   final ArrayList<Book> library = new ArrayList<Book>();
   
   public Library(ArrayList<Book> other){
      if(other.equals(null)){
         throws new NullPointerException();
      }else{
         library = other;
      }
   }
   
   public Library(){
      ArrayList<Book> library = new ArrayList<Book>();
   }
   
   public boolean add(Book book){
      boolean test = false;
      if(book.equals(null)){
         throws new IllegalArgumentException();
         return test;
      }else{
         library.add(book);
         test = true;
         return test;
      }
   }
   
   public ArrayList<Book> findTitles(String title){
      ArrayList<Book> match = new ArrayList<Book>();
      String found = "";
      for(int i = 0; i < library.size(); i++){
         found = library.get(i);
         if(found.compareTo(title) == 0){
            match.add(found);
         }
      }
      return match;
   }
   
   public void sort(){
      String first = library.get(library.size() - 1);
      for(int i = library.size() - 2; i >= 0; i++){
         String second = library.get(i);
         if(first.compareTo(second) > 0){
            library.add(0, second);
            library.remove(i);
            i = library.size() - 2;
         }
      }
   }
   
   public String toString(){
      String book = "";
      for(int i = 0; i < library.size(); i++){
         book += (library.get(i) + "\n");
      }
         return book;
   }
}