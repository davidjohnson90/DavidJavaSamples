/**
 * 
 */
package com.david.java.applet;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @author David
 *
 */
public class FrameWindowExtendsFrameClass extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FrameWindowExtendsFrameClass() {
		Button button = new Button("Hello David");
		add(button);
		setSize(400, 500);
		setTitle("David");
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameWindowExtendsFrameClass();
	}
}
