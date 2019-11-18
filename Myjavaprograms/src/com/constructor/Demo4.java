package com.constructor;

class Demo4 {
	Demo4()
	{
		System.out.println("from Demo5()");
	}
	Demo4(int i)
	{
		System.out.println("from Demo4(int)");
	}
	Demo4(int i,int j)
	{
		System.out.println("from Demo4(int,int)");
	}
	public static void main(String[] args) {
		{
			Demo4 ob1=new Demo4();
			Demo4 ob2=new Demo4(10,30);
			Demo4 ob3=new Demo4(10);
		}
	}
}
