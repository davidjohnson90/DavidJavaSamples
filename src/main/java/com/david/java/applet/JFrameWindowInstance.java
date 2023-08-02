/**
 * The JFrameWindowInstance class creates a simple Swing-based window that displays a button with the label "Hi David."
 */
package com.david.java.applet;

import javax.swing.*;
import java.awt.*;

/**
 * The JFrameWindowInstance class creates a window that displays a button with the label "Hi David."
 *
 * @author David
 */
public class JFrameWindowInstance {

    /**
     * Constructs a new JFrameWindowInstance.
     * Creates a new JFrame with the title "David Window".
     * Adds a JButton with the label "Hi David" to the window.
     * Sets the layout of the window to use FlowLayout.
     * Sets the default close operation to exit the application when the window is closed.
     * Sets the size of the window to 400x400 pixels.
     * Makes the window visible.
     */
    public JFrameWindowInstance() {
        JFrame jFrame = new JFrame("David Window");
        JButton jButton = new JButton("Hi David");
        jFrame.add(jButton);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }

    /**
     * The main method to start the application.
     * Creates an instance of JFrameWindowInstance to show the window.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new JFrameWindowInstance();
    }
}
