package com.methodoverriding;

public class MainClass1 {

	public static void main(String[] args) {
		B ob1=new B();// from B test()
		ob1.test();
		A ob2 = new A();
		ob2.test();// from A test()
	}

}
