package Exercises;

import java.util.Scanner;

public class MinimumCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		           Scanner s = new Scanner(System.in);
		           int price, amount;        

		           System.out.println("Please enter the price in shekels");        

		           price = s.nextInt();        

		           amount = price / 10;        

		           price = price % 10;        

		           System.out.println("We need " + amount + " coins of 10 NIS");        

		           amount = price / 5;        

		           price = price % 5;        

		           System.out.println("We need " + amount + " coins of 5 NIS");         

		           amount = price / 1;        

		           price = price % 1;        

		           System.out.println("We need " + amount + " coins of 1 NIS");    

		    }     

}

	


