/*
 * Programmed by: Dilpreet Singh
 * Date: April 1, 2018
 * COMP 730
 * Homework 8
 */

package HW8;

import java.util.Scanner;

public class main 
	{
	public static void main(String[] args) 
		{
		int num = 0;
		Scanner input = new Scanner(System.in);
		FibonacciSequence fibonacci = new FibonacciSequence();
		
	
		while(true) {
			System.out.println("Enter a number for to get its fibonacci Number or enter 'q' to quit");
			String n = input.nextLine();
			
			if(n.toLowerCase().equals("q")) {
				break;
			}
			try {
				num = Integer.valueOf(n);
				System.out.println("Fibonacci number of " + n + " is = " + fibonacci.GetResult(num));
			}
			catch(Exception e){
				System.out.println("Invalid Input! Please enter a number to get fibonnaci number or 'q' to quit");
			}
		}
		
		input.close();
		
		System.out.print("Thanks for using Fibonacci Sequence. Bye! \n (re-run the program to try again)");
	}
}