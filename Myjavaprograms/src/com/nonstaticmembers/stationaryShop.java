package com.nonstaticmembers;

public class stationaryShop {
	public static void main(String[] args) {
		Marker marker1=new Marker();
		Marker marker2=new Marker();
		System.out.println(marker1.price);//0
		System.out.println(marker1.colour);//Null
		System.out.println(marker2.price);//0
		System.out.println(marker2.colour);//Null
		marker1.price=120;
		marker1.colour="Blue";
		marker2.price=100;
		marker2.colour="Black";
		System.out.println(marker1.price);
		System.out.println(marker1.colour);
		System.out.println(marker2.price);
		System.out.println(marker2.colour);
		marker1.writing();
		marker2.writing();
	}
}
