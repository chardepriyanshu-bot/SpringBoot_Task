package com.pc.main.SpringProj13_LoanProcessingSystem;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.ApplicationConfig;
import com.pc.sbeans.LoanApplication;

public class LoanManagerApplication {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(ApplicationConfig.class)){
			 LoanApplication loan= ctxt.getBean(LoanApplication.class);
			 Scanner sc=new Scanner(System.in);
			 int stop=0;
			 do {
			 System.out.println("1. Apply for Loan\n2. Reject Loan \n3. View All Application \n4. Exit");
			 System.out.println("Enter choice:");
			 int choice=Integer.parseInt(sc.nextLine());
			 
			 switch(choice) {
			 case 1:
				 System.out.println("Enter name:");
				 String name=sc.nextLine();
				 System.out.println("Enter amount:");
				 double amount=Double.parseDouble(sc.nextLine());
				 loan.apply(name, amount);
				 break;
			 case 2:
				 System.out.println("Enter loan id:");
				 System.out.println("Enter amount:");
				 int loanId=Integer.parseInt(sc.nextLine());
				 loan.reject(loanId);
				 break;
			 case 3:
				 loan.view();
				 break;
			 case 4:
				 stop=1;
				 System.out.println("Thankyou");
				 break;
			default:
				System.err.println("Invalid choice.");	 
			 }
			 System.out.println("Do you want to continue(Y/N):");
			 char opt=sc.nextLine().toUpperCase().charAt(0);
			 if(opt=='N') {
				 stop=1;
				 System.out.println("Thankyou");
			 }
			 }while(stop!=1);
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
