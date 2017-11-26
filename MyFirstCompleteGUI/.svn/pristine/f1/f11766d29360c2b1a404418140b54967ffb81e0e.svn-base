/**
 * 
 */
package otherWorks;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls all the implementation and setup for the resume button.
 */
public final class ResumeButtonAction implements ActionListener {

	/**
     * Used to store a text file.
     */
    private JTextArea myText;
    
    /**
     * Used to get a file.
     */
	private File myFile;
	
	/**
	 * Used to display the text file.
	 */
	private JScrollPane myScrollPane;
	
	/**
	 * Used to instantiate the fields.
	 */
	public ResumeButtonAction() {
		myText = new JTextArea();
        myFile = new File("./Other Works/Resume.txt");
        myScrollPane = new JScrollPane(myText);
	}
	
	/**
	 * Used to display the GUI.
	 * @param theEvent used to get the current event.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame resumeFrame = new JFrame("CV/Resume");
        resumeFrame.add(myScrollPane);
        try {
			myText.read(new FileReader(myFile), null);
		} catch (IOException e) {
			System.out.println("The file was moved!");
		}
        resumeFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        resumeFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - resumeFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - resumeFrame.getHeight() / 2));
        resumeFrame.setVisible(true); 
	}
}
