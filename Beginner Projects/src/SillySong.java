/** Indiana Davis, 
  * TCSS 142B - Autumn 2013
  * Assignment 1
  */
/** Outputs silly song lyrics on console
  * @author Indiana Davis
  * @version October 8, 2013
  */
public class SillySong{
	/** Main method, starts off the program.
	  * @param args is not used, ignored.
	  */
	public static void main(String[] args){
      first_verse();
   }
   /** first_verse method, prints out the first verse of the song.
     */
   public static void first_verse(){
		System.out.println("I once wrote a program that wouldn't compile");
		compile();
      second_verse();
   }
   /** second_verse method, prints out the second verse of the song.
     */
   public static void second_verse(){
		System.out.println("My program did nothing");
		System.out.println("So I started typing.");
		printLine();
      third_verse();
   }
   /** third_verse method, prints out the third verse of the song.
     */
   public static void third_verse(){
		System.out.println("\"Parse error,\" cried the compiler");
		System.out.println("Luckily I'm such a code baller.");
		quotes();
      fourth_verse();
   }
   /** fourth_verse method, prints out the fourth verse of the song.
     */
   public static void fourth_verse(){
		System.out.println("Now the compiler wanted an identifier");
		System.out.println("And I thought the situation was getting dire.");
		method();
      fifth_verse();
   }
   /** fifth_verse method, prints out the fifth verse of the song.
     */
   public static void fifth_verse(){
		System.out.println("Java complained it expected an enum");
		System.out.println("Boy, these computers really are dumb!");
		scum();
	}
	/** tA method, sets tA to a specific and repeated verse
     */
   public static void tA() {
		System.out.println("My TA just smiled.\n");
	}
	/** compile method, sets compile to a specific and repeated verse
     */
	public static void compile() {
		System.out.println("I don't know why it wouldn't compile,");
      tA();
	}
	/** printLine method, sets printLine to a specific and repeated verse
     */
	public static void printLine() {
		System.out.println("I added System.out.println(\"I <3 coding\"),");
      compile();
	}
	/** quotes method, sets quotes to a specific and repeated verse
     */
	public static void quotes() {
		System.out.println("I added a backslash to escape the quotes,");
      printLine();
	}
	/** method method, sets method to a specific and repeated verse
     */
	public static void method() {
		System.out.println("I added a main method with its String[] args,");
      quotes();
	}
	/** scum method, sets scum to a specific and repeated verse
     */
	public static void scum() {
		System.out.println("I added a public class and called it Scum,");
      method();
	}
}