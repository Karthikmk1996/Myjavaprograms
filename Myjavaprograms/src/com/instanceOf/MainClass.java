package com.instanceOf;

class MainClass {

	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1 instanceof A);
		System.out.println(ob1 instanceof B);
		//System.out.println(ob1 instanceof D); ob1(A) has no is-a relationship with D
		B ob2= new B();
		System.out.println(ob2 instanceof B);
		System.out.println(ob2 instanceof A);
		A ob3= new A();
		System.out.println(ob3 instanceof A);
		System.out.println(ob3 instanceof B);

	}

}
