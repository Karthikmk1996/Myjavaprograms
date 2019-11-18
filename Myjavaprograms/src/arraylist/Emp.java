package arraylist;

class Emp {
	String name;
	int id;
	
	Emp(){}
	Emp(String name , int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
}
