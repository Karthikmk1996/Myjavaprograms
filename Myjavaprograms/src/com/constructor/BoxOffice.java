package com.constructor;

class BoxOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie ob1=new Movie("MazeRunner1",4.6,2014);
		System.out.println("Name:"+ob1.Name+" Rating:"+ob1.Rating+" YearOfRelease:"+ob1.YearOfRelease);
		Movie ob2=new Movie("MazeRunner2",4.5,2015);
		System.out.println("Name:"+ob2.Name+" Rating:"+ob2.Rating+" YearOfRelease:"+ob2.YearOfRelease);
		Movie ob3=new Movie("MazeRunner3",4.0,2018);
		System.out.println("Name:"+ob3.Name+" Rating:"+ob3.Rating+" YearOfRelease:"+ob3.YearOfRelease);
		
	}

}
