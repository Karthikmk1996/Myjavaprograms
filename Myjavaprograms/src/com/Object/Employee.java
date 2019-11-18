package com.Object;

 class Employee {
	 int id;
	 String name;
	 double salary;
	 Employee(){}
	 Employee(int id,String name,double salary)
	                             {
		this.id =id;
		this.name=name;
		this.salary=salary;
	 }
	 public String toString()
	 {
		 return id+" "+name+" "+salary;
	 }
	 public boolean equals(Object ob)
	 {
		 Employee temp=(Employee)ob;
		 return this.id==temp.id && this.name==temp.name && this.salary==temp.salary;
	 }
	 public int hashCode()
	 {
		 int hc=id+name.hashCode()+(int)salary;
		 return hc;
		 
	 }

}
