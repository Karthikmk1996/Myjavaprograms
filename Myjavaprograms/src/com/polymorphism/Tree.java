package com.polymorphism;

class Tree {

	public static void main(String[] args) {
		Bird b;
		b = new Bird();
		b.talk();
		
		b = new Parrot();
		b.talk();
		

	}

}
