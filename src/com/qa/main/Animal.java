package com.qa.main;

public abstract class Animal {
	private String kingdom ="Animalia";
	private String domain = "Eukaryota";
	private boolean alive = true;
	boolean flight;
	
	abstract void makeNoise();
	String getKingdom() {
		return kingdom;
	}

	String getDomain() {
		return domain;
	}


	boolean isAlive() {
		return alive;
	}


	void setAlive(boolean alive) {
		this.alive = alive;
	}


	void die() {
		alive = false;
		System.out.println("This animal has now ceased all metabolic processes.");
	}
	
	void exist() {
		System.out.println("You acknowledge your presence.");
	}
	boolean isFlight() {
		return flight;
	}
	
}
