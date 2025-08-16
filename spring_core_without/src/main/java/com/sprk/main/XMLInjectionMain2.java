package com.sprk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprk.cars.CarBrand;
import com.sprk.showroom.SPRKDealership;

public class XMLInjectionMain2 {
	
	public static void main(String[] args) {
		
		// Load XML In IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		System.out.println("Hello");
		SPRKDealership dealership = context.getBean("dealership", SPRKDealership.class);
		dealership.getCarBrand().showSpecs();
		
		SPRKDealership dealership2 = context.getBean("dealership_setter", SPRKDealership.class);
		
		CarBrand brand = dealership2.getCarBrand();
		brand.showSpecs();
	}

}
