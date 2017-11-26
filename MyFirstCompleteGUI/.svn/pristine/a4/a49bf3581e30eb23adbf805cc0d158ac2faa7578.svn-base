/*
 * TCSS 305
 */

package guiFront;

import guiPaintActions.ColorChooserAction;
import photoEditor.PhotoEditorAction;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
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

import otherWorks.BioButtonAction;
import otherWorks.PictureButtonAction;
import otherWorks.ResumeButtonAction;
import otherWorks.SamplesButtonAction;
import bonusGames.GameButtonAction;
import artQuizes.QuizButtonAction;

/**
 * The Menu Bar for this GUI.
 * @author Indiana Davis
 * @version Fall 2014
 */
@SuppressWarnings("serial")
public class MyMenuBar extends JMenuBar {

    /**
     * Used to create a tools menu for the GUI.
     */
    private final JMenu myToolsMenu;
    
    /**
     * Used to group buttons together so they work in unison.
     */
    private final ButtonGroup myGroup;
    
    /**
     * Used to clear the paint panel.
     */
    private final JMenuItem myClearButton;
    
    /**
     * Used to exit the GUI.
     */
    private final JMenuItem myExitButton;
    
    /**
     * Used to choose a color.
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
     * The initial stroke size for the shapes.
     */
    private static final int INITIAL_SIZE = 5;

    /**
     * The maximum stroke size for the shapes.
     */
    private static final int MAX_SIZE = 20;
    
    /**
     * The slider for shape size.
     */
    private JSlider mySlider;
    
    /**
     * Used to get the current tool size.
     */
    private static int myToolSize;
    
    /**
     * Used to hold the current line stroke size.
     */
    private static Stroke myLineStroke;


    /**
     * Construct the menu bar.
     * @param theFrame the JFram which will contain this JMenuBar
     */
    public MyMenuBar(final JFrame theFrame) {
        super();
        myToolsMenu = new JMenu("Tools");
        myGroup = new ButtonGroup();
        myClearButton = new JMenuItem("Clear");
        myExitButton = new JMenuItem("Exit");
        myColorChooser = new JMenuItem("Color...");
        setup(theFrame);
    }

    /**
     * Sets up the components of the menu.
     * @param theFrame the JFrame containing this menu.
     */
    private void setup(final JFrame theFrame) {
        final JMenu fileMenu = new JMenu("File");
        final JMenu aboutMenu = new JMenu("About");
        final JMenuItem bioButton = new JMenuItem("Bio");
        final JMenuItem resumeButton = new JMenuItem("CV/Resume");
        final JMenuItem pictureButton = new JMenuItem("Picture");
        final JMenuItem samplesButton = new JMenuItem("Sample Works");
        final JMenu moreMenu = new JMenu("More");
        final JMenuItem quizButton = new JMenuItem("Quiz");
        final JMenuItem gameButton = new JMenuItem("Game");
        final JMenuItem editorButton = new JMenuItem("Picture Editor");
        final JMenu optionsMenu = new JMenu("Options");
        final JMenu thicknessButton = new JMenu("Thickness");
        final JCheckBoxMenuItem box = new JCheckBoxMenuItem("Grid");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        myToolsMenu.setMnemonic(KeyEvent.VK_T);
        myClearButton.setMnemonic(KeyEvent.VK_C);
        aboutMenu.setMnemonic(KeyEvent.VK_A);
        bioButton.setMnemonic(KeyEvent.VK_B);
        resumeButton.setMnemonic(KeyEvent.VK_V);
        pictureButton.setMnemonic(KeyEvent.VK_U);
        samplesButton.setMnemonic(KeyEvent.VK_M);
        moreMenu.setMnemonic(KeyEvent.VK_M);
        quizButton.setMnemonic(KeyEvent.VK_Q);
        gameButton.setMnemonic(KeyEvent.VK_G);
        editorButton.setMnemonic(KeyEvent.VK_E);
        box.setMnemonic(KeyEvent.VK_D);
        optionsMenu.setMnemonic(KeyEvent.VK_O);
        thicknessButton.setMnemonic(KeyEvent.VK_H);
        myExitButton.setMnemonic(KeyEvent.VK_X);
        myToolsMenu.setMnemonic(KeyEvent.VK_T);
        myColorChooser.setMnemonic(KeyEvent.VK_L);
        myClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                theFrame.dispatchEvent(new WindowEvent(theFrame,
                                                       WindowEvent.WINDOW_CLOSING));
            }
        });
        // setup the Quit button
        myExitButton.addActionListener(new ActionListener() {
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
                    myToolSize = value;
                }
            }
        });
        myLineStroke = new BasicStroke(myToolSize);
        myColorChooser.addActionListener(new ColorChooserAction());
        bioButton.addActionListener(new BioButtonAction());
        resumeButton.addActionListener(new ResumeButtonAction());
        pictureButton.addActionListener(new PictureButtonAction());
        samplesButton.addActionListener(new SamplesButtonAction());
        editorButton.addActionListener(new PhotoEditorAction());
        quizButton.addActionListener(new QuizButtonAction());
        gameButton.addActionListener(new GameButtonAction());
        fileMenu.add(myClearButton);
        fileMenu.addSeparator();
        fileMenu.add(myExitButton);
        moreMenu.add(editorButton);
        moreMenu.add(quizButton);
        moreMenu.add(gameButton);
        aboutMenu.add(bioButton);
        aboutMenu.add(resumeButton);
        aboutMenu.add(pictureButton);
        aboutMenu.add(samplesButton);
        myToolsMenu.add(myColorChooser);
        myToolsMenu.addSeparator();
        thicknessButton.add(mySlider);
        optionsMenu.add(box);
        optionsMenu.add(thicknessButton);
        add(fileMenu);
        add(optionsMenu);
        add(myToolsMenu);
        add(moreMenu);
        add(aboutMenu);
    }

    /**
     * Creates a radio button menu item, associates an action with the button,
     * adds the button to a button group, adds the button to the View menu.
     * @param theAction the Action to associate with the new button being created.
     */
    public void createMenuButton(final Action theAction) {
        final JRadioButtonMenuItem createdButton = new JRadioButtonMenuItem(theAction);
        myGroup.add(createdButton);
        myToolsMenu.add(createdButton);
    }
    
    /**
     * Used to get the line stroke in the paint pannel class.
     * @return mySize used to get the object size.
     */
    public static Stroke getLineStroke() {
    	return myLineStroke;
    }
}
