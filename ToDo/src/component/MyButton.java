package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JButton;

public class MyButton extends JButton {
    // ATRIBUTES
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    
    // KONSTRUKTOR
    public MyButton() {
        //  MENGINISIALISASI WARNA        
        setColor(getColor());
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(30, 136, 56);
                
        try {
            // MENGGUNAKAN PATH RELATIF DARI ROOT CLASSPATH
            Font baseFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("font/GavolineDemo.otf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(baseFont);
            // MENGGUNAKAN FONT YANG SUDAH DIBUAT, TAPI TETAP BISA MEMAKAI UKURAN DARI GUI (PROPERTIES)            
            setFont(baseFont.deriveFont(getFont().getSize2D()));
        } catch (IOException | FontFormatException e) {
        }
        
        setContentAreaFilled(false);
        setFocusPainted(false);      // UNTUK MENGHILANGKAN GARIS FOKUS BIRU
        setBorderPainted(false);     // KARENA KITA MANUAL MEMBUAT BUTTON
        //  MENAMBAHKAN EVENT LISTENER MOUSE
        addMouseListener(new MouseAdapter() {
            
            // KETIKA KURSOR MASUK KEAREA KOMPONEN
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            // KETIKA KURSOR KELUAR DARI AREA KOMPONEN
            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;

            }

            // KETIKA KURSOR MENGKLIK KOMPONEN
            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            // KETIKA KURSOS MELEPAS KLIK
            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }
    
    // SETTER GETTER
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }    
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Menggambar Border
        g2.setColor(borderColor); // Warna border
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Menggambar Background di dalam Border
        g2.setColor(getBackground()); // Warna background
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius - 2, radius - 2);

        super.paintComponent(grphcs);
    }
}
