package com.array;

class A2 {
	public static boolean isPrime(int n) {
		int count=2;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[] args) {
	int n=333;
	int size=7;
	int []a=new int [size];
	for(int j=0;j<a.length;n++)
		if(isPrime(n))
		{
			a[j++]=n;
		}
	for(int j=0;j<a.length;j++)
		System.out.println(a[j]);
	}

}
