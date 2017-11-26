import java.util.*;
import java.io.*;
/** Indiana Davis
  * Stacks
  * TCSS 143B - Winter 2013
  */
/** This is a module program.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public class Test{

   public static void main(String[] args){
      Stack<Character> test = Stacks.stackify("Hotdog");
      System.out.println(test);
      int test2 = Stacks.count(test, 'o');
      System.out.println(test2);
      Stack<Character> test3 = Stacks.stackify("Hotdog");
      Stacks.remove(test3, 'o');
      System.out.println(test3);
      Stack<Character> test4 = Stacks.stackify("Hotdog");
      Stacks.displayOrdered(test4);
      System.out.println(test4);
   }
}