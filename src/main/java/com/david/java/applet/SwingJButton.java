package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The SwingJButton class creates a simple Swing-based window that displays two JButtons with labels "YES" and "NO."
 *
 * @author David
 */
public class SwingJButton extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SwingJButton.
     * Creates two JButtons with labels "YES" and "NO."
     * Adds the JButtons to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the size of the window to 400x400 pixels.
     * Sets the default close operation to exit the application when the window is closed.
     * Makes the window visible.
     */
    public SwingJButton() {
        JButton button1 = new JButton("YES");
        JButton button2 = new JButton("NO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 400);
        add(button1);
        add(button2);
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of SwingJButton to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new SwingJButton();
    }
}
