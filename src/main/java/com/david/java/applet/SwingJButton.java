/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author David
 *
 */
public class SwingJButton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public SwingJButton() {
		JButton button1 = new JButton("YES");
		JButton button2 = new JButton("NO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(400, 400);
		add(button1);
		add(button2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingJButton();
	}
}