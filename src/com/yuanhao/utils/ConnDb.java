package com.yuanhao.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnDb {
	
	private Connection ct = null;
	private String username="root";
	private String password = "admin";
	
	public Connection getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8",username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ct;
	}
}
