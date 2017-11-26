import java.util.*;
import java.io.*;
/** Indiana Davis
  * Rectangle
  * TCSS 143B - Winter 2013
  */
/** This program takes a length and width and returns information on a rectangle.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public class Rectangle extends Shape{

   double length = 0.0;
   double width = 0.0;
   /** Method Rectangle, checks for illegal arguments and makes a call to set the length and width. 
     * @param newLength, used to get the length.
     * @param newWidth, used to get the width. */ 
   public Rectangle(final double newLength, final double newWidth){
      if(newLength <= 0 || newWidth <= 0){
         throw new IllegalArgumentException("Must be numerical values that are greater than 0");
      }
      setLength(newLength);
      setWidth(newWidth);
   }
   /** Method setLength, used to set the length.
     * @param newLength, used to get the length. */
   public void setLength(final double newLength){
      this.length = newLength;
   }
   /** Method setWidth, used to set the width.
     * @param newWidth, used to get the width. */
   public void setWidth(final double newWidth){
      this.width = newWidth;
   }
   /** Method calculateArea, calculates the area. */
   public double calculateArea(){
      double area = length * width;
      return area;
   }
   /** Method toString, returns a string representation of the rectangle. */
   public String toString(){
      List<String> values = new ArrayList<String>();
      String len = "Length: " + length;
      String wid = "Width: " + width;
      values.add(len);
      values.add(wid);
      String rectangle = String.format("Rectangle " + values + " Area: %.2f", calculateArea());
      return rectangle;
   }
}