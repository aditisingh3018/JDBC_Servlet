package in.com.capegemini.DAOFactory;

import in.com.capegemini.persistence.IStudentDAO;
import in.com.capegemini.persistence.StudentDAOImpl;

public class StudentDAOFactory {
   private static IStudentDAO studentDao = null;
   private StudentDAOFactory() {
	   
   }
   public static IStudentDAO getStudentDAO() {
	   if(studentDao==null) {
		   studentDao= new StudentDAOImpl();
	   }
	   return studentDao;
   }
}
