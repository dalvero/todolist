package component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySpinner extends JSpinner {
    public MySpinner() {
        super(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1)); // Min value is 0

        // Customizing the spinner's editor to handle color changes
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) this.getEditor();
        JComponent spinnerComponent = editor.getTextField();

        spinnerComponent.setBackground(Color.WHITE); // Set initial background color

        // Adding a listener to handle the button colors
        JComponent spinnerButton = (JComponent) editor.getComponent(0);

        // Assuming there are two buttons: increment and decrement
        Component[] components = spinnerButton.getComponents();
        JButton incrementButton = null;
        JButton decrementButton = null;

        for (Component comp : components) {
            if (comp instanceof JButton) {
                if (incrementButton == null) {
                    incrementButton = (JButton) comp; // First button is increment
                } else {
                    decrementButton = (JButton) comp; // Second button is decrement
                    break; // Exit once both are found
                }
            }
        }

        // Set default button colors
        if (incrementButton != null) {
            incrementButton.setBackground(Color.LIGHT_GRAY);
            incrementButton.addActionListener(new ButtonColorActionListener(incrementButton));
        }

        if (decrementButton != null) {
            decrementButton.setBackground(Color.LIGHT_GRAY);
            decrementButton.addActionListener(new ButtonColorActionListener(decrementButton));
        }

        // Set a listener for value change to prevent negative values
        this.addChangeListener(e -> {
            if ((int) getValue() < 0) {
                setValue(0); // Reset to 0 if less than 0
            }
        });
    }


    private class ButtonColorActionListener implements ActionListener {
        private final JButton button;

        public ButtonColorActionListener(JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Change button color when clicked
            button.setBackground(Color.GREEN);
            Timer timer = new Timer(200, event -> {
                button.setBackground(Color.LIGHT_GRAY); // Reset color after a short delay
            });
            timer.setRepeats(false); // Only execute once
            timer.start();
        }
    }
}
