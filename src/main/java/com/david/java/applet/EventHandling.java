/**
 * This is an example applet that demonstrates event handling for keyboard input.
 * It displays a message on the screen as the user types on the keyboard.
 * It also shows a status message when a key is pressed and released.
 */
package com.david.java.applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * The EventHandling class is an example applet that demonstrates event handling for keyboard input.
 * It extends the Applet class and implements the KeyListener interface to handle keyboard events.
 * It displays a message on the screen as the user types on the keyboard.
 * It also shows a status message when a key is pressed and released.
 *
 * @author David
 */
public class EventHandling extends Applet implements KeyListener {

    private static final long serialVersionUID = 1L;

    String message = "";

    /**
     * This method is called when the applet is initialized.
     * It adds itself (this) as a KeyListener to handle keyboard events.
     */
    @Override
    public void init() {
        addKeyListener(this);
    }

    /**
     * This method is called when a key is typed (pressed and released).
     * It appends the character of the pressed key to the message string and repaints the applet.
     */
    @Override
    public void keyTyped(KeyEvent e) {
        message = message + e.getKeyChar();
        repaint();
    }

    /**
     * This method is called when a key is pressed (before it is released).
     * It shows a status message indicating that a key is pressed.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Pressed");
    }

    /**
     * This method is called when a key is released (after it is pressed).
     * It shows a status message indicating that a key is released.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Released");
    }

    /**
     * This method is called to paint the applet.
     * It displays the current message on the screen at coordinates (20, 40).
     */
    @Override
    public void paint(Graphics g) {
        g.drawString(message, 20, 40);
    }
}
