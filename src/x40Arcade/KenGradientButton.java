package x40Arcade;

import javax.swing.*;
import java.awt.*;

/**
 * Used for gradient Button - x40 (Sobrepena) ver: 0.1
 */
public class KenGradientButton extends JButton {


    private boolean pressed = false;

    private Color color1 = new Color(255, 140, 0);
    private Color color2 = new Color(255, 220, 130);

    public KenGradientButton(String text) {
        super(text);

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                pressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                pressed = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Color top;
        Color bottom;

        if (pressed) {
            top = new Color(200, 110, 0);
            bottom = new Color(240, 180, 100);
        } else {
            top = color1;
            bottom = color2;
        }

        GradientPaint gp = new GradientPaint(
            0, 0, top,
            0, getHeight(), bottom
        );

        g2d.setPaint(gp);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(g);
    }
}