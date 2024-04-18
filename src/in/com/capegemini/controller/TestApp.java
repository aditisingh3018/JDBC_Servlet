package in.com.capegemini.controller;

import java.util.Scanner;

import in.com.capegemini.Service.IStudentService;
import in.com.capegemini.ServiceFactory.StudentServiceFactory;

public class TestApp {
	public static void main(String args[]) {
		
			IStudentService studentService = StudentServiceFactory.getStudentServic();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student UID:");
			Integer sUID = sc.nextInt();
			
			System.out.println("Enter Student Name:");
			String sName = sc.next();
			
			System.out.println("Enter Student Course:");
			String sCourse = sc.next();
			
			System.out.println("Enter Student Batch:");
			Integer sBatch = sc.nextInt();
			
			String message=studentService.addStudent(sUID, sName, sCourse, sBatch);
			if(message.equalsIgnoreCase("success")) {
				System.out.println("Record inserted successfully");
			}
			else {
				System.out.println("Record insertion failed");
			}
			sc.close();
		}
	

}
