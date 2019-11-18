package com.isarelationship;

class A {
	static int x=10;
	int y=20;
	static
	{
		System.out.println("from SIB of A");
	}
	{
		System.out.println("from IIB of A");
	}
	A()
	{
		System.out.println("from A()");
	}
}

