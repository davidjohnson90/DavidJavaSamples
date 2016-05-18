/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * @author David
 *
 */
public class SwingJCheckBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public SwingJCheckBox() {
		JCheckBox checkBox = new JCheckBox("YES");
		add(checkBox);
		checkBox = new JCheckBox("NO");
		add(checkBox);
		checkBox = new JCheckBox("MAYBE");
		add(checkBox);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingJCheckBox();
	}
}