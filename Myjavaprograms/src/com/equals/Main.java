package com.equals;

class Main {
	public static void main(String[] args) {
		A ob1=new A(10,20.0);
		A ob2=new A(100,20.0);
		A ob3=new A(100,20.0);
		B ob4=new B(10,20.0,"hi");
		B ob5=new B(10,20.0,"hi");
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
		System.out.println(ob3.equals(ob2));
		System.out.println(ob4.equals(ob5));
		System.out.println(ob5.equals(ob4));
	}
}
