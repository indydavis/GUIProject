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
public final class BioButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public BioButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame bioFrame = new JFrame("Bio");
        bioFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        bioFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - bioFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - bioFrame.getHeight() / 2));
        bioFrame.setVisible(true); 
	}
}
