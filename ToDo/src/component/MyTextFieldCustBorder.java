package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke; // DIGUNAKAN UNTUK KETEBALAN BORDER
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder; // UNTUK PADDING

public class MyTextFieldCustBorder extends JTextField {

    private Color colorDefault;
    private Color colorFocusBackground; 
    private Color borderColor;
    private Color borderFocusColor;  
    private boolean isFocused;
    
    private int cornerRadius = 0;
    private int borderWidth = 1; // DEFAULT KETEBALAN BORDER

    // PADDING DEFAULT (BISA DISESUAIKAN MELALUI SETTER/PROPERTIES)
    private int paddingTop = 5;
    private int paddingLeft = 10;
    private int paddingBottom = 5;
    private int paddingRight = 10;


    // SETTER GETTER
    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = Math.max(0, cornerRadius);
        repaint();
    }
    
    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = Math.max(1, borderWidth);
        repaint();
    }
    
    public void setColorDefault(Color colorDefault) {
        this.colorDefault = colorDefault;
        if (!isFocused) {
            setBackground(colorDefault); 
        }
    }

    public Color getColorDefault() {
        return colorDefault;
    }

    public void setColorFocusBackground(Color colorFocusBackground) {
        this.colorFocusBackground = colorFocusBackground;
        if (isFocused) {
            setBackground(colorFocusBackground);
        }
    }

    public Color getColorFocusBackground() {
        return colorFocusBackground;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        if (!isFocused) {
            repaint(); 
        }
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Color getBorderFocusColor() {
        return borderFocusColor;
    }

    public void setBorderFocusColor(Color borderFocusColor) {
        this.borderFocusColor = borderFocusColor;
        if (isFocused) {
            repaint(); 
        }
    }

    public MyTextFieldCustBorder() {        
        colorDefault = Color.WHITE;
        colorFocusBackground = new Color(230, 245, 255); 
        borderColor = Color.GRAY;
        borderFocusColor = new Color(0, 120, 215); 

        setBackground(colorDefault);
        setOpaque(false); 
        updatePadding();

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                isFocused = true;
                setBackground(colorFocusBackground); 
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                isFocused = false;
                setBackground(colorDefault);                
                repaint();
            }
        });
    }

    private void updatePadding() {
        setBorder(new EmptyBorder(paddingTop, paddingLeft, paddingBottom, paddingRight));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // MENGATUR BACKGROUND DENGAN WARNA YANG SESUAI
        g2.setColor(getBackground()); 
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        g2.dispose();

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(borderWidth)); // MENGATUR KETEBALAN BORDER

        if (isFocused) {
            g2.setColor(borderFocusColor);
        } else {
            g2.setColor(borderColor);
        }

        // PENYESUAIAN UNTUK POSISI DAN UKURAN AGAR STROKE BERADA DI TEPI LUAR               
        int BWo2 = borderWidth / 2; 
        if (borderWidth % 2 == 1) { 
            g2.drawRoundRect(BWo2, BWo2, getWidth() - borderWidth, getHeight() - borderWidth, cornerRadius, cornerRadius);
        } else { // Jika genap
            g2.drawRoundRect(BWo2, BWo2, getWidth() - borderWidth, getHeight() - borderWidth, cornerRadius, cornerRadius);
        }


        g2.dispose();
    }

    // METHOD UNTUK MENGATUR PADDING 
    public void setPadding(int top, int left, int bottom, int right) {
        this.paddingTop = Math.max(0, top);
        this.paddingLeft = Math.max(0, left);
        this.paddingBottom = Math.max(0, bottom);
        this.paddingRight = Math.max(0, right);
        updatePadding(); // Perbarui border dengan padding baru
        revalidate(); // Penting untuk memberitahu layout manager
        repaint();
    }

    // GETTER SETTER
    public int getPaddingTop() { return paddingTop; }
    public void setPaddingTop(int paddingTop) {
        this.paddingTop = Math.max(0, paddingTop);
        updatePadding(); revalidate(); repaint();
    }

    public int getPaddingLeft() { return paddingLeft; }
    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = Math.max(0, paddingLeft);
        updatePadding(); revalidate(); repaint();
    }

    public int getPaddingBottom() { return paddingBottom; }
    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = Math.max(0, paddingBottom);
        updatePadding(); revalidate(); repaint();
    }

    public int getPaddingRight() { return paddingRight; }
    public void setPaddingRight(int paddingRight) {
        this.paddingRight = Math.max(0, paddingRight);
        updatePadding(); revalidate(); repaint();
    }
}