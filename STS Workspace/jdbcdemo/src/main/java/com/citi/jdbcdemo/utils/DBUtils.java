package com.citi.jdbcdemo.utils;

import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	
	public static void main(String[] args) {
		readFile();
	}
	
	private static Properties readFile() {
		try(InputStream inputStream = DBUtils.class.getClassLoader()
				.getResourceAsStream("application.properties")){
			Properties properties = new Properties();
			if(inputStream==null) {
				System.out.println("Failure!");
				return null;
			}
			properties.load(inputStream);
			
			System.out.println("DBURL" + properties.getProperty("DB_URL"));
			return properties;
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public static Connection getConnection() {
		Properties properties = readFile();
		
		try {
			Connection connection = DriverManager.getConnection(
					properties.getProperty("DB_URL"), 
					properties.getProperty("DB_USERNAME"), 
					properties.getProperty("DB_PASSWORD"));
			
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
