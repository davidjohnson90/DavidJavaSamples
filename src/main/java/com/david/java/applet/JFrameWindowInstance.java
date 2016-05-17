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
public class JFrameWindowInstance {
	/**
	 * 
	 */
	public JFrameWindowInstance() {
		JFrame jFrame = new JFrame("David Window");
		JButton jButton = new JButton("Hi David");
		jFrame.add(jButton);
		jFrame.setLayout(new FlowLayout());
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameWindowInstance();
	}
}