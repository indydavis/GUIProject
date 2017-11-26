// finish (and comment) me!

package snapshop.gui;

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
import snapshop.filters.EdgeDetectFilter;
import snapshop.filters.EdgeHighlightFilter;
import snapshop.filters.FlipHorizontalFilter;
import snapshop.filters.FlipVerticalFilter;
import snapshop.filters.GrayscaleFilter;
import snapshop.filters.SharpenFilter;
import snapshop.filters.SoftenFilter;
import snapshop.image.PixelImage;

/**
 * @author indyd_000
 * @version 1
 */
@SuppressWarnings("serial")
public class SnapShopGUI extends JFrame {
    
    /**
     * 
     */
    private final EdgeDetectFilter myEdgeDetect;
    /**
     * 
     */
    private final EdgeHighlightFilter myEdgeHighlight;
    /**
     * 
     */
    private final FlipHorizontalFilter myHorizontalFlip;
    /**
     * 
     */
    private final FlipVerticalFilter myVerticalFlip;
    /**
     * 
     */
    private final GrayscaleFilter myGrayscale;
    /**
     * 
     */
    private final SharpenFilter mySharpen;
    /**
     * 
     */
    private final SoftenFilter mySoften;
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
    String location = ".";

    /**
     * 
     */
    public SnapShopGUI() {
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
     */
    void start() {
        myFrame.setTitle("TCSS 305 SnapShop");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
     * An inner class that calls doSomething() on the_object.
     */
    public class EdgeDetectEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button1.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myEdgeDetect.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));

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
            myEdgeHighlight.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            myHorizontalFlip.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            myVerticalFlip.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            myGrayscale.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            mySharpen.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            mySoften.filter(myImage);
            myLabel.setIcon(new ImageIcon(myImage));
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
            final JFileChooser fileChooser = new JFileChooser(location);
            File file = null;
            int result = 0;
            try {
                result = fileChooser.showOpenDialog(myFrame);
                if (result == fileChooser.APPROVE_OPTION) {
                    file = fileChooser.getSelectedFile();
                    System.out.println("File =" + file);
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
     * An inner class that calls doSomething() on the_object.
     */
    public class SaveEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button9.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            final JFileChooser saveFile = new JFileChooser(location);
            File file = null;
            int result = 0;
            try {
                result = saveFile.showSaveDialog(myFrame);
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
     * An inner class that calls doSomething() on the_object.
     */
    public class CloseEvent implements ActionListener {
        
        /**
         * @param theEvent gives the event for button10.
         */
        public void actionPerformed(final ActionEvent theEvent) {
            myLabel.setIcon(null);
            myFrame.pack();
            myFrame.setLocationRelativeTo(null);
        }
    }
}