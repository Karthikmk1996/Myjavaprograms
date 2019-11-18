package com.constructor;

class P1 {
	int i;
	P1()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 ob=new P1();
		System.out.println(ob);
		System.out.println("++++");
		P1 ob1=new P1();
		System.out.println(ob1);
	}

}
