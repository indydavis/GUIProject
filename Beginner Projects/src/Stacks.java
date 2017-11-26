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
public class Stacks{

   public static Stack<Character> stackify(String str){
      Stack<Character> word = new Stack<Character>();
      for(int i = str.length() - 1; i >= 0; i--){
         word.push(str.charAt(i));
      }
      return word;
   }
   
   public static int count(Stack<Character> stack, char c){
      int count = 0;
      char letter;
      Stack<Character> temp = new Stack<Character>();
      while(!stack.isEmpty()){
         letter = stack.pop();
         if(letter == c){
            count++;
         }
         temp.push(letter);
      }
      while(!temp.isEmpty()){
         stack.push(temp.pop());
      }
      return count;
   }
   
   public static void remove(Stack<Character> stack, char c){
      char letter;
      Stack<Character> temp = new Stack<Character>();
      while(!stack.isEmpty()){
         letter = stack.pop();
         if(letter != c){
            temp.push(letter);
         }
      }
      while(!temp.isEmpty()){
         stack.push(temp.pop());
      }
   }
   
   public static void displayOrdered(Stack<Character> stack){
      ArrayList<Character> temp = new ArrayList<Character>();
      while(!stack.isEmpty()){
         temp.add(stack.pop());
      }
      Collections.sort(temp);
      for(int i = temp.size() - 1; i >= 0; i--){
         stack.push(temp.get(i));
      }
   }
}