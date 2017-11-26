/*
 * TCSS 305
 */

package guiFront;

import guiPaintActions.EllipseAction;
import guiPaintActions.LineAction;
import guiPaintActions.PencilAction;
import guiPaintActions.RectangleAction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.Rectangle2D;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The JPanel upon which the text will be painted.
 * @author indyd_000
 * @version 1
 */
@SuppressWarnings("serial")
public class MyPaintPannel extends JPanel implements ActionListener {

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

	@Override
	public void actionPerformed(final ActionEvent theEvent) {
		final JFrame guiFrame = new JFrame("TCSS 305 PowerPaint");

        final MyMenuBar menuBar = new MyMenuBar(guiFrame);
        final MyToolBar toolBar = new MyToolBar();
        final MyPaintPannel panel = new MyPaintPannel();

        final Action[] actions = {new PencilAction(panel), new LineAction(panel),
            new RectangleAction(panel), new EllipseAction(panel)};

        for (final Action action : actions) {
            menuBar.createMenuButton(action);
            toolBar.createToggleButton(action);
        }

        guiFrame.setJMenuBar(menuBar);

        guiFrame.add(toolBar, BorderLayout.SOUTH);
        guiFrame.add(panel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        guiFrame.pack();
        
        /** A ToolKit. */
        final Toolkit kit = Toolkit.getDefaultToolkit();
        
        guiFrame.setLocation(
            (int) (kit.getScreenSize().getWidth() / 2 - guiFrame.getWidth() / 2),
            (int) (kit.getScreenSize().getHeight() / 2 - guiFrame.getHeight() / 2));
    }

}