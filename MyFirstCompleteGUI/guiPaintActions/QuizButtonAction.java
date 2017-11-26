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
public final class QuizButtonAction implements ActionListener {

	/**
	 * @param args
	 */
	public QuizButtonAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame quizFrame = new JFrame("Quiz");
        quizFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        quizFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - quizFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - quizFrame.getHeight() / 2));
        quizFrame.setVisible(true); 
	}
}
