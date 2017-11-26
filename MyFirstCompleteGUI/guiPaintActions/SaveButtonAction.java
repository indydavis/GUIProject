/**
 * 
 */
package guiPaintActions;

import guiFront.MyGUI;
import guiFront.MyPaintPannel;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author indyd_000
 *
 */
public final class SaveButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public SaveButtonAction() {
		
	}
	
	/**
	 * 
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
