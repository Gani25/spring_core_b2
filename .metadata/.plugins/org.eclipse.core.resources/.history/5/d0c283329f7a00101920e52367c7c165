package com.sprk.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.sprk.cars.BMW;
import com.sprk.cars.MG;
import com.sprk.cars.Tata;
import com.sprk.showroom.SPRKDealership;

@Configuration
public class DemoConfig {
	
	@Bean()
	@Lazy(value = true)
	public Tata getTataBean() {
		return new Tata();
	}
	@Bean
	@Lazy(value = true)
	public BMW getBMWBean() {
		return new BMW();
	}
	@Bean
	@Lazy(value = true)
	public MG getMGBean() {
		return new MG();
	}
	
	@Bean(name = "dealershipBean")
	@Lazy(value = true)
	public SPRKDealership getDealershipBean() {
		// Constructor Inject
		return new SPRKDealership(getTataBean());
	}
	
	@Bean(name = "dealershipBeanSetter")
	@Lazy(value = true)
	public SPRKDealership getDealershipBeanSetter() {
		// Constructor Inject
		SPRKDealership dealership = new SPRKDealership();
		dealership.setCarBrand(getBMWBean());
		return dealership;
	}
}
