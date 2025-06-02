package component;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MySpinnerTime extends JSpinner {

    private final Color defaultBorderColor = Color.GRAY;
    private final Color focusBorderColor = new Color(0, 120, 215); // MENGATUR SECARA FINAL BAHWA WARNA FOCUSNYA ADALAH BIRU
    private final int cornerRadius = 12;
    private final Insets contentPadding = new Insets(5, 10, 5, 10); // PADDING

    public MySpinnerTime() {
        super(new SpinnerDateModel());
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setOpaque(false); 
        setBorder(null);  // HILANGKAN BORDER DEFAULT

        // FORMAT JAM HH:mm
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(this, "HH:mm");
        setEditor(dateEditor);

        // MENDAPATKAN EDITOR (JSpinner.DefaultEditor ADALAH JPanel)
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) getEditor();
        editor.setOpaque(true); 
        editor.setBackground(Color.WHITE); // WARNA BACKGROUND PUTIH
        // BORDER RADIUS
        editor.setBorder(new RoundedBorder(defaultBorderColor, cornerRadius, contentPadding));

        // CUSTOMISASI TAMPILAN JTextField DIDALAM SPINNER
        JTextField tf = editor.getTextField();
        tf.setOpaque(false); // AGAR TRANSPARAN DAN EDITOR BACKGROUND TERLIHAT
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setForeground(Color.BLACK);
        tf.setBorder(null); 

        // FOKUS EFEK PADA JTextField
        tf.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                editor.setBorder(new RoundedBorder(focusBorderColor, cornerRadius, contentPadding));
                editor.repaint(); 
            }

            public void focusLost(FocusEvent e) {
                editor.setBorder(new RoundedBorder(defaultBorderColor, cornerRadius, contentPadding));
                editor.repaint(); 
            }
        });
        
    }

    // KELAS CUSTOM BORDER
    private static class RoundedBorder extends AbstractBorder {
        private final Color color;
        private final int radius;
        private final Insets contentPadding;
        private final int borderThickness = 1;

        public RoundedBorder(Color color, int radius, Insets contentPadding) {
            this.color = color;
            this.radius = radius;
            this.contentPadding = contentPadding;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(contentPadding.top + borderThickness,
                              contentPadding.left + borderThickness,
                              contentPadding.bottom + borderThickness,
                              contentPadding.right + borderThickness);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.top = contentPadding.top + borderThickness;
            insets.left = contentPadding.left + borderThickness;
            insets.bottom = contentPadding.bottom + borderThickness;
            insets.right = contentPadding.right + borderThickness;
            return insets;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(this.color);
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2.dispose();
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }   
}