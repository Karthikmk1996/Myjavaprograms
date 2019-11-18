package com.constructor;

class Loan {
	String Name;
	double ROI;
	Loan(String Name,double ROI)
	{
		this.Name=Name;
		this.ROI=ROI;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan ob1=new Loan("A",20000);
		System.out.println("Name:"+ob1.Name+" ROI:"+ob1.ROI);
		Loan ob2=new Loan("B",10000);
		System.out.println("Name:"+ob2.Name+" ROI:"+ob2.ROI);
	}

}
