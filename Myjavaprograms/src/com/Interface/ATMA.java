package com.Interface;

class ATMA implements ATM {
	long balance;
	@Override
	public void deposit(long amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Successfully deposited"+" "+amount);
		}
		else
			System.out.println("Deposit valid amount");
	}
	@Override
	public void withdrawl(long amount) {
		if(amount<balance)
		{
			balance=balance-amount;
			System.out.println("Successfully withdrawn"+" "+amount);
		}
		else
			System.out.println("invalid amount");
		
	}
	@Override
	public long checkbalance() {
		return balance;
	}
	
}
