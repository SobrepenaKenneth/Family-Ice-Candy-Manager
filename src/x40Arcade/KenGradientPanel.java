package x40Arcade;

import javax.swing.*;
import java.awt.*;

/**
 * Used for gradient panel - x40 (Sobrepena) ver: 0.1
 */
public class KenGradientPanel extends JPanel {
	private Color color1 = new Color(255, 94, 58);
	private Color color2 = new Color(255, 195, 113);

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g;

		int width = getWidth();
		int height = getHeight();

		GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);

		g2D.setPaint(gp);
		g2D.fillRect(0, 0, width, height);

	}
}
