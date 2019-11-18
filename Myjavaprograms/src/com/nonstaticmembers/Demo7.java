package com.nonstaticmembers;

public class Demo7 {
	int i;
	void test()
	{
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Demo7 ob1=new Demo7();
		System.out.println(ob1.i);
		ob1.test();
	}
}
