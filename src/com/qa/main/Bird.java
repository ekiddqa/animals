package com.qa.main;

public class Bird extends Animal implements Caw{
	String species = "Not a species - a class 'Aves'.";
	boolean domestic = false;
	boolean flight = true; //I know we've had an lecture around this but I am spending way too much time on just creating variables.
	boolean birb = true;
	@Override
	void makeNoise() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

	}
	boolean acknowledge() {
		boolean acknowledged = true;
		System.out.println("bird this is.");
		return acknowledged;
	}
	@Override
	public void Sqawk() {
		System.out.println("Caw");
		
	}
}
