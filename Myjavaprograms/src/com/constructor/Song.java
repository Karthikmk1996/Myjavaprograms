package com.constructor;

class Song {
	String SongName;
	String Singer;
	Song(String SongName,String Singer)
	{
		this.SongName=SongName;
		this.Singer=Singer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song ob1=new Song("Mi_Gente","Willy Williams");
		System.out.println("SongName:"+ob1.SongName+" Singer:"+ob1.Singer);
		Song ob2=new Song("Smack_That","Akon");
		System.out.println("SongName:"+ob2.SongName+" Singer:"+ob2.Singer);
	}

}
