/**
	
	This program will determine if the user's input value is positive, negative or zero. 

	@ author Stephanie-Angela Brauer

*/

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
	public static void main (String args[]) {

		int n;
		Scanner sc = new Scanner (System.in);
		System.out.print ("Please enter an integer value: ");
		n = sc.nextInt ();
	
		System.out.print ("For an integer of "+n+" the output is: ");

		if (n > 0)
			System.out.println ("positive");
		else if (n < 0)
	   		System.out.println ("negative");
		else
			System.out.println ("zero");
   }
}