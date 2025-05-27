package component;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyScrollBar extends BasicScrollBarUI {

    private Color thumbColor;
    private Color trackColor;

    // Constructor untuk mengatur warna scrollbar
    public MyScrollBar(Color thumbColor, Color trackColor) {
        this.thumbColor = thumbColor;
        this.trackColor = trackColor;
    }

    // Method untuk menyesuaikan ukuran thumb
    protected Dimension getThumbSize() {
        return new Dimension(8, 8); // Ukuran minimalis untuk scrollbar
    }

    // Mengatur warna track scrollbar
    @Override
    protected void configureScrollBarColors() {
        this.thumbColor = thumbColor != null ? thumbColor : Color.GRAY;
        this.trackColor = trackColor != null ? trackColor : Color.LIGHT_GRAY;
    }

    @Override
    protected void paintThumb(java.awt.Graphics g, javax.swing.JComponent c, java.awt.Rectangle thumbBounds) {
        g.setColor(thumbColor);
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    }

    @Override
    protected void paintTrack(java.awt.Graphics g, javax.swing.JComponent c, java.awt.Rectangle trackBounds) {
        g.setColor(trackColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void paintDecreaseHighlight(java.awt.Graphics g) {}

    @Override
    protected void paintIncreaseHighlight(java.awt.Graphics g) {}
}
