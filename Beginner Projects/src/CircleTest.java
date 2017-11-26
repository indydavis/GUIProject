import java.io.*;

/** Tests the Circle class.
  * @author Michael Pitts
  * @version December 5th, 2013*/
public class CircleTest {

   /** Roughly 2/3, used for testing.*/
   private static final double TWO_THIRDS = 2.0/3.0;

   /** Runs the tests, prints if all tests pass or the tests will error if they fail.
     * @param args is ignored.*/
   public static void main(String[] args) {
      final PrintStream system_out = System.out;
      final ByteArrayOutputStream test_out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(test_out, true));
      boolean pass = true;
      pass &= testDefaultContstructor();
      pass &= testRadiusContstructor();
      // getRadius effectivley tested in other methods.
      pass &= testSetRadius();
      pass &= testCalculateDiameter();
      pass &= testCalculateCircumference();
      pass &= testCalculateArea();
      pass &= testToString();
      pass &= testEquals();
      if (pass) {
         if (test_out.size() == 0) {
            system_out.println("All tests passed.");
         } else {
            System.err.println("Circle class should never print to the console.");
            System.err.println("Found text:\"" + test_out.toString() + "\"");
         }
      }
   }
   
   /** Test the radius given, single double param, constructor for the cirle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#Circle(double) */
   public static boolean testRadiusContstructor() {
      boolean pass = false;
      try {
         Circle c = new Circle(1.0);
         pass = c.getRadius() == 1.0;
         c = new Circle(0.5);
         pass = c.getRadius() == 0.5;
         c = new Circle(3.0);
         pass &= c.getRadius() == 3.0;
         c = new Circle(TWO_THIRDS);
         pass &= c.getRadius() == TWO_THIRDS;
         try {
            c = new Circle(0.0);
            pass = false; // above should have thrown exception
         } catch (IllegalArgumentException e) {
            pass &= true; // good, zero is an illegal radius
         }
         try {
            c = new Circle(-0.5);
            pass = false; // above should have thrown exception
         } catch (IllegalArgumentException e) {
            pass &= true; // good, zero is an illegal radius
         }
         if (!pass) {
            System.err.println("Did not pass single, double sized float number, parameter constructor.");
         }
       } catch (final Exception e) {
         System.err.println("The single, double sized float number, parameter constructor threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Test the default, no parameter, constructor for the cirle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#Circle() */
   public static boolean testDefaultContstructor() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = c.getRadius() == 1.0;
         if (!pass) {
            System.err.println("Did not generate circle with correct default radius of one.");
         }
       } catch (final Exception e) {
         System.err.println("The default constructor threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Tests the setRadius method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#setRadius(double) */
   public static boolean testSetRadius() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         c.setRadius(0.5);
         pass = c.getRadius() == 0.5;
         c.setRadius(3.0);
         pass &= c.getRadius() == 3.0;
         c.setRadius(TWO_THIRDS);
         pass &= c.getRadius() == TWO_THIRDS;
         try {
            c.setRadius(0.0);
            pass = false; // above should have thrown exception
         } catch (IllegalArgumentException e) {
            pass &= true; // good, zero is an illegal radius
         }
         try {
            c.setRadius(-0.5);
            pass = false; // above should have thrown exception
         } catch (IllegalArgumentException e) {
            pass &= true; // good, zero is an illegal radius
         }
         if (!pass) {
            System.err.println("Did not setRadius correctly.");
         }
       } catch (final Exception e) {
         System.err.println("The setRadius method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }

   /** Tests the calculateDiameter method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#calculateDiameter() */
   public static boolean testCalculateDiameter() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = c.calculateDiameter() == 2.0;
         c.setRadius(3.0);
         pass &= c.calculateDiameter() == 6.0;
         c.setRadius(TWO_THIRDS);
         pass &= c.calculateDiameter() == 2*TWO_THIRDS;
         if (!pass) {
            System.err.println("Did not calculateDiameter correctly.");
         }
       } catch (final Exception e) {
         System.err.println("The calculateDiameter method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Tests the calculateDiameter method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#calculateDiameter() */
   public static boolean testCalculateCircumference() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = c.calculateCircumference() == 2*Math.PI;
         c.setRadius(3.0);
         pass &= c.calculateCircumference() == 6.0*Math.PI;
         c.setRadius(TWO_THIRDS);
         pass &= c.calculateCircumference() == 2*Math.PI*TWO_THIRDS;
         if (!pass) {
            System.err.println("Did not calculateCircumference correctly.");
         }
       } catch (final Exception e) {
         System.err.println("The calculateCircumference method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Tests the calculateArea method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#calculateArea() */
   public static boolean testCalculateArea() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = c.calculateArea() == Math.PI;
         c.setRadius(3.0);
         pass &= c.calculateArea() == 9.0*Math.PI;
         c.setRadius(TWO_THIRDS);
         pass &= areClose(c.calculateArea(), Math.PI*TWO_THIRDS*TWO_THIRDS);
         if (!pass) {
           System.err.println("Did not calculateArea correctly.");
         }
       } catch (final Exception e) {
         System.err.println("The calculateArea method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Tests the toString method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#toString() */
   public static boolean testToString() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = "Radius: 1.00".equals(c.toString());
         c.setRadius(3.0);
         pass &= "Radius: 3.00".equals(c.toString());
         c.setRadius(TWO_THIRDS);
         pass &= "Radius: 0.67".equals(c.toString());
         if (!pass) {
            System.err.println("Did not correcly generate the String in toString method.");
         }
       } catch (final Exception e) {
         System.err.println("The toString method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Tests the equals method in the Circle class.
     * @return true if the test passes, false otherwise.
     * @see Circle#equals(Object) */
   public static boolean testEquals() {
      boolean pass = false;
      try {
         final Circle c = new Circle();
         pass = new Circle(1.0).equals(c);
         c.setRadius(3.0);
         pass &= ! new Circle().equals(c);
         pass &= new Circle(3.0).equals(c);
         c.setRadius(TWO_THIRDS);
         pass &= ! new Circle().equals(c);
         pass &= new Circle(TWO_THIRDS).equals(c);
         try {
            pass &= ! c.equals(new Object()); // should not pass.
         } catch (ClassCastException e) {
            pass &= true; // exception is okay.
         }
         if (!pass) {
            System.err.println("Did not pass the equals method test.");
         }
       } catch (final Exception e) {
         System.err.println("The equals method threw an error:");
         e.printStackTrace();
       }
       return pass;
   }
   
   /** Returns true if the two values are very close, in effect the same but register as
     * not equal due to double floating point round off error.
     * @param first_value is one of the values to test.
     * @param second_value is the other value to test.
     * @return true if the two values are similar, false otherwise.*/
   public static boolean areClose(final double first_value, 
      final double second_value) {
      final double min = Math.min(first_value, second_value);
      final double max = Math.max(first_value, second_value);
      int count = 0;
      double next = min;
      while (count < 2 && next != max) {
         next = Math.nextUp(next);
         count++;
      }
      return next == max;
   }
   
   /** Tests the areClose() method in this class.
     * @return true if the method seems to work, false otherwise.
     * @see CircleTest#areClose(double, double).*/
   public static boolean testAreClose() {
      boolean pass = areClose(1.0, 1.0);
      pass &= areClose(3.0, 3.0);
      pass &= !areClose(1.0, 2.0);
      pass &= areClose(0.1, 0.1);
      pass &= !areClose(0.1, 0.2);
      pass &= areClose(TWO_THIRDS * 5 * TWO_THIRDS, 5 * TWO_THIRDS * TWO_THIRDS);
      pass &= areClose(TWO_THIRDS * TWO_THIRDS * 5, 5 * TWO_THIRDS * TWO_THIRDS);
      pass &= areClose(TWO_THIRDS * TWO_THIRDS * Math.E, Math.E * TWO_THIRDS * TWO_THIRDS);
      pass &= areClose(TWO_THIRDS * Math.E * TWO_THIRDS, TWO_THIRDS * TWO_THIRDS * Math.E);
      pass &= !areClose(5 * TWO_THIRDS * TWO_THIRDS, 5.00001 * TWO_THIRDS * TWO_THIRDS);
      pass &= !areClose(4.99999*TWO_THIRDS * TWO_THIRDS, 5 * TWO_THIRDS * TWO_THIRDS);
      return pass;
   }
}