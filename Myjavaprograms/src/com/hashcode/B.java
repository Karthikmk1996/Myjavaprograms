package com.hashcode;

class B extends A {
	char ch;
	String s;
	B(){}
	B(int i,double d,char ch,String s)
	{
		super(i,d);
		this.ch=ch;
		this.s=s;
	}
	public boolean equals(Object ob)
	{
		B temp=(B)ob;
		return super.equals(temp)&&this.ch==temp.ch&& this.s.equals(temp.s);
	}
	public int hashCode()
	{
		int hs=super.hashCode()+ch+s.hashCode();
		return hs;
	}
}
