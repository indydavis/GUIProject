/*
 * TCSS 305 - Assignment 4A: PowerPaint
 */

package powerpaint.gui;

import java.awt.EventQueue;

/**
 * Runs PowerPaint by instantiating and starting the PowerPaintGUI.
 * @author indyd_000
 * @version Spring 2014
 */
public final class PowerPaintMain {

    /**
     * Private constructor, to prevent instantiation of this class.
     */
    private PowerPaintMain() {
        throw new IllegalStateException();
    }

    /**
     * The main method, invokes the SnapShop GUI. Command line arguments are
     * ignored.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final PowerPaintGUI gui = new PowerPaintGUI();
//                gui.start();    
            }
        });
    }
}
