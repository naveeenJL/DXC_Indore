package com.dxcfirstapp;

class Chicken{
	String type,color,quantity;
	Recepie mRecepie;
	
	void display() {
		type= "dum";
		color="red";
		quantity= "1kg";
		System.out.println(type+color+quantity);
		mRecepie= new Recepie();
		mRecepie.DisplayRecepie();
		mRecepie.setdata("oo", "kk", "lll");
		
	}
}

class Recepie{
	String onion,turmaric,salt;
	
	void DisplayRecepie()
	{
		onion="1 plate";
		turmaric="1tbspoon";
		salt="2tbspoon";
		System.out.println(onion + turmaric + salt);
	}
	void setdata(String onion,String turmaric,String salt)
	{
		this.onion=onion;
		this.turmaric=turmaric;
		this.salt=salt;
		System.out.println(onion + turmaric + salt);
		
	}
}
public class AggregationExample {
	public static void main(String [] args) 
	{
	Chicken mobj=new Chicken();
	mobj.display();
		
	}

}
