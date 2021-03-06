/**
 * 
 */
package artQuizes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Indiana Davis
 * @version Fall 2014
 * Controls the action for the quiz button.
 */
public final class QuizButtonAction implements ActionListener {

    /**
     * Used to hold a text area field.
     */
    private JTextArea myText;
    
    /**
     * Used to get a file.
     */
    private File myFile;
	
    /**
     * Used to be able to scroll through a work or image.
     */
    private JScrollPane myScrollPane;
	
    /**
     * Used as a grouping panel for a series of buttons.
     */
    private JPanel southPanel;
	
    /**
     * Used to hold the failure text for the end of the quiz.
     */
    private JLabel endLabel;
	
    /**
     * Used to hold the success text for the end of the quiz.
     */
    private JLabel endLabel2;
	
    /**
     * Used to show all of the panels, labels, buttons, and other parts to the GUI.
     */
    private JFrame quizFrame;
	
    /**
     * Used to hold the question text for the quiz.
     */
    private JLabel myLabel;
    
    /**
     * 
     */
    private boolean correct = false;
	
    /**
     * Used to instantiate the parts for the GUI.
     */
    public QuizButtonAction() {
    	myText = new JTextArea();
	myLabel = new JLabel("Who requested the artwork for the Mona Lisa?");
        myFile = new File("./Other Works/Leonardo Da Vinci Quiz.txt");
        myScrollPane = new JScrollPane(myText);
        endLabel = new JLabel("Wrong Answer!");
        endLabel2 = new JLabel("Correct!");
	}
	
    /**
     * @param theEvent used to control the current event.
     * Sets up the pieces of the GUI and makes them visible.
     */
    @Override
    public void actionPerformed(ActionEvent theEvent) {
        quizFrame = new JFrame("Quiz");
        southPanel = new JPanel(new FlowLayout());
        JButton firstAnswer = new JButton("Mona Lisa");
        firstAnswer.addActionListener(new WrongAnswerAction());
        JButton secondAnswer = new JButton("Lisa Gherardini");
        secondAnswer.addActionListener(new WrongAnswerAction());
        JButton thirdAnswer = new JButton("Francesco Del Giocondo");
        thirdAnswer.addActionListener(new CorrectAnswerAction());
        JButton fourthAnswer = new JButton("Leonardo Da Vinci");
        fourthAnswer.addActionListener(new WrongAnswerAction());
        southPanel.add(fourthAnswer);
        southPanel.add(thirdAnswer);
        southPanel.add(secondAnswer);
        southPanel.add(firstAnswer);
        try {
            myText.read(new FileReader(myFile), null);
        } catch (IOException e) {
            System.out.println("The file was moved!");
	}
        quizFrame.add(myLabel, BorderLayout.NORTH);
        quizFrame.add(myScrollPane, BorderLayout.CENTER);
        quizFrame.add(southPanel, BorderLayout.SOUTH);
        quizFrame.pack();
        final Toolkit kit = Toolkit.getDefaultToolkit();
        quizFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - quizFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - quizFrame.getHeight() / 2));
        quizFrame.setVisible(true); 
	}
	
    /**
     * @author Indiana Davis
     * Controls the action for the first answer button.
     */
    public class WrongAnswerAction implements ActionListener {

    	/**
    	 * @param e used to control the current event.
    	 * Sets up the failure GUI.
    	 */
	@Override
	public void actionPerformed(ActionEvent e) {
            quizFrame.remove(myScrollPane);
            quizFrame.remove(myLabel);
            quizFrame.remove(southPanel);
            quizFrame.add(endLabel);
            quizFrame.pack();
            quizFrame.setLocationRelativeTo(null);
            correct = false;
            String url = "jdbc:derby://localhost:1527/IndianaDavisDB";
	    String username = "indydavis";
	    String password = "Jones1995";
	    try (Connection con = DriverManager.getConnection(url, username, password)) {
	     	String query = "INSERT INTO correct VALUES (" + correct + ")";
                Statement stmt = con.createStatement();
                if(stmt.executeUpdate(query) != 1) {
                    System.out.println ("Failed to add the record!");
                }
	    } catch (SQLException e1) {
	        System.out.println("Exception creating connection: " + e1);
	        System.exit(0);
	    }
	}
    }
    
    /**
     * @author Indiana Davis
     * Controls the action for the third answer button.
     */
    public class CorrectAnswerAction implements ActionListener {

    	/**
    	 * @param e used to control the current event.
    	 * Sets up the success GUI.
    	 */
	@Override
	public void actionPerformed(ActionEvent e) {
            quizFrame.remove(myScrollPane);
            quizFrame.remove(myLabel);
            quizFrame.remove(southPanel);
            quizFrame.add(endLabel2);
            quizFrame.pack();
            quizFrame.setLocationRelativeTo(null);
            correct = true;
            String url = "jdbc:derby://localhost:1527/IndianaDavisDB";
	    String username = "indydavis";
	    String password = "Jones1995";
	    try (Connection con = DriverManager.getConnection(url, username, password)) {
                String query = "INSERT INTO myfirstdatabase VALUES (" + correct + ")";
                Statement stmt = con.createStatement();
                if(stmt.executeUpdate(query) != 1) {
                    System.out.println ("Failed to add the record!");
                }
	    } catch (SQLException e1) {
	        System.out.println("Exception creating connection: " + e1);
	        System.exit(0);
	    }
	}
    }
}
