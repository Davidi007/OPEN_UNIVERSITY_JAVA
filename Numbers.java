package Exercises;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner s = new Scanner(System.in);
          System.out.println("Please enter two numbers");

          int num1, num2;

          num1 = s.nextInt();

          num2 = s.nextInt();

          System.out.println(num1 + "+" + num2 + "=" + (num1+num2));

          System.out.println(num1 + "-" + num2 + "=" + (num1-num2));

     }

}
	


