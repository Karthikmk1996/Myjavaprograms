package com.inheritance;

class HomeLoan extends Loan {
	int id;
	HomeLoan()
	{
		
	}
	HomeLoan(int id,double roi)
	{
		super(roi);
		this.id=id;
	}
}
