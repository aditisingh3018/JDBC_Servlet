package in.com.capegemini.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.com.capegemini.DBUtil.JdbcUtil;
import in.com.capegemini.DTO.Student;

public class StudentDAOImpl implements IStudentDAO {
	Connection connection = null;
	PreparedStatement psmt = null;
	JdbcUtil connectionObject = new JdbcUtil();
	int rowAffected = 0;

	@Override
	public String addStudent(Integer StudentUID, String StudentName, String StudentCourse, Integer StudentBatch) {
		String sqlInsertQuery ="insert into studentdb values(?,?,?,?)";
		connection = connectionObject.getConnection();
		if(connection!=null) 
			try {
				psmt=connection.prepareStatement(sqlInsertQuery);
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
				if(psmt!=null) {
					try {
					psmt.setInt(1,StudentUID);
					}catch (SQLException e) {
						
						e.printStackTrace();
					}
					try {
					psmt.setString(2,StudentName);
					}catch (SQLException e) {
						
						e.printStackTrace();
					}
					try {
					psmt.setString(3,StudentCourse);
					}catch (SQLException e) {
						
						e.printStackTrace();
					}
					try {
					psmt.setInt(4,StudentBatch);
					}
					catch (SQLException e) {
						
						e.printStackTrace();
					}
					try {
						rowAffected = psmt.executeUpdate();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				}
				
					if(rowAffected>0) 
						return "success";
					
					else 
						return "failure";
					
				
			 
		//return sqlInsertQuery	;
	}	
		
		
	

	@Override
	public Student selectStudent(Integer Student) {
		
		return null;
	}

	@Override
	public String updateStudent(Integer StudentUID) {
		
		return null;
	}

	@Override
	public String deleteStudent(Integer StudentUID) {
		
		return null;
	}

}
