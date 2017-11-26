/*
 * TCSS 305
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * The JPanel upon which the text will be painted.
 * 
 * @author Alan Fowler
 * @version Winter 2014
 */
@SuppressWarnings("serial")
public class PaintPanel extends JPanel {

    /** The default size for this JPanel. */
    private static final Dimension DEFUALT_SIZE = new Dimension(400, 300);

    /** The font size in points. */
    private static final int FONT_SIZE = 80;

    /** Encapsulates the text to display on this panel. */
    private String myText;

    /**
     * Construct this JPanel.
     */
    public PaintPanel() {
        super();
        setPreferredSize(DEFUALT_SIZE);
        setBackground(Color.WHITE);

        myText = "Welcome";
    }

    /**
     * Sets the displayed text to the provided String.
     * 
     * @param theText the new text to set
     */
    public void setText(final String theText) {
        myText = theText;
    }

    /** {@inheritDoc} */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        final Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, FONT_SIZE);
        g2d.setFont(font);

        // get the visual bounds of the text using a GlyphVector.
        final FontRenderContext renderContext = g2d.getFontRenderContext();
        final GlyphVector glyphVector = font.createGlyphVector(renderContext, myText);
        final Rectangle2D visualBounds = glyphVector.getVisualBounds().getBounds();

        final int x =
                (int) ((getWidth() - visualBounds.getWidth()) / 2 - visualBounds.getX());
        final int y =
                (int) ((getHeight() - visualBounds.getHeight()) / 2 - visualBounds.getY());

        // display the text visually centered in the JPanel
        g2d.drawString(myText, x, y);
    }

}
