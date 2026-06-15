package fst;

interface BicycleParts{
	public int tyres = 2;
	public int maxSpeed = 25;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
	}
	
	public void speedUp(int increment) {
		this.currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
	}
	
	public String bicycleDesc() {
		return ("No of gears are " + gears + "\nSpeed of bicycle is "+ maxSpeed);
	}
	
}

class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	MountainBike(int gears, int currentSpeed, int startHeight){
		super(gears, currentSpeed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String bicyleDesc() {
		return (super.bicycleDesc() + "\nSeat Height of the bicycle " + seatHeight);
	}
}

public class Activity7 {
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3,0,25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);	
	}

}
