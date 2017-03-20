/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * @author David
 *
 */
public class JSwingRadioButton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public JSwingRadioButton() {

		JRadioButton radioButton = new JRadioButton("TestJava");
		add(radioButton);
		radioButton = new JRadioButton("B");
		add(radioButton);
		radioButton = new JRadioButton("C");
		add(radioButton);
		radioButton = new JRadioButton("NONE");
		add(radioButton);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSwingRadioButton();
	}
}