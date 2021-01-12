package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Cat nya = new Cat();
		nya.rumble(); //testing interface
		nya.die(); //testing inherited
		Pointed mmm = new Pointed();
		mmm.beCute();
		mmm.Sqawk(); //testing other interface
		Dog boof = new Dog();
		boof.makeNoise(); //testing abstract inherited
		nya.makeNoise();  //proving inheritance
		mmm.makeNoise();
		Animal thing = new Bird(); // testing class != constructor
		System.out.println(thing.flight);
		Cat b = new Tabby();
		System.out.println(b.flight);
		Bird Pelly = new Bird();
		System.out.println(Pelly.flight); //proving that flight works
	}

}
