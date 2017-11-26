// finish (and comment) me!

package photoEditor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

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
 * @author indyd_000
 * @version 1
 */
@SuppressWarnings("serial")
public class PhotoEditorGUI extends JFrame {
    
    /**
     * 
     */
    private final JPanel myNorthPanel;
    /**
     * 
     */
    private final JPanel mySouthPanel;
    /**
     * The frame for this application's GUI.
     */
    private final JFrame myFrame;
    /**
     * 
     */
    private PixelImage myImage;
    /**
     * 
     */
    private JLabel myLabel;

    /**
     * 
     */
    public PhotoEditorGUI() {
        myFrame = new JFrame();
        myNorthPanel = new JPanel(new FlowLayout());
        mySouthPanel = new JPanel(new FlowLayout());
        myLabel = new JLabel();
        myLabel.setHorizontalAlignment(SwingConstants.CENTER);
        myLabel.setVerticalAlignment(SwingConstants.CENTER);
    }

    /**
     * Sets up the components in this frame.
     */
    void start() {
        myFrame.setTitle("TCSS 305 SnapShop");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JButton button1 = new JButton("Edge Detect");
        final JButton button2 = new JButton("Edge Highlight");
        final JButton button3 = new JButton("Flip Horizontal");
        final JButton button4 = new JButton("Flip Vertical");
        final JButton button5 = new JButton("Grayscale");
        final JButton button6 = new JButton("Sharpen");
        final JButton button7 = new JButton("Soften");
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
        
        myNorthPanel.add(button1);
        myNorthPanel.add(button2);
        myNorthPanel.add(button3);
        myNorthPanel.add(button4);
        myNorthPanel.add(button5);
        myNorthPanel.add(button6);
        myNorthPanel.add(button7);
        
        mySouthPanel.add(button8);
        mySouthPanel.add(button9);
        mySouthPanel.add(button10);
        
        myFrame.add(myNorthPanel, BorderLayout.NORTH);
        myFrame.add(myLabel, BorderLayout.CENTER);
        myFrame.add(mySouthPanel, BorderLayout.SOUTH);

        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class EdgeDetectEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button1.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final EdgeDetectFilter imageFilter = new EdgeDetectFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class EdgeHighlightEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button2.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final EdgeHighlightFilter imageFilter = new EdgeHighlightFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class FlipHorizontalEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button3.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final FlipHorizontalFilter imageFilter = new FlipHorizontalFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class FlipVerticalEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button4.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final FlipVerticalFilter imageFilter = new FlipVerticalFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class GrayscaleEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button5.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final GrayscaleFilter imageFilter = new GrayscaleFilter();
            imageFilter.filter(myImage);
            myImage.getData();
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class SharpenEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button6.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final SharpenFilter imageFilter = new SharpenFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class SoftenEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button7.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final SoftenFilter imageFilter = new SoftenFilter();
            imageFilter.filter(myImage);
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class OpenEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button8.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final JFileChooser fileChooser = new JFileChooser(".");
            File file = null;
            int result = 0;
            try {
                result = fileChooser.showOpenDialog(myFrame);
                if (result == fileChooser.APPROVE_OPTION) {
                    file = fileChooser.getSelectedFile();
                    myImage = PixelImage.load(file);
                    myLabel.setIcon(new ImageIcon(myImage));
                    myFrame.pack();
                }
            } catch (final IOException e) {
                System.err.println("Could not open the file");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class SaveEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button9.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Image");
            final File file = new File(myImage.toString());
            if (file != null) {
                try {
                    myImage.save(file);
                } catch (final IOException ex) {
                    System.err.println("Could not save the file.");
                }
            }
        }
    }
    
    /**
     * An inner class that calls doSomething() on the_object.
     */
    public class CloseEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button10.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            //myLabel.remove((ImageIcon)myImage);
        }
    }
}