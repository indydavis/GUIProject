/* Indiana Davis, TCSS 142B, October 3, 2013
 * This program prints a phrase on the screen*/
 
/** Outputs a phrase to the console
  * @author Indiana Davis
  * @version 1.0 */
class Shining{
   /** Main method, displays a phrase. 
     * @param args is not used, ignored. */ 
   public static void main(String[] args){
      //Calls repeat1000
      repeat1000();
   }
   /** Print, displays the phrase. 
     * @param args is not used, ignored. */ 
   public static void print(){
      //Phrase
      System.out.println("All work and no play makes Jack a dull boy.");
   }
   /** Repeat10, displays characters. 
     * @param args is not used, ignored. */ 
   public static void repeat10(){
      //Calls print
      print();
      print();
      print();
      print();
      print();
      print();
      print();
      print();
      print();
      print();
   }
   /** Repeat100, displays characters. 
     * @param args is not used, ignored. */ 
   public static void repeat100(){
      //Calls repeat10
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
      repeat10();
   }
   /** Repeat1000, displays characters. 
     * @param args is not used, ignored. */ 
   public static void repeat1000(){
      //Calls repeat100
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
      repeat100();
   }
}