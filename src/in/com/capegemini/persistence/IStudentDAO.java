package in.com.capegemini.persistence;

import in.com.capegemini.DTO.Student;

public interface IStudentDAO {
  public String addStudent(Integer StudentUID,String StudentName,String StudentCourse, Integer StudentBatch );
  public Student selectStudent(Integer Student);
  public String updateStudent(Integer StudentUID);
  public String deleteStudent(Integer StudentUID);
}
