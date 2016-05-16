/**
 * 
 */
package com.david.java.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author David
 *
 */
public class SerializeObject {
	public static void main(String[] args) {
		try {
			StudentInfoSerial studentInfo = new StudentInfoSerial("David", 101,
					"8951199887");
			FileOutputStream fos = new FileOutputStream(
					"src\\main\\resources\\Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studentInfo);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}