import java.util.*;
/** Indiana Davis
  * Game
  * TCSS 142B - Autumn 2013
  * Homework 5
  */
/** This program plays a game with the user.
  * @author Indiana Davis
  * @version November 11, 2013
  */
public class Game{
	/** Main method, takes input from user and converts it to Roman numerals.
	  * @param args is not used, ignored.
	  * @return results based on selection.
	  */
    public static void main(String[] args){
    	Scanner choice = new Scanner(System.in);
    	System.out.println("This program allows you to play games of Rock, Paper, Scissors, Lizard, Spock against the computer.");
    	System.out.println("The rules are: ");
    	System.out.println("Rock beats Scissors and Lizard,");
    	System.out.println("Paper beats Rock and Spock,");
    	System.out.println("Rock beats Scissors and Lizard,");
    	System.out.println("Rock beats Scissors and Lizard,");
    	System.out.println("Rock beats Scissors and Lizard,");
    	
    	
    }
    /** Converts the input of the user into Roman numerals.
     * @param number used to gather and store users input.
     * @return used to return the value to be printed later.
     */
    public static String solve(String number){
       	for (int t = 0; t < number.length(); t++){
         	if (t > 0 && t <= 9){
           		int h = t * 3;
           	} else {
           	}
    	}
       	return number;
    }
}