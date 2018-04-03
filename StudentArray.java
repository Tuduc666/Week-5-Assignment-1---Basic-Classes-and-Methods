/*
 * 2. Getting more advanced   

Create an array of type Student with three positions.

Read in their info just like before.

Print out the names of those students, their grades, and their GPAs.
Then, print out the average GPA of all three students.

 */
import java.util.Scanner;
public class StudentArray {
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private String grade;
	private double gpa;
	
	public static double getDouble(String prompt) {
		double iDouble;  
		System.out.println(prompt);
		iDouble = sc.nextDouble();
		sc.nextLine();  // this one will eat the carriage return, otherwise the name would eat the carriage return
		return iDouble;
	}
	
	public static String getString(String prompt) {
		String iString;  
		System.out.println(prompt);
		iString = sc.nextLine();
		return iString;
	}
	 
	public String toString() {                         // building the default toString function
		String message = "Name: " + this.getName() + "\n";
		message += "Grade: " + this.getGrade() + "\n";
		message += "GPA: " +this.getGpa();
		return message;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public static void main(String[] args) {
		int numStudents = 3;
		Student[] A = new Student[numStudents];   // Defining array A as an array of students with 3 elements
		double totalGPA=0;
		double returnGPA;

		// get user input
		for (int i=0;i<numStudents;i++) {
			A[i] = new Student();               // instantiate a new student
			A[i].setName(getString("What is your name?"));
			A[i].setGrade(getString("What is your grade?"));
			
			returnGPA = getDouble("What is your GPA?");
			A[i].setGpa(returnGPA);
			totalGPA += returnGPA;          // total for calculating average GPA
		}

		// print info
		for (int i=0;i<numStudents;i++) System.out.println(A[i]);

		System.out.println("Average GPA is " + totalGPA/numStudents);
	}
}
