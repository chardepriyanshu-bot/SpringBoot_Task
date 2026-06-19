package com.pc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pc.config.AppConfig;
import com.pc.sbeans.LearningController;

public class PlatformTest {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class))
		{
			LearningController ctrl=ctxt.getBean(LearningController.class);
			ctrl.enrollJavaCourse();
			//ctrl.enrollPythonCourse();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
