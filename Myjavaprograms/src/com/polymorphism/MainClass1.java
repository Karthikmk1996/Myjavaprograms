package com.polymorphism;

class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
		bank = new SBI();
		System.out.println(bank.rateOfInterest());
		
		bank = new Canara();
		System.out.println(bank.rateOfInterest());
		
		bank = new ICICI();
		System.out.println(bank.rateOfInterest());
	}

}
