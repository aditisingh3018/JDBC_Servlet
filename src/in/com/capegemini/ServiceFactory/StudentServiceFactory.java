package in.com.capegemini.ServiceFactory;

import in.com.capegemini.Service.IStudentService;
import in.com.capegemini.Service.StudentServiceImpl;

public class StudentServiceFactory {
      private static IStudentService studentService = null;
      private StudentServiceFactory() {
    	  
      }
      public static IStudentService getStudentServic() {
    	  if(studentService==null) {
    		  studentService = new StudentServiceImpl();
    	  }
    	  return studentService;
      }
}
