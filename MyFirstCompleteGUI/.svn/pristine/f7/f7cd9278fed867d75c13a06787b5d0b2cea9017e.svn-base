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
public final class ResumeButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public ResumeButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
		final MyGUI resume = new MyGUI();
        final JFrame resumeFrame = new JFrame("CV/Resume");
        resumeFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        resumeFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - resumeFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - resumeFrame.getHeight() / 2));
        resumeFrame.setVisible(true); 
	}
}
