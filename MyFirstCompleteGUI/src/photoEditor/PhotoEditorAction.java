// finish (and comment) me!

package photoEditor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;









//import examples.NamedObject;
import photoEditor.EdgeDetectFilter;
import photoEditor.EdgeHighlightFilter;
import photoEditor.FlipHorizontalFilter;
import photoEditor.FlipVerticalFilter;
import photoEditor.GrayscaleFilter;
import photoEditor.SharpenFilter;
import photoEditor.SoftenFilter;
import photoEditor.PixelImage;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls all the implementation and setup for the photo editor button.
 */
@SuppressWarnings("serial")
public class PhotoEditorAction extends JFrame implements ActionListener {
    
    /**
     * Used to filter the edge of the image.
     */
    private final EdgeDetectFilter myEdgeDetect;
    
    /**
     * Used to highlight the edge of the image.
     */
    private final EdgeHighlightFilter myEdgeHighlight;
    
    /**
     * Used to flip the image horizontally.
     */
    private final FlipHorizontalFilter myHorizontalFlip;
    
    /**
     * Used to flip the image vertically.
     */
    private final FlipVerticalFilter myVerticalFlip;
    
    /**
     * Used to make the image gray.
     */
    private final GrayscaleFilter myGrayscale;
    
    /**
     * Used to sharpen the image.
     */
    private final SharpenFilter mySharpen;
    
    /**
     * Used to soften the image.
     */
    private final SoftenFilter mySoften;
    
    /**
     * The frame for this application's GUI.
     */
    private final JFrame myFrame;
    
    /**
     * Used to store the image.
     */
    private PixelImage myImage;
    
    /**
     * Used to display the image.
     */
    private JLabel myLabel;
    
    /**
     * Used to get the relative location of the sample pictures. 
     */
    String location = ".";

    /**
     * Used to instantiate the fields.
     */
    public PhotoEditorAction() {
        myFrame = new JFrame();
        myLabel = new JLabel();
        myEdgeDetect = new EdgeDetectFilter();
        myEdgeHighlight = new EdgeHighlightFilter();
        myHorizontalFlip = new FlipHorizontalFilter();
        myVerticalFlip = new FlipVerticalFilter();
        myGrayscale = new GrayscaleFilter();
        mySharpen = new SharpenFilter();
        mySoften = new SoftenFilter();
    }

    /**
     * Sets up the components in this frame.
     * @param e used to get the current events.
     */
    @Override
	public void actionPerformed(ActionEvent e) {
        myFrame.setTitle("Photo Editor");
        
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
        
        final JPanel northPanel = new JPanel(new FlowLayout());
        final JPanel southPanel = new JPanel(new FlowLayout());

        final JButton button1 = new JButton(myEdgeDetect.getDescription());
        final JButton button2 = new JButton(myEdgeHighlight.getDescription());
        final JButton button3 = new JButton(myHorizontalFlip.getDescription());
        final JButton button4 = new JButton(myVerticalFlip.getDescription());
        final JButton button5 = new JButton(myGrayscale.getDescription());
        final JButton button6 = new JButton(mySharpen.getDescription());
        final JButton button7 = new JButton(mySoften.getDescription());
        final JButton button8 = new JButton("Open...");
        final JButton button9 = new JButton("Save As...");
        final JButton button10 = new JButton("Close Image");
        
        button1.addActionListener(new EdgeDetectEvent());
        button2.addActionListener(new EdgeHighlightEvent());
        button3.addActionListener(new FlipHorizontalEvent());
        button4.addActionListener(new FlipVerticalEvent());
        button5.addActionListener(new GrayscaleEvent());
        button6.addActionListener(new SharpenEvent());
        button7.addActionListener(new SoftenEvent());
        button8.addActionListener(new OpenEvent());
        button9.addActionListener(new SaveEvent());
        button10.addActionListener(new CloseEvent());
        
        northPanel.add(button1);
        northPanel.add(button2);
        northPanel.add(button3);
        northPanel.add(button4);
        northPanel.add(button5);
        northPanel.add(button6);
        northPanel.add(button7);
        
        southPanel.add(button8);
        southPanel.add(button9);
        southPanel.add(button10);
        
        myFrame.add(northPanel, BorderLayout.NORTH);
        myFrame.add(myLabel, BorderLayout.CENTER);
        myFrame.add(southPanel, BorderLayout.SOUTH);

        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
    }
    
    /**
     * An inner class that filters the image.
     */
    public class EdgeDetectEvent implements ActionListener {
        
        /**
         * Filters the image.
         * @param theEvent gives the event for button1.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myEdgeDetect.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));

        }
    }
    
    /**
     * An inner class that filters the image.
     */
    public class EdgeHighlightEvent implements ActionListener {
        
        /**
         * Filters the image
         * @param theEvent gives the event for button2.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myEdgeHighlight.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that flips the image.
     */
    public class FlipHorizontalEvent implements ActionListener {
        
        /**
         * Flips the image.
         * @param theEvent gives the event for button3.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myHorizontalFlip.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that flips the image.
     */
    public class FlipVerticalEvent implements ActionListener {
        
        /**
         * Flips the image.
         * @param theEvent gives the event for button4.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myVerticalFlip.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that grays the image.
     */
    public class GrayscaleEvent implements ActionListener {
        
        /**
         * Grays the image.
         * @param theEvent gives the event for button5.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myGrayscale.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that sharpens the image.
     */
    public class SharpenEvent implements ActionListener {
        
        /**
         * Sharpens the image.
         * @param theEvent gives the event for button6.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            mySharpen.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that softens the image.
     */
    public class SoftenEvent implements ActionListener {
        
        /**
         * Softens the image.
         * @param theEvent gives the event for button7.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            mySoften.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
        }
    }
    
    /**
     * An inner class that collects the file.
     */
    public class OpenEvent implements ActionListener {
        
        /**
         * Gathers the file.
         * @param theEvent gives the event for button8.
         */
        @SuppressWarnings("static-access")
		public void actionPerformed(final ActionEvent theEvent) {
            final JFileChooser fileChooser = new JFileChooser(location);
            File file = null;
            int result = 0;
            try {
                result = fileChooser.showOpenDialog(myFrame);
                if (result == fileChooser.APPROVE_OPTION) {
                    file = fileChooser.getSelectedFile();
                    myImage = PixelImage.load(file);
                    myLabel.setIcon(new ImageIcon(myImage));
                    myFrame.pack();
                    myFrame.setLocationRelativeTo(null);
                }
            } catch (final IOException e) {
                System.err.println("Could not open the file");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * An inner class that saves the image.
     */
    public class SaveEvent implements ActionListener {
        
        /**
         * Saves the image.
         * @param theEvent gives the event for button9.
         */
        @SuppressWarnings("static-access")
		public void actionPerformed(final ActionEvent theEvent) {
            final JFileChooser saveFile = new JFileChooser(location);
            File file = null;
            int result = 0;
            try {
                result = saveFile.showSaveDialog(myFrame);
                BufferedImage bi = myImage;
                File outputfile = new File("saved.png");
                ImageIO.write(bi, "png", outputfile);
                if (result == saveFile.APPROVE_OPTION) {
                    file = new File(saveFile.getName());
                    myImage.save(file);
                }
            } catch (final IOException e) {
                System.err.println("Could not save the file");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * An inner class that closes the image.
     */
    public class CloseEvent implements ActionListener {
        
        /**
         * Closes the image.
         * @param theEvent gives the event for button10.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myLabel.setIcon(null);
            myFrame.pack();
            myFrame.setLocationRelativeTo(null);
        }
    }
}