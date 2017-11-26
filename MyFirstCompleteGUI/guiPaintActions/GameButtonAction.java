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
public final class GameButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public GameButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame gameFrame = new JFrame("Game");
        gameFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        gameFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - gameFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - gameFrame.getHeight() / 2));
        gameFrame.setVisible(true); 
	}
}
