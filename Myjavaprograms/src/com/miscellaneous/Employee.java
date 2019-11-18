package com.miscellaneous;

class Employee {
	int id;
	String name;
	double salary;
	
	static Employee createEmployee(int id,String name,double salary)
	{
		return new Employee(id,name,salary);
	}
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	Employee initialize(double salary)
	{
		this.salary=salary;
		return this;
	}
	Employee display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		return this;
	}
	
}
