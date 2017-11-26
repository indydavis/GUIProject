/*
 * TCSS 305 - Assignment 3: SnapShop
 */

package photoEditor;

import java.awt.EventQueue;

/**
 * Runs SnapShop by instantiating and starting the SnapShopGUI.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version Spring 2014
 */
public final class PhotoEditorMain {

    /**
     * Private constructor, to prevent instantiation of this class.
     */
    public PhotoEditorMain() {
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
                final PhotoEditorGUI gui = new PhotoEditorGUI();
                gui.start();    
            }
        });
    }
}
