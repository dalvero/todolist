package component;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    // ATRIBUTES
    private int cornerRadius = 0; // SUDUT RADIUS
    private Color backgroundColor = Color.WHITE; // WARNA BACKGROUND
    private Color borderColor = Color.BLACK; // WARNA BORDER
    private int borderWidth = 2; // TEBAL BORDER

    // KONSTRUKTOR
    public MyPanel() {
        setOpaque(false); // AGAR KITA BISA MENGGAMBAR LAYAR
    }

    // SETTER GETTER
    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint(); // MEREFRESH TAMPILAN
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        repaint(); // MEREFRESH TAMPILAN
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint(); // MEREFRESH TAMPILAN
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        repaint(); // MEREFRESH TAMPILAN
    }

    // METHOD PAINT COMPONENT
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // WARNA BACKGROUND
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        // BORDER
        if (borderColor != null && borderWidth > 0) {
            g2.setColor(borderColor);
            g2.setStroke(new BasicStroke(borderWidth));
            g2.drawRoundRect(
                borderWidth / 2,
                borderWidth / 2,
                getWidth() - borderWidth,
                getHeight() - borderWidth,
                cornerRadius,
                cornerRadius
            );
        }
    }
}
