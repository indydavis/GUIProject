import java.util.*;
/* Indiana Davis,
 * Roman
 * TCSS 142B - Autumn 2013
 * Homework 4
 */
/** Outputs Roman numerals based on input.
  * @author Indiana Davis
  * @version October 12, 2013
  */
public class ISBN{
	/** Main method, takes input from user and converts it to Roman numerals.
	  * @param args is not used, ignored.
	  */
    public static void main(String[] args){
    	Scanner in = new Scanner (System.in);
    	System.out.print("Enter the first 12 digits of the books ISBN number: ");
    	String number = in.next();
    	solve(number);
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