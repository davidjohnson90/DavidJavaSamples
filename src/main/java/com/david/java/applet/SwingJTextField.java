package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The SwingJTextField class creates a simple Swing-based window that displays a JTextField component.
 *
 * @author David
 */
public class SwingJTextField extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SwingJTextField.
     * Creates a JTextField component with a width of 20 columns.
     * Adds the JTextField component to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the size of the window to 400x400 pixels.
     * Sets the default close operation to exit the application when the window is closed.
     * Makes the window visible.
     */
    public SwingJTextField() {
        JTextField textField = new JTextField(20);
        add(textField);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of SwingJTextField to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new SwingJTextField();
    }
}
