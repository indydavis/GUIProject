import java.util.*;
/** Indiana Davis,
  * Roman
  * TCSS 142B - Autumn 2013
  * Homework 4
  */
/** Outputs Roman numerals based on input.
  * @author Indiana Davis
  * @version October 12, 2013
  */
public class Roman{
	/** Main method, takes input from user and converts it to Roman numerals.
	  * @param args is not used, ignored.
	  */
   public static void main(String[] args){
      String Ones = "";
    	String Tens = "";
    	String Hundreds = "";
    	String Thousands = "";
      Scanner in = new Scanner (System.in);
    	System.out.print("Enter a number between 1 and 3000: ");
    	int number = in.nextInt();
    	if(number > 0 && number <= 3000){
         Ones = ones_place(number);
         Tens = tens_place(number);
         Hundreds = hundreds_place(number);
         Thousands = thousands_place(number);
         String r = (Thousands + Hundreds + Tens + Ones);
        	System.out.println("The number " + number + " is the Roman numberal " + r);
      }else{
        	System.out.println("The number must be between 1 and 3000: ");
    		number = in.nextInt();
      }
   }
   /** ones_place method, converts the number in the ones place to roman numerals.
     * @param int used to give the number in the ones place.
     */
   public static String ones_place(int number){
      String Ones = "";
      int ones = number % 10;
    	if (ones == 1){
         Ones = ("I");
      }else if (ones == 2){
         Ones = ("II");
      }else if (ones == 3){
         Ones = ("III");
      }else if(ones == 4){
         Ones = ("IV");
      }else if(ones == 5){
         Ones = ("V");
      }else if(ones == 6){
         Ones = ("VI");
      }else if(ones == 7){
         Ones = ("VII");
      }else if(ones == 8){
         Ones = ("VIII");
      }else if(ones == 9){
         Ones = ("IX");
      }
      return Ones;
   }
   /** tens_place method, converts the number in the tens place to roman numerals.
     * @param int used to give the number in the tens place.
     */
   public static String tens_place(int number){
      String Tens = "";
      int t = number / 10;
    	if (t < 10){
    	   t = number / 10;
    	}else{
    		t = t % 10;
    	}
    	int n = t;
      if (n == 1){
         Tens = ("X");
      }else if (n == 2){
         Tens = ("XX");
      }else if(n == 3){
         Tens = ("XXX");
      }else if(n == 4){
         Tens = ("XL");
      }else if(n == 5){
         Tens = ("L");
      }else if(n == 6){
         Tens = ("LX");
      }else if(n == 7){
         Tens = ("LXX");
      }else if(n == 8){
         Tens = ("LXXX");
      }else if(n == 9){
         Tens = ("XC");
      }
      return Tens;
   }
    /** hundreds_place method, converts the number in the hundreds place to roman numerals.
      * @param int used to give the number in the hundreds place.
      */
   public static String hundreds_place(int number){
      String Hundreds = "";
      int h = number / 100;
    	if (h < 10){
    		h = number / 100;
    	}else{
    		h = h % 10;
    	}
    	int p = h;
      if (p == 1){
         Hundreds = ("C");
      }else if (p == 2){
         Hundreds = ("CC");
      }else if (p == 3){
         Hundreds = ("CCC");
      }else if(p == 4){
         Hundreds = ("CD");
      }else if(p == 5){
         Hundreds = ("D");
      }else if(p == 6){
         Hundreds = ("DC");
      }else if(p == 7){
         Hundreds = ("DCC");
      }else if(p == 8){
         Hundreds = ("DCCC");
      }else if(p == 9){
         Hundreds = ("CM");
      }
      return Hundreds;
   }
   /** thousands_place method, converts the number in the thousands place to roman numerals.
     * @param int used to give the number in the thousands place.
     */
   public static String thousands_place(int number){
      String Thousands = "";
    	int g = number / 1000;
    	if (g < 10){
    		g = number / 1000;
    	}else{
    		g = g % 10000;
    	}
    	int k = g;
      if (k == 1){
         Thousands = ("M");
      }else if (k == 2){
         Thousands = ("MM");
      }else if (k == 3){
         Thousands = ("MMM");
      }
      return Thousands;
   }
}