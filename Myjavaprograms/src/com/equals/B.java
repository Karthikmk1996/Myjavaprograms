package com.equals;

class B extends A {
	String s;
	B(){}
	B(int i,double j,String s)
	{
		super(i,j);
		this.s=s;
	}
	public boolean equals(Object ob)
	{
		return super.equals(ob)&& this.s==((B)ob).s;
	}
}
