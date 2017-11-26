import java.util.Scanner;
/** Indiana Davis, 
  * TCSS 142B - Autumn 2013
  * Homework 3
  */
/** Requests the length of sides of a triangle and outputs the angle.
  * @author Indiana Davis
  * @version October 22, 2013
  */
public class Angels{
	/** Main method requests input from user and outputs angle value in radians.
	  * @param args is not used, ignored.
	  */
	public static void main(String[] args){
		Scanner length = new Scanner(System.in);
      opening();
      double sideA = sideA(length);
      double sideB = sideB(length);
      double sideC = sideC(length);
      end(sideA, sideB, sideC);
   }
   public static void opening(){
		System.out.println("The triangle has three sides; A, B, and C.");
		System.out.println("Each side has and opposite angle on the triangle;");
		System.out.println("named alpha, beta, and gama respectively.");
   }
   public static double sideA(Scanner length){
		System.out.print("Please enter the length of side A:");
		double sideA = length.nextDouble();
      return sideA;
   }
   public static double sideB(Scanner length){
		System.out.print("Please enter the length of side B:");
		double sideB = length.nextDouble();
      return sideB;
   }
   public static double sideC(Scanner length){
		System.out.print("Please enter the length of side C:");
		double sideC = length.nextDouble();
      return sideC;
   }
   public static void end(double sideA, double sideB, double sideC){
		System.out.print("The magnitude of alpha is: ");
		double p = ((sideB * sideB - sideA * sideA + sideC * sideC) / (2 * sideB * sideC));
		double a = Math.acos(p);
		System.out.printf("a = %.3f", a);
		System.out.println();
		System.out.print("The magnitude of beta is: ");
		double j = ((sideA * sideA - sideB * sideB + sideC * sideC) / (2 * sideA * sideC));
		double b = Math.acos(j);
		System.out.printf("b = %.3f", b);
		System.out.println();
		System.out.print("The magnitude of gama is: ");
		double n = ((sideA * sideA - sideC * sideC + sideB * sideB) / (2 * sideA * sideB));
		double c = Math.acos(n);
		System.out.printf("c = %.3f", c);
	}
}