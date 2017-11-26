/**
 * 
 */
package bonusGames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import photoEditor.PixelImage;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls the action for the game button.
 */
public final class GameButtonAction implements ActionListener {
    
    /**
     * Creates a label for the image to be set on.
     */ 
    static JLabel myLabel;
    
    /**
     * Gets an image to be used in the game.
     */
    static PixelImage myImage;
    
    /**
     * Creates a long variable for use in the timer
     */
    static long myTime;
    
    /**
     * Creates the frame for the GUI.
     */
    static JFrame gameFrame;
    
    /**
     * Creates a panel to hold a button set on.
     */
    static JPanel southPanel;
    
    /**
     * Creates a button that ends the game.
     */
    static JButton end2button;
    
    /**
     * Used to get a file.
     */
    static File myFile;
    
    /**
     * Used to start the game and timer.
     */
    static JButton startButton;
    
    /**
     * Creates a button that ends the game.
     */
    static JButton endButton;
    
    /**
     * Used to create a label that holds instructional text.
     */
    static JLabel text;
    
    /**
     * Used to end the game after 30 seconds.
     */
    static Timer myTimer;
    
    /**
     * Used to give the timer a task to complete.
     */
    static MyTimer myTask;
    
	/**
	 * Used to instantiate the variables for the GUI.
	 */
	public GameButtonAction() {
		myFile = new File("./Other Works/Tom and Jerry spot the difference.jpg");
		myTask = new MyTimer();
		myLabel = new JLabel();
		endButton = new JButton("A");
		myTimer = new Timer();
	}
	
	/**
	 * Used to create the GUI's start button and frame.
	 * @param theEvent used to control the current event.
	 */
	@Override
	public void actionPerformed(ActionEvent theEvent) {
        gameFrame = new JFrame("Game");
        startButton = new JButton("Start");
        gameFrame.add(startButton, BorderLayout.CENTER);
        startButton.addActionListener(new StartAction());
        
        gameFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        gameFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - gameFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - gameFrame.getHeight() / 2));
        gameFrame.setVisible(true); 
	}
	
	/**
	 * @author Indiana Davis
	 * @version Fall 2014
	 * Controls the action for the start button.
	 */
    public class StartAction implements ActionListener {
        
        /**
         * @param theEvent gives the event for button3.
         * Creates the GUI for the game.
         */
        public void actionPerformed(final ActionEvent theEvent) {
        	text = new JLabel("Which image holds the difference?");
            southPanel = new JPanel(new FlowLayout());
            end2button = new JButton("B");
        	myTime = System.currentTimeMillis();
        	gameFrame.remove(startButton);
    		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
            myLabel.setVerticalAlignment(SwingConstants.CENTER);
            gameFrame.add(myLabel, BorderLayout.CENTER);
            try {
    			myImage = PixelImage.load(myFile);
    		} catch (IOException e) {
    			System.out.println("Could not find the file!");
    			e.printStackTrace();
    		}
            myLabel.setIcon(new ImageIcon(myImage));
            end2button.addActionListener(new End2Action());
            endButton.addActionListener(new EndAction());
            southPanel.add(endButton);
            southPanel.add(end2button);
            gameFrame.add(southPanel, BorderLayout.SOUTH);
            gameFrame.add(text, BorderLayout.NORTH);
            gameFrame.pack();
            final Toolkit kit = Toolkit.getDefaultToolkit();
            gameFrame.setLocation(
                    (int) (kit.getScreenSize().getWidth() / 2 - gameFrame.getWidth() / 2),
                    (int) (kit.getScreenSize().getHeight() / 2 - gameFrame.getHeight() / 2));
            myTimer.schedule(GameButtonAction.myTask, 30000);
        }
    }
    
    /**
     * @author Indiana Davis
     * @version Fall 2014
     * Controls the action for the end button.
     */
    public class EndAction implements ActionListener {

    	/**
    	 * @param e used to control the current event.
    	 * Used to create the successful ending game frame.
    	 */
		@Override
		public void actionPerformed(ActionEvent e) {
			gameFrame.remove(myLabel);
			gameFrame.remove(southPanel);
			gameFrame.remove(text);
			long endtime = System.currentTimeMillis();
			myTime = (endtime - myTime)/1000;
			JLabel endLabel = new JLabel("Congradulations: Your Time Was: " + myTime + " seconds.");
			gameFrame.add(endLabel);
			gameFrame.pack();
			gameFrame.setLocationRelativeTo(null);
		}
    }
    
    /**
     * @author Indiana Davis
     * @version Fall 2014
     * Controls all the actions for the end2 button.
     */
    public class End2Action implements ActionListener {

    	/**
    	 * @param e Used to control the current events.
    	 * Used to create the failure end GUI.
    	 */
		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			gameFrame.remove(myLabel);
			gameFrame.remove(southPanel);
			gameFrame.remove(text);
			long endtime = System.currentTimeMillis();
			myTime = (endtime - myTime)/1000;
			JLabel endLabel = new JLabel("Failure: Your Time Was: " + myTime + " seconds.");
			gameFrame.add(endLabel);
			gameFrame.pack();
			gameFrame.setLocationRelativeTo(null);
		}
    }
}

/**
 * @author Indiana Davis
 * @version Winter 2014
 * Controls all the implementation and setup for the timer task.
 */
class MyTimer extends TimerTask {

	/**
	 * Used to get the timer task set up and the timer working.
	 */
	@Override
	public void run() {
		Toolkit.getDefaultToolkit().beep();
		GameButtonAction.gameFrame.remove(GameButtonAction.myLabel);
		GameButtonAction.gameFrame.remove(GameButtonAction.southPanel);
		GameButtonAction.gameFrame.remove(GameButtonAction.text);
		long endtime = System.currentTimeMillis();
		GameButtonAction.myTime = (endtime - GameButtonAction.myTime)/1000;
		JLabel endLabel = new JLabel("Failure: Your Time Was: " + GameButtonAction.myTime + " seconds.");
		GameButtonAction.gameFrame.add(endLabel);
		GameButtonAction.gameFrame.pack();
		GameButtonAction.gameFrame.setLocationRelativeTo(null);
	}
	
}