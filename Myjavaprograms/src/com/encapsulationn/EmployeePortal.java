package com.encapsulationn;

public class EmployeePortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(1,"A",15.2);
		System.out.println("Employee name is "+emp.getName());
		System.out.println("Employee id is "+emp.getId());
		System.out.println("Employee salary is "+emp.getSalary());
		emp.setSalary(16.5);
		System.out.println("Employee salary is "+emp.getSalary());
	}

}
