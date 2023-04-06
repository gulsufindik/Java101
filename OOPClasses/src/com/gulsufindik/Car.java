package com.gulsufindik;

public class Car {

	// <variables>
	String type;
	String model;
	String color;
	int speed;
	int speedLimit = 100;

	// <methods>
	void increaseSpeed(int increment) {
		if ((speed + increment) < speedLimit) {
			speed += increment;
		}
	}

	void decreaseSpeed(int decrease) {
		if (speed > 0) {
			speed -= decrease;
		}
	}

	void printSpeed() {
		System.out.println("Hızınız : " + speed);
	}

}
