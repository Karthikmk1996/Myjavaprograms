package com.toString;

class B extends A {
	char ch;
	String s;
	B()
	{
		
	}
	B(int i,double j,char ch,String s)
	{
		super(i,j);
		this.ch=ch;
		this.s=s;
	}
	public String toString()
	{
		return super.toString()+" "+ch+" "+s;
	}
}
