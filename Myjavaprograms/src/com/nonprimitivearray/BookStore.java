package com.nonprimitivearray;

class BookStore 
{

	public static void main(String[] args) 
	{
		Books[]shelf= {new Books(" D.O.T.A ",1450,1),
				new Books(" The Hitman ",1550,2),
				new Books(" Far Cry ",1650,3),
				new Books(" Prince of Persia ",1750,4),
				new Books(" Assasin Creed ",1850,5)};
		for(Books n:shelf) 
			n.genre("thriller");
	}

}
