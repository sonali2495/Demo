package com.bridgelabz.functionalInterface;

public class Vehicle {
	
	public static void main(String[] args) {
		int speed = 110;
		 Enfield e = ()->{ System.out.println("Speed of Enfield is:" +speed);};
		 e.speed();
	}

}
