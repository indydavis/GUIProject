/*
 * TCSS 305A - Spring 2014
 * Lecture 2 code demo
 */

/**
 * Represents a 2-dimensional point on a plane.
 *
 * @author Alan Fowler acfowler@uw.edu
 * @author Help from the whole TCSS 305A class!!
 * @version 2 April 2014
 */
public final class Point {

    // constants (static final fields)
    
    /**  A default value for the x coordinate. */
    public static final double DEFAULT_X = 0;
    
    /** A default value for the y coordinate. */
    public static final double DEFAULT_Y = 0;

    /** A format string for decimal numbers. */
    private static final String FORMAT = "%.2f"; // used to display 2 decimal places
    
    // instance fields

    /** The x coordinate. */
    private double myX;

    /** The y coordinate. */
    private double myY;

    // constructors

    /**
     * Constructs a point using the provided coordinates.
     *
     * @param theX The x coordinate to assign to this point.
     * @param theY The y coordinate to assign to this point.
     */
    public Point(final double theX, final double theY) {
        myX = theX;
        myY = theY;
        
        //OR if the setters are 'final'
        //setX(theX);
        //setY(theY);
    }

    /**
     * Constructs a point at the origin (0, 0).
     */
    public Point() {
        myX = DEFAULT_X;
        myY = DEFAULT_Y;
        
        //OR
        //this(DEFAULT_X, DEFAULT_Y);
    }
    
    /**
     * This copy constructor creates a new Point as a copy of the specified Point.
     * 
     * @param theOtherPoint a Point object to copy.
     */
    public Point(final Point theOtherPoint) {
        myX = theOtherPoint.myX;
        myY = theOtherPoint.myY;
        
        //OR
        //this(theOtherPoint.myX, theOtherPoint.myY);
    }

    // queries (sometimes called 'accessors'; sometimes called 'getters')

    /**
     * What is the x coordinate?
     *
     * @return the x coordinate
     */
    public double getX() {
        return myX;
    }

    /**
     * What is the y coordinate?
     *
     * @return the y coordinate
     */
    public double getY() {
        return myY;
    }

    /**
     * What is the distance to the specified point?
     * 
     * precondition: theOtherPoint is not null
     *
     * @param theOtherPoint The other point.
     * @return the distance from the current point to the specified point
     * @throws NullPointerException if theOtherPoint is null
     */
    public double calculateDistance(final Point theOtherPoint) {
        final double dx = myX - theOtherPoint.myX;
        final double dy = myY - theOtherPoint.myY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // commands (sometimes called 'mutators'; sometimes called 'setters')

    /**
     * Set the x-coordinate to the specified value!
     * 
     * @param theX the new x value to set
     */
    public void setX(final double theX) {
        myX = theX;
    }

    /**
     * Set the y-coordinate to the specified value!
     * 
     * @param theY the new y value to set
     */
    public void setY(final double theY) {
        myY = theY;
    }

    /**
     * Translate by the specified values!
     * 
     * @param theX The x distance to translate by.
     * @param theY The y distance to translate by.
     */
    public void translate(final double theX, final double theY) {
        myX += theX;
        myY += theY;
    }

    // overridden methods from class Object

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" (");
        sb.append(String.format(FORMAT, myX));
        sb.append(", ");
        sb.append(String.format(FORMAT, myY));
        sb.append(')');
        return sb.toString();
    }

}
