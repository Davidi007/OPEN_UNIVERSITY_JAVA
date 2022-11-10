package Exercises;
import java.util.Scanner;

/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Double first,second,result;
        
        System.out.println("please enter two integers:");
        first = scan.nextDouble(); 
        second = scan.nextDouble();
        
        result = first*second;
        System.out.println("Multiplication is: "+result); 
        
    }
    
}

