package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The JSwingRadioButton class creates a simple Swing-based window that displays JRadioButtons with labels.
 * Each radio button represents a different option: "TestJava," "B," "C," and "NONE."
 *
 * @author David
 */
public class JSwingRadioButton extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new JSwingRadioButton.
     * Creates JRadioButtons with labels "TestJava," "B," "C," and "NONE."
     * Adds the radio buttons to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the size of the window to 400x400 pixels.
     * Sets the default close operation to exit the application when the window is closed.
     * Makes the window visible.
     */
    public JSwingRadioButton() {

        JRadioButton radioButton = new JRadioButton("TestJava");
        add(radioButton);
        radioButton = new JRadioButton("B");
        add(radioButton);
        radioButton = new JRadioButton("C");
        add(radioButton);
        radioButton = new JRadioButton("NONE");
        add(radioButton);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of JSwingRadioButton to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new JSwingRadioButton();
    }
}
