package com.inheritance;

class Smartphone extends Mobile{
	double storage;
	double version;
	Smartphone(String type,double price,double storage,double version)
	{
		super(type,price);
		this.storage=storage;
		this.version=version;
	}
}
