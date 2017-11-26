/**
 * 
 */
package guiFront;

import guiPaintActions.EllipseAction;
import guiPaintActions.LineAction;
import guiPaintActions.PencilAction;
import guiPaintActions.RectangleAction;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.Action;
import javax.swing.JFrame;

/**
  * @author Indiana Davis
  * @version Fall 2014
  * Used to set up the GUI.
  */
public class MyGUI {

	/**
     * Construct the GUI.
     */
    public MyGUI() {
        // no fields to initialize...
        
        // just set up the GUI
    }

    /**
     * Sets up the GUI.
     */
    void start() {
        final JFrame guiFrame = new JFrame("Artistry");

        final MyMenuBar menuBar = new MyMenuBar(guiFrame);
        final MyToolBar toolBar = new MyToolBar();
        
        final MyPaintPannel panel = new MyPaintPannel();

        final Action[] actions = {new PencilAction(panel), new LineAction(panel),
            new RectangleAction(panel), new EllipseAction(panel)};

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