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
         ArrayList<String> authors = new ArrayList<String>();
         ArrayList<Book> books = new ArrayList<Book>();
         while (inputFile.hasNext()){
         // Read title
         // Read author(s) 
         // Insert title & author(s)into a book
         // Add this book to the ArrayList<Book> of books
         }
         // Instatiate a Library object filled with the books read thus far
         // and write the contents of the library to the output file
         // Sort the current contents of the library
         // and write the contents of the sorted library to the output file
         // Close the first input file and open the second input file.
         // Read the titles and authors from the second input file,
         // add them to the library, and write the contents of the
         // library to the output file.
         inputFile.close();
         . . . etc.
         // Sort the library and write it to the output file
         // The following tests the findTitles method:
         // Write only the "Acer Dumpling" books to the output file
         // Write only the "The Bluffs" books to the output file
         // Close all open files and end main.
         inputFile.close();
         outputFile.close();
   }  
         // Header for method that separates author names and
         // returns an ArrayList<String> containing the author names
   public static ArrayList<String> getAuthors(String s){  
      // YOU FILL IN THE DETAILS HERE  
   }
}