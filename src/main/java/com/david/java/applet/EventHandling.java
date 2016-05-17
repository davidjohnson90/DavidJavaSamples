/**
 * 
 */
package com.david.java.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author David
 *
 */
public class EventHandling extends Applet implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String message = "";

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.Applet#init()
	 */
	@Override
	public void init() {
		addKeyListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		message = message + e.getKeyChar();
		repaint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("Key Pressed");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Key Released");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		g.drawString(message, 20, 40);
	}
}
