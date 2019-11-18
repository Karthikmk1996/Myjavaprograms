package com.nonstaticmembers;

class Demo4 {
	int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 ob=new Demo4();
		int i=20;
		System.out.println(i);
		System.out.println(ob.i);
	}

}
