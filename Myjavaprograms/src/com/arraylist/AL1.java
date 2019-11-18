package com.arraylist;

import java.util.ArrayList;

class AL1 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList ();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(10);
		al.add(20);
		al.add("Tejha");
		System.out.println(al);
		al.add(1, "Sudarshan");
		System.out.println(al);
		al.add("Hithesh");
		al.add("Aditya");
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Object ob = al.set(5, "Harshith");
		System.out.println(ob);
		System.out.println(al);
		System.out.println(al.contains("Ashmitha"));
		System.out.println(al.add(20));
		System.out.println(al);
		System.out.println(al.indexOf(20));
		System.out.println(al.lastIndexOf(20));
		System.out.println(al.indexOf("Thejha"));
		System.out.println(al.size());
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}
}
