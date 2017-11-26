import java.util.*;
import java.io.*;
/** Indiana Davis
  * CircleMain
  * TCSS 142B - Autumn 2013
  * Homework 8
  */
/** This program prints circle statistics based on user input.
  * @author Indiana Davis
  * @version December 7, 2013
  */
public class CircleMain{
   /** Main method, links to other methods and checks for the number 0.
	  * @param args is not used, ignored.
	  */
   public static void main(String[] args){
      double number = -1.0;
      Circle[] circles = new Circle[3];
      introduction();
      number = getRadius();
      while(number != 0){
         System.out.println("Here is your new Circle:");
         Circle mainCircle = new Circle(number);
         array(mainCircle, circles);
         printOtherCircle(mainCircle);
         printCircleArray(circles);
         compairArray(circles);
         number = getRadius();
      }
      System.out.println("Thank you for using the circle program.");
   }
   /** introduction method, prints the introduction for the program.
     */
   public static void introduction(){
      System.out.println("This program will prompt for the radius of a circle");
      System.out.println("and display the circle's diameter, circumference, and area.");
      System.out.println("The program will repeat until the user chooses to quit.\n");
   }
   /** getRadius method, gets the radius for the circle from the user.
     */
   public static double getRadius(){
      double number = -1.0;
      Scanner input = new Scanner(System.in);
      while(number < 0){
         System.out.print("Enter a radius (0 to quit): ");
         if(input.hasNextDouble()){
            number = input.nextDouble();
            if(number < 0){
               System.out.println("The radius must be a positive number; please try again.\n");
            }
         }else{
            System.out.println("Not a number; try again.\n");
            input.next();
         }
      }
      return number;
   }
   /** array method, used to move the three most recent circles into their possitions in the array.
     * @param mainCircle, used to get the value of the most recent circle.
     * @param circles, used to get the established array.
     */
   public static void array(Circle mainCircle, Circle[] circles){
      int i = circles.length - 1;
      while(i > 0){
         circles[i] = circles[i - 1];
         i--;
      }
      circles[0] = mainCircle;
   }
   /** printCircle method, prints off the gathered statistics.
     */
   public static void printCircle(Circle mainCircle){
      System.out.print(mainCircle + ", ");
      System.out.printf("Diameter: %.2f", mainCircle.calculateDiameter());
      System.out.printf(", Circumference: %.2f",  mainCircle.calculateCircumference());
      System.out.printf(", Area: %.2f", mainCircle.calculateArea());
      System.out.println();
   }
   /** printCircleArray method, sends the circles held in the array to printCircle to be printed.
     * @param circles, used to gather the established array.
     */
   public static void printCircleArray(Circle[] circles){
      int i = 0;
      System.out.println("Here are the most recent " + circles.length + " circles:");
      while(i < circles.length && circles[i] != null){
         printCircle(circles[i]);
         i++;
      }
   }
   /** printOtherCircle method, prints the information gathered about mainCircle.
     * @param mainCircle, used to determine the radius of the circle.
     */
   public static void printOtherCircle(Circle mainCircle){
      System.out.println(mainCircle);
      System.out.printf("Diameter: %.2f", mainCircle.calculateDiameter());
      System.out.printf(", Circumference: %.2f",  mainCircle.calculateCircumference());
      System.out.printf(", Area: %.2f", mainCircle.calculateArea());
      System.out.println();
   }
   /** compairArray method, compairs the last three circles to see if they are equal.
     * @param circles, used to gather the information about the circles from the array.
     */
   public static void compairArray(Circle[] circles){
      int count = 1;
      if (circles[0] != null && circles[1] != null && circles[0].equals(circles[1])) {
         count++;
      }
      if (circles[1] != null && circles[2] != null && circles[1].equals(circles[2]) && count != 3) {
         count++;
      }
      if (circles[0] != null && circles[2] != null && circles[0].equals(circles[2]) && count != 3) {
         count++;
      }
      if(count > 1){
         System.out.println(count + " of the Circles are equal.\n"); 
      }else{
         System.out.println("None of the Circles are equal.\n");
      }   
   }
}