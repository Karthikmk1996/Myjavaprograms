package pratice;

class AgeException extends RuntimeException
{
}
class Voter{
int age;
Voter() {}
Voter(int age)
{
	if(age<=18)
		throw new AgeException();
	else
		{
		this.age=age;
		System.out.println("VOTE");
		}
}
	
}
	