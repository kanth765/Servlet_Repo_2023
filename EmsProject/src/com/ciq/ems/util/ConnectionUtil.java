package com.ciq.ems.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	private static Connection connection = null;
	private static Properties properties = null;
	static {
		try {
			properties = new Properties();
			properties.load(
					ConnectionUtil.class.getClassLoader().getResourceAsStream("com/ciq/ems/config/db.properties"));
			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("un"),
					properties.getProperty("pw"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;

	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
