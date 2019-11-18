package com.pac2;

import com.pac1.A2;

public class E2 extends A2
{
 public static void main(String[] args) {
	E2 ob = new E2();
	System.out.println(ob.j);// j of A2 has package scope it cant be inherited in subclass of 
	System.out.println(E2.i);//different package
}
}
