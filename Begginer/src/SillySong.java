/* Indiana Davis, 
* TCSS 142B - Autumn 2013
* Assignment 1
*/
/** Outputs silly song lyrics on console
*  @author Indiana Davis
*  @version October 8, 2013
*/
public class SillySong{
	/** Main method, prints the lyrics on screen.
	 *  @param args is not used, ignored.
	 */
	public static void main(String[] args){
		//first verse
		System.out.println("I once wrote a program that wouldn't compile");
		Compile();
		TA();
		//second verse
		System.out.println("My program did nothing");
		System.out.println("So I started typing.");
		PrintLine();
		Compile();
		TA();
		//third verse
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		Quotes();
		PrintLine();
		Compile();
		TA();
		//fourth verse
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		Method();
		Quotes();
		PrintLine();
		Compile();
		TA();
		//fifth verse
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		Class();
		Method();
		Quotes();
		PrintLine();
		Compile();
		TA();
	}
		//Sets TA to a specific and repeated verse
		public static void TA() {
		System.out.println("My TA just smiled.\n");
		}
	//Sets Compile to a specific and repeated verse
	public static void Compile() {
		System.out.println("I don't know why it wouldn't compile.");
	}
	//Sets PrintLine to a specific and repeated verse
	public static void PrintLine() {
		System.out.println("I added System.out.println (\"I <3 coding\"),");
	}
	//Sets Quotes to a specific and repeated verse
	public static void Quotes() {
		System.out.println("I added a backslash to escape the quotes,");
	}
	//Sets Method to a specific and repeated verse
	public static void Method() {
		System.out.println("I added a main method with its String [] args,");
	}
	//Sets Class to a specific and repeated verse
	public static void Class() {
		System.out.println("I added a public class and called it Scum,");
	}
}