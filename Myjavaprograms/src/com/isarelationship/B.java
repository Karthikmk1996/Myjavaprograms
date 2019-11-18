package com.isarelationship;

class B extends A {
	static int i=100;
	int j=200;
	static
	{
		System.out.println("from SIB of B");
	}
	{
		System.out.println("from IIB of B");
	}
	B()
	{
		System.out.println("from B()");
	}
}
