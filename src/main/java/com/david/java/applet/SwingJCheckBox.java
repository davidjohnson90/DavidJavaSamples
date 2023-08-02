package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The SwingJCheckBox class creates a simple Swing-based window that displays JCheckBox components with labels.
 *
 * @author David
 */
public class SwingJCheckBox extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SwingJCheckBox.
     * Creates three JCheckBox components with labels "YES," "NO," and "MAYBE."
     * Adds the JCheckBox components to the window.
     * Sets the size of the window to 400x400 pixels.
     * Sets the default close operation to exit the application when the window is closed.
     * Sets the layout of the window to use FlowLayout.
     * Makes the window visible.
     */
    public SwingJCheckBox() {
        JCheckBox checkBox = new JCheckBox("YES");
        add(checkBox);
        checkBox = new JCheckBox("NO");
        add(checkBox);
        checkBox = new JCheckBox("MAYBE");
        add(checkBox);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of SwingJCheckBox to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new SwingJCheckBox();
    }
}
