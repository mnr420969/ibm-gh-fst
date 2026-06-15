package fst;

public class Activity1 {
	
	public static void main(String[] args) {
		Car polo = new Car();
		
		polo.make = 2014;
		polo.color = "Black";
		polo.transmission = "Manual";
		
		polo.displayCharacteristics();
		polo.accerlerate();
		polo.brake();
	}

}

class Car {
	
	String color, transmission;
	int make, tyres, doors;
	
	Car() {
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of the car        : " + color);
		System.out.println("Transmission of the car : " + transmission);
		System.out.println("Make of the car         : " + make);
		System.out.println("Number of Tyres         : " + tyres);
		System.out.println("Number of Doors         : " + doors);
	}
	
	public void accerlerate() {
		System.out.println("The car is moving forward");
	}
	
	public void brake() {
		System.out.println("The car has stopped");
	}

}

