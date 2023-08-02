/**
 * The HelloDavidApplet class is a simple applet that displays the message "Hello David".
 */
package com.david.java.applet;

import java.applet.Applet;
import java.awt.*;
import java.util.logging.Logger;

/**
 * The HelloDavidApplet class extends the Applet class to create a simple applet that displays a greeting message.
 * It overrides the paint method to draw the message "Hello David" on the applet window.
 *
 * @author David
 */
public class HelloDavidApplet extends Applet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(HelloDavidApplet.class.getName());

    /**
     * Overrides the paint method of the Applet class to draw the message "Hello David" on the applet window.
     *
     * @param g the Graphics object to draw on the applet window.
     */
    @Override
    public void paint(Graphics g) {
        LOGGER.info("Drawing the greeting message.");
        g.drawString("Hello David", 20, 20);
    }

}
