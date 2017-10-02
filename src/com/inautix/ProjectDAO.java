package com.inautix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProjectDAO {

	public Connection database(){
		Connection conn = null;
		String url="";
		try {
			Class.forName("");
			conn = DriverManager.getConnection(url,"shobana","shobana");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
