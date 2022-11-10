package Exercises;

import java.util.Scanner;

public class SquareValidationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter four lengths:");

        int len1 = s.nextInt();

        int len2 = s.nextInt();

        int len3 = s.nextInt();

        int len4 = s.nextInt();

        if (len1 == len2 && len2 == len3 && len3 == len4)

             System.out.println("Square");

        else

             System.out.println("Not Square");
   }

}
