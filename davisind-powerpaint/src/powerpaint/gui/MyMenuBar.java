/*
 * TCSS 305
 */

package powerpaint.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import powerpaint.action.ColorChooserAction;

/**
 * The JMenuBar for this GUI example.
 * 
 * @author indyd_000
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class MyMenuBar extends JMenuBar {

    /**
     * 
     */
    private final JMenu myToolsMenu;
    /**
     * 
     */
    private final ButtonGroup myGroup;
    /**
     * 
     */
    private final JMenuItem myClearButton;
    /**
     * 
     */
    private final JMenuItem myQuitButton;
    /**
     * 
     */
    private final JMenuItem myColorChooser;
    /**
     * The minor tick spacing for the slider.
     */
    private static final int MINOR_TICK_SPACING = 1;

    /**
     * The major tick spacing for the slider.
     */
    private static final int MAJOR_TICK_SPACING = 5;
    /**
     * The initial frames per second at which the simulation will run.
     */
    private static final int INITIAL_SIZE = 5;

    /**
     * The maximum frames per second at which the simulation will run.
     */
    private static final int MAX_SIZE = 20;
    /**
     * The slider for pecil size.
     */
    private JSlider mySlider;
    /**
     * 
     */
    private static int mySize = 5;


    /**
     * Construct the menu bar.
     * @param theFrame the JFram which will contain this JMenuBar
     */
    public MyMenuBar(final JFrame theFrame) {
        super();
        myToolsMenu = new JMenu("Tools");
        myGroup = new ButtonGroup();
        myClearButton = new JMenuItem("Clear");
        myQuitButton = new JMenuItem("Exit");
        myColorChooser = new JMenuItem("Color...");
        setup(theFrame);
    }

    /**
     * Sets up the components of the menu.
     * 
     * @param theFrame the JFrame containing this menu.
     */
    private void setup(final JFrame theFrame) {
        final JMenu fileMenu = new JMenu("File");
        final JMenu helpMenu = new JMenu("Help");
        final JMenuItem aboutButton = new JMenuItem("About...");
        final JMenu optionsMenu = new JMenu("Options");
        final JMenu thicknessButton = new JMenu("Thickness");
        final JCheckBoxMenuItem box = new JCheckBoxMenuItem("Grid");
        fileMenu.setMnemonic(KeyEvent.VK_O);
        myToolsMenu.setMnemonic(KeyEvent.VK_V);
        myClearButton.setMnemonic(KeyEvent.VK_Q);
        myClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                theFrame.dispatchEvent(new WindowEvent(theFrame,
                                                       WindowEvent.WINDOW_CLOSING));
            }
        });
        // setup the Quit button
        myQuitButton.setMnemonic(KeyEvent.VK_Q);
        myQuitButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                theFrame.dispatchEvent(new WindowEvent(theFrame,
                                                       WindowEvent.WINDOW_CLOSING));
            }
        });
        mySlider = new JSlider(SwingConstants.HORIZONTAL, 0, MAX_SIZE,
                               INITIAL_SIZE);
        mySlider.setMajorTickSpacing(MAJOR_TICK_SPACING);
        mySlider.setMinorTickSpacing(MINOR_TICK_SPACING);
        mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        mySlider.addChangeListener(new ChangeListener() {
            /** Called in response to slider events in this window. */
            public void stateChanged(final ChangeEvent theEvent) {
                final int value = mySlider.getValue();
                if (value > 0) {
                    mySize = value;
                }
            }
        });
        myColorChooser.addActionListener(new ColorChooserAction());
        fileMenu.add(myClearButton);
        fileMenu.addSeparator();
        fileMenu.add(myQuitButton);
        helpMenu.add(aboutButton);
        myToolsMenu.add(myColorChooser);
        myToolsMenu.addSeparator();
        thicknessButton.add(mySlider);
        optionsMenu.add(box);
        optionsMenu.add(thicknessButton);
        add(fileMenu);
        add(optionsMenu);
        add(myToolsMenu);
        add(helpMenu);
    }

    /**
     * Creates a radio button menu item, associates an action with the button,
     * adds the button to a button group, adds the button to the View menu.
     * @param theAction the Action to associate with the new button being
     *            created
     */
    public void createMenuButton(final Action theAction) {
        final JRadioButtonMenuItem createdButton = new JRadioButtonMenuItem(theAction);
        myGroup.add(createdButton);
        myToolsMenu.add(createdButton);
    }

}
