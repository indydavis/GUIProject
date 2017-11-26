import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author indyd_000
 */
public class Coding {
	
	/**
	 * Tests for primeness.
	 */
	static boolean test = false;
	/**
	 * 
	 */
	static String word = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please input a prime number between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int value1 = input.nextInt();
		test = prime(value1);
		while (test != true) {
			System.out.println("Not a prime number. Please try again: ");
			value1 = input.nextInt();
			prime(value1);
		}
		System.out.println("Please input another prime number between 1 and 100: ");
		int value2 = input.nextInt();
		test = prime(value2);
		while (test != true) {
			System.out.println("Not a prime number. Please try again: ");
			value2 = input.nextInt();
			prime(value2);
		}
		int value = value1 * value2;
		System.out.println("Now enter a word: ");
		word = input.next();
		String word2 = word.toLowerCase();
		word2 = encode(value, word2);
		decode(value, word2);
		System.out.println("This concludes the program.");
		input.close();
	}
	
	/**
	 * @param value, used to get the prime value.
	 * @return test, returns true if the number is prime and between 1 and 100.
	 */
	public static boolean prime(int value) {
		if (value >= 1 && value <= 100) {
			if (value == 1 || value == 2 || value == 3 || value == 5 || value == 7) {
				test = true;
			}
			else if (value%2 != 0 && value%3 != 0 && value%5 != 0 && value%7 != 0) {
				test = true;
			}
		}
		return test;
	}
	/**
	 * @param number, gets the prime number value.
	 * @param word, gets the word to be encoded.
	 */
	public static String encode(int number, String word2) {
		String encoded = "";
		while (!word2.isEmpty()) {
			char letter = word2.charAt(0);
			int value = ASCII(letter); //find the ASCII value of the first character.
			value = (value * number) % 26;
			letter = ReverseASCII(value);
			encoded += letter;
			word2 = word2.substring(1, word2.length());
		}
		System.out.println("The encoded word is: " + encoded);
		return encoded;
	}
	
	/**
	 * @param letter, used to get the letter.
	 * @return returns the value associated with that letter.
	 */
	public static int ASCII(char letter){
		int number = 0;
		if(letter == 'a'){
			number = 0;
		}else if(letter == 'b'){
			number = 1;
		}else if(letter == 'c'){
			number = 2;
		}else if(letter == 'd'){
			number = 3;
		}else if(letter == 'e'){
			number = 4;
		}else if(letter == 'f'){
			number = 5;
		}else if(letter == 'g'){
			number = 6;
		}else if(letter == 'h'){
			number = 7;
		}else if(letter == 'i'){
			number = 8;
		}else if(letter == 'j'){
			number = 9;
		}else if(letter == 'k'){
			number = 10;
		}else if(letter == 'l'){
			number = 11;
		}else if(letter == 'm'){
			number = 12;
		}else if(letter == 'n'){
			number = 13;
		}else if(letter == 'o'){
			number = 14;
		}else if(letter == 'p'){
			number = 15;
		}else if(letter == 'q'){
			number = 16;
		}else if(letter == 'r'){
			number = 17;
		}else if(letter == 's'){
			number = 18;
		}else if(letter == 't'){
			number = 19;
		}else if(letter == 'u'){
			number = 20;
		}else if(letter == 'v'){
			number = 21;
		}else if(letter == 'w'){
			number = 22;
		}else if(letter == 'x'){
			number = 23;
		}else if(letter == 'y'){
			number = 24;
		}else{
			number = 25;
		}
		return number;
	}
	
	/**
	 * @param value used to get the value of the letter.
	 * @return returns the letter associated with that value.
	 */
	public static char ReverseASCII(int value){
		char letter;
		if(value == 0){
			letter = 'a';
		}else if(value == 1){
			letter = 'b';
		}else if(value == 2){
			letter = 'c';
		}else if(value == 3){
			letter = 'd';
		}else if(value == 4){
			letter = 'e';
		}else if(value == 5){
			letter = 'f';
		}else if(value == 6){
			letter = 'g';
		}else if(value == 7){
			letter = 'h';
		}else if(value == 8){
			letter = 'i';
		}else if(value == 9){
			letter = 'j';
		}else if(value == 10){
			letter = 'k';
		}else if(value == 11){
			letter = 'l';
		}else if(value == 12){
			letter = 'm';
		}else if(value == 13){
			letter = 'n';
		}else if(value == 14){
			letter = 'o';
		}else if(value == 15){
			letter = 'p';
		}else if(value == 16){
			letter = 'q';
		}else if(value == 17){
			letter = 'r';
		}else if(value == 18){
			letter = 's';
		}else if(value == 19){
			letter = 't';
		}else if(value == 20){
			letter = 'u';
		}else if(value == 21){
			letter = 'v';
		}else if(value == 22){
			letter = 'w';
		}else if(value == 23){
			letter = 'x';
		}else if(value == 24){
			letter = 'y';
		}else{
			letter = 'z';
		}
		return letter;
	}
	
	/**
	 * @param number, gets the prime number value.
	 * @param word, gets the word to be encoded.
	 */
	public static void decode(int number, String word2) {
		String decoded = "";
		number = decodevalue(number);
		while (!word2.isEmpty()) {
			char letter = word2.charAt(0);
			int value = ASCII(letter); //find the ASCII value of the first character.
			value = (value * number) % 26;
			letter = ReverseASCII(value);
			decoded += letter;
			word2 = word2.substring(1, word2.length());
		}
		System.out.println("The decoded word is: " + decoded);
		System.out.println("The decoded word is: " + word);
	}
	
	public static int decodevalue(int number){
		int mod = 26;
		Integer valuechange = new Integer(number);
		BigInteger bigintvalue = BigInteger.valueOf(valuechange.intValue());
		BigInteger modvalue = BigInteger.ZERO; 
		modvalue = BigInteger.valueOf(mod);
		bigintvalue = bigintvalue.modInverse(modvalue);
		int value = bigintvalue.intValue();
		System.out.println("The inverse mod is: " + value);
		return value;
	}
}