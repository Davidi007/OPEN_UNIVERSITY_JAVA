package Exercises;

import java.util.Scanner;

public class Triangle1

{// Start of class Triangle1

	public static void main(String[] args)

	{// Start of method main
		// For getting values from user to the program we using Scanner interface
		Scanner scan = new Scanner(System.in);
		// Program output explanation and instructions
		System.out.println("This program calculates the area " + "and the perimeter of a given triangle. ");
		System.out.println("Please enter the three lengths" + " of the triangle's sides");
		// User values input
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		// For perimeter result of the triangle system run the perimeter formula [ P = a + b + c]
		int perimeter = a + b + c;
		// Definition of 's' as half of the perimeter for area calculation
		// Casting the perimeter values to double
		double s = (double) perimeter / 2;
		double area;
		// For area result of the triangle system will run the Heron's formula on half
		// of the perimeter
		area = s * (s - a) * (s - b) * (s - c);
		area = Math.sqrt(area);
		// Output
		System.out.println("The lengths of the triangle sides are: " + a + ", " + b + ", " + c + '.');
		System.out.println("The perimeter of the triangle is: " + perimeter);
		System.out.println("The area of the triangle is: " + area);

	} // End of method main
} // End of class Triangle1
