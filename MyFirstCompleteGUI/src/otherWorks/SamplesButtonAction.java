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
 * Controls all the implementation and setup for the samples button.
 */
public final class SamplesButtonAction implements ActionListener {

	/**
     * Used to store a text file.
     */
    private JTextArea myText;
    
    /**
     * Used to get a text file.
     */
	private File myFile;
	
	/**
	 * Used to display the text file.
	 */
	private JScrollPane myScrollPane;
	
	/**
	 * Used to instantiate the fields.
	 */
	public SamplesButtonAction() {
		myText = new JTextArea();
        myFile = new File("./Other Works/Sample Work.txt");
        myScrollPane = new JScrollPane(myText);
	}
	
	/**
	 * Used to display the GUI.
	 * @param theEvent Used to get the current event.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame samplesFrame = new JFrame("Sample Works");
        samplesFrame.add(myScrollPane);
        try {
			myText.read(new FileReader(myFile), null);
		} catch (IOException e) {
			System.out.println("The file was moved!");
		}
        samplesFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        samplesFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - samplesFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - samplesFrame.getHeight() / 2));
        samplesFrame.setVisible(true); 
	}
}
