package Exercises;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Program output explanation
		System.out.println("This program checks three numbers of triangle sides and defines the triangle as well. ");
		System.out.println("Please enter the three lengths" + " of the triangle's sides");
		// User values input
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();

		// First program checks if the inserted values are created valid triangle

		if ((x + y <= z) || (x + z <= y) || (z + y <= x)) // Invalid numbers for triangle
			System.out.println("The numbers: " + x + ", " + y + " and " + z + " cannot represent a triangle");
		
		// Equilateral triangle validation by comparing all triangle sides 
		
		else if (x == y && y == z)
			System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an equilateral triangle");
		
		// Isosceles triangle validation by comparing only 2 triangle sides 

		else if (x == z || x == y || y == z)
			System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an isosceles triangle");
		
		// Right-angle triangle validation by Pythagoras function
		
		else if ((Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))
				|| (Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2))
				|| (Math.pow(z, 2) + Math.pow(y, 2) == Math.pow(x, 2)))
			System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a right-angle triangle");
		
		// All rest of triangles that don't have any of definitions above
		
		else
			System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a common triangle");

	} // End of method main
} // End of class Triangle
