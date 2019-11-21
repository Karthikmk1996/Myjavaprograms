package pratice;

public class Emp {
	 static void salaryDetails(double salary)
	 {
	 	if(salary>1000)
	 		System.out.println("TY");
	 	else
	 		
	 		throw new SalaryException();
	 	    
	         }
	 public static void main(String[] args) {
	 	System.out.println("fm");
	 	salaryDetails(200);
	 	System.out.println("me");
	 	
	 }
	 

}
