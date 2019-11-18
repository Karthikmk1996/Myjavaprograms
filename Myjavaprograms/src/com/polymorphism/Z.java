package com.polymorphism;
//compile time polymorphism
class Z {

	public static void main(String[] args) {
		a(10);
		a("Hi");
	}

 static void a(int i)
 {System.out.println(i)  ;}
 static void a(String s)
 {System.out.println(s);}
}
 
