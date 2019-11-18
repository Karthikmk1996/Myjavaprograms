package com.objectclass;

class Emp {
	int id;
	String name;
	double salary;
	Emp(){ }
	Emp(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}
