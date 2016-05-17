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
public class RectangleApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int height, width;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#init()
	 */
	@Override
	public void init() {
		height = getSize().height;
		width = getSize().width;
		setName("Rectangle Applet");
	}
	
	/* (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
	g.drawRoundRect(10, 30, width, height, 2, 3);}
}
