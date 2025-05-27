package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JTextField;

public class MyTextField extends JTextField{
    
    private Color colorDefault;
    private Color colorFocus;
    private Color borderColor;
    private boolean isFocused;
    private int paddingLeft = 10;
    
    
    public void setColorDefault(Color colorDefault) {
        this.colorDefault = colorDefault;
        setBackground(colorDefault);
    }

    public void setColorFocus(Color colorFocus) {
        this.colorFocus = colorFocus;
    }


    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getColorDefault() {
        return colorDefault;
    }

    public Color getColorFocus() {
        return colorFocus;
    }

    public Color getBorderColor() {
        return borderColor;
    }
    
    public MyTextField() {
        //  Init Color
        colorDefault = Color.WHITE;
        colorFocus = Color.GREEN;
        borderColor = Color.BLACK;

        setBackground(colorDefault);
        
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                isFocused = true;
                setBackground(colorFocus);
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                isFocused = false;
                setBackground(colorDefault);
                borderColor = Color.BLACK;
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Menggambar latar belakang
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Mengisi latar belakang dengan warna default
        g2.setColor(getBackground());
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));

        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Menggambar border persegi
        if (isFocused) {
            g2.setColor(colorFocus);
        } else {
            g2.setColor(borderColor);
        }
        
        
        g2.draw(new Rectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1));

        g2.dispose();
    }

     @Override
    public Insets getInsets() {
        // Mengatur padding kiri
        return new Insets(0, paddingLeft, 0, 0);
    }

    public void setPaddingLeft(int padding) {
        this.paddingLeft = padding;
        repaint();
    }
    
}
