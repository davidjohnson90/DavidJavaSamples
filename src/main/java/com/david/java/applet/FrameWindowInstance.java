/**
 * This class demonstrates creating a simple AWT Frame window and adding a Label to it.
 * The window displays the text "Hi David, Welcome to Java AWT."
 * The window has a size of 300x300 pixels and is displayed when the main method is executed.
 * <p>
 * Note: Since this class is for demonstration purposes, it is a standalone application and not an applet.
 */
package com.david.java.applet;

import java.awt.*;

/**
 * The FrameWindowInstance class demonstrates creating a simple AWT Frame window with a Label.
 * The window displays the text "Hi David, Welcome to Java AWT."
 * It has a size of 300x300 pixels and is displayed when the main method is executed.
 * <p>
 * Note: Since this class is a standalone application, the main method is used to create and show the window.
 * It creates an instance of this class, which displays the window with the Label.
 * <p>
 * Note: This class is for demonstration purposes and doesn't follow best practices for modern GUI development.
 *
 * @author David
 */
public class FrameWindowInstance {

    /**
     * Constructor to create a Frame window with a Label.
     * It creates a Frame and a Label with the text "Hi David, Welcome to Java AWT."
     * The Label is added to the Frame, and the Frame is set to visible with a size of 300x300 pixels.
     */
    public FrameWindowInstance() {
        Frame frame = new Frame();
        Label label = new Label("Hi David, Welcome to Java AWT.");
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    /**
     * The main method to create and show the Frame window with the Label.
     * It creates an instance of the FrameWindowInstance class, which displays the window with the Label.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new FrameWindowInstance();
    }
}
