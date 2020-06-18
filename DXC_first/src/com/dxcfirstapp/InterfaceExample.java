package com.dxcfirstapp;

interface HandSanataizer {
	void show();
}
interface HomeSanataizer {
	void liquertyp(); 
}
interface OfficeSanataizer {
	void liquerqyt();
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample mobj= new InterfaceExample();
		mobj.show();
		mobj.liquertyp();
		mobj.liquerqyt();
		

	}

	private void liquerqyt() {
		// TODO Auto-generated method stub
		System.out.println("liquer is medium");
		
	}

	private void liquertyp() {
		// TODO Auto-generated method stub
		System.out.println("liquer is high");
		
	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println("no liquer");
		
	}

}
