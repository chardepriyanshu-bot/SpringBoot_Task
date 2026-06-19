package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.sbeans.Address;
import com.pc.sbeans.Principle;
import com.pc.sbeans.School;

public class Test {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class)){
			 Address add = ctxt.getBean(Address.class);
			 add.setCity("Nagpur");
			 add.setState("Maharashtra");
			 Principle prin=ctxt.getBean(Principle.class);
			 prin.setName("Guju");
			 prin.setExperience(21);
			School school= ctxt.getBean(School.class);
			school.setSchoolName("Zila Parishad Vidhyalay");
			System.out.println(school.showDetails());
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
