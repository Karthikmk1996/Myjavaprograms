package com.nonstaticmembers;

public class Demo5 {
	void m1() // non static method is a non static context
	{
		System.out.println("from m1()");
		System.out.println(this);
	}
	public static void main(String[] args) {
		Demo5 x=new Demo5();
		x.m1();// we call non static method using object reference variable
		System.out.println(x);
	}
}
