package com.constructor;

class P3 {
	int i;
	P3()
	{
		
	}
	P3(int a)
	{
		i=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3 ob1= new P3();
		System.out.println(ob1.i);
		P3 ob2= new P3(50);
		System.out.println(ob2.i);
	}

}
