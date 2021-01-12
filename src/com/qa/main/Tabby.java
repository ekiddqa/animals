package com.qa.main;

public class Tabby extends Cat {
 boolean favourite = false;
 boolean goodKitty = true;
 int year = 1690;
 boolean angry;
 
 
 void setAngry(boolean angry) {
	this.angry = angry;
}

 void forgive() {
		if(goodKitty == false) {
			goodKitty = true;
		}

	}
	
 void bite() {
		if(angry) {
			System.out.println("Ow!");
			goodKitty = false;
}
}
}
