package com.toString;

public class Company extends Employee {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"A",10);
		System.out.println(e1);
		/*System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);*/
		Employee []e= {new Employee(2,"B",12),
						new Employee(3,"C",13)};
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		}
}
