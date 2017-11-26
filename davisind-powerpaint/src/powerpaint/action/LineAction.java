/*
 * TCSS 305
 */

package powerpaint.action;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;

import javax.swing.AbstractAction;
import javax.swing.Action;

import powerpaint.gui.MyPaintPannel;

/**
 * The Action which occurs when Hello is selected.
 * 
 * @author indyd_000
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class LineAction extends AbstractAction implements MouseMotionListener,
    MouseListener {

    /** The JPanel to associate with this Action. */
    private final MyPaintPannel myPanel;
    
    /**
     * 
     */
    private double myFirstX;
    
    /**
     * 
     */
    private double myFirstY;
    
    /**
     * 
     */
    private double mySecondX;
    
    /**
     * 
     */
    private double mySecondY;
    
    /**
     * 
     */
    private Line2D.Double myLine = new Line2D.Double();

    /**
     * Construct this Action.
     * 
     * @param thePanel a JPanel to associate with this Action.
     */
    public LineAction(final MyPaintPannel thePanel) {
        super("Line");
        myPanel = thePanel;
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_H);
        putValue(Action.SELECTED_KEY, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseDragged(final MouseEvent theEvent) {
        mySecondX = theEvent.getX();
        mySecondY = theEvent.getY();
    }

    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        
    }

    @Override
    public void mouseMoved(final MouseEvent theEvent) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseClicked(final MouseEvent theEvent) {
        myFirstX = theEvent.getX();
        myFirstY = theEvent.getY();
        mySecondX = theEvent.getX();
        mySecondY = theEvent.getY();
    }

    @Override
    public void mousePressed(final MouseEvent theEvent) {
        myFirstX = theEvent.getX();
        myFirstY = theEvent.getY();
        mySecondX = theEvent.getX();
        mySecondY = theEvent.getY();
    }

    @Override
    public void mouseReleased(final MouseEvent theEvent) {
        mySecondX = theEvent.getX();
        mySecondY = theEvent.getY();
    }

    @Override
    public void mouseEntered(final MouseEvent theEvent) {
        
    }

    @Override
    public void mouseExited(final MouseEvent theEvent) {
        
    }
    
    /**
     * @param theGraphic used to get the line.
     */
    public void paint(final Graphics theGraphic) {
        myLine.setLine(myFirstX, myFirstY, mySecondX, mySecondY);
        myPanel.repaint();
    }
}