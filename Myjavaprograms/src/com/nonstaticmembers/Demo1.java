package com.nonstaticmembers;
// Demo pgm for non static variable
class Demo1 {
	int i;//non static member variable
	boolean flag;
	public static void main(String[] args) {
		System.out.println(new Demo1());
		System.out.println(new Demo1());
		Demo1 a=new Demo1();
		System.out.println(a.i);
		System.out.println(a.flag);
		a.i=10;
		a.flag=true;
		System.out.println(a.i);
		System.out.println(a.flag);
	}
}
