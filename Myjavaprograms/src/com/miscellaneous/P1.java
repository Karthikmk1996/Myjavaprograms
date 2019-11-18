package com.miscellaneous;

class P1 {
	static void displayArray(int[]array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {1,2,3,4,5};
		P1.displayArray(array);
		for(int i=0;i<array.length;i++)
		{
			array[i]=array[i]+1;
		}
		P1.displayArray(array);
	}

}
