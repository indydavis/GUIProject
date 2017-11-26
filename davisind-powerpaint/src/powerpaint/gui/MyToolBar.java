/*
 * TCSS 305
 */

package powerpaint.gui;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import powerpaint.action.ColorChooserAction;

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
     * Construct the ToolBar.
     */
    public MyToolBar() {
        super();
        myGroup = new ButtonGroup();
    }

    /**
     * Create a JToggleButton for the ToolBar.
     * 
     * @param theAction to associate with the created JToggleButton
     */
    public void createToggleButton(final Action theAction) {
        final JToggleButton toggleButton = new JToggleButton(theAction);
        myGroup.add(toggleButton);
        add(toggleButton);
    }

}