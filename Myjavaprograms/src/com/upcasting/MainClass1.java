package com.upcasting;

class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new B();// Upcasting
		System.out.println(ob1.i);
		//System.out.println(ob1.j); CTE: using parent type reference variable we can't access 
											//members of child class
		B ob2=new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3= ob2;// Upcasting
		System.out.println(ob3.i);
		//System.out.println(ob3.j); CTE:	using parent type reference variable we can't access
											//members of child class
	}

}
