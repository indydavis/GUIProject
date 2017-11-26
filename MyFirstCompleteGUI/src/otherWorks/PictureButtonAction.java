/**
 * 
 */
package otherWorks;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import photoEditor.PixelImage;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls all the implementation and setup for the picture button.
 */
public final class PictureButtonAction implements ActionListener {

	/**
     * Used to get an image file.
     */
	private File myFile;
	
	/**
     * Used to store an image file.
     */
    private PixelImage myImage;
	
	/**
     * Used to display an image file.
     */
    private JLabel myLabel;
    
	/**
	 * Used to instantiate the fields.
	 */
	public PictureButtonAction() {
		myFile = new File("./Other Works/Indiana.jpg");
		myLabel = new JLabel();
	}
	
	/**
	 * Used to display the GUI.
	 * @param theEvent used to get the current event.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        final JFrame pictureFrame = new JFrame("Picture");
        
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
        
        pictureFrame.add(myLabel, BorderLayout.CENTER);
        
        try {
			myImage = PixelImage.load(myFile);
		} catch (IOException e) {
			System.out.println("Could not find the file!");
			e.printStackTrace();
		}
        myLabel.setIcon(new ImageIcon(myImage));
        
        pictureFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        pictureFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - pictureFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - pictureFrame.getHeight() / 2));
        pictureFrame.setVisible(true); 
	}
}
