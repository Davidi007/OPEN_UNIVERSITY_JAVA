package Exercises;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		          final int ADULT = 18, SENIOR = 67;
		          final int GRANT = 200, HEALTH_TAX = 100;      
		          Scanner scan = new Scanner(System.in);        

		          int age; 
		          double salary;        

		          System.out.println("Please enter your age");        
		          age = scan.nextInt();        

		          System.out.println("Please enter your salary");       
		          salary = scan.nextDouble();        

		          if (age >= ADULT && age < SENIOR)               
		               salary = salary - HEALTH_TAX; // salary -= HEALTH_TAX
		          else            
		               salary = salary + GRANT; // salary += GRANT

		          System.out.println("Updated salary is " + salary);    

		     }

		}
	


