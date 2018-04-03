/*
 * 4. Pythagorean Theorum

Create a method that takes in two sides of a triangle 
and returns the length of the hypotenuse.

This can be found with the following equation:
c = sqrt(a^2 + b^2)

Create a main that calls this method with at least 3 different
sets of values and prints the results of each.

 */
public class hypotenuse {

	public static void main(String[] args) {
		int a,b;
		
		a=5; b=8;
		System.out.println("a= " + a + ", b= " + b + ", c= " + getHyp(a,b));
		
		a=3; b=6;
		System.out.println("a= " + a + ", b= " + b + ", c= " + getHyp(a,b));
		
		a=8; b=12;
		System.out.println("a= " + a + ", b= " + b + ", c= " + getHyp(a,b));

	}
	
	public static double getHyp(int a, int b) {
		return (Math.sqrt(a*a + b*b));
	}

}
