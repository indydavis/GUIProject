/**
 * 
 */
package guiPaintActions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls all the implementation and setup for the save button.
 */
public final class SaveButtonAction implements ActionListener {

	/**
	 * Constructor not used.
	 */
	public SaveButtonAction() {
		
	}
	
	/**
	 * Used to save the file when pressed.
	 * @param theEvent used to get the current event.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame saveFrame = new JFrame("Save As");
        saveFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        saveFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - saveFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - saveFrame.getHeight() / 2));
        saveFrame.setVisible(true); 
	}
}
