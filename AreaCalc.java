/*
 * 5. Area Calculator

Create four methods to calculate the area for different objects.

Your method declaration will look something like this:
public static double area_circle()   // returns the area of a circle
public static int area_rectangle()   // returns the area of a rectangle
public static int area_square()      // returns the area of a square
public static double area_triangle() // returns the area of a triangle

The equations for each are as follows:
Circle = pi * radius^2
Rectangle = length * width
Square = side^2
Triangle = 0.5 * base * height

Note: you can use Math.PI for the value of pi.

Create a main method that asks the user which object they would 
like to get the area of.

It will then direct them to that method.

Each method will then ask the user to input the value of each variable required.
For example, area_circle() will ask the user to input the radius.

The main method will then return the results.

 */
import java.util.Scanner;
public class AreaCalc {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int object;
		
		System.out.println("Calculate the area of which object?");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Triangle");
		object = sc.nextInt(); sc.nextLine();
		switch (object) {
		case 1:
			System.out.println("Area of the circle = " + areaCir());
			break;
		case 2:
			System.out.println("Area of the rectangle = " + areaRect());
			break;
		case 3:
			System.out.println("Area of the square = " + areaSquare());
			break;
		case 4:
			System.out.println("Area of the triangle = " + areaTri());
			break;
		default:
			System.out.println("Invalid selection");
		}
		sc.close();
	}
	
	public static double areaCir() {
		double radius;
		System.out.println("Enter the radius of the circle");
		radius = sc.nextDouble();
		return (Math.PI * radius * radius);
	}
	
	public static int areaRect() {
		int len, width;
		System.out.println("Enter the length and width of the rectangle");
		len = sc.nextInt();
		width = sc.nextInt();
		return (len * width);
	}
	
	public static int areaSquare() {
		int len;
		System.out.println("Enter the length of a side of the square");
		len = sc.nextInt();
		return (len * len);
	}

	public static double areaTri() {
		double base, height;
		System.out.println("Enter the length of the base and height of the triangle");
		base = sc.nextDouble();
		height = sc.nextDouble();
		return (base * height * .5);
	}
}
