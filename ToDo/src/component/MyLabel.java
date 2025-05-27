package component;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JLabel;

public class MyLabel extends JLabel{
    // ATRIBUTES
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private boolean isOver;
    private Font pomodoroFont;

    // KONSTRUKTOR
    public MyLabel() {
        color = Color.BLACK;
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        
        setForeground(color);
        
        
        try {
            // MENGGUNAKAN PATH RELATIF DARI ROOT CLASSPATH
            Font baseFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("font/GavolineDemo.otf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(baseFont);
            // MENGGUNAKAN FONT YANG SUDAH DIBUAT, TAPI TETAP BISA MEMAKAI UKURAN DARI GUI (PROPERTIES)            
            setFont(baseFont.deriveFont(getFont().getSize2D()));
        } catch (IOException | FontFormatException e) {
        }

   
        
        addMouseListener(new MouseAdapter() {
            // KETIKA KURSOR MASUK KEAREA KOMPONEN
            @Override
            public void mouseEntered(MouseEvent me) {
                setForeground(colorOver);
                isOver = true;
            }

            // KETIKA KURSOR KELUAR DARI AREA KOMPONEN
            @Override
            public void mouseExited(MouseEvent me) {
                setForeground(color);
                isOver = false;

            }

            // KETIKA KURSOR MENEKAN
            @Override
            public void mousePressed(MouseEvent me) {
                setForeground(colorClick);
            }

            // KETIKA KURSOR MELEPAS
            @Override
            public void mouseReleased(MouseEvent me) {
                if (isOver) {
                    setForeground(colorOver);
                } else {
                    setForeground(color);
                }
            }
        });
    }

    public Font getPomodoroFont() {
        return pomodoroFont;
    }

    public void setPomodoroFont(Font pomodoroFont) {
        this.pomodoroFont = pomodoroFont;
    }

    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public boolean isIsOver() {
        return isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }
    
    
}
