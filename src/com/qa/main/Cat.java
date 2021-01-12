package com.qa.main;

public class Cat extends Animal implements Purr{
	String species = "Felis catus";
	boolean feline = true;
	boolean domestic = true;
	boolean flight = false;
	String getSpecies() {
		return species;
	}
	boolean isFeline() {
		return feline;
	}
	boolean isDomestic() {
		return domestic;
	}
	boolean isFlight() {
		return flight;
	}
	
	String ofFirstDomestication() {
		return "Near East around 7500 BC";
	}
	@Override
	void makeNoise() {
		System.out.println("Meow.");
	}
	@Override
	public void rumble() {
		System.out.println("Purrrrrrrrrrr");
		
	}
	@Override
	public void hiss() {
		System.out.println("HISS!");
		
	}
}
