package com.nonstaticmembers;

class A1 {
	int i;
	void initializing(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ob= new A1 ();
		ob.initializing(10);
		System.out.println(ob.i);
	}

}
