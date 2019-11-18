package com.methodoverriding;

class Rectangle extends Shape {
	void area()
	{
		int length=12;
		int breadth=13;
		System.out.println(length*breadth);
	}
}
