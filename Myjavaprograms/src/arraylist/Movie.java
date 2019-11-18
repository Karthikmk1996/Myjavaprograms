package arraylist;

class Movie {
	String name;
	double rating;
	
	Movie() {}
	Movie(String name , double rating)
	{
		this.name=name;
		this.rating=rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + "]";
	}
	

}
