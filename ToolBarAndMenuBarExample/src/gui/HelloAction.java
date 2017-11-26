/*
 * TCSS 305
 */

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * The Action which occurs when Hello is selected.
 * 
 * @author Alan Fowler
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class HelloAction extends AbstractAction {

    /** The JPanel to associate with this Action. */
    private final PaintPanel myPanel;

    /**
     * Construct this Action.
     * 
     * @param thePanel a JPanel to associate with this Action.
     */
    public HelloAction(final PaintPanel thePanel) {
        super("Hello");
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_H);
        putValue(Action.SELECTED_KEY, true);
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        
        myPanel.setText((String) getValue(Action.NAME));
        myPanel.repaint();
    }

}
