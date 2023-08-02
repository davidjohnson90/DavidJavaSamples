package com.david.java.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * The RectangleApplet class is a simple Java applet that draws a rounded rectangle on the applet window.
 *
 * @author David
 */
public class RectangleApplet extends Applet {

    private static final long serialVersionUID = 1L;

    int height, width;

    /*
     * Initializes the applet and sets the height, width, and name.
     */
    @Override
    public void init() {
        height = getSize().height;
        width = getSize().width;
        setName("Rectangle Applet");
    }

    /**
     * Draws a rounded rectangle on the applet window.
     *
     * @param g the Graphics object to draw on the applet window.
     */
    @Override
    public void paint(Graphics g) {
        g.drawRoundRect(10, 30, width, height, 2, 3);
    }
}
