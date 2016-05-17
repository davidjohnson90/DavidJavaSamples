/**
 * 
 */
package com.david.java.applet;

import java.awt.Frame;
import java.awt.Label;

/**
 * @author David
 *
 */
public class FrameWindowInstance {
	/**
	 * 
	 */
	public FrameWindowInstance() {
		Frame frame = new Frame();
		Label label = new Label("Hi David, Welcome to Java AWT.");
		frame.add(label);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameWindowInstance();
	}
}