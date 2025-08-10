package com.sprk.cars;

public class BMW implements CarBrand {

	public BMW() {
		System.out.println("I am BMW car");
	}
	
	@Override
	public void showSpecs() {
		System.out.println("I am BMW Car and I am best for racing and premium sports feel");
	}
}
