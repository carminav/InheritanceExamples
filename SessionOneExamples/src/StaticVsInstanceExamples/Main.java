package StaticVsInstanceExamples;

public class Main {

	
	public static void main(String[] args) {
		 
		/* Write down what you think the output of this would be and then 
		 * compare your answers.
		 */
		

		Student.printNumberOfStudents(); // What is the output of this?
		
		Student one = new Student(16, "Mary");
		Student two = new Student(17, "John");
		Student three = new Student(18, "Luke");

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		Student.printNumberOfStudents(); // What is the output of this now? 
		
		Student four = new Student(19, "Meridith");
		Student five = new Student(20, "Alex");
		
		System.out.println(four);
		System.out.println(five);
		
		Student.printNumberOfStudents(); // And now?
		
		
	}

}
