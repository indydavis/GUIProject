/*
 * Event Listeners TCSS 305
 */

package powerpaint.action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

/**
 * Demonstrates the use of a color chooser.
 * @author indyd_000
 * @version 1
 */
public final class ColorChooserAction implements ActionListener {
    /**
     * Private constructor to prevent instantiation.
     */
    public ColorChooserAction() {
        // do nothing
    }

    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        Color result = Color.BLACK;
        do {
            result = JColorChooser.showDialog(null, "Select a color", Color.BLACK);
            System.out.println("Color chosen: " + result);
        } while (result != null); // user chooses cancel or closes window        
    }
}