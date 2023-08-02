/**
 * The JSwingComboBox class creates a simple Swing-based window that displays a JComboBox with a list of names.
 */
package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The JSwingComboBox class extends JFrame to create a window that displays a JComboBox with a list of names.
 *
 * @author David
 */
public class JSwingComboBox extends JFrame {

    private static final long serialVersionUID = 1L;
    String name[] = {"Arun", "Andrew", "David", "Johnson", "Sundarson"};

    /**
     * Constructs a new JSwingComboBox.
     * Creates a new JComboBox with the list of names.
     * Adds the JComboBox to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the size of the window to 400x400 pixels.
     * Sets the default close operation to exit the application when the window is closed.
     * Makes the window visible.
     */
    public JSwingComboBox() {
        JComboBox<String> comboBox = new JComboBox<String>(name);
        add(comboBox);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of JSwingComboBox to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new JSwingComboBox();
    }
}
