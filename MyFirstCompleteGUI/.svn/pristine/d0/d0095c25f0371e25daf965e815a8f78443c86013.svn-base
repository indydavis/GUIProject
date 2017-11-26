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
public final class PictureButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public PictureButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame pictureFrame = new JFrame("Picture");
        pictureFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        pictureFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - pictureFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - pictureFrame.getHeight() / 2));
        pictureFrame.setVisible(true); 
	}
}
