/**
 * 
 */
package com.david.java.applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author David
 *
 */
public class HelloDavidApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		g.drawString("Hello David", 20, 20);
	}

}
