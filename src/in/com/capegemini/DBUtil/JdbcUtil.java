package in.com.capegemini.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public Connection getConnection() {
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims_815","root","Anshi@3018");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("Connection Established");
		return con;
	}

}
