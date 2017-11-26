/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * An action listener class that does something less trivial.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version Spring 2014
 */
public class SlightlyLessTrivialActionListener implements ActionListener {
    /**
     * The dimensions of the window.
     */
    private static final Dimension SIZE = new Dimension(200, 200);

    /**
     * The time threshold for clicking too fast.
     */
    private static final long THRESHOLD = 1000; // 1000ms = 1 second

    // Instance Fields

    /**
     * The two-actions-ago timestamp.
     */
    private long myTwoActionsAgo;

    /**
     * The one-action-ago timestamp.
     */
    private long myOneActionAgo;

    // Interface Methods

    /**
     * Handles an ActionEvent. In a less boring way.
     * 
     * @param theEvent The event.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        System.err.println(theEvent);

        // easter egg time!

        if (theEvent.getWhen() - myTwoActionsAgo < THRESHOLD) {
            JOptionPane.showMessageDialog(null, "You're clicking too fast. Please stop.",
                                          "Click Speed Warning", JOptionPane.WARNING_MESSAGE);
        }

        myTwoActionsAgo = myOneActionAgo;
        myOneActionAgo = theEvent.getWhen();
    }

    // Main method, for testing

    /**
     * Creates a JFrame with a single button, to test event listening, with a
     * twist.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("Click On Me!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JButton button = new JButton("A Button");
        button.addActionListener(new SlightlyLessTrivialActionListener());
        frame.add(button);
        frame.setSize(SIZE);

        //frame.setLocationRelativeTo(null);
        frame.setLocationByPlatform(true);

        frame.setVisible(true);
    }
}
