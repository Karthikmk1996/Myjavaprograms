package com.polymorphism;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob;
		ob = new A();
		ob.test();
		
		ob = new B();
		ob.test();
		
		ob = new C();
		ob.test();
		
		ob = new B();
		ob.test();
	}

}
