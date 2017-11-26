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
public final class PhotoEditorAction implements ActionListener {

	/**
	 * @param args
	 */
	public PhotoEditorAction() {
		
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame editorFrame = new JFrame("Photo Editor");
        editorFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        editorFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - editorFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - editorFrame.getHeight() / 2));
        editorFrame.setVisible(true); 
	}
}
