/* Indiana Davis, TCSS 142B, October 2, 2013
 * This program prints the silly song lyrics
 */
/** Outputs silly song lyrics on console
 *  @author Indiana Davis
 *  @version 1.0
 */
class HW1{
	/** Main method, sets strings and displayes lyrics.
	 * @param args is not used, ignored.
	 */
	public static void main (String[] args){
		//first verse
		System.out.println("I once wrote a program that wouldn't compile");
		method2();
		method1();
		//second verse
		System.out.println("My program did nothing");
		System.out.println("So I started typing.");
		method3();
		method2();
		method1();
		//third verse
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		method4();
		method3();
		method2();
		method1();
		//fourth verse
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		method5();
		method4();
		method3();
		method2();
		method1();
		//fifth verse
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		method6();
		method5();
		method4();
		method3();
		method2();
		method1();
		//Sets method1 to a specific, repeated verse
	public static void method1 (String[] args){
		System.out.println("My TA just smiled.");
	}
	//Sets method2 to a specific, repeated verse
	public static void method2 (String[] args){
		System.out.println("I don't know why it wouldn't compile.");
	}
	//Sets method3 to a specific, repeated verse
	public static void method3 (String[] args){
		System.out.println("I added System.out.println (\"I <3 coding\"),");
	}
	//Sets method4 to a specific, repeated verse
	public static void method4 (String[] args){
		System.out.println("I added a backslash to escape the quotes,");
	}
	//Sets method5 to a specific, repeated verse
	public static void method5 (String[] args){
		System.out.println("I added a main method with its String [] args,");
	}
	//Sets method6 to a specific, repeated verse
	public static void method6 (String[] args){
		System.out.println("I added a public class and called it Scum,");
	}
	}
}