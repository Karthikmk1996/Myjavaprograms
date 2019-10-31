package myjavaprograms;

class Product
{

	public static void main(String[] args) 
	{
		print(2,4);
		print(2,4,6);
		print(2.0,4.0);
	}
	public static void print(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void print(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	public static void print(double x,double y)
	{
		System.out.println(x*y);
	}
}

