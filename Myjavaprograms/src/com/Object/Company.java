package com.Object;

 class Company
 {
	public static void main(String[] args) 
	{
		TestEngineer t1=new TestEngineer(1,"A",10.0,"selenium");
		TestEngineer t2=new TestEngineer(1,"A",10.0,"selenium");
		Developer d1=new Developer(1,"B",10.0,"Ruby");
		Developer d2=new Developer(1,"B",10.0,"Ruby");
	    System.out.println(t1);
	    System.out.println(t2);
	    System.out.println(d1);
	    System.out.println(d2);
	    System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(d1.hashCode());
	    System.out.println(d2.hashCode());
	}
}
