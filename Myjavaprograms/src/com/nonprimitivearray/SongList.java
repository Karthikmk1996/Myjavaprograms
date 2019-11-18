package com.nonprimitivearray;

class SongList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song[] Songlist=new Song[5];
		Songlist[0]=new Song("AB","ab",123);
		Songlist[1]=new Song("CD","cd",1234);
		Songlist[2]=new Song("EF","ef",1123);
		Songlist[3]=new Song("GH","gh",1223);
		Songlist[4]=new Song("IJ","ij",1253);
	for(Song x: Songlist)
	{
		System.out.println("name: "+x.name);
		System.out.println("singer: "+x.singer);
		System.out.println("likes: "+x.likes);
	}
	}
}
