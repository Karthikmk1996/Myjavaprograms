package com.array;

public class A3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5,sqr=0;
		int[]a=new int[size];
		for(int i=0,n=1;i<a.length;n++) {
			sqr=n*n;
			a[i++]=sqr;
			}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
