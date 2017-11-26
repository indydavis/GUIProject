import java.util.*;
import java.io.*;
/** Indiana Davis
  * Shape
  * TCSS 143B - Winter 2013
  */
/** This program preforms various tasks for book upkeep.
  * @author Indiana Davis
  * @version January 8, 2013
  */
public abstract class Shape implements Comparable<Shape>{

   public abstract double calculateArea();
   
   public int compareTo(final Shape other){
      return (int) (this.calculateArea() - other.calculateArea());
   }
}