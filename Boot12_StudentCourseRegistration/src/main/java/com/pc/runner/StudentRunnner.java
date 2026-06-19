package com.pc.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pc.controller.StudentController;
import com.pc.entity.Student;

@Component
public class StudentRunnner implements CommandLineRunner {

	@Autowired
	private StudentController ctrl;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("""
					1. Register Student
					2. View All Students
					3. View Student by Id
					4. Update Student
					5. Delete Student
					6. Count Students
					Enter your operation no. : 
					""");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.println("Enter student Name:");
				String studentName=sc.nextLine();
				System.out.println("Enter course Name:");
				String courseName=sc.nextLine();
				System.out.println("Enter course fee:");
				Double courseFee=Double.parseDouble(sc.nextLine());
				System.out.println("Enter institute Name:");
				String instituteName=sc.nextLine();
				Student student=new Student(studentName,courseName,courseFee,instituteName);
				ctrl.registerStudent(student);
				break;
			case 2:
				ctrl.viewAllStudents();
				break;
			case 3:
				System.out.println("Enter student Id: ");
				int studentId=Integer.parseInt(sc.nextLine());
				ctrl.searchById(studentId);
				break;
			case 4:
				System.out.println("Enter student Id: ");
				int studentId2=Integer.parseInt(sc.nextLine());
				System.out.println("Enter student Name:");
				String studentName2=sc.nextLine();
				System.out.println("Enter course Name:");
				String courseName2=sc.nextLine();
				System.out.println("Enter course fee:");
				Double courseFee2=Double.parseDouble(sc.nextLine());
				System.out.println("Enter institute Name:");
				String instituteName2=sc.nextLine();
				Student student2=new Student(studentId2,studentName2,courseName2,courseFee2,instituteName2);
				ctrl.updateCourse(student2);
				break;
			case 5:
				System.out.println("Enter student Id: ");
				int studentId3=Integer.parseInt(sc.nextLine());
				ctrl.deleteStudent(studentId3);
				break;
			case 6:
				ctrl.countStudent();
				break;
			default:
				System.err.println("Invalid Operation no.");
			}
			
			System.out.println("Do you want to continue?(Y/N)");
			ch=sc.nextLine().charAt(0);
		}while(Character.toUpperCase(ch)=='Y');
		System.out.println("---- Thank You ----");
		sc.close();
		
	}

}
