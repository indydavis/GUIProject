/*
 * TCSS 305
 */

package guiFront;

import guiPaintActions.ColorChooserAction;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 * The JToolBar for this GUI example.
 * 
 * @author indyd_000
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class MyToolBar extends JToolBar {

    /** A button group for the mutually exclusive tool bar buttons. */
    private final ButtonGroup myGroup;
    /**
     * 
     */
    private final JMenuItem myColorChooser;
    /**
     * 
     */
    private final JMenuItem myBackButton;
    /**
     * 
     */
    private final JMenuItem myForwardButton;

    /**
     * Construct the ToolBar.
     */
    public MyToolBar() {
        super();
        myGroup = new ButtonGroup();
        myColorChooser = new JMenuItem("Color...");
        myBackButton = new JMenuItem("Back");
        myForwardButton = new JMenuItem("Forward");
    }

    /**
     * Create a JToggleButton for the ToolBar.
     * 
     * @param theAction to associate with the created JToggleButton
     */
    public void createToggleButton(final Action theAction) {
        final JToggleButton toggleButton = new JToggleButton(theAction);
        myColorChooser.addActionListener(new ColorChooserAction());
        myGroup.add(toggleButton);
        add(myColorChooser);
        add(toggleButton);
        add(myBackButton);
        add(myForwardButton);
    }

}