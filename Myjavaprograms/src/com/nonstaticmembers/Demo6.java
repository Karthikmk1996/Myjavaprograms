package com.nonstaticmembers;

public class Demo6 {
	void m1()
	{
		System.out.println("from m1()");
		System.out.println(this);
	}
	void m2()
	{
		System.out.println("from m2()");
		System.out.println(this);
	}
	public static void main(String[] args) {
		Demo6 ob1=new Demo6();
		Demo6 ob2=new Demo6();
		System.out.println(ob1);
		System.out.println(ob2);
		ob1.m1();
		ob1.m2();
		ob2.m1();
		ob2.m2();
	}
}

