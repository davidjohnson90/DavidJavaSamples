/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author David
 *
 */
public class SwingJTextField extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public SwingJTextField() {
		JTextField textField = new JTextField(20);
		add(textField);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingJTextField();
	}
}
