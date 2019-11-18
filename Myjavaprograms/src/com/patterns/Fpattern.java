package com.patterns;

class Fpattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==0||i==2||j==0||j==3)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}
	}

}
