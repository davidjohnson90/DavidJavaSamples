/**
 * 
 */
package com.david.java.applet;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * @author David
 *
 */
public class JSwingComboBox extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name[] = { "Arun", "Andrew", "David", "Johnson", "Sundarson" };

	/**
	* 
	*/
	public JSwingComboBox() {
		JComboBox<String> comboBox = new JComboBox<String>(name);
		add(comboBox);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSwingComboBox();
	}
}
