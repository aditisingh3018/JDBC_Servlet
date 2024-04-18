package in.com.capegemini.Service;

import in.com.capegemini.DAOFactory.StudentDAOFactory;
import in.com.capegemini.DTO.Student;
import in.com.capegemini.persistence.IStudentDAO;

public class StudentServiceImpl implements IStudentService {
    
	private IStudentDAO studentDao;
	@Override
	public String addStudent(Integer StudentUID, String StudentName, String StudentCourse, Integer StudentBatch) {
		studentDao = StudentDAOFactory.getStudentDAO();
		if(studentDao!=null) {
			return studentDao.addStudent(StudentUID, StudentName, StudentCourse, StudentBatch);
		}
		else{
			return "failure";
		}
		
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
