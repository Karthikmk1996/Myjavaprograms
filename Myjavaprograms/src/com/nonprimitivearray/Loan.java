package com.nonprimitivearray;

public class Loan {
	String name;
	double roi;
	Loan()
	{
		
	}
	Loan(String name,double roi)
	{
		this.name=name;
		this.roi=roi;
	}
	void interest()
	{
		System.out.println(name+" is granted at "+roi+" % ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan("Vehicle Loan",12);
		Loan l2=new Loan("Home Loan",10);
		Loan l3=new Loan("Education Loan",8.0);
		Loan[]loan= {l1,l2,l3};
		for(int i=0;i<loan.length;i++)
		{
			System.out.println(loan[i].name+" "+loan[i].roi);
			loan[i].interest();
		}
	}

}
