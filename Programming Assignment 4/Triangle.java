import java.util.*;
import java.io.*;
/** Indiana Davis
  * Triangle
  * TCSS 143B - Winter 2013
  */
/** This program takes 3 side lengths and returns information on a triangle.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public class Triangle extends Shape{

   double sideA;
   double sideB;
   double sideC;
   /** Method Triangle, checks for illegal arguments and makes a call to set the sides. 
     * @param newSideA, used to get a sides length.
     * @param newSideB, used to get a sides length.
     * @param newSideC, used to get a sides length. */
   public Triangle(final double newSideA, final double newSideB, final double newSideC){
      double temp1 = newSideA + newSideB;
      double temp2 = newSideB + newSideC;
      double temp3 = newSideA + newSideC;
      if(temp1 < newSideC || temp3 < newSideB || temp2 < newSideA || newSideA <= 0 || newSideB <= 0 || 
         newSideC <= 0){ //checks for negative arguments and that the sides equal that of a triangle.
         throw new IllegalArgumentException("Must be numerical values that are greater than 0 and be a triangle.");
      }
      setSideA(newSideA);
      setSideB(newSideB);
      setSideC(newSideC);
   }
   /** Method setSideA, used to set side A.
     * @param newSideA, used to get a sides length. */
   public void setSideA(final double newSideA){
      this.sideA = newSideA;
   }
   /** Method setSideB, used to set side B.
     * @param newSideB, used to get a sides length. */
   public void setSideB(final double newSideB){
      this.sideB = newSideB;
   }
   /** Method setSideC, used to set side C.
     * @param newSideC, used to get a sides length. */
   public void setSideC(final double newSideC){
      this.sideC = newSideC;
   }
   /** Method calculateArea, calculates the area. */
   public double calculateArea(){
      double area = 0.0;
      double temp = 0.0;
      temp = (sideA + sideB + sideC)/2;
      area = Math.sqrt(temp * (temp - sideA) * (temp - sideB) * (temp - sideC)); //calculates the area.
      return area;
   }
   /** Method toString, returns a string representation of the triangle. */
   public String toString(){
      List<String> values = new ArrayList<String>();
      String A = "SideA: " + sideA;
      String B = "SideB: " + sideB;
      String C = "SideC: " + sideC;
      values.add(A);
      values.add(B);
      values.add(C);
      String triangle = String.format("Triangle " + values + " Area: %.2f", calculateArea());
      return triangle;
   }
}