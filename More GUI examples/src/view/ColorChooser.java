/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.Color;

import javax.swing.JColorChooser;

/**
 * Demonstrates the use of a color chooser.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler - minor changes, new comments
 * @version 1.1
 */
public final class ColorChooser {
    /**
     * Private constructor to prevent instantiation.
     */
    private ColorChooser() {
        // do nothing
    }

    /**
     * Displays a color chooser, and sends the chosen color to standard output.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String... theArgs) {
        Color result = null;

        do {
            result = JColorChooser.showDialog(null, "A Color Chooser", null);
            System.out.println("Color chosen: " + result);
        } while (result != null); // user chooses cancel or closes window
    }
}
