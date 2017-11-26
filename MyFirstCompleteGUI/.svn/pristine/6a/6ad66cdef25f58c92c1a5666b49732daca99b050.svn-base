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
public final class SamplesButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public SamplesButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame samplesFrame = new JFrame("Sample Works");
        samplesFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        samplesFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - samplesFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - samplesFrame.getHeight() / 2));
        samplesFrame.setVisible(true); 
	}
}
