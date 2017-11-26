/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An event listener that listens for mouse events, and prints them all to
 * standard error.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler - minor changes and added comments
 * @version 1.1
 */
public class TrivialMouseListener implements MouseListener {
    /**
     * The dimensions of the window.
     */
    private static final Dimension SIZE = new Dimension(400, 300);

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
     * Creates a frame and listens for mouse events.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("Fun with Mouse Events");
        final JPanel panel = new JPanel();
        panel.addMouseListener(new TrivialMouseListener());
        frame.add(panel); // adds to BorderLayout.CENTER by default
        frame.setSize(SIZE);
        frame.setLocationRelativeTo(null); // center frame on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
