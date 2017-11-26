/*
 * Event Listeners TCSS 305
 */

package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Illustrates how keyboard and action events work with text entry.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler - minor changes
 * @version 1.1
 */
public class KeyboardAndActionListener implements KeyListener, ActionListener {
    /**
     * Detects a key pressed event.
     * 
     * @param theEvent The event.
     */
    @Override
    public void keyPressed(final KeyEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * Detects a key released event.
     * 
     * @param theEvent The event.
     */
    @Override
    public void keyReleased(final KeyEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * Detects a key typed event.
     * 
     * @param theEvent The event.
     */
    @Override
    public void keyTyped(final KeyEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * Detects an action event.
     * 
     * @param theEvent The event.
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        System.err.println(theEvent);
    }

    /**
     * Creates a frame with a text field and a label, and listens for key and
     * action events.
     * 
     * @param theArgs Command line arguments (ignored).
     */
    public static void main(final String[] theArgs) {
        final JFrame frame = new JFrame("Text Entry");
        final JLabel label = new JLabel("Text Field");
        final JTextField textField1 = new JTextField(40);
        final FlowLayout layout = new FlowLayout();

        final KeyboardAndActionListener listener = new KeyboardAndActionListener();

        textField1.addActionListener(listener);
        textField1.addKeyListener(listener);

        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(textField1);
        frame.pack();
        frame.setVisible(true);
    }
}
