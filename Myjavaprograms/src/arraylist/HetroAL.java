package arraylist;

import java.util.ArrayList;

class HetroAL {

	public static void main(String[] args) {
		ArrayList hetro = new ArrayList();
		hetro.add(new Bike("Red" , 60.0));
		hetro.add(new Emp("Karthik" , 1));
		Movie m = new Movie("KGF" , 5.0);
		hetro.add(m);
		hetro.add(10);
		System.out.println(hetro);
		
	}

}
