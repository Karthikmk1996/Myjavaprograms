package com.Interface;

class ATMMachine {

	public static void main(String[] args) {
		ATM atm=new ATMA();
		atm.deposit(1000);
		//System.out.println("Balance is"+" "+atm.checkbalance());
		atm.withdrawl(100);
		//System.out.println("Balance is"+" "+atm.checkbalance());
		System.out.println("Get out");

	}

}
