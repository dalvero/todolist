package component;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class MyScrollPane extends JScrollPane {
    public MyScrollPane(Component view) {
        super(view);
        setBorder(null);
        getViewport().setBorder(null);
        setViewportBorder(null);
        setBackground(new Color(0, 0, 0, 0)); // TRANSAPARAN
        
        customizeScrollBar(getVerticalScrollBar());
        customizeScrollBar(getHorizontalScrollBar());
        
        getViewport().setOpaque(false);
    }

    private void customizeScrollBar(JScrollBar scrollBar) {
        scrollBar.setOpaque(false);
        scrollBar.setUI(new BasicScrollBarUI() {
            private final Color defaultThumbColor = new Color(180, 180, 180, 180); // SEMI TRANSPARAN
            private final Color hoverThumbColor = new Color(140, 140, 140, 200);   // SAAT HOVER
            private boolean isThumbHovered = false;

            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = defaultThumbColor;
                this.trackColor = new Color(0, 0, 0, 0); // TRANSPARAN
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return invisibleButton(); // MENGHILANGKAN PANAH ATAS
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return invisibleButton(); // MENGHILANGKAN PANAH BAWAH
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                if (!scrollbar.isEnabled() || thumbBounds.isEmpty()) return;

                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Color color = isThumbHovered ? hoverThumbColor : defaultThumbColor;
                g2.setColor(color);

                // MENGUBAH SUDUT MENJADI BULAT DAN MENGKUSTOMISASI UKURAN
                g2.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height, 10, 10);
                g2.dispose();
            }

            @Override
            protected void installListeners() {
                super.installListeners();
                scrollbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent e) {
                        isThumbHovered = getThumbBounds().contains(e.getPoint());
                        scrollbar.repaint();
                    }
                });
            }

            private JButton invisibleButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                button.setOpaque(false);
                button.setContentAreaFilled(false);
                button.setBorderPainted(false);
                return button;
            }
        });

        scrollBar.setPreferredSize(new Dimension(8, 8));
        scrollBar.setUnitIncrement(16); // SCROLL LEBIH SMOOTH
    }
}
