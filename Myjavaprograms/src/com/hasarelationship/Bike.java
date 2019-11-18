package com.hasarelationship;

class Bike {
	Engine e=new Engine(100);
	double mileage;
	String colour;
	Bike()
	{
		
	}
	Bike(double mileage,String colour)
	{
		this.mileage=mileage;
		this.colour=colour;
	}
}
