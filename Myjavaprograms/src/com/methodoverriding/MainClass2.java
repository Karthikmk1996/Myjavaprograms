package com.methodoverriding;

class MainClass2 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.area();//12.56
		Rectangle r=new Rectangle();
		r.area();//156
		Shape s=new Shape();
		s.area(); // Shape has an area
	}
}
