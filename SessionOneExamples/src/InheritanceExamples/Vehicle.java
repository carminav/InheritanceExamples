package InheritanceExamples;

public class Vehicle {

	protected int mileage;
	protected String color;
	protected String model;
	protected int damage = 0; //All vehicles start with 0 damage
	
	private int privateVar = 10;
	
	
	public void crashInto(Vehicle v) {
		this.damage += 2;
		v.damage += 2;
	}
	
	public void printMileage() {
		System.out.println("Vehicle: Mileage: " + mileage);
	}
	
	public void printColor() {
		System.out.println("Vehicle: Color: " + color);
	}
	
	public void printModel() {
		System.out.println("Vehicle: Model: " + model);
	}
	
	public void printDamage() {
		System.out.println("Vehicle: Damage: " + damage);
	}
	
	public void setMileage(int m) {
		this.mileage = m;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public void setModel(String m) {
		this.model = m;
	}
	
	
	
	
	
}
