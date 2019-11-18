package com.constructor;

class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P4 ob1=new P4(10,false);
		P4 ob2=new P4(20,true);
		P4 ob3=new P4(10,20>=10);
		System.out.println("i:"+ob1.i+" b:"+ob1.b);
		System.out.println("i:"+ob2.i+" b:"+ob2.b);
		System.out.println("i:"+ob3.i+" b:"+ob3.b);
	}

}
