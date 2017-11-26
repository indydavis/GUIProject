/*
 * TCSS 305
 */

package powerpaint.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

import powerpaint.action.ColorChooserAction;
import powerpaint.action.EllipseAction;
import powerpaint.action.LineAction;
import powerpaint.action.PencilAction;
import powerpaint.action.RectangleAction;

/**
 * The Graphical User Interface for this example program.
 * 
 * @author indyd_000
 * @version Winter 2014
 */
public class PowerPaintGUI {

    // no instance fields this time!

    /**
     * Construct the GUI.
     */
    public PowerPaintGUI() {
        // no fields to initialize...
        
        // just set up the GUI
        start(); // could have called this from main instead...
    }

    /**
     * Sets up the GUI.
     */
    void start() {
        final JFrame guiFrame = new JFrame("TCSS 305 PowerPaint");
        final MyMenuBar menuBar = new MyMenuBar(guiFrame);
        final MyToolBar toolBar = new MyToolBar();
        final MyPaintPannel panel = new MyPaintPannel();
        final JButton colorchooser = new JButton("Color...");
        final Action[] actions = {new PencilAction(panel), new LineAction(panel),
            new RectangleAction(panel), new EllipseAction(panel)};
        colorchooser.addActionListener(new ColorChooserAction());
        toolBar.add(colorchooser);
        toolBar.addSeparator();
        for (final Action action : actions) {
            menuBar.createMenuButton(action);
            toolBar.createToggleButton(action);
        }

        guiFrame.setJMenuBar(menuBar);

        guiFrame.add(toolBar, BorderLayout.SOUTH);
        guiFrame.add(panel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        guiFrame.pack();
        
        /** A ToolKit. */
        final Toolkit kit = Toolkit.getDefaultToolkit();
        
        guiFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - guiFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - guiFrame.getHeight() / 2));
        
        guiFrame.setVisible(true);
    }

}
