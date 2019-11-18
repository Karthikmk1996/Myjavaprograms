package com.objectclass;

class A1 {
	int i;
	double j;
	A1(){ }
	A1(int i, double j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return i+" "+j;
	}
}