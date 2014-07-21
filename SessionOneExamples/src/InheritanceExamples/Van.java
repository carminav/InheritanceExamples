package InheritanceExamples;

public class Van extends Vehicle {

	private boolean slidingDoors = true;
	
	public void crashInto(Vehicle v) {
		this.damage += 2;
		v.damage += 10;
	}
	
	public void printMileage() {
		System.out.println("Van: Mileage: " + mileage);
	}
	
	public void printColor() {
		System.out.println("Van: Color: " + color);
	}
	
	public void printColor(double d) {
		System.out.println("Van: Color with Double: " + color + " " + d);
	}
	
	public void printColor(int x) {
		System.out.println("Van: Color with Int: " + color + " " + x);
	}
	
	public void printModel() {
		System.out.println("Van: Model: " + model);
	}
	
	public void printDamage() {
		System.out.println("Van: Damage: " + damage);
	}
	
	public void printHasSlidingDoors() {
		System.out.println("Van: SlidingDoors: " + slidingDoors);
	}
	
	
	
}
