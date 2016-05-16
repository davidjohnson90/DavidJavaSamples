/**
 * 
 */
package com.david.java.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author David
 *
 */
public class DeserializeObject {
	public static void main(String[] args) {
		StudentInfoSerial studentInfo = null;
		try {
			FileInputStream fis = new FileInputStream(
					"src\\main\\resources\\Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			studentInfo = (StudentInfoSerial) ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(studentInfo.name + "\n" + studentInfo.sid + "\n"
				+ studentInfo.contact);
	}
}
