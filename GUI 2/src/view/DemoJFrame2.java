/*
 * A second JFrame demo TCSS 305
 */

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A second demonstration of JFrame.
 * 
 * This demonstration uses composition instead of inheritance. This class does
 * not extend JFrame, instead it has a field of type JFrame.
 * 
 * @author Alan Fowler (acfowler@u.washington.edu)
 * @version Spring 2014
 */
public final class DemoJFrame2 { // this class does not extend JFrame

    /**
     * The frame for this application's GUI.
     */
    private final JFrame myFrame; // instead we keep a field of type JFrame

    /**
     * Constructor to initialize fields.
     */
    private DemoJFrame2() {
        myFrame = new JFrame();
    }

    /**
     * Sets up and displays the GUI for this application.
     */
    private void start() {
        myFrame.setTitle("Second Frame Demo");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);

        myFrame.add(new JButton("World!")); // BorderLayout.CENTER by default
        myFrame.add(new JButton("Hello"), BorderLayout.WEST);
        myFrame.add(new JButton("Goodbye!"), BorderLayout.SOUTH);

        final JPanel panel1 = new JPanel();
        panel1.add(new JButton("TCSS"));
        panel1.add(new JButton("305"));
         //myFrame.add(panel1, BorderLayout.CENTER);

        myFrame.add(panel1, BorderLayout.NORTH);

        //myFrame.setLayout(new FlowLayout());

        myFrame.pack();
        myFrame.setVisible(true);
    }

    /**
     * The start point for a program that displays a frame.
     * 
     * @param theArgs command line arguments - ignored
     */
    public static void main(final String... theArgs) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DemoJFrame2().start();
            }
        });
    }

}
