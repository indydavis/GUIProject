import java.util.*;
import java.io.*;
/** Indiana Davis
  * Circle
  * TCSS 143B - Winter 2013
  */
/** This program takes a radius and returns information on a circle.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public class Circle extends Shape{

   double radius = 0.0;
   /** Method Circle, checks for illegal arguments and makes a call to set the radius. 
     * @param newRadius, used to get the radius. */ 
   public Circle(final double newRadius){
      if(newRadius <= 0){
         throw new IllegalArgumentException("Must be a numerical value that is greater than 0");
      }else{
         setRadius(newRadius);
      }
   }
   /** Method setRadius, used to set the radius.
     * @param newRadius, used to get the radius. */
   public void setRadius(final double newRadius){
      this.radius = newRadius;
   }
   /** Method calculateArea, calculates the area. */
   public double calculateArea(){
      double area = 0.0;
      double temp = 0.0;
      temp = Math.pow(radius, 2); //calculates the radius squared.
      area = Math.PI * temp; //calculates the area given radius sqared.
      return area;
   }
   /** Method toString, returns a string representation of the circle. */
   public String toString(){
      List<String> values = new ArrayList<String>();
      String rad = "Radius:  " + radius;
      values.add(rad);
      String circle = String.format("Circle " + values + " Area: %.2f", calculateArea());
      return circle;
   }
}