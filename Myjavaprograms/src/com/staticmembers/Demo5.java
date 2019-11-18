package com.staticmembers;

public class Demo5 {

	public static void main(String[] args) {
		System.out.println(Demo4.i);
		Demo4.i=20;
		System.out.println(Demo4.i);
	}

}
