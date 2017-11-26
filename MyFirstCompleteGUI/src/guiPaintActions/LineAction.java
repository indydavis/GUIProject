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
 * Controls all the implementation and setup for the line button.
 */
@SuppressWarnings("serial")
public class LineAction extends AbstractAction {

    /** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;
    
    /**
     * Controls the line action button event.
     * @param thePanel a JPanel to associate with this Action.
     */
    public LineAction(final MyPaintPannel thePanel) {
        super("Line");
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_N);
        putValue(Action.SELECTED_KEY, true);
    }

    /**
      * Used to change the current shape enum to line.
      * @param e used to get the current event.
      */
	@Override
	public void actionPerformed(ActionEvent e) {
    	MyPaintPannel.myCurrentShape = shapeType.Line; 
		myPanel.repaint();
	}
}