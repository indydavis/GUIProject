import java.util.*;
import java.io.*;
public class LibraryDriver{

   public static void main(String[] args){
      Scanner inputFile = null ;
      PrintStream outputFile = null;
         try{
            inputFile = new Scanner(new File("LibraryIn1.txt"));
            outputFile = new PrintStream(new File("LibraryOut.txt"));
         }catch (Exception e){
            System.out.println("Difficulties opening the file!  " + e);
            System.exit(1);
         }
         ArrayList<Book> books = new ArrayList<Book>();
         while (inputFile.hasNext()){
            String title = inputFile.nextLine();
            String line = inputFile.nextLine();
            ArrayList<String> authors = getAuthors(line);
            Book book = new Book(title, authors);
            books.add(book);
         }
         Library library = new Library(books);
         outputFile.println("Prints initial book list:");
         outputFile.println(library);
         library.sort();
         outputFile.println("Prints sorted book list:");
         outputFile.println(library);
         inputFile.close();
         try{
            inputFile = new Scanner(new File("LibraryIn2.txt"));
         }catch(FileNotFoundException e){
            System.out.println("Difficulties opening the file!  " + e);
            System.exit(1);
         }
         while (inputFile.hasNext()){
            String title = inputFile.nextLine();
            String line = inputFile.nextLine();
            ArrayList<String> authors = getAuthors(line);
            Book book = new Book(title, authors);
            library.add(book);
         }
         outputFile.println("Prints with new books unsorted:");
         outputFile.println(library);
         library.sort();
         outputFile.println("Prints all sorted book list:");
         outputFile.println(library);
         String test1 = "Acer Dumpling";
         ArrayList<Book> match = library.findTitles(test1);
         outputFile.println("Prints all Acer Dumplings:");
         for(int i = 0; i < match.size(); i++){
            outputFile.println(match.get(i));
         }
         String test2 = "The Bluff";
         match = library.findTitles(test2);
         outputFile.println("Prints all The Bluffs:");
         for(int i = 0; i < match.size(); i++){
            outputFile.println(match.get(i));
         }
         inputFile.close();
         outputFile.close();
   }  
   public static ArrayList<String> getAuthors(String s){  
      ArrayList<String> authors = new ArrayList<String>();
      String names = "";
      while(s.contains("*")){
         int location = s.indexOf('*');
         authors.add(s.substring(0, location) + "; ");
         s = s.substring(location + 1);
      }
      if(!s.contains("*")){
         authors.add(s);
      }
      authors.add(names);
      return authors;
   }
}