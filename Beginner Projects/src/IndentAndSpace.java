import java.util.*;
import java.io.*;
/** Indiana Davis
  * IndentAndSpace
  * TCSS 142B - Autumn 2013
  * Homework 6
  */
/** This program creates proper indentation for users file input.
  * @author Indiana Davis
  * @version November 20, 2013
  */
public class IndentAndSpace{
	/** Main method, prompts the user for a file until usable file is given.
	  * @param args is not used, ignored.
	  * @throws FileNotFoundException if file is not found.
	  */
    public static void main(String[] args){
    	final Scanner in = new Scanner(System.in);
        String file_name;
        Scanner scanner = null; // points to no actual object, indicates not set up yet
        while (scanner == null) { // while we don't have a working Scanner...
           System.out.print("Please enter a file name: ");
           file_name = in.nextLine();
           File f = new File(file_name);
           try {
              scanner = new Scanner(f); // if it works, new working Scanner
           } catch (FileNotFoundException e) { // else there was a problem.  Try again
              System.out.println("Could not find file");
              //e.printStackTrace(); // if you wanted the details of the error message as well
           } 
        }
    	test(scanner);
	}
    /** test method, tests the file for bracket characters.
     * @param text used to capture parts within the text.
     * @return prints the text onto the console.
     */
    public static void test(Scanner text){
	   	int number = 0;
	   	Scanner phrase;
	   	String token = "";
	   	while(text.hasNextLine()){
	   		String line = text.nextLine();
	   		line = line.trim();
	   			if(line.contains("{")){
	   				tabs(number);
	   				number++;
	   			}else if(line.contains("}")){
	   				number--;
	   				tabs(number);
	   			}else if(line.contains("(") && !line.contains(")")){
	   				tabs(number);
	   				number++;
	   			}else if(line.contains(")") && !line.contains("(")){
	   				tabs(number);
	   				number--;
	   			}else{
	   				tabs(number);
	   			}
	   		System.out.println(line);
	   	}
    }
   /** Prints the number of tabs given by the integer number.
    *  @param int sets number as an integer.
    *  @param number determines the number of tabs to print.
    */
   public static void tabs(int number){
		for(int i = 0; i < number; i++){
			System.out.print("\t");
		}
   }
}