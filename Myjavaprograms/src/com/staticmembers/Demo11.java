package com.staticmembers;

class Demo11 {
	static int i;
	static
	{
		System.out.println("from sib of Demo11");
	}
	public static void main(String[] args) {
		System.out.println("from main of Demo11");
		System.out.println(Demo12.j);
	}
}
