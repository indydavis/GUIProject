/*
 * TCSS 305 - Assignment 3
 */

package guiFront;

import java.awt.EventQueue;

/**
 * Runs PowerPaint by instantiating and starting the PowerPaintGUI.
 * @author indyd_000
 * @version Spring 2014
 */
public final class MyGUIMain {

    /**
     * Private constructor, to prevent instantiation of this class.
     */
    private MyGUIMain() {
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
                final MyGUI gui = new MyGUI();
                gui.start();  
            }
        });
    }
}
