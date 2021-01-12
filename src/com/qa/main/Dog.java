package com.qa.main;

public class Dog extends Animal implements Purr{
	String species = "Canis familiaris";
	boolean canine = true;
	boolean domestic = true;
	boolean flight = false;
	
	
	String getSpecies() {
		return species;
	}


	boolean isCanine() {
		return canine;
	}


	boolean isDomestic() {
		return domestic;
	}


	boolean isFlight() {
		return flight;
	}


	@Override
	void makeNoise() {
		System.out.println("Woof!");
	}


	@Override
	public void rumble() {
		System.out.println("Grrrrr....");
		
	}


	@Override
	public void hiss() {
		System.out.println("What");
		
	}
	
}
