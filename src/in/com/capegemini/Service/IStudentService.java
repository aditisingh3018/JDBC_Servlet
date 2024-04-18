package in.com.capegemini.Service;

import in.com.capegemini.DTO.Student;

public interface IStudentService {
	
	 public String addStudent(Integer StudentUID,String StudentName,String StudentCourse, Integer StudentBatch );
	  public Student selectStudent(Integer Student);
	  public String updateStudent(Integer StudentUID);
	  public String deleteStudent(Integer StudentUID);

}
