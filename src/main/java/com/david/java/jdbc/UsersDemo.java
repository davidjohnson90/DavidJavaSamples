/**
 * 
 */
package com.david.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author David
 *
 */
public class UsersDemo {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:ucanaccess://E:/MSAcess/UserInfo.accdb");
			Statement statement = connection.createStatement();
			String sql = "Select * from users";
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(
						"\n" + resultSet.getString(1) + "\t" + resultSet.getString(5) + "\t" + resultSet.getString(2)
								+ "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
