package com.miscellaneous;

class Company {
	public static void main(String[] args) {
		Employee e1=Employee.createEmployee(1,"A",7.7).display();//create -> Display
		Employee e2=Employee.createEmployee(2,"B",7.6).display().initialize(8.6).display();//create->Display->Re-initialize->Display
		Employee e3=Employee.createEmployee(3,"C",7.5).display().initialize(8.7).display();
		Employee e4=Employee.createEmployee(4,"D",7.4).display().initialize(8.8).display();
	}
}
