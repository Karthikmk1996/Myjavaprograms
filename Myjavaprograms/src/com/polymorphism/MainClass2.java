package com.polymorphism;

class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] b = new Bank[4];
		b[0] = new ICICI();
		b[1] = new Canara();
		b[2] = new SBI();
		b[3] = new Bank();
		for(Bank bank : b)
			
		{
			System.out.println(bank.rateOfInterest());
		}
	}
	

}
