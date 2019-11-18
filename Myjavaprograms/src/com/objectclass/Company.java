package com.objectclass;

class Company {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "vishnu", 10);
		System.out.println(e1);
		
		Emp[] e = {new Emp(2, "Mahesh",12),new Emp(3, "Durga",13)};
		System.out.println(e[0]);
		System.out.println(e[1]);
		
	}

}
