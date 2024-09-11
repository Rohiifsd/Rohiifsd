package com.excelr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelr.config.AppConfig;
import com.excelr.model.Student;

public class DriverApp {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student myStudent1=(Student)beanFactory.getBean(Student.class);
	    System.out.println(myStudent1);
	    myStudent1.display();
		
	
		
		
	}

}
