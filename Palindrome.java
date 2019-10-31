package myjavaprograms;

class Palindrome {

	public static void main(String[] args) {
	int num=121                                                                                      ,rev=0,rem,org;
	org=num;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(org==rev)
		System.out.println(org+" is a palindrome");
	else
		System.out.println(org+" is not a palindrome");
	}

}
