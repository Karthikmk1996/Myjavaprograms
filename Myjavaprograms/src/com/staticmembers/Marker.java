package com.staticmembers;

class Marker {
	static int price;
	static String colour;
	
	static void writing()
	{
		System.out.println("Marker of colour "+colour+" is writing");
	}
	public static void main(String[] args) {
		System.out.println(price);
		System.out.println(colour);
		Marker.price=100;
		Marker.colour="Black";
		System.out.println("Marker colour is "+Marker.colour+" Marker Price is "+Marker.price);
		Marker.price=80;
		Marker.colour="Blue";
		System.out.println("Marker colour is "+Marker.colour+" Marker Price is "+Marker.price);
		Marker.writing();
	}
}
