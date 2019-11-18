package com.inheritance;

class Dog extends Animal {
	String colour;
	Dog(int height,int weight,String colour)
	{
		super(height,weight);
		this.colour=colour;
	}
	public static void main(String[] args) {
		Dog d=new Dog(22,27,"Brown");
		System.out.println(d.height);
		System.out.println(d.weight);
		System.out.println(d.colour);
	}
}
