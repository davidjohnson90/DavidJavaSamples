/**
 * This class demonstrates a simple AWT Frame window that extends the Frame class.
 * It contains a single button with the label "Hello David."
 * The window has a title "David" and a size of 400x500 pixels.
 * <p>
 * Note: Since the Frame class is being extended, this class can be used as a standalone application.
 * When executed, it will create a window displaying the button.
 * <p>
 * Note: This class is for demonstration purposes and doesn't follow best practices for modern GUI development.
 */
package com.david.java.applet;

import java.awt.*;

/**
 * The FrameWindowExtendsFrameClass class extends the Frame class to create a simple AWT Frame window.
 * It contains a single button with the label "Hello David."
 * The window has a title "David" and a size of 400x500 pixels.
 * When the main method is executed, it creates an instance of this class, showing the window with the button.
 *
 * @author David
 */
public class FrameWindowExtendsFrameClass extends Frame {
    private static final long serialVersionUID = 1L;

    /**
     * Constructor to create a Frame window with a button.
     * It adds a button with the label "Hello David" to the frame.
     * The frame has a size of 400x500 pixels, a title "David," and uses FlowLayout as the layout manager.
     * It also sets the frame visible, so it can be displayed on the screen.
     */
    public FrameWindowExtendsFrameClass() {
        Button button = new Button("Hello David");
        add(button);
        setSize(400, 500);
        setTitle("David");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    /**
     * The main method to create and show the Frame window.
     * It creates an instance of the FrameWindowExtendsFrameClass, which displays the window with the button.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        new FrameWindowExtendsFrameClass();
    }
}
