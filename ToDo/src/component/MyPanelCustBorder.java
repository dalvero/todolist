package component;

import javax.swing.*;
import java.awt.*;

public class MyPanelCustBorder extends JPanel {
    // ATRIBUTES
    private int cornerRadius = 0; // SUDUT RADIUS
    private Color backgroundColor = Color.WHITE; // WARNA BACKGROUND
    private Color borderColor = Color.BLACK; // WARNA BORDER
    private int borderWidth = 2; // TEBAL BORDER   
    private boolean borderTop = true; 
    private boolean borderBottom = true;
    private boolean borderLeft = true;
    private boolean borderRight = true;
    
    
    // KONSTRUKTOR
    public MyPanelCustBorder() {
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

    public boolean isBorderTop() {
        return borderTop;
    }

    public void setBorderTop(boolean borderTop) {
        this.borderTop = borderTop;
    }

    public boolean isBorderBottom() {
        return borderBottom;
    }

    public void setBorderBottom(boolean borderBottom) {
        this.borderBottom = borderBottom;
    }

    public boolean isBorderLeft() {
        return borderLeft;
    }

    public void setBorderLeft(boolean borderLeft) {
        this.borderLeft = borderLeft;
    }

    public boolean isBorderRight() {
        return borderRight;
    }

    public void setBorderRight(boolean borderRight) {
        this.borderRight = borderRight;
    }  
    
    // METHOD PAINT COMPONENT
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create(); // create() AGAR TIDAK MENGGANGGU STAT E STAT GRAPHICS ORI        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // WARNA BACKGROUND
        // MEMBUAT BACKGROUND SEDIKIT LEBIH KEJIL JIKA ADA BORDER AGAR BORDER TIDAK TERPOTONG                        
        g2.setColor(backgroundColor);
        g2.fillRoundRect(0, 0, width, height, cornerRadius, cornerRadius);

        // BORDER
        if (borderColor != null && borderWidth > 0) {
            g2.setColor(borderColor);
            // GUNAKAN fillRect UNTUK MENGGAMBAR BORDER SEBAGAI PERSEGI PANJANG TIPIS                        
            // Menggambar border individual
            
            // NOTES : 
            // JIKA CORNER RADIUS > 0, BORDER INI AKAN LURUS DAN MUNGKIN AKAN MEMOTONG BORDER RADIUS                        
            if (borderTop) {
                g2.fillRect(0, 0, width, borderWidth);
            }
            if (borderBottom) {
                g2.fillRect(0, height - borderWidth, width, borderWidth);
            }
            if (borderLeft) {
                // JIKA BORDER ATAS ADA, MULAI Y DARI BAWAH BORDER ATAS
                // JIKA BORDER BAWAH ADA, TINGGI BORDER KIRI DIKURANGI AGAR TIDAK TUMPANG TINDIH                
                int yPos = borderTop ? borderWidth : 0;
                int h = height - (borderTop ? borderWidth : 0) - (borderBottom ? borderWidth : 0);
                if (h > 0) { // HANYA GAMBAR JIKA TINGGINYA POSITIF
                   g2.fillRect(0, yPos, borderWidth, h);
                } else if (!borderTop && !borderBottom) { // KALAU CUMA BORDER KIRI
                   g2.fillRect(0, 0, borderWidth, height);
                }
            }
            if (borderRight) {
                // HAMPIR SAMA DENGAN BORDER LEFT 
                int yPos = borderTop ? borderWidth : 0;
                int h = height - (borderTop ? borderWidth : 0) - (borderBottom ? borderWidth : 0);
                if (h > 0) {
                    g2.fillRect(width - borderWidth, yPos, borderWidth, h);
                } else if (!borderTop && !borderBottom) { // KALAU CUMA BORDER KANAN
                    g2.fillRect(width - borderWidth, 0, borderWidth, height);
                }
            }
        }
        g2.dispose(); // SELALU DISPOSE GRAPHICS YANG DI-creat()
    }
}
