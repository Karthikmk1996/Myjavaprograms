package com.staticmembers;

class Demo10 {
static int i;
static
{
	System.out.println("from Sib");
	System.out.println(i);
	i=20;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from the main");
		System.out.println(i);
	}

}
