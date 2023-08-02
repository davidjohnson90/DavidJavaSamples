/**
 * The JFrameWindowExtendsFrameClass class creates a simple Swing-based window that extends the JFrame class
 * to display a label with the text "Hi David."
 */
package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The JFrameWindowExtendsFrameClass class extends JFrame to create a window that displays a label with the text "Hi David."
 *
 * @author David
 */
public class JFrameWindowExtendsFrameClass extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new JFrameWindowExtendsFrameClass.
     * Sets the title of the window to "David Window".
     * Adds a JLabel with the text "Hi David" to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the default close operation to exit the application when the window is closed.
     * Sets the size of the window to 400x400 pixels.
     * Makes the window visible.
     */
    public JFrameWindowExtendsFrameClass() {
        setTitle("David Window");
        JLabel jLabel = new JLabel("Hi David");
        add(jLabel);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of JFrameWindowExtendsFrameClass to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new JFrameWindowExtendsFrameClass();
    }
}
