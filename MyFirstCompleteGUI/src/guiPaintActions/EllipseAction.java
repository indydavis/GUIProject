/*
 * TCSS 305
 */

package guiPaintActions;

import guiFront.MyPaintPannel;
import guiFront.MyPaintPannel.shapeType;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls all the implementation and setup for the ellipse button.
 */
@SuppressWarnings("serial")
public class EllipseAction extends AbstractAction {

	/** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;
    
    /**
     * Used to control the ellipse action.
     * @param thePanel a JPanel to associate with this Action.
     */
    public EllipseAction(MyPaintPannel panel) {
        super("Ellipse");
        myPanel = panel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
        putValue(Action.SELECTED_KEY, true);
    }

    /**
     * {@inheritDoc}
     * Changes shape type to ellipse on the enum.
     * @param theEvent Used to control the event.
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
    	MyPaintPannel.myCurrentShape = shapeType.Ellipse; 
        myPanel.repaint();
    }
}