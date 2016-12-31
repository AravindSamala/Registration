package com.registration.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class regConnection {

	public static Connection getConnection() {
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch( ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","arvind","arvind123");

		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
		
	}
}
