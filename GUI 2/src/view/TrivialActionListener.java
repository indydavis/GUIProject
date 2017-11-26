/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * An action listener that does something trivial.
 * 
 * @author Daniel M. Zimmerman
 * @version 1.0
 */
public class TrivialActionListener implements ActionListener {
    /**
     * The dimensions of the window.
     */
    private static final Dimension SIZE = new Dimension(220, 90);

    // Interface Methods

    /**
     * Handles an ActionEvent. In a boring way.
     * 
     * @param theEvent The event.
     */
    public void actionPerformed(final ActionEvent theEvent) {
        System.err.println(theEvent);
        // ((JButton) the_event.getSource()).removeActionListener(this);

        // When buttons are disabled, they should also LOOK disabled
        ((JButton) theEvent.getSource()).setEnabled(false);
    }

    // Main method, for testing

    /**
     * Creates a JFrame with 2 buttons, to test event listening.
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("Click On Me!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JButton button = new JButton("A Button");
        final JButton button2 = new JButton("Another Button");

        final ActionListener listener = new TrivialActionListener();

        button.addActionListener(listener);
        button2.addActionListener(listener);

        frame.add(button, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.setSize(SIZE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
