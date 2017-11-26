/*
 * TCSS 305 - code demo
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests of the Point class.
 * 
 * @author Alan Fowler
 * @version 7 April 2014
 */
public class PointTest {
    
    /** A Point to use in the tests. */
    private Point myPoint;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() {
        myPoint = new Point();
    }

    /**
     * Test method for {@link Point#calculateDistance(Point)}.
     */
    @Test
    public void testCalculateDistance() {
        assertEquals("testCalculateDistance failed!", 5,
                     myPoint.calculateDistance(new Point(3, 4)), .00001);
        
        assertEquals("testCalculateDistance failed!", 5,
                     myPoint.calculateDistance(new Point(-3, -4)), .00001);
        
        assertEquals("testCalculateDistance failed!", 0,
                     myPoint.calculateDistance(new Point(myPoint)), .00001);
    }
    
    /**
     * Test method for {@link Point#calculateDistance(Point)}.
     */
    @Test(expected = NullPointerException.class)
    public void testCalculateDistanceNull() {
        myPoint.calculateDistance(null);
    }

    /**
     * Test method for {@link Point#setX(double)}.
     */
    @Test
    public void testSetX() {
        myPoint.setX(42);
        assertEquals("setX failed!", 42, myPoint.getX(), .00001);
    }

    /**
     * Test method for {@link Point#setY(double)}.
     */
    @Test
    public void testSetY() {
        myPoint.setY(-42);
        assertEquals("setY failed!", -42, myPoint.getY(), .00001);
    }

    /**
     * Test method for {@link Point#translate(double, double)}.
     */
    @Test
    public void testTranslate() {
        myPoint.translate(10, -5);
        assertEquals("translate failed!", 10, myPoint.getX(), .000001);
        assertEquals("translate failed!", -5, myPoint.getY(), .000001);
    }

    /**
     * Test method for {@link Point#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("toString() produced an unexpected result!",
                     "Point (0.00, 0.00)", myPoint.toString());
    }

}
