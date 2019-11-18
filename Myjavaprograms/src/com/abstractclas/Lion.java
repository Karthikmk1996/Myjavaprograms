package com.abstractclas;

class Lion extends Animal {
	Lion()
	{
		
	}
	Lion(double height,double weight)
	{
		super(height,weight);
	}
	@Override
	void talk()
	{
		System.out.println("Roars");
	}
}
