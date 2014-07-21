package InheritanceExamples;

public class Main {

	
	/* Session One Examples 7/20/14
	 * 
	 * Before running this Main file to see the output, write down what you 
	 * think the output would be. Compare your answers afterwards and email 
	 * me if you have any questions. 
	 * 
	 * Notice that there are some methods in TwoDoorCar, Car, etc that I did 
	 * not use in this Main.java file. Feel free to experiment with all of the
	 * methods I provided. 
	 * 
	 */

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
		
		//what is the output from this for loop?
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
	
		
		
		// What is the output from this for loop?
		for (int i = 0; i < vehArray.length; i++) {
			vehArray[i].printDamage();
			
		}
				
		
		
		//PART THREE (Questions)
		
		/*Try to answer these */
		/* 1) Why won't c.printColor(5) compile? 
		 * 2) Will c.printColor(5.0) compile? 
		 * 3) Will a.printManual() compile? 
		 * 4) Will f.printManual() compile?
		 * 5) Will b.printManual() compile?
		 * 6) Of all of the Vehicle objects above (a,b,c,d,e,f), 
		 *    only object 'a' has a field called "privateVar". 
		 *    Why is this?
		 * 7) In the Van, Car, and TwoDoorCar files, which methods are 
		 *    considered to be overriding another method?
		 * 8) Can you find any methods in this package that are 
		 *    overloading?*/
		
		
		
		
		

	}

}
