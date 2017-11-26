/*
 * TCSS 305 – Spring 2014
 * Assignment 1 - Testing
 */

import java.awt.Color;
import java.awt.Point;

/**
 * Represents a circle.
 * 
 * <p>Invariant: myRadius must be greater than 0
 *           AND myCenter must not be null
 *           AND myColor must not be null</p>
 * 
 * @author Alan Fowler
 * @version Spring 2014
 */
public class Circle {

    // class constants

    /**
     * A default radius to use when no other value is specified - 1.0 (unit circle).
     */
    private static final double DEFAULT_RADIUS = 1.0; // unit circle

    /**
     * A default Point for the center of a Circle - (0, 0).
     */
    private static final Point DEFAULT_CENTER = new Point(0, 0); // origin

    /**
     * A default Color to use when no other Color is specified - Color.BLACK.
     */
    private static final Color DEFAULT_COLOR = Color.BLACK;

    // instance fields

    /**
     * The radius of this Circle.
     */
    private double myRadius;

    /**
     * The center of this Circle.
     */
    private Point myCenter;

    /**
     * The color of this Circle.
     */
    private Color myColor;

    // constructors

    /**
     * Constructs a Circle at the specified location with the specified radius
     * and specified color.
     * 
     * <p>Precondition: The parameters must not violate the class invariant.
     * That is, theRadius must be greater than 0
     *      AND theCenter must not be null
     *      AND theColor must not be null</p>
     * 
     * @param theRadius the radius to assign to this Circle
     * @param theCenter the center point to assign to this Circle
     * @param theColor the color to assign to this Circle
     * @throws IllegalArgumentException if theRadius <= 0
     *                                  OR theCenter is null
     *                                  OR theColor is null
     */
    public Circle(final double theRadius,
                  final Point theCenter,
                  final Color theColor) throws IllegalArgumentException {

        if (theRadius <= 0) {
            throw new IllegalArgumentException("The radius must be a positive value!");
        }

        if (theCenter == null) {
            throw new IllegalArgumentException("The center must not be null!");
        }

        if (theColor == null) {
            throw new IllegalArgumentException("The color must not be null!");
        }

        myRadius = theRadius;
        // make a defensive copy of the mutable parameter to avoid an encapsulation violation
        myCenter = (Point) theCenter.clone();
        myColor = theColor;
    }

    /**
     * Constructs a black unit circle centered at the origin.
     */
    public Circle() {
        this(DEFAULT_RADIUS, DEFAULT_CENTER, DEFAULT_COLOR);
    }

    // instance methods (commands)

    /**
     * Sets the radius of this Circle to the specified value.
     * 
     * <p>Precondition: theRadius must be greater than 0</p>
     * <p>Postcondition: this Circle will be assigned the specified radius</p>
     * 
     * @param theRadius the radius value to assign to this Circle
     * @throws IllegalArgumentException if theRadius <= 0
     */
    public final void setRadius(final double theRadius) throws IllegalArgumentException {

        if (theRadius <= 0) {
            throw new IllegalArgumentException();
        }
        myRadius = theRadius;
    }

    /**
     * Sets the center of this Circle to the specified point.
     * 
     * <p>Precondition: thePoint must not be null</p>
     * <p>Postcondition: this Circle will be assigned the specified center Point</p>
     * 
     * @param thePoint the center value to assign to this Circle
     * @throws IllegalArgumentException if thePoint is null
     */
    public final void setCenter(final Point thePoint) throws IllegalArgumentException {
        
        if (thePoint == null) {
            throw new IllegalArgumentException("The center point must not be null!");
        }
        // make a defensive copy of the mutable parameter to avoid an encapsulation violation
        myCenter = (Point) thePoint.clone();
    }

    /**
     * Sets the Color of this Circle to the specified value.
     * 
     * <p>Precondition: theColor must not be null</p>
     * <p>Postcondition: this Circle will be assigned the specified Color</p>
     * 
     * @param theColor the Color value to assign to this Circle
     * @throws IllegalArgumentException if theColor is null
     */
    public final void setColor(final Color theColor) throws IllegalArgumentException {

        if (theColor == null) {
            throw new IllegalArgumentException();
        }
        myColor = theColor;
    }

    // instance methods (queries)

    /**
     * @return the radius of this Circle
     */
    public final double getRadius() {
        return myRadius;
    }

    /**
     * @return the center Point of this Circle
     */
    public final Point getCenter() {

        // return a defensive copy of the mutable field to avoid an encapsulation violation
        return (Point) myCenter.clone();
    }

    /**
     * @return the Color of this Circle
     */
    public final Color getColor() {
        return myColor;
    }

    /**
     * Calculates and returns the diameter of this Circle.
     * 
     * @return The diameter of this Circle
     */
    public double calculateDiameter() {
        return 2 * myRadius;
    }

    /**
     * Calculates and returns the circumference of this Circle.
     * 
     * @return the circumference of this Circle
     */
    public double calculateCircumference() {
        return Math.PI * myRadius;
    }

    /**
     * Calculates and returns the area of this Circle.
     * 
     * @return the area of this Circle
     */
    public double calculateArea() {
        return Math.PI * Math.pow(myRadius, 2);
    }
    
    // overridden methods from class Object

    /**
     * {@inheritDoc}
     * 
     * The String representation of this Circle will be formatted as follows:
     * <br>Circle [radius=(current value), center=(current value), color=(current value)].
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(128);
        builder.append(getClass().getSimpleName());
        builder.append(" [radius=");
        builder.append(myRadius);
        builder.append(", center=");
        builder.append(myCenter);
        builder.append(", color=");
        builder.append(myColor);
        builder.append(']');
        return builder.toString();
    }

}