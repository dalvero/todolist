package component;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.border.Border;

public class MyComboBox<E> extends JComboBox<E> {

    // ATRIBUT
    private Color defaultBorderColor = new Color(245, 245, 245);
    private Color focusBorderColor = new Color(0, 120, 215); // BIRU
    private Color editorBackgroundColor = Color.WHITE;
    private int cornerRadius = 12;
    private Insets contentPadding = new Insets(5, 10, 5, 10); // PADDING
    

    private JTextField customEditorTextField;
    private JPanel customEditorPanel;

    public MyComboBox() {
        super();
        initComponentsCustom();
    }

    public MyComboBox(ComboBoxModel<E> aModel) {
        super(aModel);
        initComponentsCustom();
    }

    public MyComboBox(E[] items) {
        super(items);
        initComponentsCustom();
    }

    private void initComponentsCustom() {
        setOpaque(false);
        setBorder(null);

        setUI(new CustomComboBoxUI());
        setEditable(true);
        setEditor(new CustomEditor());

        if (getEditor().getEditorComponent() instanceof JTextField) {
            customEditorTextField = (JTextField) getEditor().getEditorComponent();

            if (customEditorTextField.getParent() instanceof JPanel) {
                customEditorPanel = (JPanel) customEditorTextField.getParent();
            } else {
                customEditorPanel = null;
            }

            if (customEditorPanel != null) {
                customEditorPanel.setOpaque(true);
                // DISINI STYLE AWALNYA DIATUR OLEH updateEditorStyle()
            } else {
                customEditorTextField.setOpaque(true);
                 // DISINI STYLE AWALNYA DIATUR OLEH updateEditorStyle()
            }

            customEditorTextField.setOpaque(false);
            customEditorTextField.setBorder(null);
            customEditorTextField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            customEditorTextField.setForeground(Color.BLACK);
            customEditorTextField.setHorizontalAlignment(JTextField.LEFT);

            customEditorTextField.addFocusListener(new FocusListener() {
                @Override
                public void focusGained(FocusEvent e) {
                    updateEditorStyle(); // UNTUK UPDATE BORDER, PANGGIL METHOD INI
                }

                @Override
                public void focusLost(FocusEvent e) {
                    updateEditorStyle(); // UNTUK UPDATE BORDER, PANGGIL METHOD INI
                }
            });
        }
        updateEditorStyle(); // PANGGIL UNTUK SET AWAL
    }

    private void updateEditorStyle() {
        Border currentBorder;
        boolean hasFocus = customEditorTextField != null && customEditorTextField.hasFocus();

        if (hasFocus) {
            currentBorder = new RoundedBorder(focusBorderColor, cornerRadius, contentPadding);
        } else {
            currentBorder = new RoundedBorder(defaultBorderColor, cornerRadius, contentPadding);
        }

        if (customEditorPanel != null) {
            customEditorPanel.setBackground(editorBackgroundColor);
            customEditorPanel.setBorder(currentBorder);
            customEditorPanel.revalidate();
            customEditorPanel.repaint();
        } else if (customEditorTextField != null) {            
            customEditorTextField.setBackground(editorBackgroundColor);
            customEditorTextField.setBorder(currentBorder);
            customEditorTextField.revalidate();
            customEditorTextField.repaint();
        }
        // REPAINT JComboBox UNTUK MEMASTIKAN SEMUA BAGIAN DIPERBARUI
        revalidate();
        repaint();
    }

    // GETTER SETTER

    public Color getDefaultBorderColor() {
        return defaultBorderColor;
    }

    public void setDefaultBorderColor(Color defaultBorderColor) {
        Color oldColor = this.defaultBorderColor;
        this.defaultBorderColor = defaultBorderColor;
        firePropertyChange("defaultBorderColor", oldColor, defaultBorderColor); // METHOD DARI JComponent
        updateEditorStyle();
    }

    public Color getFocusBorderColor() {
        return focusBorderColor;
    }

    public void setFocusBorderColor(Color focusBorderColor) {
        Color oldColor = this.focusBorderColor;
        this.focusBorderColor = focusBorderColor;
        firePropertyChange("focusBorderColor", oldColor, focusBorderColor); // METHOD DARI JComponent
        updateEditorStyle();
    }

    public Color getEditorBackgroundColor() {
        return editorBackgroundColor;
    }

    public void setEditorBackgroundColor(Color editorBackgroundColor) {
        Color oldColor = this.editorBackgroundColor;
        this.editorBackgroundColor = editorBackgroundColor;
        firePropertyChange("editorBackgroundColor", oldColor, editorBackgroundColor); // METHOD DARI JComponent
        updateEditorStyle();
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        int oldRadius = this.cornerRadius;
        this.cornerRadius = cornerRadius;
        firePropertyChange("cornerRadius", oldRadius, cornerRadius); // METHOD DARI JComponent
        updateEditorStyle();
    }

    public Insets getContentPadding() {
        return contentPadding;
    }

    public void setContentPadding(Insets contentPadding) {
        Insets oldPadding = this.contentPadding;
        this.contentPadding = contentPadding;
        firePropertyChange("contentPadding", oldPadding, contentPadding); // METHOD DARI JComponent
        updateEditorStyle();
    }   

    // KUSTOMISASI UI (PANAH DAN POPUP)
    private class CustomComboBoxUI extends BasicComboBoxUI {
        @Override
        // KUSTOMISASI BUTTON
        protected JButton createArrowButton() {
            JButton button = super.createArrowButton();
            button.setOpaque(false);
            button.setBackground(new Color(0,0,0,0));
            button.setBorder(BorderFactory.createEmptyBorder(0,0,0,5));
            button.setContentAreaFilled(false);            
            return button;
        }
        
        @Override
        // KUSTOMISASI POP UP
        protected ComboPopup createPopup() {
            BasicComboPopup popup = (BasicComboPopup) super.createPopup();            
            popup.setBorder(BorderFactory.createLineBorder(MyComboBox.this.defaultBorderColor, 1));
            return popup;
        }

        @Override
        public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
            // KOSONG KARENA BACKGROUND SUDAH DISTYLE OLEH EDITOR PANEL
        }

        @Override
        public void paintCurrentValue(Graphics g, Rectangle bounds, boolean hasFocus) {
            // KOSONG KARENA BACKGROUND SUDAH DISTYLE OLEH EDITOR PANEL
        }
    }

    // MENGGUNAKAN CLASS CustomEditor SEBAGAI KUSTOMISASI DASAR
    private class CustomEditor extends BasicComboBoxEditor {
        
    }


    // CLASS UNTUK RADIUS BORDER
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