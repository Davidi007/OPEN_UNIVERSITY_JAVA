package Exercises;

import java.util.Scanner;

public class PlayWithNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);           

        System.out.println("Please enter number");        

        int num = scan.nextInt();        

        if (num > 0) { // חיובי
             if (num % 2 == 0)

                  System.out.println("The number is even"); // זוגי

             else

                  System.out.println("The number is odd"); // אי זוגי

         }

         else // לא חיובי

              System.out.println("wrong number");
	}

}
