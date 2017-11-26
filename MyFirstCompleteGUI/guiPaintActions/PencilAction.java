/*
 * TCSS 305
 */

package guiPaintActions;

import guiFront.MyPaintPannel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * The Action which occurs when Goodbye is selected.
 * @author indyd_000
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class PencilAction extends AbstractAction {

    /** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;

    /**
     * Construct this Action.
     * 
     * @param thePanel a JPanel to associate with this Action.
     */
    public PencilAction(final MyPaintPannel thePanel) {
        super("Pencil");
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_G);
        putValue(Action.SELECTED_KEY, true);
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        //myPanel.setText((String) getValue(Action.NAME));
        myPanel.repaint();
    }
}