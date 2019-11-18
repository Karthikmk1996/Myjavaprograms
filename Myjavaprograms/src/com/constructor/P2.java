package com.constructor;

class P2 {
	int i=10;
	double d=12.0;
	P2()
	{
		System.out.println("from P2()");
		System.out.println(i);
		System.out.println(d);
		System.out.println(this.i);
		System.out.println(this.d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		P2 obj=new P2();
		System.out.println(obj.i);
		System.out.println(obj.d);
	}

}
