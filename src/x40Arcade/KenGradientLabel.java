package x40Arcade;

import javax.swing.*;
import java.awt.*;

/**
 * Used for gradient label - x40 (Sobrepena) ver: 0.1
 */
public class KenGradientLabel extends JLabel {

	private Color color1 = new Color(255, 94, 58);
	private Color color2 = new Color(255, 195, 113);

	public KenGradientLabel(String text) {
		super(text);
		setOpaque(false);
		setForeground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
	    Graphics2D g2d = (Graphics2D) g;

	    FontMetrics fm = g2d.getFontMetrics();
	    String text = getText();

	    int height = getHeight();
	    GradientPaint gp = new GradientPaint(
	    		0, 0, color1, 0, 100, color2
	    );
	    
	    System.out.println(height);

	    g2d.setPaint(gp);
	    g2d.setFont(getFont());
	    g2d.drawString(text, 10, fm.getAscent());
	}
}
