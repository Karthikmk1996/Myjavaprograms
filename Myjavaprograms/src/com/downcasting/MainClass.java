package com.downcasting;

class MainClass {
	public static void display(A obj)
	{
		System.out.println(obj.i);
		if(obj instanceof B)
			System.out.println(((B)obj).j);
		if(obj instanceof C)
			System.out.println(((C)obj).k);
		System.out.println("*************");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(10);
		B ob2=new B(10,15);
		C ob3=new C(1,2,3);
		A ob4=new C(2,4,6);
		A ob5=new C(5,10,15);
		display(ob1);
		display(ob2);
		display(ob3);
		display(ob4);
		display(ob5);
	}

}
