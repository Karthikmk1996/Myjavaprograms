package com.har;

class Bike {
	Engine e = new Engine(100);
	double mileage;
	String color;
	Bike()
	{
	}
	Bike(double mileage,String color)
	{
		this.mileage=mileage;
		this.color=color;
	}
}

