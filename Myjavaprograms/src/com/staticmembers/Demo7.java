package com.staticmembers;

class Demo7 {
static void m1()
{
	System.out.println("from static method m1 of Demo7");
}
	public static void main(String[] args) {
	m1();
	Demo7.m1();

	}

}
