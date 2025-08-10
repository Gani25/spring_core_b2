package com.sprk.cars;

public class Tata implements CarBrand {

	public Tata() {
		System.out.println("I am tata car");
	}
	
	@Override
	public void showSpecs() {
		System.out.println("I am Tata Car and I am best in budget");
	}
}
