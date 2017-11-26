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
 * Controls all the implementation and setup for the rectangle button.
 */
@SuppressWarnings("serial")
public class RectangleAction extends AbstractAction {

	/** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;
    
    /**
     * Controls the rectangle action.
     * @param thePanel a JPanel to associate with this Action.
     */
    public RectangleAction(MyPaintPannel panel) {
        super("Rectangle");
        myPanel = panel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
        putValue(Action.SELECTED_KEY, true);
    }

    /** 
     * {@inheritDoc}
     * Used to change the enum to rectangle.
     * @param theEvent used to get the current event.
     */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
    	MyPaintPannel.myCurrentShape = shapeType.Rectangle; 
        myPanel.repaint();
    }
}