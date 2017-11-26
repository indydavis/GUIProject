/*
 * Event Listeners TCSS 305
 */

package guiPaintActions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

/**
 * Demonstrates the use of a color chooser.
 * @author Indiana Davis
 * @version Fall 2014
 */
public final class ColorChooserAction implements ActionListener {
	
	/**
	 * Used to get the chosen color.
	 */
	private static Color result;
	
    /**
     * Private constructor to prevent instantiation.
     * @wbp.parser.entryPoint
     */
    public ColorChooserAction() {
        result = Color.BLACK;
    }
    
    /**
     * Gets the color from the color chooser and stores it.
     * @param theEvent Used to control the current event.
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
    	result = JColorChooser.showDialog(null, "Select a color", Color.BLACK);
    }
    
    /**
     * Returns result when called.
     * @return result used to get the color that was chosen.
     */
    public static Color getResult() {
    	return result;
    }
}