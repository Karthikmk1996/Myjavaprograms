package com.inheritance;

class TestEngineer extends Employee {
	String tool;
	TestEngineer(String tool,int id,double salary,String name)
	{
		super(id,salary,name);
		this.tool=tool;
	}
}
