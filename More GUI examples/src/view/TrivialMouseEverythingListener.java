/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

/**
 * An event listener that listens for all possible mouse events. All events are
 * simply printed to standard error.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler - minor changes, some new comments
 * @version 1.1
 */
public class TrivialMouseEverythingListener implements MouseInputListener, MouseWheelListener {
    /**
     * The dimensions of the window.
     */
    private static final Dimension SIZE = new Dimension(400, 300);

    // Interface Methods

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseClicked(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseEntered(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseExited(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mousePressed(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseReleased(final MouseEvent theEvent) {
        System.err.println(theEvent);
    }

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
     * Creates a frame and listens for mouse events of all kinds.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("The Most Fun with Mouse Events");
        final JPanel panel = new JPanel();

        final TrivialMouseEverythingListener listener = new TrivialMouseEverythingListener();

        // Notice that the listener is added to the panel multiple times (for
        // different functions)
        panel.addMouseListener(listener);
        panel.addMouseMotionListener(listener);
        panel.addMouseWheelListener(listener);

        frame.add(panel); // adds to BorderLayout.CENTER by default

        frame.setSize(SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
