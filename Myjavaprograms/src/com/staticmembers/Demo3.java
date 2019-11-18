package com.staticmembers;

public class Demo3 {
	static int i=100;
	public static void main(String[] args) {
		System.out.println(i);
		i=20;
		System.out.println(Demo3.i);
	}
}
