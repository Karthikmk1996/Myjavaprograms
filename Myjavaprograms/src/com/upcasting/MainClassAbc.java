package com.upcasting;

class MainClassAbc {
	public static void main(String[] args) {
		A ob1= new B();//Upcasting
		System.out.println(ob1.i);
		System.out.println("**********");
		B ob2= new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		System.out.println("***********");
		C ob3=new C();
		System.out.println(ob3.i);
		System.out.println(ob3.j);
		System.out.println(ob3.k);
		B ob4=new C();//Upcasting
		System.out.println(ob4.i);
		System.out.println(ob4.j);
		//System.out.println(ob4.k); CTE
		A ob5=new C();
		System.out.println(ob5.i);
		//System.out.println(ob5.j); CTE
		//System.out.println(ob5.k); CTE
				
	}
}
