package component;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class MyOptionPane {

    public interface OptionCallback {
        void onResult(boolean yes);
    }

    public static void showInfo(Component parent, String message, String title) {
        showCustomDialog(parent, message, title, "info", false, null);
    }

    public static void showWarning(Component parent, String message, String title) {
        showCustomDialog(parent, message, title, "warning", false, null);
    }

    public static void showConfirm(Component parent, String message, String title, OptionCallback callback) {
        showCustomDialog(parent, message, title, "question", true, callback);
    }

    private static void showCustomDialog(Component parent, String message, String title, String iconType, boolean isConfirm, OptionCallback callback) {
        MyPanelCustBorder panel = new MyPanelCustBorder();        
        panel.setBackgroundColor(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));                       
        panel.setBorderColor(Color.WHITE);
        
        // Icon label
        JLabel iconLabel = new JLabel();
        if (iconType.equals("info")) {
            iconLabel.setIcon(UIManager.getIcon("OptionPane.informationIcon"));
        } else if (iconType.equals("warning")) {
            iconLabel.setIcon(UIManager.getIcon("OptionPane.warningIcon"));
        } else if (iconType.equals("question")) {
            iconLabel.setIcon(UIManager.getIcon("OptionPane.questionIcon"));
        }

        panel.add(iconLabel, BorderLayout.WEST);

        // Message
        JLabel label = new JLabel("<html><body style='width:250px'>" + message + "</body></html>");
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(label, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(Color.WHITE);

        MyButton okButton = new MyButton();
        okButton.setRadius(15);
        okButton.setText("OK");
        okButton.setColor(new Color(200, 255, 200));

        MyButton yesButton = new MyButton();
        yesButton.setRadius(15);
        yesButton.setText("Yes");
        yesButton.setColor(new Color(200, 255, 200));

        MyButton noButton = new MyButton();
        noButton.setRadius(15);
        noButton.setText("No");
        noButton.setColor(new Color(255, 200, 200));

        final JDialog dialog = new JDialog();
        dialog.setUndecorated(true);
        dialog.setModal(true);
        dialog.setTitle(title);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.getContentPane().add(panel, BorderLayout.CENTER);

        if (isConfirm) {
            buttonPanel.add(yesButton);
            buttonPanel.add(noButton);
        } else {
            buttonPanel.add(okButton);
        }

        panel.add(buttonPanel, BorderLayout.SOUTH);
        dialog.pack();

        // Lebih dinamis dan otomatis menengah ke parent (frame)
        if (parent != null) {
            Point parentLocation = parent.getLocationOnScreen();
            int x = parentLocation.x + (parent.getWidth() - dialog.getWidth()) / 2;
            int y = parentLocation.y + (parent.getHeight() - dialog.getHeight()) / 2;
            dialog.setLocation(x, y);
        } else {
            // Jika parent null, tengah layar
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - dialog.getWidth()) / 2;
            int y = (screenSize.height - dialog.getHeight()) / 2;
            dialog.setLocation(x, y);
        }
      

        // Tombol
        okButton.addActionListener(e -> {
            dialog.dispose();
            if (callback != null) callback.onResult(true);
        });

        yesButton.addActionListener(e -> {
            dialog.dispose();
            if (callback != null) callback.onResult(true);
        });

        noButton.addActionListener(e -> {
            dialog.dispose();
            if (callback != null) callback.onResult(false);
        });

        dialog.setVisible(true);
    }
}
