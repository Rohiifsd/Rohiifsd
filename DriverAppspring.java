package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Engine;
import com.excelr.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Engine myEngine1=(Engine)beanFactory.getBean("e1");
		System.out.println(myEngine1);
		
		Engine myEngine2=(Engine)beanFactory.getBean("e2");
		System.out.println(myEngine2);
		
		
		Gear myGear1=beanFactory.getBean("g1",Gear.class);
		System.out.println(myGear1);
		
		Gear myGear2=(Gear)beanFactory.getBean("g2");
		System.out.println(myGear2);
	}

}
