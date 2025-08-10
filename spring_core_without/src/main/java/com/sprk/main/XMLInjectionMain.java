package com.sprk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLInjectionMain {
	
	public static void main(String[] args) {
		
		// Load XML In IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		System.out.println("Hello");
	}

}
