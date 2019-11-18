package com.polymorphism;

class MainClass3 {
	static void display(Bank bank)
	{
		System.out.println(bank.rateOfInterest());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank b1;
	b1 = new ICICI();
	display(b1);
	b1 = new SBI();
	display(b1);
	b1 = new Canara();
	display(b1);

	}

}
