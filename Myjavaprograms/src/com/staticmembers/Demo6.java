package com.staticmembers;

class Demo6 {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=20;
System.out.println(i);
System.out.println(Demo6.i);
m1();
System.out.println(Demo6.i);
	}
public static void m1()
{
	System.out.println(i);
	i=10;
}
}
