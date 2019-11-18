package com.miscellaneous;

class MainClassA {
		// TODO Auto-generated method stub
		static void display(A ob) 
		{
			System.out.println("i:"+ob.i+" j:"+ob.j);
		}
		public static void main(String[] args) {
			A ob1=new A(10,20.2);
			A ob2=new A(20,25.3);
			display(ob1);
			display(ob2);
		}
	}

