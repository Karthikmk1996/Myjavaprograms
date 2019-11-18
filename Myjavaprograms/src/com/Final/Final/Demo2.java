package com.Final;

class Demo2 {
	public static void main(String[] args) {
		test(10);
	}
	static void test(final int i)
	{
		System.out.println(i);
		//i=20;
		System.out.println(i+20);
	}
}
