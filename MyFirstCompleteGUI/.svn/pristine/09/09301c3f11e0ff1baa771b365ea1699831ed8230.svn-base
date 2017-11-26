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
 * Controls all the implementation and setup for the bio button.
 */
public final class BioButtonAction implements ActionListener {

	/**
     * Used to hold a text file.
     */
    private JTextArea myText;
    
    /**
     * Used to get a text file.
     */
	private File myFile;
	
	/**
	 * Used to show the text file.
	 */
	private JScrollPane myScrollPane;
    
	/**
	 * Used to instantiate the GUI parts.
	 */
	public BioButtonAction() {
        myText = new JTextArea();
        myFile = new File("./Other Works/Personal Statement.txt");
        myScrollPane = new JScrollPane(myText);
	}
	
	/**
	 * Used to create and display the GUI.
	 * @param theEvent used to get the current events.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame bioFrame = new JFrame("Bio");
        try {
			myText.read(new FileReader(myFile), null);
		} catch (IOException e) {
			System.out.println("The file was moved!");
		}
        bioFrame.add(myScrollPane);
        bioFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        bioFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - bioFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - bioFrame.getHeight() / 2));
        bioFrame.setVisible(true); 
	}
}
