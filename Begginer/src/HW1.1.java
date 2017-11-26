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
		//sets strings
		String me = "My TA just smiled.";
		String hi = "I don't know why it wouldn't compile,";
		String the = "I added System.out.println (\"I <3 coding\"),";
		String mite = "I added a backslash to escape the quotes,";
		String mini = "I added a main method with its String [] args,";
		String tee = "I added a public class and called it Scum,";
		//first verse
		System.out.println("I once wrote a program that wouldn't compile");
		System.out.println(hi);
		System.out.println(me);
		System.out.println();
		//second verse
		System.out.println("My program did nothing");
		System.out.println("So I started typing.");
		System.out.println(the);
		System.out.println(hi);
		System.out.println(me);
		System.out.println();
		//third verse
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		System.out.println(mite);
		System.out.println(the);
		System.out.println(hi);
		System.out.println(me);
		System.out.println();
		//fourth verse
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		System.out.println(mini);
		System.out.println(mite);
		System.out.println(the);
		System.out.println(hi);
		System.out.println(me);
		System.out.println();
		//fifth verse
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		System.out.println(tee);
		System.out.println(mini);
		System.out.println(mite);
		System.out.println(the);
		System.out.println(hi);
		System.out.println(me);
	}
}