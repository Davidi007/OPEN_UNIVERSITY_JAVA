package Exercises;

/**
	 * The Clock class prints calculation of difference between two times.
	 * 
	 * @version 1
	 */
	import java.util.Scanner;
	public class Clock
	{
	    /**
	     *  Gets two time pairs from user, 
	     *  checks their legality, 
	     *  in case of illegal time - prints appropriate notice
	     *  otherwise - calculates their difference
	     */
	    public static void main(String[]args)
	    {
	         final int MINUTES_IN_HOUR = 60;  
	         final int HOURS_IN_DAY = 24;  
	         final int MINUTES_LOW_BOUND = 0;  
	         final int HOURS_LOW_BOUND = 0;  
	        
	         boolean legalOperation = true;
	         char  sign = '+';
	         
	         //Gets first time pair from user
	         Scanner scan=new Scanner(System.in);
	         System.out.println("Please, input first time pair (hours minutes)");        
	         int firstHours = scan.nextInt();
	         int firstMinutes = scan.nextInt();
	         //Gets second time pair from user          
	          System.out.println("Please, input second time (hours minutes)");
	          int secondHours = scan.nextInt();
	          int secondMinutes = scan.nextInt();
	          
	         if ((firstHours < HOURS_LOW_BOUND) || 
	                (firstHours >= HOURS_IN_DAY) || 
	                (firstMinutes < MINUTES_LOW_BOUND) || 
	                (firstMinutes >= MINUTES_IN_HOUR))
	         {// Check legality of the first pair
	             System.out.println(firstHours + ":" + firstMinutes +
	                                                          " is illegal time ! ");
	             if ((firstHours < HOURS_LOW_BOUND) || (firstHours >= HOURS_IN_DAY))
	                System.out.println(" \tThe hour number should be between " + 
	                                                            HOURS_LOW_BOUND + " up " + (HOURS_IN_DAY-1)); 
	             if ((firstMinutes < MINUTES_LOW_BOUND) || 
	                    (firstMinutes >= MINUTES_IN_HOUR))
	                System.out.println(" \tThe minute number should be between " +
	                                                            MINUTES_LOW_BOUND + " up " + (MINUTES_IN_HOUR -1));
	             legalOperation = false;
	         }//if
	         
	         if ((secondHours < HOURS_LOW_BOUND) || 
	                (secondHours >= HOURS_IN_DAY) || 
	                (secondMinutes < MINUTES_LOW_BOUND) || 
	                (secondMinutes >= MINUTES_IN_HOUR))
	         {// Check legality of the second pair
	             System.out.println(secondHours + ":" + secondMinutes + 
	                                                         " is illegal time !");
	             if ((secondHours < HOURS_LOW_BOUND) || (secondHours >= HOURS_IN_DAY))
	                   System.out.println(" \tThe hour number should be between " + 
	                                                               HOURS_LOW_BOUND + " up " + (HOURS_IN_DAY - 1)); 
	             if ((secondMinutes < MINUTES_LOW_BOUND) || 
	                    (secondMinutes >= MINUTES_IN_HOUR) )
	                   System.out.println(" \tThe minute number should be between " + 
	                                                               MINUTES_LOW_BOUND + " up " + (MINUTES_IN_HOUR -1));
	            legalOperation = false;
	         }//if
	         
	         if ( legalOperation == true)
	         {// calculation of the time difference
	             
	             //sign definition
	            if ( (secondHours < firstHours) || 
	                    ((secondHours == firstHours) && (secondMinutes <= firstMinutes)))
	                sign = '-';
	              
	             //minutes calculation
	             if (secondMinutes < firstMinutes)
	             {
	                 secondMinutes+=MINUTES_IN_HOUR;
	                 if (secondHours>0)
	                    secondHours--;
	                 else
	                    secondHours = HOURS_IN_DAY - 1;
	             }
	             int minutes = secondMinutes - firstMinutes;            
	            
	               //hours calculation
	             if (secondHours < firstHours)             
	                  secondHours+=HOURS_IN_DAY;                   
	              int hours = secondHours - firstHours;
	              
	              //output
	              if (minutes < 10)
	                  System.out.println("The difference is: " + sign + hours + 
	                                                              ":0" + minutes);
	             else
	                   System.out.println("The difference is: " + sign + hours + 
	                                                              ":" + minutes);
	         }//if
	    }//main
	}//Clock class


