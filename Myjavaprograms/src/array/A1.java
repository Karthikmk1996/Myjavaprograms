package com.array;
import java.util.Scanner;
class A1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter Size");
	int size=sc.nextInt();
	int[]a=new int[size];
	System.out.println("Enter Values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}

}
