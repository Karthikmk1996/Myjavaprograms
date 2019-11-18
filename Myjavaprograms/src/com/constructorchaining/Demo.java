package com.constructorchaining;

class Demo {
	{
		System.out.println("from IIB");
	}
	Demo()
	{
		//this(5);
		System.out.println("from Demo()");
	}
	Demo(int x)
	{
		this();
		System.out.println("from Demo(int)");
	}
	Demo(double y)
	{
		this(5);
		System.out.println("from Demo(double)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob1=new Demo();
		System.out.println("*********");
		Demo ob2=new Demo(10);
		System.out.println("**********");
		Demo ob3=new Demo(5.5);
		System.out.println("**********");
	}

}
