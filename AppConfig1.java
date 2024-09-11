package com.excelr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.excelr.model.Student;

@Configuration
@ComponentScan(basePackages = "com.excelr.model")
public class AppConfig {

	@Bean
	public Student getStudentByCDI()
	{
		return new Student(93,"Jasprit");
	}
	
	@Bean
	public Student getStudentBySDI()
	{
		Student s1=new Student();
		s1.setRno(1);
		s1.setSname("Rahul");
		return s1;
	}
}
