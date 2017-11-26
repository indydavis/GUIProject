/*
d * TCSS 305
 */

package guiFront;

import guiPaintActions.ColorChooserAction;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * The JPanel upon which the text will be painted.
 * @author Indiana Davis
 * @version Fall 2014
 */
@SuppressWarnings("serial")
public class MyPaintPannel extends JPanel {

    /** The default size for this JPanel. */
    private static final Dimension DEFUALT_SIZE = new Dimension(400, 300);

    /** The font size in points. */
    private static final int FONT_SIZE = 80;
    
    /**
     * Holds the first point for a shape.
     */
    private Point myFirstPoint;
    
    /**
     * Holds the second point for a shape.
     */
    private Point mySecondPoint;
    
    /**
     * Used to determine which tool is being used.
     */
    public static enum shapeType {Line,Pencil,Rectangle,Ellipse};
    
    /**
     * Used to hold the type of tool being used.
     */
    public static shapeType myCurrentShape;
    
    /**
     * Used to hold points for the line button.
     */
    public ArrayList<Point> lineList = new ArrayList<Point>();
    
    /**
     * Used to hold points for the ellipse button.
     */
    public ArrayList<Point> ellipseList = new ArrayList<Point>();
    
    /**
     * Used to hold points for the pencil button.
     */
    public ArrayList<GeneralPath> pencilList = new ArrayList<GeneralPath>();
    
    /**
     * Used to hold points for the rectangle button.
     */
    public ArrayList<Point> rectangleList = new ArrayList<Point>();
    
    /**
     * Used to hold the current stroke value.
     */
    private Stroke currentStroke;
    
    /**
     * Used to hold the current color for the shapes.
     */
    private Color currentColor = Color.BLACK;
    
    /**
     * Used to determine a path for the line tool.
     */
    private GeneralPath myPath = new GeneralPath();
    
    /**
     * Constructs the JPanel.
     */
    public MyPaintPannel() {
        super();
        setPreferredSize(DEFUALT_SIZE);
        setBackground(Color.WHITE);
        addMouseListener(new MouseActions());
        addMouseMotionListener(new MouseMontions());
    }

    /**
     *  {@inheritDoc}
     *  @param theGraphics used to the graphics being printed on the panel.
     *  Prints the graphics to the paint panel.
     */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        final Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, FONT_SIZE);
        g2d.setFont(font);
        currentStroke = MyMenuBar.getLineStroke();
        currentColor = ColorChooserAction.getResult();
        /** Used to determine which shape is being used and to store the points. */
        if(myCurrentShape == shapeType.Line && myFirstPoint != null && mySecondPoint != null) {
        	lineList.add(myFirstPoint);
        	lineList.add(mySecondPoint);
        } else if(myCurrentShape == shapeType.Rectangle && myFirstPoint != null && mySecondPoint != null) {
        	rectangleList.add(myFirstPoint);
        	rectangleList.add(mySecondPoint);
        } else if(myCurrentShape == shapeType.Pencil && myFirstPoint != null && mySecondPoint != null) {
        	myPath.contains(myFirstPoint);
        	myPath.contains(mySecondPoint);
        	myPath.moveTo(mySecondPoint.getX(), mySecondPoint.getY());
        	myPath.lineTo(mySecondPoint.getX(), mySecondPoint.getY());
        	pencilList.add(myPath);
        } else if(myCurrentShape == shapeType.Ellipse && myFirstPoint != null && mySecondPoint != null) {
        	ellipseList.add(myFirstPoint);
        	ellipseList.add(mySecondPoint);
        }
        
        /** Used to print the lines using points stored in the array lists. */
        for(int i = 0; i < lineList.size(); i += 2) {
        	g2d.setStroke(currentStroke);
            g2d.setPaint(currentColor);
            g2d.drawLine((int)lineList.get(i).getX(), (int)lineList.get(i).getY(), (int)lineList.get(i+1).getX(), (int)lineList.get(i+1).getY());
        }
        
        /** Used to print the rectangles using the points stored in the array list. */
        for(int i = 0; i < rectangleList.size(); i += 2) {
        	g2d.setStroke(currentStroke);
            g2d.setPaint(currentColor);
            if((int)rectangleList.get(i+1).getX() > (int)rectangleList.get(i).getX() && (int)rectangleList.get(i+1).getY() > (int)rectangleList.get(i).getY()) {
                g2d.drawRect((int)rectangleList.get(i).getX(), (int)rectangleList.get(i).getY(), ((int)rectangleList.get(i+1).getX() - (int)rectangleList.get(i).getX()), ((int)rectangleList.get(i+1).getY() - (int)rectangleList.get(i).getY()));
                //Works for Rectangle going up and to the right.
            } else if((int)rectangleList.get(i+1).getX() > (int)rectangleList.get(i).getX() && (int)rectangleList.get(i).getY() > (int)rectangleList.get(i+1).getY()) {
                g2d.drawRect((int)rectangleList.get(i).getX(), (int)rectangleList.get(i+1).getY(), ((int)rectangleList.get(i+1).getX() - (int)rectangleList.get(i).getX()), ((int)rectangleList.get(i).getY() - (int)rectangleList.get(i+1).getY()));
                //Works for Rectangle going down and to the left.
            } else if((int)rectangleList.get(i).getX() > (int)rectangleList.get(i+1).getX() && (int)rectangleList.get(i+1).getY() > (int)rectangleList.get(i).getY()) {
            	g2d.drawRect((int)rectangleList.get(i+1).getX(), (int)rectangleList.get(i).getY(), ((int)rectangleList.get(i).getX() - (int)rectangleList.get(i+1).getX()), ((int)rectangleList.get(i+1).getY() - (int)rectangleList.get(i).getY()));
            	//Works for Rectangle going up and to the left.
            } else {
            	g2d.drawRect((int)rectangleList.get(i+1).getX(), (int)rectangleList.get(i+1).getY(), ((int)rectangleList.get(i).getX() - (int)rectangleList.get(i+1).getX()), ((int)rectangleList.get(i).getY() - (int)rectangleList.get(i+1).getY()));
            }
        }
        
        /** Used to print the ellipses using the points stored in the array list. */
        for(int i = 0; i < ellipseList.size(); i += 2) {
        	g2d.setStroke(currentStroke);
            g2d.setPaint(currentColor);
            if((int)ellipseList.get(i+1).getX() > (int)ellipseList.get(i).getX() && (int)ellipseList.get(i+1).getY() > (int)ellipseList.get(i).getY()) {
                g2d.drawOval((int)ellipseList.get(i).getX(), (int)ellipseList.get(i).getY(), ((int)ellipseList.get(i+1).getX() - (int)ellipseList.get(i).getX()), ((int)ellipseList.get(i+1).getY() - (int)ellipseList.get(i).getY()));
                //Works for Ellipse going up and to the right.
            } else if((int)ellipseList.get(i+1).getX() > (int)ellipseList.get(i).getX() && (int)ellipseList.get(i).getY() > (int)ellipseList.get(i+1).getY()) {
                g2d.drawOval((int)ellipseList.get(i).getX(), (int)ellipseList.get(i+1).getY(), ((int)ellipseList.get(i+1).getX() - (int)ellipseList.get(i).getX()), ((int)ellipseList.get(i).getY() - (int)ellipseList.get(i+1).getY()));
                //Works for Ellipse going down and to the left.
            } else if((int)ellipseList.get(i).getX() > (int)ellipseList.get(i+1).getX() && (int)ellipseList.get(i+1).getY() > (int)ellipseList.get(i).getY()) {
            	g2d.drawOval((int)ellipseList.get(i+1).getX(), (int)ellipseList.get(i).getY(), ((int)ellipseList.get(i).getX() - (int)ellipseList.get(i+1).getX()), ((int)ellipseList.get(i+1).getY() - (int)ellipseList.get(i).getY()));
            	//Works for Ellipse going up and to the left.
            } else {
            	g2d.drawOval((int)ellipseList.get(i+1).getX(), (int)ellipseList.get(i+1).getY(), ((int)ellipseList.get(i).getX() - (int)ellipseList.get(i+1).getX()), ((int)ellipseList.get(i).getY() - (int)ellipseList.get(i+1).getY()));
            }
            
            /** Used to print the pencil strokes using the points stored in the array list. */
            for(i = 0; i < pencilList.size(); i += 2) {
            	g2d.setStroke(currentStroke);
                g2d.setPaint(currentColor);
                g2d.drawLine((int)lineList.get(i).getX(), (int)lineList.get(i).getY(), (int)lineList.get(i+1).getX(), (int)lineList.get(i+1).getY());
            }
        }
    }
    
    /**
     * Used to get and control the mouse's actions on the paint panel.
     * @author Indiana Davis
     */
    public class MouseActions extends MouseAdapter {
    	
    	/**
    	 * Used to get a point when the mouse is pressed.
    	 * @param theEvent used to get the current event.
    	 */
    	public void mousePressed(final MouseEvent theEvent) {
    		myFirstPoint = theEvent.getPoint();
    	}
    	
    	/**
    	 * Used to get a point when the mouse is released.
    	 * @param theEvent used to get the current event.
    	 */
    	public void mouseReleased(final MouseEvent theEvent) {
    		mySecondPoint = theEvent.getPoint();
    		repaint();
    	}
    }
    
    /**
     * Used to control the mouse actions.
     * @author Indiana Davis
     */
    public class MouseMontions extends MouseMotionAdapter {
    	
    	/**
    	 * Used to get a point when the mouse is dragged.
    	 * @param theEvent used to get the current event.
    	 */
    	public void mouseDragged(final MouseEvent theEvent) {
    		//mySecondPoint = theEvent.getPoint();
    	}
    }
}