package InheritanceExamples;

public class Car extends Vehicle {
	
	public boolean manual; 

	
	public void printMileage() {
		System.out.println("Car: Mileage: " + mileage);
	}
	
	public void printColor() {
		System.out.println("Car: Color: " + color);
	}
	
	public void printColor(double d) {
		System.out.println("Car: Color with Double: " + color + " " + d);
	}
	
	public void printColor(int x) {
		System.out.println("Car: Color with Int: " + color + " " + x);
	}
	
	public void printModel() {
		System.out.println("Car: Model: " + model);
	}
	
	public void printDamage() {
		System.out.println("Car: Damage: " + damage);
	}
	
	public void printManual() {
		System.out.println("Car: Manual: " + manual);
	}
}
