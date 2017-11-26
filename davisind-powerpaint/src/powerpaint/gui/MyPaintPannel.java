/*
 * TCSS 305
 */

package powerpaint.gui;

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
 * @author indyd_000
 * @version 1
 */
@SuppressWarnings("serial")
public class MyPaintPannel extends JPanel {

    /** The default size for this JPanel. */
    private static final Dimension DEFUALT_SIZE = new Dimension(400, 300);

    /** The font size in points. */
    private static final int FONT_SIZE = 80;

    /**
     * Construct this JPanel.
     */
    public MyPaintPannel() {
        super();
        setPreferredSize(DEFUALT_SIZE);
        setBackground(Color.WHITE);
    }

    /** {@inheritDoc} */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        final Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, FONT_SIZE);
        g2d.setFont(font);
    }

}