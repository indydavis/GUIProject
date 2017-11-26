/**
 * 
 */
package math;

import java.util.Scanner;

/**
 * @author indyd_000
 *
 */
public class HackingBasis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letter;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a prime number: ");
		int num = input.nextInt();
		System.out.println("Please enter an additive: ");
		int add = input.nextInt();
		System.out.println("Please enter a statement: ");
		String words = input.next();
		words = words.trim();
		while(words.length() != 0) {
			letter = words.charAt(0);
			words.substring(1, words.length());
		}
		if(num < 10 && num % 2 != 0 && num % 3 != 0
				&& num % 5 != 0) {
			encode(num, letter, add);
		}
	}
	
	/**
	 * 
	 */
	public static void encode(final int prime, final int letter, final int add) {
		int value = prime * letter + add;
	}
	
	/**
	 * 
	 */
	public static void decode(final int fomula, final int replace) {
		
	}
}
