package Exercises;

import java.util.Scanner;

public class Lesson2Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Please choose one of the options");
		System.out.println("1 - Square");
		System.out.println("2 - Rectangle");
		System.out.println("3 - Tringle");
		System.out.println("4 - Circle");
		
		int userChoice = s.nextInt();
		
		if (userChoice==1)
			System.out.println("Please enter 4 numbers");
		if (userChoice==2)
			System.out.println("Please enter 4 numbers");
		if (userChoice==3)
			System.out.println("Please enter 3 numbers");
		if (userChoice==4)
			System.out.println("AHMAD");
	}

}
