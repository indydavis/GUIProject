/*
 * TCSS 305 - Circle Test Homework
 */
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

/**
  * Tests the Circle class.
  * @author indyd_000
  * @version CircleTest1.
  */
public class CircleTest {
    /** TOLERANCE used to show maximum tolerance for doubles. */
    private static final double TOLERANCE = 0.000001;
    
    /** myCircle object used to test the circle class. */
    private Circle myCircle;
    
    /**
      * @throws java.lang.Exception
      */
    @Before
    public void setUp() {
        myCircle = new Circle();
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testCircleNull() {
        myCircle = new Circle(-1, new Point(2, 5), Color.GREEN);
    }

    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testCircleNull2() {
        myCircle = new Circle(4.0, null, Color.GREEN);
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testCircleNull3() {
        myCircle = new Circle(3.0, new Point(2, 7), null);
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test
    public void testSetRadius() {
        myCircle.setRadius(5.0);
        assertEquals("setRadius failed!", 5.0, myCircle.getRadius(), TOLERANCE);
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRadiusNull() {
        myCircle.setRadius(-1);
    }

    /**
      * Test method for {@link Circle#setCenter(java.awt.Point)}.
      */
    @Test
    public void testSetCenter() {
        myCircle.setCenter(new Point(4, 3));
        assertEquals("setCenter failed!", new Point(4, 3), myCircle.getCenter());
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCenterNull() {
        myCircle.setCenter(null);
    }

    /**
      * Test method for {@link Circle#setColor(java.awt.Color)}.
      */
    @Test
    public void testSetColor() {
        myCircle.setColor(Color.BLUE);
        assertEquals("setColor failed!", Color.BLUE, myCircle.getColor());
    }
    
    /**
      * Test method for {@link Circle#setRadius(double)}.
      */
    @Test(expected = IllegalArgumentException.class)
    public void testSetColorNull() {
        myCircle.setColor(null);
    }

    /**
      * Test method for {@link Circle#calculateDiameter()}.
      */
    @Test
    public void testCalculateDiameter() {
        myCircle.setRadius(5.0);
        final double diameter = myCircle.calculateDiameter();
        assertEquals("calculateDiameter failed!", 10.0, diameter, TOLERANCE);
    }

    /**
      * Test method for {@link Circle#calculateCircumference()}.
      */
    @Test
    public void testCalculateCircumference() {
        myCircle.setRadius(5.0);
        final double circumference = myCircle.calculateCircumference();
        assertEquals("calculateCircumference failed!", 15.707963, circumference, TOLERANCE);
    }

    /**
      * Test method for {@link Circle#calculateArea()}.
      */
    @Test
    public void testCalculateArea() {
        myCircle.setRadius(5.0);
        final double area = myCircle.calculateArea();
        assertEquals("calculateArea failed!", Math.PI * Math.pow(5.0, 2), area, TOLERANCE);
    }

    /**
      * Test method for {@link Circle#toString()}.
      */
    @Test
    public void testToString() {
        myCircle.setRadius(5.0);
        myCircle.setCenter(new Point(4, 3));
        myCircle.setColor(Color.BLUE);
        final String s = myCircle.toString();
        assertEquals("toString failed!", "Circle [radius=5.0, center=java.awt.Point[x=4,y=3], "
                        + "color=java.awt.Color[r=0,g=0,b=255]]", s);
    }
}