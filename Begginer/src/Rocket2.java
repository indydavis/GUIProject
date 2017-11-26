import java.util.*;
/* Indiana Davis,
 * Rocket 
 * TCSS 142B - Autumn 2013
 * Homework 2
 */
/** 
  * Outputs rocket image on console
  *  @author Indiana Davis
  *  @version October 12, 2013
  */
public class Rocket2{
	/** Main method, prints the rocket on screen.
	  * @param args is not used, ignored.
	  */
	public static void main(String[] args){
		Scanner size = new Scanner (System.in);
		System.out.print("Please enter a size: ");
		int i = size.nextInt();
		tip(i);
		top(i);
		line(i);
		middle1(i);
		middle2(i);
		line(i);
		middle2(i);
		middle1(i);
		line(i);
		top(i);
}
	//Sets for loop for tip of rocket.
	public static void tip(int i){
		for (int a = -2; a <= (2 * i - 3); a++) {
				System.out.print(" ");
	}
			for (int k = 1; k <= 1; k++){
				System.out.print("/\\");
		}
				System.out.println();
		}
	//Sets the for loops for the top portion of the rocket.
	public static void top(int i){
		for (int a = -1; a <= (2 * i - 3); a++) {
			for (int j = (2 * i - 3); j >= a; j--){
				System.out.print(" ");
		}
			for (int k = -1; k <= a; k++){
				System.out.print("/");
			}
			for (int l = 1; l <= 1; l++){
				System.out.print("**");
			}
			for (int m = -1; m <= a; m++){
				System.out.print("\\");
			}
				System.out.println();
		}
	}
	//Sets for loop for the line on the rocket.
	public static void line(int i){
		for (int b = (i - 2); b <= (i - 2); b++){
			for (int s = 1; s <= 1; s++){
		System.out.print("+");
	}
	  	    for (int q = (i + 4); q >= 5; q--){
				System.out.print("-:-:");
		}
	  	    System.out.println("+");
		}
	}
	//Sets for loops for top middle portion of the rocket.
	public static void middle1(int i){
		for (int b = 1; b <= i; b++){
			for (int s = 1; s <= (b / b); s++){
			System.out.print("|");
			}
  	    for (int q = (i - 1); q >= b; q--){
			System.out.print("+");
		}
		for (int u = 1; u <= b; u++){
			System.out.print("/\\");
		}
  	    for (int l = (i - 1); l >= b; l--){
			System.out.print("++");
		}
		for (int k = 1; k <= b; k++){
			System.out.print("/\\");
		}
  	    for (int p = (i - 1); p >= b; p--){
			System.out.print("+");
		}
			System.out.println("|");
		}
		}
	//Sets for loops for the bottom middle portion of the rocket.
	public static void middle2(int i){
		for (int c = 1; c <= i; c++){
			for (int x = 1; x <= (c / c); x++){
			System.out.print("|");
	}
			for (int o = 2; o <= c; o++){
			System.out.print("+");
		}
			for (int h = i; h >= c; h--){
				System.out.print("\\/");
		}
			for (int r = 2; r <= c; r++){
			System.out.print("++");
		}
			for (int e = i; e >= c; e--){
				System.out.print("\\/");
		}
			for (int w = 2; w <= c; w++){
			System.out.print("+");
		}
				System.out.println("|");
		}
	}	
}