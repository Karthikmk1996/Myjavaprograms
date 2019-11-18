package com.constructor;

class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println("Name:"+e1.Name+" Salary:"+e1.Salary+" id:"+e1.id);
		e1.id=1;
		e1.Name="A";
		e1.Salary=10.5;
		System.out.println("Name:"+e1.Name+" Salary:"+e1.Salary+" id:"+e1.id);
		Employee ob1=new Employee("B",17.5,2);
		System.out.println("Name:"+ob1.Name+" Salary:"+ob1.Salary+" id:"+ob1.id);
		Employee ob2=new Employee("C",15.3,3);
		System.out.println("Name:"+ob2.Name+" Salary:"+ob2.Salary+" id:"+ob2.id);
		Employee ob3=new Employee("D",14.8,4);
		System.out.println("Name:"+ob3.Name+" Salary:"+ob3.Salary+" id:"+ob3.id);
	}

}
