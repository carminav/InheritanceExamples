package InheritanceExamples;

public class TwoDoorCar extends Car {
	

	public void crashInto(Vehicle v) {
		this.damage += 10;
		v.damage += 2;
	}
	
	public void printMileage() {
		System.out.println("TwoDoorCar: Mileage: " + mileage);
	}
	
	public void printColor() {
		System.out.println("TwoDoorCar: Color: " + color);
	}
	
	public void printColor(double d) {
		System.out.println("TwoDoorCar: Color with Double: " + color + " " + d);
	}
	
	public void printColor(int x) {
		System.out.println("TwoDoorCar: Color with Int: " + color + " " + x);
	}
	
	public void printModel() {
		System.out.println("TwoDoorCar: " + model);
	}
	
	public void printDamage() {
		System.out.println("TwoDoorCar: Damage: " + damage);
	}
	
	
	
}
