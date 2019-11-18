package com.abstractclas;

class Jungle {

	public static void main(String[] args) {
	Dog d=new Dog(12, 22);
	Lion l=new Lion(20, 100);
	System.out.println(d.height+" "+d.weight);
	d.talk();
	System.out.println(l.height+" "+l.weight);
	l.talk();
	Animal d1=new Dog(15,20);
	d1.talk();
	System.out.println(d1.height+" "+d1.weight);
	d1=new Lion(22,300);
	System.out.println(d1.height+" "+d1.weight);
	d1.talk();
	}

}
