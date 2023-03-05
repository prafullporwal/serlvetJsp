package com.learn.utils;

import java.sql.*;

public class DatabaseUtil {
	
	public Connection getConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Ab029tx");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
