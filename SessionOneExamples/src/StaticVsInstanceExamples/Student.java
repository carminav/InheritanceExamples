package StaticVsInstanceExamples;

public class Student {

	private static int numberOfStudents = 0; 
	
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfStudents += 1;
	}
	
	
	/* When methods are Static, they are also only accessible from the class, 
	 * and not an object. 
	 * For example, to access this method from a different file you would do:
	 * Student.printNumberOfStudents();
	 */
	public static void printNumberOfStudents() {
		 System.out.println("Number of total students made: " + numberOfStudents);
	}
	
	
	public String toString() {
		return "Student: " + name + " " + age + " years old";
	}
	
	
	
}
