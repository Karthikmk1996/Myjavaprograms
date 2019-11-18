package com.nonprimitivearray;

class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {2,4,6,8};
		/*for(int i=0;i<array.length;i++)
		{*/
		System.out.println("displaying odd num: ");
		for(int x:array)
		{
			System.out.println(x+1);
		}
		//}
	}

}
