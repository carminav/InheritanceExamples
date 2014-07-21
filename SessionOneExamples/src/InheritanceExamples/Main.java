package InheritanceExamples;

public class Main {


	public static void main(String[] args) {
		
		
		//Setup
		Vehicle a = new Vehicle();
		a.setColor("Red");
		a.setMileage(30);
		a.setModel("Model 1");
		
		Van b = new Van();
		b.setColor("White");
		b.setMileage(40);
		b.setModel("Model 2");
		
		Vehicle c = new Van();
		c.setColor("Orange");
		c.setMileage(45);
		c.setModel("Model 3");
		
		Car d = new Car();
		d.setColor("Green");
		d.setMileage(20);
		d.setModel("Model 4");
		
		Car e = new TwoDoorCar();
		e.setColor("Blue");
		e.setMileage(25);
		e.setModel("Model 5");
		
		TwoDoorCar f = new TwoDoorCar();
		f.setColor("Silver");
		f.setMileage(26);
		f.setModel("Model 6");
		
		Vehicle[] vehArray = new Vehicle[6];
		vehArray[0] = a;
		vehArray[1] = b;
		vehArray[2] = c;
		vehArray[3] = d;
		vehArray[4] = e;
		vehArray[5] = f;
		
		
		//Calling Methods
		
		// PART ONE EXAMPLES
		System.out.println("___PART ONE___");
		
		for (int i = 0; i < vehArray.length; i++) {
			vehArray[i].printColor();
			vehArray[i].printMileage();
			vehArray[i].printModel();
			System.out.println(); //print extra new line
		}
		

		
		// PART TWO EXAMPLES 
		System.out.println("___PART TWO___");
		
		b.crashInto(c);
		b.crashInto(f);
		a.crashInto(d);
		a.crashInto(e);
		e.crashInto(b);
	
		
		
		for (int i = 0; i < vehArray.length; i++) {
			vehArray[i].printDamage();
			
		}
		
		
		//PART FOUR 
		System.out.println("__PART THREE__");
		
		
		
		
		//PART THREE (Questions)
		
		/* Questions to think about: */
		/* 1) Why won't c.printColor(5) compile? 
		 * 2) Will c.printColor(5.0) compile? 
		 * 3) Will a.printManual() compile? 
		 * 4) Will f.printManual() compile?
		 * 5) Will b.printManual() compile?
		 * 6) Of all of the Vehicle objects above (a,b,c,d,e,f), 
		 *    only object 'a' has a field called "privateVar". 
		 *    Why is this?*/
		
		

	}

}
