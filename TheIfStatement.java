package Exercises;

import java.util.Scanner;

public class TheIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);   

        System.out.println("Please enter number");     

        int num =  scan.nextInt();
        if (num == 1 || num == 2)

             num++;

        else if (num >= 3 && num <= 5)

             num--;

        else if (num == 6)

             num*=2;

        else

              num*=3;
         System.out.println("The new number is: " + num);     

    }

}
	


