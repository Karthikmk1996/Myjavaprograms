package com.Interface;

class Main1 {
	public static void main(String[] args) {
		I ob=new P1(); // abstraction using interface
		ob.test1(); // calling the method test1() using ob(which is of interface type)
		ob.test2();
	}
}
