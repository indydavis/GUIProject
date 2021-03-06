/*
 * TCSS 305
 */

package powerpaint.action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import powerpaint.gui.MyPaintPannel;

/**
 * The Action which occurs when Hello is selected.
 * 
 * @author indyd_000
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class RectangleAction extends AbstractAction {

    /** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;

    /**
     * Construct this Action.
     * @param thePanel a JPanel to associate with this Action.
     */
    public RectangleAction(final MyPaintPannel thePanel) {
        super("Rectangle");
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_H);
        putValue(Action.SELECTED_KEY, true);
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.repaint();
    }

}