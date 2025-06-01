package component;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

public class MyCheckBox extends JCheckBox {
    private int cornerRadius = 8;
    private Color boxBackground = Color.WHITE;
    private Color currentBoxBorderColor; // WARNA BORDER YANG SEDANG AKTIF
    private Color originalBoxBorderColor = Color.BLACK; // WARNA BORDER ASLI YANG DI-SET
    private int boxBorderWidth = 2;
    private Color checkColor = new Color(50, 150, 250); // WARNA CENTANG BIRU
    private Color textColor = Color.BLACK;

    public MyCheckBox() {        
        setOpaque(false);
        setForeground(textColor); // MENGOVERIDE setTextColor JIKA DIPANGGIL
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        this.currentBoxBorderColor = this.originalBoxBorderColor;

        // REMOVE ICON CENTANG BAWAAN
        setIcon(null); 

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                currentBoxBorderColor = checkColor.darker();
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                currentBoxBorderColor = originalBoxBorderColor; // MENGEMBALIKAN KE WARNA ASLI
                repaint();
            }
        });
    }

    // Setter Getter
    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    public Color getBoxBackground() {
        return boxBackground;
    }

    public void setBoxBackground(Color boxBackground) {
        this.boxBackground = boxBackground;
        repaint();
    }

    public Color getBoxBorderColor() {
        return originalBoxBorderColor; // MENGEMBALIKAN WARNA ASLI YANG DI SET
    }

    public void setBoxBorderColor(Color boxBorderColor) {
        this.originalBoxBorderColor = boxBorderColor;
        // MENGUPDATE currentBoxBorderColor WALAUPUN TIDAK SEDANG HOVER
        if (currentBoxBorderColor == null || !currentBoxBorderColor.equals(checkColor.darker())) {
             this.currentBoxBorderColor = boxBorderColor;
        }
        repaint();
    }

    public int getBoxBorderWidth() {
        return boxBorderWidth;
    }

    public void setBoxBorderWidth(int boxBorderWidth) {
        this.boxBorderWidth = boxBorderWidth;
        repaint();
    }

    public Color getCheckColor() {
        return checkColor;
    }

    public void setCheckColor(Color checkColor) {
        this.checkColor = checkColor;
        // MENGUPDATE WARNA HOVER JIKA checkColor BERUBAH DAN HOVER SEDANG AKTIF
        boolean isHovering = currentBoxBorderColor != null && currentBoxBorderColor.equals(this.checkColor.darker()); 
        if(isHovering && getMousePosition() != null) { // MEMERIKSA APAKAH MOUSE MASIH DI ATAS KOMPONEN
             currentBoxBorderColor = checkColor.darker();
        }
        repaint();
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
        setForeground(textColor); 
    }

    @Override
    protected void paintComponent(Graphics g) {        
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // MENENTUKAN UKURAN KONSISTEN DAN POSISI KOTAK CENTANG        
        int size = 18; // UKURAN KOTAK CENTANG
        // POSISI Y AGAR VERTIKAL DI TENGAH
        int y = (getHeight() - size) / 2;
        // POSISI X (BIASANYA DI PALING KIRI, SETELAH INSETS JIKA ADA)
        // UNTUK JCheckBox, UI BIASANYA MENEMPATKAN IKON DI KIRI
        // KITA AKAN MENGGAMBAR DI POSISI X = 0 RELATIF TERHADAP AREA GAMBAR KOMPONEN        
        int x = 0; // TAMBAHKAN DISINI JIKA INGIN ADA PADDING KIRI

        // BACKGROUND KOTAK
        g2.setColor(boxBackground);
        g2.fillRoundRect(x, y, size, size, cornerRadius, cornerRadius);

        // BORDER KOTAK
        g2.setStroke(new BasicStroke(boxBorderWidth));
        g2.setColor(currentBoxBorderColor); // GUNAKAN currentBoxBorderColor UNTUK HOVER
        g2.drawRoundRect(x, y, size, size, cornerRadius, cornerRadius);

        // JIKA CHECKED, GAMBAR CENTANG
        if (isSelected()) {
            g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.setColor(checkColor);

            // MENGGAMBAR CENTANG MANUAL
            int padding = 4; // PADDING DALAM KOTAK UNTUK CENTANG
            int x1 = x + padding;
            int y1 = y + size / 2;
            int x2 = x + size / 2 - padding / 2; // SESUAIKAN AGAR ADA DITENGAH
            int y2 = y + size - padding;
            int x3 = x + size - padding;
            int y3 = y + padding + 1;

            g2.drawLine(x1, y1, x2, y2);
            g2.drawLine(x2, y2, x3, y3);
        }
        g2.dispose();
    }
}