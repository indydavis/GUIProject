import java.util.*;
import java.io.*;
/** Indiana Davis
  * CircleMain
  * TCSS 142B - Autumn 2013
  * Homework 8
  */
/** This program calculates statistics for a circle.
  * @author Indiana Davis
  * @version December 7, 2013
  */
public class Circle{

   private double radius;  //A class universal parameter that hold the radius variable.
   /** Circle method, sets the defalt radius of the circle.
     */
   public Circle(){
      this (1);
   }
   /** Circle method, sets radius to the defalt value.
     * @param newRadius gets the default radius value.
     */
   public Circle(double newRadius){
      if(newRadius <= 0){
         throw new IllegalArgumentException();
      }
      radius = newRadius;
   }
   /** getRadius method, returns the value of radius as a double.
     */
   public double getRadius(){
      return radius;
   }
   /** setRadius method, sets radius to what newRadius was.
     * @param newRadius gets the value of the radius.
     */
   public void setRadius(double newRadius){
      if(newRadius <= 0){
         throw new IllegalArgumentException();
      }
      radius = newRadius;
   }
   /** calculateDiameter method, calculates the diameter of a circle.
     */
   public double calculateDiameter(){
      double diameter = radius * 2;
      return diameter;
   }
   /** calculateCircumference method, calculates the circumference of a circle.
     */
   public double calculateCircumference(){
      double diameter = calculateDiameter();
      double circumference = diameter * Math.PI;
      return circumference;
   }
   /** calculateArea method, calculates the area of a circle.
     */
   public double calculateArea(){
      double area = (Math.pow(radius, 2)) * Math.PI;
      return area;
   }
   /** equals method, checks to see if two circles are equal.
     * @param other takes an object with statistics to compare.
     */
   public boolean equals(Object other){
      Circle c = (Circle) other;
      return c.radius == radius;
   }
   /** toString method, returns the radius in String format.
     */
   public String toString(){
      return String.format("Radius: %.2f", radius);
   }
}