package com.qa.main;

public class Pointed extends Cat implements Caw{
	 boolean favourite = true;
	 boolean goodKitty = true;
	 String firstBreed = "Siamese";
	 boolean hungry = false;
	 
	 
	void beCute() {
		 System.out.println("Mwrow!");
		 makeNoise();
		 goodKitty = true;
	 }


	@Override
	public void Sqawk() {
		System.out.println("...");
		
	}
}
