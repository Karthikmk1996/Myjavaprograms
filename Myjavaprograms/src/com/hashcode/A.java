package com.hashcode;

class A {
	int i;
	double d;
	A()
	{
		
	}
	A(int i,double d)
	{
		this.i=i;
		this.d=d;
	}
	public boolean equals(Object ob)
	{
		A temp=(A)ob;
		return this.i==temp.i&& this.d==temp.d;
	}
	public int hashCode()
	{
		return i+(int)d;
	}
}
