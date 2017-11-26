/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An event listener that listens for mouse motion and scroll wheel events, and
 * prints them all to standard error.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler - minor changes and added comments
 * @version 1.1
 */
public class TrivialMouseMotionAndScrollWheelListener implements MouseMotionListener,
                MouseWheelListener {
    /**
     * The dimensions of the window.
     */
    private static final Dimension SIZE = new Dimension(400, 300);

    // Interface Methods

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseWheelMoved(final MouseWheelEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseDragged(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseMoved(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * Creates a frame and listens for mouse motion and scroll wheel events.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("More Fun with Mouse Events");
        final JPanel panel = new JPanel();

        final TrivialMouseMotionAndScrollWheelListener listener =
                        new TrivialMouseMotionAndScrollWheelListener();

        panel.addMouseMotionListener(listener);
        panel.addMouseWheelListener(listener);

        frame.add(panel); // adds to BorderLayout.CENTER by default
        frame.setSize(SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
