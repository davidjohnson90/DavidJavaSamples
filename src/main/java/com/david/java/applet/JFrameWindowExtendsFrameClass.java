/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author David
 *
 */
public class JFrameWindowExtendsFrameClass extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public JFrameWindowExtendsFrameClass() {
		setTitle("David Window");
		JLabel jLabel = new JLabel("Hi David");
		add(jLabel);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameWindowExtendsFrameClass();
	}
}
